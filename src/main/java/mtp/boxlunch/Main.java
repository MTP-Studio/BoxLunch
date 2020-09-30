package mtp.boxlunch;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Main.MOD_ID,version = Main.VERSION,name = Main.NAME,acceptedMinecraftVersions = Main.ACCEPTED_MINECRAFT_VERSION)
public class Main {
        public static final String MOD_ID = "boxlunch";
        public static final String NAME="BoxLunch";
        public static final String VERSION = "1.0.0";
        public static final String ACCEPTED_MINECRAFT_VERSION="1.12.2";
        private static Logger logger;

        @EventHandler
        public void PreInit(FMLPreInitializationEvent event){
                logger = event.getModLog();
        }
        @EventHandler
        public void Init(FMLInitializationEvent event){

        }
        @EventHandler
        public void PostInit(FMLPostInitializationEvent event){

        }
}
