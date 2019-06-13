package greenscreen.proxy;

import greenscreen.Greenscreen;
import greenscreen.GreenscreenItems;
import greenscreen.Greenscreenblocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerModels() {
		registerModel(GreenscreenItems.greenchroma,0,new ModelResourceLocation(GreenscreenItems.greenchroma.getRegistryName(),"inventory"));
		registerModel(Greenscreenblocks.greenscreenblock , 0, new ModelResourceLocation(Greenscreenblocks.greenscreenblock.getRegistryName(), "inventory"));
	}

	private void registerModel(Object obj, int meta, ModelResourceLocation loc) {
		Item item = null;
		if (obj instanceof Item) {
			item = (Item) obj;
		} else if (obj instanceof Block) {
			item = Item.getItemFromBlock((Block) obj);
		} else {
			throw new IllegalArgumentException();
		}
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, loc);
	}

}
