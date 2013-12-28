package com.Psycho.item;

import com.Psycho.info.PsychoInfo;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class Nightcap extends ItemArmor {

        public Nightcap(int par1) {
                super(par1, EnumArmorMaterial.DIAMOND, 0, 0);
                this.setHasSubtypes(false);
        }

        
        @Override
        @SideOnly(Side.CLIENT)
        public void registerIcons(IconRegister par1IconRegister) {
                this.itemIcon = par1IconRegister.registerIcon(this.iconString = PsychoInfo.ID + ":crystalglasses");
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, int slot,
                        String type) {
                return this.iconString = PsychoInfo.ID + ":textures/models/armor/crystalglasses.png";
        }
}