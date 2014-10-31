package DQMIIaddBoP;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "DQMNextBoPAddon", name = "DQMNextBoPAddon", version = "1.1.0",dependencies="after:DQMⅢ;after:BiomesOPlenty")
//@Mod(modid = "DQMNextBoPAddon", name = "DQMNextBoPAddon", version = "1.0.0",dependencies="after:DQMⅢ")
@NetworkMod(clientSideRequired = false, serverSideRequired = false)

public class DqmBopAddon {

	public static BoPConfigs bopCfg;

    @Mod.Init
    public void load(FMLInitializationEvent event)
    {

    	Configuration cfg1 = new Configuration(new File(DQMII.DQM.proxy.getDir(), "config/biomesoplenty/main.cfg"));
		//getConfigDim(cfg1);


    	bopCfg = new BoPConfigs(cfg1);
    	bopCfg.setBassai();
    	bopCfg.setCanSpawn();
    	bopCfg.setBassai();
    	AddMobSpawn.addSpawn();



    }
}
