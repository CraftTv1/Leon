package firetools;

import firetools.items.Fire;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FireItems {
	
	public static Item fire;
	
	public void init() {
		
		
		fire = new Fire().setCreativeTab(CreativeTabs.MATERIALS);
		NameUtils.setNames(fire, "fire");
	}
	
	public void register() {
		registerItem(fire);
	
	}
	
	private void registerItem(Item item) {
		GameRegistry.register(item);
	}
	
	}


