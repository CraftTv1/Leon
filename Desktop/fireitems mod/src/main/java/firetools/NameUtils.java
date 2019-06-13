package firetools;

import net.minecraft.item.Item;

public class NameUtils {
	
	public static void setNames(Object obj, String name) {
		if (obj instanceof Item) {
			((Item)obj).setRegistryName(name).setUnlocalizedName(name);
		}else {
			throw new IllegalArgumentException();
		}
	}

}
