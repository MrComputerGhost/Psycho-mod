package com.Psycho.item;

import com.Psycho.info.PsychoInfo;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ImaginaryIngot extends Item {

	public ImaginaryIngot(int par1, CreativeTabs tab) {
		super(par1);
		this.setCreativeTab(tab);
	}
	public void registerIcons(IconRegister registerIcon) {
		this.itemIcon = registerIcon.registerIcon(PsychoInfo.getResource(this.getUnlocalizedName()));
	}
	
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
	    {
	        player.mountEntity(entity);
			return true;
	    }
	
}
