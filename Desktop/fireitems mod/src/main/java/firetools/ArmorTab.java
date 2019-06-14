package firetools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ArmorTab extends CreativeTabs {
	
	public ArmorTab() {
		super("firetools");
		this.setBackgroundImageName("item_search.png");
	}

	@Override
	public Item getTabIconItem() {
		return FireItems.fire;
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}

}



