package com.tcn.cosmoslibrary.impl.interfaces;

import net.minecraft.item.ItemStack;

/**
 * Used for names with meta.
 * Used for blocks with variants. {@link BlockPlanks}
 */
public interface IMetaName {

	public String getSpecialName(ItemStack stack);
	
}