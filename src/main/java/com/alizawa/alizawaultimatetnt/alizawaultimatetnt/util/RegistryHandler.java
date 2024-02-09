package com.alizawa.alizawaultimatetnt.util;

import com.alizawa.alizawaultimatetnt.AlizawaUltimateTNT;
import com.alizawa.alizawaultimatetnt.blocks.*;
import com.alizawa.alizawaultimatetnt.entity.AirDefenceTNTEntity;
import com.alizawa.alizawaultimatetnt.entity.DragonBreathTNTEntity;
import com.alizawa.alizawaultimatetnt.entity.FireTNTEntity;
import com.alizawa.alizawaultimatetnt.entity.MineTNTEntity;
import com.alizawa.alizawaultimatetnt.items.NetherWand;
import com.alizawa.alizawaultimatetnt.items.TNTSword;
import com.alizawa.alizawaultimatetnt.items.TNTPickaxe;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.TNTBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.alizawa.alizawaultimatetnt.items.ItemBase;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AlizawaUltimateTNT.MOD_ID);

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AlizawaUltimateTNT.MOD_ID);


    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, AlizawaUltimateTNT.MOD_ID);


    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, AlizawaUltimateTNT.MOD_ID);



    //注册完东西要初始化
    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());


    }



    //实体
    public static final RegistryObject<EntityType<DragonBreathTNTEntity>> DRAGON_BREATH_TNT_ENTITY = ENTITIES.register("dragon_breath_tnt",
            () -> EntityType.Builder.<DragonBreathTNTEntity>of(DragonBreathTNTEntity::new, EntityClassification.MISC)
                    .sized(2.1F, 2.1F)
                    .build(String.valueOf(new ResourceLocation(AlizawaUltimateTNT.MOD_ID, "dragon_breath_tnt"))));

    public static final RegistryObject<EntityType<FireTNTEntity>> FIRE_TNT_ENTITY = ENTITIES.register("fire_tnt",
            () -> EntityType.Builder.<FireTNTEntity>of(FireTNTEntity::new, EntityClassification.MISC)
                    .sized(2.1F, 2.1F)
                    .build(String.valueOf(new ResourceLocation(AlizawaUltimateTNT.MOD_ID, "fire_tnt"))));

    public static final RegistryObject<EntityType<AirDefenceTNTEntity>> AIR_DEFENCE_TNT_ENTITY = ENTITIES.register("air_defence_tnt",
            () -> EntityType.Builder.<AirDefenceTNTEntity>of(AirDefenceTNTEntity::new, EntityClassification.MISC)
                    .sized(2.1F, 2.1F)
                    .build(String.valueOf(new ResourceLocation(AlizawaUltimateTNT.MOD_ID, "air_defence_tnt"))));

    public static final RegistryObject<EntityType<MineTNTEntity>> MINE_TNT_ENTITY = ENTITIES.register("mine_tnt",
            () -> EntityType.Builder.<MineTNTEntity>of(MineTNTEntity::new, EntityClassification.MISC)
                    .sized(2.1F, 2.1F)
                    .build(String.valueOf(new ResourceLocation(AlizawaUltimateTNT.MOD_ID, "mine_tnt"))));

    //物品注册
    public static final RegistryObject<Item> DRAGON_BREATH_GUNPOWDER = ITEMS.register("dragon_breath_gunpowder", ItemBase::new);

    //物品注册，但是特殊物品
    public static final RegistryObject<Item> NETHER_WAND = ITEMS.register("nether_wand", () -> new NetherWand(new Item.Properties().tab(AlizawaUltimateTNT.TAB).setNoRepair().stacksTo(1)));

    //武器和工具
    public static final RegistryObject<Item> TNT_SWORD = ITEMS.register("tnt_sword", () -> new TNTSword(new Item.Properties().tab(AlizawaUltimateTNT.TAB).setNoRepair().stacksTo(1)));

    public static final RegistryObject<Item> TNT_PICKAXE = ITEMS.register("tnt_pickaxe", () -> new TNTPickaxe(new Item.Properties().tab(AlizawaUltimateTNT.TAB).setNoRepair().stacksTo(1)));

    public static final RegistryObject<Item> TNT_BOW = ITEMS.register("tnt_bow",
            () -> new BowItem(new Item.Properties().tab(AlizawaUltimateTNT.TAB).setNoRepair().stacksTo(1)));

    //方块 - 放在地上的状态
    public static final RegistryObject<Block> DRAGON_BREATH_TNT_BLOCK = BLOCKS.register("dragon_breath_tnt", () -> new DragonBreathTNT(AbstractBlock.Properties.of(Material.EXPLOSIVE).instabreak().sound(SoundType.GRASS)));

    public static final RegistryObject<Block> FIRE_TNT_BLOCK = BLOCKS.register("fire_tnt", () -> new FireTNT(AbstractBlock.Properties.of(Material.EXPLOSIVE).instabreak()
            .sound(SoundType.STONE)));

    public static final RegistryObject<Block> AIR_DEFENCE_TNT_BLOCK = BLOCKS.register("air_defence_tnt", () -> new AirDefenceTNTBlock(AbstractBlock.Properties.of(Material.EXPLOSIVE).instabreak()
            .sound(SoundType.GRASS)));

    public static final RegistryObject<Block> MINE_TNT_BLOCK = BLOCKS.register("mine_tnt", () -> new MineTNT(AbstractBlock.Properties.of(Material.EXPLOSIVE).instabreak()
            .sound(SoundType.GRASS)
    ));

    public static final RegistryObject<Block> ALIZAWA_HEAD_BLOCK = BLOCKS.register("alizawa_head_block", () -> new AlizawaHead(AbstractBlock.Properties.of(Material.EXPLOSIVE).instabreak().lightLevel(value -> 50).strength(1.0F, 100.0F)
            .sound(SoundType.WOOL)
            ));
    //方块 - 拿在手上的状态
    public static final RegistryObject<Item> DRAGON_BREATH_TNT_ITEM = ITEMS.register("dragon_breath_tnt", () -> new BlockItemBase(DRAGON_BREATH_TNT_BLOCK.get()));

    public static final RegistryObject<Item> FIRE_TNT_ITEM = ITEMS.register("fire_tnt", () -> new BlockItemBase(FIRE_TNT_BLOCK.get()));

    public static final RegistryObject<Item> AIR_DEFENCE_TNT_ITEM = ITEMS.register("air_defence_tnt", () -> new BlockItemBase(AIR_DEFENCE_TNT_BLOCK.get()));

    public static final RegistryObject<Item> MINE_TNT_ITEM = ITEMS.register("mine_tnt", () -> new BlockItemBase(MINE_TNT_BLOCK.get()));

    public static final RegistryObject<Item> ALIZAWA_HEAD_ITEM = ITEMS.register("alizawa_head_block", () -> new BlockItemBase(ALIZAWA_HEAD_BLOCK.get()));




}


