package sword.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import sword.SwordItems;

public class Swords extends CreativeTabs {
	
	public Swords() {
		super("swords");
		this.setBackgroundImageName("item_search.png");
	}

	@Override
	public Item getTabIconItem() {
		return SwordItems.fireitem;
		
	}
	
	@Override
	public boolean hasSearchBar() {	
		return true;
	}
	
	

}
