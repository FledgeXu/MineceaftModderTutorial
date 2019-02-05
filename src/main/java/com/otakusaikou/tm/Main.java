package com.otakusaikou.tm;

import com.otakusaikou.tm.Proxy.CommonProxy;
import com.otakusaikou.tm.util.Reference;
import com.otakusaikou.tm.util.Util;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = Reference.NAME, modid = Reference.MODID, version = Reference.VERSION)
public class Main {
    @Instance
    public static Main instance = new Main();
    @SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        Util.logger = event.getModLog();
        Util.logger.warn("It's preInit");
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        Util.logger.warn("It's Init");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        Util.logger.warn("It's postInit");
    }

}
