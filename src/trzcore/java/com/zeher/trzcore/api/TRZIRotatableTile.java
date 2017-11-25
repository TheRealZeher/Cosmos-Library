package com.zeher.trzcore.api;

import net.minecraft.util.EnumFacing;

public abstract interface TRZIRotatableTile
	{
	  public abstract boolean canRotate();
	  
	  public abstract void rotate();
	  
	  public abstract EnumFacing getDirectionFacing();
	}

