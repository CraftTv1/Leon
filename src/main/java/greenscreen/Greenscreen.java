package greenscreen;

import greenscreen.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Greenscreen.MODID, version = Greenscreen.VERSION, name = Greenscreen.NAME)
public class Greenscreen {
	public static final String MODID = "greenscreen";
	public static final String VERSION = "1.0";
	public static final String NAME = "Greenscreen";

	@Instance(MODID)
	public static Greenscreen instance;

	@SidedProxy(modId = MODID, serverSide = "greenscreen.proxy.CommonProxy", clientSide = "greenscreen.proxy.ClientProxy")
	public static CommonProxy proxy;
	public GreenscreenItems items;
	public Greenscreenblocks blocks;

	@EventHandler
	public void Preinit(FMLPreInitializationEvent event) {
		items = new GreenscreenItems();
		items.init();
		items.register();
		blocks = new Greenscreenblocks();
		blocks.init();
		blocks.register();

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@EventHandler
	public void Postinit(FMLPostInitializationEvent event) {
		proxy.registerModels();

	}
}
