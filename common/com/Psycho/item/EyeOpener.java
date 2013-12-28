package com.Psycho.item;

import com.Psycho.info.PsychoInfo;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EyeOpener extends Item {

	public EyeOpener(int par1, CreativeTabs tab) {
		super(par1);
		this.setCreativeTab(tab);
	}
	public void registerIcons(IconRegister registerIcon) {
		this.itemIcon = registerIcon.registerIcon(PsychoInfo.getResource(this.getUnlocalizedName()));
	}
	
	
	 /*Only test this in Survival Mode. 
	 **I am using DIM-1 (The Nether) for the dimension ATM.
	 **Be in the Nether for this to work.*/
	 
	  public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
		
		if (par2EntityPlayer.dimension == -1)
		{
	        par2EntityPlayer.travelToDimension(0);
	        par1ItemStack.stackSize = 0 ;
	        par2EntityPlayer.addChatMessage("§0<§kYourself§r§0> WAKE UP");
	        return true;	        		        		
	    }
		if (par2EntityPlayer.dimension != -1);
		{
			par2EntityPlayer.addChatMessage("Item Cannot Be Used In This Demension");
			return true;
		}
		
		
	    
    }
	
	       
  
	
}
