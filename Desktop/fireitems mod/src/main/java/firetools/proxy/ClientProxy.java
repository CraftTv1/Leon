package firetools.proxy;

import firetools.FireItems;
import firetools.FireTools;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy {

	public void registerModels() {
		registerModel(FireItems.fire, 0, new ModelResourceLocation(FireItems.fire.getRegistryName(), "inventory"));

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
