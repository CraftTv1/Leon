package firetools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FireTabs extends CreativeTabs{
	
	public FireTabs() {
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
