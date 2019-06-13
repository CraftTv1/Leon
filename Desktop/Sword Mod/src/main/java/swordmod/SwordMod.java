package swordmod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import swordmod.proxy.CommonProxy;

@Mod(modid = SwordMod.MODID, version = SwordMod.VERSION, name = SwordMod.NAME)
public class SwordMod {
	public static final String MODID = "sword";
	public static final String VERSION = "1.0";
	public static final String NAME = "Sword";

	@Instance(MODID)
	public static SwordMod  instance;

	@SidedProxy(modId = MODID, serverSide = "greenscreen.proxy.CommonProxy", clientSide = "greenscreen.proxy.ClientProxy")
	public static CommonProxy proxy;


	@EventHandler
	public void Preinit(FMLPreInitializationEvent event) {
		

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@EventHandler
	public void Postinit(FMLPostInitializationEvent event) {
		proxy.registerModels();
	

	}
}
