package sword;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import sword.item.FireItem;
import sword.tab.Swords;

public class SwordItems {
	
	public static Item fireitem;

	public void init() {
		fireitem = new FireItem().setCreativeTab(SwordMod.instance.tab);
		NameUtils.setNames(fireitem, "fireitem");

	}

	public void register() {
	registerItem(fireitem);
	
	}
	
	private void registerItem(Item item) {
		GameRegistry.register(item);
		
	}
}
