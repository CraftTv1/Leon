package greenscreen;

import greenscreen.items.GreenChroma;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GreenscreenItems {
	
	public static Item greenchroma;
	
	public void init() {
		greenchroma = new GreenChroma().setCreativeTab(CreativeTabs.MATERIALS);
		NameUtils.setNames(greenchroma, "greenchroma");
	}
	
	public void register() {
		registerItem(greenchroma);
		
	}
	
	private void registerItem(Item item) {
		GameRegistry.register(item);
		
	}

}
