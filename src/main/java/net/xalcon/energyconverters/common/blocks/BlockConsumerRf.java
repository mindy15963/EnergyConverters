package net.xalcon.energyconverters.common.blocks;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.xalcon.energyconverters.common.EnergyConvertersConfig;
import net.xalcon.energyconverters.common.tiles.TileEntityConsumerRf;

import javax.annotation.Nullable;
import java.util.List;

public class BlockConsumerRf extends BlockBase implements ITileEntityProvider
{
	public final static String INTERNAL_NAME = "energy_consumer_rf";

	public BlockConsumerRf()
	{
		super(Material.IRON, INTERNAL_NAME);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityConsumerRf();
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		if(EnergyConvertersConfig.showInfoTooltips)
			tooltip.add(I18n.format("energyconverters.rf_warning"));
	}
}
