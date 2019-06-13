package sword.proxy;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import sword.SwordItems;
import sword.SwordMod;

public class ClientProxy extends CommonProxy {

	public void registerModels() {
		registerModel(SwordItems.fireitem, 0, new ModelResourceLocation(SwordItems.fireitem.getRegistryName(), "inventory"));

	}

	private void registerModel(Object obj, int meta, ModelResourceLocation loc) {
		Item item = null;
		if (obj instanceof Item) {
			item = (Item) obj;
		} else if (obj instanceof Block) {
			Item.getItemFromBlock((Block) obj);
		} else {
			throw new IllegalArgumentException();
		}
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, loc);
	}

}
