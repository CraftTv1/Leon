package sword;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import sword.proxy.CommonProxy;
import sword.tab.Swords;

@Mod(modid = SwordMod.MODID, version = SwordMod.VERSION, name = SwordMod.NAME)
public class SwordMod {
	public static final String MODID = "sword";
	public static final String VERSION = "1.0";
	public static final String NAME = "Sword";

	@Instance(MODID)
	public static SwordMod instance = new SwordMod();
	
	@SidedProxy(modId = MODID, serverSide = "sword.proxy.CommonProxy", clientSide = "sword.proxy.CommonProxy")
	public static CommonProxy proxy = new CommonProxy();

	public Swords tab;

	public SwordItems items;

	@EventHandler
	public void Preinit(FMLPreInitializationEvent event) {
		tab = new Swords();
		items = new SwordItems();
		items.init();
		items.register();

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerModels();

	}

	@EventHandler
	public void Postinit(FMLPostInitializationEvent event) {
		proxy.registerModels();

	}
}
