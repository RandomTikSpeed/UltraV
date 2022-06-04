package com.randomtikspeed.ultrav.spigot.items;

import com.randomtikspeed.ultrav.spigot.UltraV;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class RulesItems {
    private UltraV instance;
    public ItemStack nullItem;
    public ItemStack close;
    public ItemStack back;

    public ItemStack mcRules;
    public ItemStack dcRules;

    public ItemStack mcRule1;
    public ItemStack mcRule2;
    public ItemStack mcRule3;
    public ItemStack mcRule4;
    public ItemStack mcRule5;
    public ItemStack mcRule6;

    public ItemStack dcRule1;
    public ItemStack dcRule2;
    public ItemStack dcRule3;
    public ItemStack dcRule4;
    public ItemStack dcRule5;
    public ItemStack dcRule6;
    public ItemStack dcRule7;
    public ItemStack dcRule8;
    public ItemStack dcRule9;
    public ItemStack dcRule10;

    public RulesItems(UltraV instance) {
        this.instance = instance;
    }

    public void init() {
        createNullItem();
        createClose();
        createBack();

        createMCRules();
        createDCRules();

        createMCRule1();
        createMCRule2();
        createMCRule3();
        createMCRule4();
        createMCRule5();
        createMCRule6();

        createDCRule1();
        createDCRule2();
        createDCRule3();
        createDCRule4();
        createDCRule5();
        createDCRule6();
        createDCRule7();
        createDCRule8();
        createDCRule9();
        createDCRule10();
    }


    // Null Item
    private void createNullItem() {
        ItemStack item = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(Component.text("")));
        item.setItemMeta(meta);
        nullItem = item;
    }
    // Close
    private void createClose() {
        ItemStack item = new ItemStack(Material.BARRIER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(instance.getCore().getMessageManager().getCoreMessages().Colour("&cClose"));
        item.setItemMeta(meta);
        close = item;
    }
    // Back
    private void createBack() {
        ItemStack item = new ItemStack(Material.BARRIER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(Component.text("§cGo Back")));
        item.setItemMeta(meta);
        back = item;

    }

    /* Main Menu */
    // Minecraft Rules Button
    private void createMCRules() {
        ItemStack item = new ItemStack(Material.OAK_SAPLING, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(Component.text("§aMinecraft Rules")));
        List<String> lore = new ArrayList<>();
        lore.add("§7Click to check out");
        lore.add("§7the Minecraft server");
        lore.add("§7rules!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        mcRules = item;
    }
    // Discord Rules Button
    private void createDCRules() {
        ItemStack item = new ItemStack(Material.LAPIS_LAZULI, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§9Discord Rules");
        List<String> lore = new ArrayList<>();
        lore.add("§7Click to check out");
        lore.add("§7the Discord server");
        lore.add("§7rules!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        dcRules = item;
    }

    /* Minecraft Rules */
    // Rule 1
    private void createMCRule1() {
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(Component.text("§61. No hacking")));
        List<String> lore = new ArrayList<>();
        lore.add(String.valueOf(Component.text("§7This includes but is not")));
        lore.add(String.valueOf(Component.text("§7limited to xray, minimaps,")));
        lore.add(String.valueOf(Component.text("§7and automine")));
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        mcRule1 = item;
    }
    // Rule 2
    private void createMCRule2() {
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(Component.text("§62. Do not beg the staff for items")));
        List<String> lore = new ArrayList<>();
        lore.add(String.valueOf(Component.text("§7We will not give them to you")));
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        mcRule2 = item;
    }
    // Rule 3
    private void createMCRule3() {
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(Component.text("§63. Lag machines are not allowed")));
        List<String> lore = new ArrayList<>();
        lore.add(String.valueOf(Component.text("§7If found, any lag machines")));
        lore.add(String.valueOf(Component.text("§7will be removed and a")));
        lore.add(String.valueOf(Component.text("§7punishment may be issued")));
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        mcRule3 = item;
    }
    // Rule 4
    private void createMCRule4() {
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(Component.text("§64. Do not bug abuse")));
        List<String> lore = new ArrayList<>();
        lore.add(String.valueOf(Component.text("§7If you find a bug / glitch,")));
        lore.add(String.valueOf(Component.text("§7please tell a staff member.")));
        lore.add(String.valueOf(Component.text("§7This includes inconsistencies")));
        lore.add(String.valueOf(Component.text("§7in /shop")));
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        mcRule4 = item;
    }
    // Rule 5
    private void createMCRule5() {
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(Component.text("§65. Do not target new players")));
        List<String> lore = new ArrayList<>();
        lore.add(String.valueOf(Component.text("§7Don't target only new players, as")));
        lore.add(String.valueOf(Component.text("§7this can drive them off our server")));
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        mcRule5 = item;
    }
    // Rule 6
    private void createMCRule6() {
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(Component.text("§66. Do not tp trap")));
        List<String> lore = new ArrayList<>();
        lore.add(String.valueOf(Component.text("§7This gives you an unfair advantage")));
        lore.add(String.valueOf(Component.text("§7over unsuspecting or new players")));
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        mcRule6 = item;
    }

    /* Discord Rules */
    // Rule 1
    private void createDCRule1() {
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(Component.text("§91. Don't spam")));
        List<String> lore = new ArrayList<>();
        lore.add(String.valueOf(Component.text("§7Don't clog the chats with lots")));
        lore.add(String.valueOf(Component.text("§7of unnecessary messages")));
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        dcRule1 = item;
    }
    // Rule 2
    private void createDCRule2() {
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(Component.text("§92. No excessive swearing")));
        List<String> lore = new ArrayList<>();
        lore.add(String.valueOf(Component.text("§7Swearing is allowed, but")));
        lore.add(String.valueOf(Component.text("§7use it in moderation")));
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        dcRule2 = item;
    }
    // Rule 3
    private void createDCRule3() {
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(Component.text("§93. No NSFW")));
        List<String> lore = new ArrayList<>();
        lore.add(String.valueOf(Component.text("§7Do not talk about gore / sexual")));
        lore.add(String.valueOf(Component.text("§7topics, this is a Minecraft server")));
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        dcRule3 = item;
    }
    // Rule 4
    private void createDCRule4() {
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(Component.text("§94. No hate speech, slurs, death threats")));
        List<String> lore = new ArrayList<>();
        lore.add(String.valueOf(Component.text("§7Homophobia, racism, ableism and other")));
        lore.add(String.valueOf(Component.text("§7forms of hate speech will not be tolerated")));
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        dcRule4 = item;
    }
    // Rule 5
    private void createDCRule5() {
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(Component.text("§95. No sensitive or controversial topics")));
        List<String> lore = new ArrayList<>();
        lore.add(String.valueOf(Component.text("§7This is not the place for political debates")));
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        dcRule5 = item;
    }
    // Rule 6
    private void createDCRule6() {
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(Component.text("§96. Do not unnecessarily ping staff")));
        List<String> lore = new ArrayList<>();
        lore.add(String.valueOf(Component.text("§7If you need help, please don't ping")));
        lore.add(String.valueOf(Component.text("§7us 13 times. We have lives too")));
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        dcRule6 = item;
    }
    // Rule 7
    private void createDCRule7() {
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(Component.text("§97. Use the correct channels")));
        List<String> lore = new ArrayList<>();
        lore.add(String.valueOf(Component.text("§7Try to keep the subject of")));
        lore.add(String.valueOf(Component.text("§7conversation relevant to the channel")));
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        dcRule7 = item;
    }
    // Rule 8
    private void createDCRule8() {
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(Component.text("§98. Do not target or harass anyone")));
        List<String> lore = new ArrayList<>();
        lore.add(String.valueOf(Component.text("§7Harassment of any kind will not be tolerated")));
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        dcRule8 = item;
    }
    // Rule 9
    private void createDCRule9() {
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(Component.text("§99. Do not self advertise / promote")));
        List<String> lore = new ArrayList<>();
        lore.add(String.valueOf(Component.text("§7Don't advertise your stuff")));
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        dcRule9 = item;
    }
    // Rule 10
    private void createDCRule10() {
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(String.valueOf(Component.text("§910. Follow Discord's TOS")));
        List<String> lore = new ArrayList<>();
        lore.add(String.valueOf(Component.text("§6Right click to view their TOS")));
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        dcRule10 = item;
    }
}
