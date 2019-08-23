package org.sdoaj.eloncraft.items;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.sdoaj.eloncraft.Eloncraft;
import org.sdoaj.eloncraft.items.tools.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Mod.EventBusSubscriber(modid = Eloncraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {
    private static final List<Item> items = new ArrayList<>();
    private static final HashMap<Item, String> oreDictEntries = new HashMap<>();

    // metals from ores

    public static ItemBasic ALUMINUM_INGOT;
    public static ItemBasic TITANIUM_INGOT;
    public static ItemBasic LITHIUM_INGOT;
    public static ItemBasic NICKEL_INGOT;
    public static ItemBasic CHROMIUM_INGOT;
    public static ItemBasic COPPER_INGOT;
    public static ItemBasic NIOBIUM_INGOT;
    public static ItemBasic HAFNIUM_INGOT;
    public static ItemBasic MAGNESIUM_INGOT;
    public static ItemBasic ZINC_INGOT;

    public static ItemBasic ALUMINUM_NUGGET;
    public static ItemBasic TITANIUM_NUGGET;
    public static ItemBasic LITHIUM_NUGGET;
    public static ItemBasic NICKEL_NUGGET;
    public static ItemBasic CHROMIUM_NUGGET;
    public static ItemBasic COPPER_NUGGET;
    public static ItemBasic NIOBIUM_NUGGET;
    public static ItemBasic HAFNIUM_NUGGET;
    public static ItemBasic MAGNESIUM_NUGGET;
    public static ItemBasic ZINC_NUGGET;

    public static ItemBasic IRON_PLATE;
    public static ItemBasic GOLD_PLATE;
    public static ItemBasic ALUMINUM_PLATE;
    public static ItemBasic TITANIUM_PLATE;
    public static ItemBasic LITHIUM_PLATE;
    public static ItemBasic NICKEL_PLATE;
    public static ItemBasic CHROMIUM_PLATE;
    public static ItemBasic COPPER_PLATE;
    public static ItemBasic NIOBIUM_PLATE;
    public static ItemBasic HAFNIUM_PLATE;
    public static ItemBasic MAGNESIUM_PLATE;
    public static ItemBasic ZINC_PLATE;

    public static ItemBasic IRON_DUST;
    public static ItemBasic GOLD_DUST;
    public static ItemBasic ALUMINUM_DUST;
    public static ItemBasic TITANIUM_DUST;
    public static ItemBasic LITHIUM_DUST;
    public static ItemBasic NICKEL_DUST;
    public static ItemBasic CHROMIUM_DUST;
    public static ItemBasic COPPER_DUST;
    public static ItemBasic NIOBIUM_DUST;
    public static ItemBasic HAFNIUM_DUST;
    public static ItemBasic MAGNESIUM_DUST;
    public static ItemBasic ZINC_DUST;

    public static ItemBasic ABYSSAL_INGOT;
    public static ItemBasic REFINED_PALLASITE;

    public static ItemBasic ABYSSAL_DUST;

    // alloys

    public static ItemBasic STEEL_INGOT;

    public static ItemBasic STEEL_NUGGET;

    public static ItemBasic STEEL_PLATE;

    public static ItemBasic INCONEL_BARS;
    public static ItemBasic ALUMINUM_2198_INGOT;
    public static ItemBasic ALUMINUM_7XXX_INGOT;
    public static ItemBasic NIOBIUM_C103_INGOT;

    public static ItemBasic INCONEL_PLATE;
    public static ItemBasic ALUMINUM_2198_PLATE;
    public static ItemBasic ALUMINUM_7XXX_PLATE;
    public static ItemBasic NIOBIUM_C103_PLATE;

    // other metal items

    public static ItemBasic BROKEN_STEEL_GEAR;
    public static ItemBasic DAMAGED_AIRCRAFT_PLATING;

    public static ItemBasic TITANIUM_FAN;
    public static ItemBasic FUEL_PIPE;

    // random items

    public static ItemBasic CRUSHED_COAL;
    public static ItemBasic UNTREATED_CARBON_FIBERS;
    public static ItemBasic CARBON_FIBERS;
    public static ItemBasic CARBON_FIBER_PLATE;
    public static ItemBasic HEAT_SHIELD;
    public static ItemBasic STEEL_ROD;
    public static ItemBasic REDSTONE_CATALYST;

    // rocket parts

    public static ItemBasic MERLIN_ENGINE;

    public static ItemBasic OCTAWEB;
    public static ItemBasic LANDING_LEG;
    public static ItemBasic FUEL_TANK_LOX_1;
    public static ItemBasic FUEL_TANK_RP1_1;
    public static ItemBasic GRID_FIN;
    public static ItemBasic COLD_GAS_THRUSTER;
    public static ItemBasic INTERSTAGE;
    public static ItemBasic FUEL_TANK_LOX_2;
    public static ItemBasic FUEL_TANK_RP1_2;

    public static ItemBasic USA_FLAG;
    public static ItemBasic USA_FLAG_EPIC;

    public static ItemBasic SUPERDRACO_ENGINE;
    public static ItemBasic FUEL_TANK_3;
    public static ItemBasic WARP_CORE;
    public static ItemBasic FALCON9_DRAGON;

    public static ItemBasic FALCON9;
    public static ItemBasic FALCON9_FUELED;

    // tools/weapons

    public static ItemPickaxe TITANIUM_PICKAXE;

    public static ItemSword TITANIUM_CUTLASS;
    public static ItemSword TITANIUM_KATANA;

    public static ItemArmor TITANIUM_HELMET;
    public static ItemArmor TITANIUM_CHESTPLATE;
    public static ItemArmor TITANIUM_LEGGINGS;
    public static ItemArmor TITANIUM_BOOTS;

    private static void init() {
        ALUMINUM_INGOT = new ItemBasic("aluminum_ingot");
        TITANIUM_INGOT = new ItemBasic("titanium_ingot");
        LITHIUM_INGOT = new ItemBasic("lithium_ingot");
        NICKEL_INGOT = new ItemBasic("nickel_ingot");
        CHROMIUM_INGOT = new ItemBasic("chromium_ingot");
        COPPER_INGOT = new ItemBasic("copper_ingot");
        NIOBIUM_INGOT = new ItemBasic("niobium_ingot");
        HAFNIUM_INGOT = new ItemBasic("hafnium_ingot");
        MAGNESIUM_INGOT = new ItemBasic("magnesium_ingot");
        ZINC_INGOT = new ItemBasic("zinc_ingot");

        ALUMINUM_NUGGET = new ItemBasic("aluminum_nugget");
        TITANIUM_NUGGET = new ItemBasic("titanium_nugget");
        LITHIUM_NUGGET = new ItemBasic("lithium_nugget");
        NICKEL_NUGGET = new ItemBasic("nickel_nugget");
        CHROMIUM_NUGGET = new ItemBasic("chromium_nugget");
        COPPER_NUGGET = new ItemBasic("copper_nugget");
        NIOBIUM_NUGGET = new ItemBasic("niobium_nugget");
        HAFNIUM_NUGGET = new ItemBasic("hafnium_nugget");
        MAGNESIUM_NUGGET = new ItemBasic("magnesium_nugget");
        ZINC_NUGGET = new ItemBasic("zinc_nugget");

        IRON_PLATE = new ItemBasic("iron_plate");
        GOLD_PLATE = new ItemBasic("gold_plate");
        ALUMINUM_PLATE = new ItemBasic("aluminum_plate");
        TITANIUM_PLATE = new ItemBasic("titanium_plate");
        LITHIUM_PLATE = new ItemBasic("lithium_plate");
        NICKEL_PLATE = new ItemBasic("nickel_plate");
        CHROMIUM_PLATE = new ItemBasic("chromium_plate");
        COPPER_PLATE = new ItemBasic("copper_plate");
        NIOBIUM_PLATE = new ItemBasic("niobium_plate");
        HAFNIUM_PLATE = new ItemBasic("hafnium_plate");
        MAGNESIUM_PLATE = new ItemBasic("magnesium_plate");
        ZINC_PLATE = new ItemBasic("zinc_plate");

        IRON_DUST = new ItemBasic("iron_dust");
        GOLD_DUST = new ItemBasic("gold_dust");
        ALUMINUM_DUST = new ItemBasic("aluminum_dust");
        TITANIUM_DUST = new ItemBasic("titanium_dust");
        LITHIUM_DUST = new ItemBasic("lithium_dust");
        NICKEL_DUST = new ItemBasic("nickel_dust");
        CHROMIUM_DUST = new ItemBasic("chromium_dust");
        COPPER_DUST = new ItemBasic("copper_dust");
        NIOBIUM_DUST = new ItemBasic("niobium_dust");
        HAFNIUM_DUST = new ItemBasic("hafnium_dust");
        MAGNESIUM_DUST = new ItemBasic("magnesium_dust");
        ZINC_DUST = new ItemBasic("zinc_dust");

        ABYSSAL_INGOT = new ItemBasic("abyssal_ingot");
        REFINED_PALLASITE = new ItemBasic("refined_pallasite");

        ABYSSAL_DUST = new ItemBasic("abyssal_dust");

        STEEL_INGOT = new ItemBasic("steel_ingot");

        STEEL_NUGGET = new ItemBasic("steel_nugget");

        STEEL_PLATE = new ItemBasic("steel_plate");

        INCONEL_BARS = new ItemBasic("inconel_bars");
        INCONEL_BARS.addLore("A heat-resistant nickel-chromium superalloy often used in rocket engines.");
        INCONEL_BARS.setGlows();
        ALUMINUM_2198_INGOT = new ItemBasic("aluminum_2198_ingot");
        ALUMINUM_2198_INGOT.addLore("An aluminum-lithium alloy found in rocket fuel and oxidizer tanks.");
        ALUMINUM_2198_INGOT.setGlows();
        ALUMINUM_7XXX_INGOT = new ItemBasic("aluminum_7xxx_ingot");
        ALUMINUM_7XXX_INGOT.addLore("7000 series aluminum alloys are made from ~90% aluminum, ~7% zinc, ~2% magnesium, and ~1% other elements; they are commonly used in aerospace applications.");
        ALUMINUM_7XXX_INGOT.setGlows();
        NIOBIUM_C103_INGOT = new ItemBasic("niobium_c103_ingot");
        NIOBIUM_C103_INGOT.addLore("A high-performance, heat-resistant niobium-hafnium-titanium alloy used in rocket engine nozzles.");
        NIOBIUM_C103_INGOT.setGlows();

        INCONEL_PLATE = new ItemBasic("inconel_plate");
        INCONEL_PLATE.setGlows();
        ALUMINUM_2198_PLATE = new ItemBasic("aluminum_2198_plate");
        ALUMINUM_2198_PLATE.setGlows();
        ALUMINUM_7XXX_PLATE = new ItemBasic("aluminum_7xxx_plate");
        ALUMINUM_7XXX_PLATE.setGlows();
        NIOBIUM_C103_PLATE = new ItemBasic("niobium_c103_plate");
        NIOBIUM_C103_PLATE.setGlows();

        BROKEN_STEEL_GEAR = new ItemBasic("broken_steel_gear");
        DAMAGED_AIRCRAFT_PLATING = new ItemBasic("damaged_aircraft_plating");

        TITANIUM_FAN = new ItemBasic("titanium_fan");
        FUEL_PIPE = new ItemBasic("fuel_pipe");

        CRUSHED_COAL = new ItemBasic("crushed_coal");
        CRUSHED_COAL.setBurnTime(800);
        UNTREATED_CARBON_FIBERS = new ItemBasic("untreated_carbon_fibers");
        CARBON_FIBERS = new ItemBasic("carbon_fibers");
        CARBON_FIBERS.addLore("Disclaimer: most real carbon fibers aren't gmade of coal.");
        CARBON_FIBERS.setGlows();
        CARBON_FIBER_PLATE = new ItemBasic("carbon_fiber_plate");
        CARBON_FIBER_PLATE.setGlows();
        HEAT_SHIELD = new ItemBasic("heat_shield");
        HEAT_SHIELD.addLore("Magical heat shielding made from void-resistant plants and pulverized hellfire. What more could you ask for?");
        HEAT_SHIELD.setGlows();
        STEEL_ROD = new ItemBasic("steel_rod");
        REDSTONE_CATALYST = new ItemBasic("redstone_catalyst");
        REDSTONE_CATALYST.addLore("Enhances the reaction between fuel and LOX to produce more thrust and increase acceleration.");

        MERLIN_ENGINE = new ItemBasic(defaultProperties(16), "merlin_engine");
        MERLIN_ENGINE.addLore("\"Merlin's thrust-to-weight ratio exceeds 150, making the Merlin the most efficient booster engine ever built, while still maintaining the structural and thermal safety margins needed to carry astronauts.\"");

        OCTAWEB = new ItemBasic(defaultProperties(1), "octaweb");
        OCTAWEB.addLore("\"A metal structure that supports eight engines surrounding a center engine at the base of the launch vehicle.\"");
        LANDING_LEG = new ItemBasic(defaultProperties(4), "landing_leg");
        LANDING_LEG.addLore("\"The Falcon 9 first stage carries landing legs which will deploy after stage separation and allow for the rocket's soft return to Earth.\"");
        FUEL_TANK_LOX_1 = new ItemBasic(defaultProperties(1), "fuel_tank_lox_1");
        FUEL_TANK_LOX_1.addLore("A first stage component that contains a fuel tank for liquid oxygen, an oxidizer essential for the combustion reaction used by liquid-propelled rockets to provide thrust.");
        FUEL_TANK_RP1_1 = new ItemBasic(defaultProperties(1), "fuel_tank_rp1_1");
        FUEL_TANK_RP1_1.addLore("A first stage component that contains a fuel tank for RP-1 (Rocket Propellant-1), a highly refined form of kerosene used as rocket fuel.");
        GRID_FIN = new ItemBasic(defaultProperties(4), "grid_fin");
        GRID_FIN.addLore("\"Falcon 9's first stage is equipped with hypersonic grid fins that manipulate the direction of the stage's lift during re-entry.\"");
        COLD_GAS_THRUSTER = new ItemBasic(defaultProperties(2), "cold_gas_thruster");
        COLD_GAS_THRUSTER.addLore("Used to flip the rocket around as it begins its journey back to Earth.");
        INTERSTAGE = new ItemBasic(defaultProperties(1), "interstage");
        INTERSTAGE.addLore("The interstage connects the first and second stages and facilitates their separation. It also has grid fins and cold gas thrusters for steering and alignment during re-entry and landing.");
        FUEL_TANK_LOX_2 = new ItemBasic(defaultProperties(1), "fuel_tank_lox_2");
        FUEL_TANK_LOX_2.addLore("A second stage component that contains a fuel tank for liquid oxygen, an oxidizer essential for the combustion reaction used by liquid-propelled rockets to provide thrust.");
        FUEL_TANK_RP1_2 = new ItemBasic(defaultProperties(1), "fuel_tank_rp1_2");
        FUEL_TANK_RP1_2.addLore("A second stage component that contains a fuel tank for RP-1 (Rocket Propellant-1), a highly refined form of kerosene used as rocket fuel.");

        USA_FLAG = new ItemBasic(defaultProperties(1), "usa_flag");
        USA_FLAG_EPIC = new ItemBasic(defaultProperties(1), "usa_flag_epic");
        USA_FLAG_EPIC.setGlows();

        SUPERDRACO_ENGINE = new ItemBasic(defaultProperties(8), "superdraco_engine");
        SUPERDRACO_ENGINE.addLore("3D printed engines made of Inconel and used to provide propulsion for the Crew Dragon.");
        FUEL_TANK_3 = new ItemBasic(defaultProperties(4), "fuel_tank_3");
        FUEL_TANK_3.addLore("SuperDraco engines don't actually use RP-1 and LOX, but making fuel is annoying enough already.");
        WARP_CORE = new ItemBasic(defaultProperties(1), "warp_core");
        WARP_CORE.addLore("An essential piece of the Dragon that allows it and its passenger to return to the Overworld.");
        WARP_CORE.setGlows();
        FALCON9_DRAGON = new ItemBasic(defaultProperties(1), "falcon9_dragon");
        FALCON9_DRAGON.addLore("\"Dragon is a free-flying spacecraft designed to deliver both cargo and people to orbiting destinations.\"");

        FALCON9 = new ItemBasic(defaultProperties(1), "falcon9");
        FALCON9.addLore(TextFormatting.GOLD + "One small step for a Steve, one giant leap for mankind.");
        FALCON9.addLore(TextFormatting.AQUA + "Using magical items found only in the world of Minecraft, this rocket and its crew capsule can go much farther than their real-life counterparts.");
        FALCON9.addLore(TextFormatting.LIGHT_PURPLE + "The mystical powers of the End* allow it to warp itself and its passenger back to the Overworld from anywhere in the universe.");
        FALCON9_FUELED = new ItemBasic(defaultProperties(1), "falcon9_fueled");
        FALCON9_FUELED.addLore(TextFormatting.AQUA + "Creative only");

        TITANIUM_PICKAXE = new ItemPickaxe("titanium_pickaxe", ModToolMaterials.TITANIUM);

        TITANIUM_CUTLASS = new ItemSword("titanium_cutlass", ModToolMaterials.TITANIUM, 10.0F, 1.3F);
        TITANIUM_KATANA = new ItemSword("titanium_katana", ModToolMaterials.TITANIUM, 6.5F, 2.0F);

        TITANIUM_HELMET = new ItemArmor("titanium_helmet", ModArmorMaterials.TITANIUM, EquipmentSlotType.HEAD);
        TITANIUM_CHESTPLATE = new ItemArmor("titanium_chestplate",ModArmorMaterials.TITANIUM, EquipmentSlotType.CHEST);
        TITANIUM_LEGGINGS = new ItemArmor("titanium_leggings", ModArmorMaterials.TITANIUM, EquipmentSlotType.LEGS);
        TITANIUM_BOOTS = new ItemArmor("titanium_boots", ModArmorMaterials.TITANIUM, EquipmentSlotType.FEET);
    }

    public static void addItem(Item item) {
        items.add(item);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        init();
        items.forEach(event.getRegistry()::register);
    }

    public static Item.Properties defaultProperties() {
        return new Item.Properties().group(ItemGroupEloncraft.INSTANCE);
    }

    public static Item.Properties defaultProperties(int maxStackSize) {
        return defaultProperties().maxStackSize(maxStackSize);
    }
}
