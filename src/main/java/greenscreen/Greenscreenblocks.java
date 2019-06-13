package greenscreen;

import greenscreen.block.Greenscreenblock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Greenscreenblocks {
	
	public static Block greenscreenblock;

	public void init() {
		greenscreenblock = new Greenscreenblock();
		NameUtils.setNames(greenscreenblock, "greenscreenblock");

	}

	public void register() {
		registerBlock(greenscreenblock);
	}

	private void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock itemblock = new ItemBlock(block);
		itemblock.setUnlocalizedName(block.getUnlocalizedName()).setRegistryName(block.getRegistryName());
		GameRegistry.register(itemblock);

	}

}
