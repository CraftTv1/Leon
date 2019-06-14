package firetools ;


import firetools.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = FireTools.MODID, version = FireTools.VERSION, name = FireTools.NAME)
public class FireTools {
	public static final String MODID = "firetools";
	public static final String VERSION = "1.0";
	public static final String NAME = "FireTools";
	
	@Instance(MODID)
	public static  FireTools instance = new FireTools();
	
	@SidedProxy(modId = MODID, serverSide = "firetools.proxy.CommonProxy", clientSide = "firetools.proxy.ClientProxy")
	public static CommonProxy proxy = new CommonProxy();
	public FireItems items;
	public SwordTab tab1;
	public toolTab tab2;
	public ArmorTab tab3;
	public FireTabs tab;
	
	

	


	@EventHandler
	public void Preinit(FMLPreInitializationEvent event) {
		tab1 = new SwordTab();
		tab2 = new toolTab();
		tab3 = new ArmorTab();
		tab = new FireTabs();
		items = new FireItems();
		items.init();
		items.register();
	
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@EventHandler
	public void Postinit(FMLPostInitializationEvent event) {
		proxy.registerModels();
		

	}
}
