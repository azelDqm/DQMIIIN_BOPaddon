package DQMIIaddBoP;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.src.ModLoader;
import DQMII.DQM;
import DQMII.DqmEvent1;
import DQMII.DqmEvent2;
import DQMII.Client.MobEntity.DqmEntityAyasiikage;
import DQMII.Client.MobEntity.DqmEntityBigCrow;
import DQMII.Client.MobEntity.DqmEntityBigguhatto;
import DQMII.Client.MobEntity.DqmEntityBubsura;
import DQMII.Client.MobEntity.DqmEntityBurauni;
import DQMII.Client.MobEntity.DqmEntityButisuraimu;
import DQMII.Client.MobEntity.DqmEntityDokuroarai;
import DQMII.Client.MobEntity.DqmEntityDoronuba;
import DQMII.Client.MobEntity.DqmEntityDorozara;
import DQMII.Client.MobEntity.DqmEntityDragosuraimu;
import DQMII.Client.MobEntity.DqmEntityDucksbill;
import DQMII.Client.MobEntity.DqmEntityGizumo;
import DQMII.Client.MobEntity.DqmEntityGizumoAZ;
import DQMII.Client.MobEntity.DqmEntityGuntaigani;
import DQMII.Client.MobEntity.DqmEntityHitokuisaberu;
import DQMII.Client.MobEntity.DqmEntityHoimisura;
import DQMII.Client.MobEntity.DqmEntityIkkakuusagi;
import DQMII.Client.MobEntity.DqmEntityItamogu;
import DQMII.Client.MobEntity.DqmEntityKimera;
import DQMII.Client.MobEntity.DqmEntityKirapan;
import DQMII.Client.MobEntity.DqmEntityKirikabuobake;
import DQMII.Client.MobEntity.DqmEntityMadohando;
import DQMII.Client.MobEntity.DqmEntityMomon;
import DQMII.Client.MobEntity.DqmEntityMomonja;
import DQMII.Client.MobEntity.DqmEntityObakekinoko;
import DQMII.Client.MobEntity.DqmEntityObakeumiusi;
import DQMII.Client.MobEntity.DqmEntityOnikozou;
import DQMII.Client.MobEntity.DqmEntityOokiduti;
import DQMII.Client.MobEntity.DqmEntityOokutibasi;
import DQMII.Client.MobEntity.DqmEntityOomedama;
import DQMII.Client.MobEntity.DqmEntityOonamekuji;
import DQMII.Client.MobEntity.DqmEntityPapetkozou;
import DQMII.Client.MobEntity.DqmEntityPurizunyan;
import DQMII.Client.MobEntity.DqmEntityRippusu;
import DQMII.Client.MobEntity.DqmEntityRiripat;
import DQMII.Client.MobEntity.DqmEntitySibirekurage;
import DQMII.Client.MobEntity.DqmEntitySimasimacat;
import DQMII.Client.MobEntity.DqmEntitySirudokozou;
import DQMII.Client.MobEntity.DqmEntitySukippaa;
import DQMII.Client.MobEntity.DqmEntitySunomon;
import DQMII.Client.MobEntity.DqmEntitySupini;
import DQMII.Client.MobEntity.DqmEntitySura;
import DQMII.Client.MobEntity.DqmEntitySuraimubesu;
import DQMII.Client.MobEntity.DqmEntitySuraimunaito;
import DQMII.Client.MobEntity.DqmEntitySuraimutawa;
import DQMII.Client.MobEntity.DqmEntitySuraimutumuri;
import DQMII.Client.MobEntity.DqmEntityTogebouzu;
import DQMII.Client.MobEntity.DqmEntityTukaima;
import DQMII.Client.MobEntity.DqmEntityUzusioking;
import DQMII.Client.MobEntity.DqmEntityWaraibukuro;
import DQMII.Client.MobEntity.DqmEntityZinmentyou;
import DQMII.Client.MobEntity.DqmEntityZukkinya;
import DQMII.Client.MobEntity2.DqmEntityAkumanosyo;
import DQMII.Client.MobEntity2.DqmEntityAnimaruzonbi;
import DQMII.Client.MobEntity2.DqmEntityArumiraji;
import DQMII.Client.MobEntity2.DqmEntityBaburin;
import DQMII.Client.MobEntity2.DqmEntityBakudanbebi;
import DQMII.Client.MobEntity2.DqmEntityBakudaniwa;
import DQMII.Client.MobEntity2.DqmEntityBebisatan;
import DQMII.Client.MobEntity2.DqmEntityBehoimisuraimu;
import DQMII.Client.MobEntity2.DqmEntityBehoimusuraimu;
import DQMII.Client.MobEntity2.DqmEntityBerobero;
import DQMII.Client.MobEntity2.DqmEntityBeronyaago;
import DQMII.Client.MobEntity2.DqmEntityBuchunpa;
import DQMII.Client.MobEntity2.DqmEntityBuraddihando;
import DQMII.Client.MobEntity2.DqmEntityButtizukinya;
import DQMII.Client.MobEntity2.DqmEntityDesufuratta;
import DQMII.Client.MobEntity2.DqmEntityDokuyazukin;
import DQMII.Client.MobEntity2.DqmEntityDoraki;
import DQMII.Client.MobEntity2.DqmEntityDorakima;
import DQMII.Client.MobEntity2.DqmEntityEnzeruslime;
import DQMII.Client.MobEntity2.DqmEntityFgizumo;
import DQMII.Client.MobEntity2.DqmEntityFurosutogizumo;
import DQMII.Client.MobEntity2.DqmEntityGaikotukensi;
import DQMII.Client.MobEntity2.DqmEntityGhost;
import DQMII.Client.MobEntity2.DqmEntityGorudentotemu;
import DQMII.Client.MobEntity2.DqmEntityHerughost;
import DQMII.Client.MobEntity2.DqmEntityHgizumo;
import DQMII.Client.MobEntity2.DqmEntityHiitogizumo;
import DQMII.Client.MobEntity2.DqmEntityHitokuibako;
import DQMII.Client.MobEntity2.DqmEntityHitokuiga;
import DQMII.Client.MobEntity2.DqmEntityHoroghost;
import DQMII.Client.MobEntity2.DqmEntityHyouganmajin;
import DQMII.Client.MobEntity2.DqmEntityJeriman;
import DQMII.Client.MobEntity2.DqmEntityKingsura;
import DQMII.Client.MobEntity2.DqmEntityKirapan2;
import DQMII.Client.MobEntity2.DqmEntityKirasuko;
import DQMII.Client.MobEntity2.DqmEntityMapetman;
import DQMII.Client.MobEntity2.DqmEntityMarinsuraimu;
import DQMII.Client.MobEntity2.DqmEntityMatango;
import DQMII.Client.MobEntity2.DqmEntityMeijidoraki;
import DQMII.Client.MobEntity2.DqmEntityMeijikimera;
import DQMII.Client.MobEntity2.DqmEntityMeragosuto;
import DQMII.Client.MobEntity2.DqmEntityMetaruraida;
import DQMII.Client.MobEntity2.DqmEntityMetoroghost;
import DQMII.Client.MobEntity2.DqmEntityMimikku;
import DQMII.Client.MobEntity2.DqmEntityMinidemon;
import DQMII.Client.MobEntity2.DqmEntityMrippusu;
import DQMII.Client.MobEntity2.DqmEntityNightwalker;
import DQMII.Client.MobEntity2.DqmEntityObakekyandoru;
import DQMII.Client.MobEntity2.DqmEntityOdoruhouseki;
import DQMII.Client.MobEntity2.DqmEntityPinkmomon;
import DQMII.Client.MobEntity2.DqmEntitySamayoutamasii;
import DQMII.Client.MobEntity2.DqmEntitySibireageha;
import DQMII.Client.MobEntity2.DqmEntitySibiredanbira;
import DQMII.Client.MobEntity2.DqmEntitySkullgaroo;
import DQMII.Client.MobEntity2.DqmEntitySumairurokku;
import DQMII.Client.MobEntity2.DqmEntitySumoruguru;
import DQMII.Client.MobEntity2.DqmEntitySupekutetto;
import DQMII.Client.MobEntity2.DqmEntitySura2;
import DQMII.Client.MobEntity2.DqmEntitySuraimubogu;
import DQMII.Client.MobEntity2.DqmEntitySuraimuburesu;
import DQMII.Client.MobEntity2.DqmEntitySuraimuking;
import DQMII.Client.MobEntity2.DqmEntitySyado;
import DQMII.Client.MobEntity2.DqmEntityTahodoraki;
import DQMII.Client.MobEntity2.DqmEntityTomosibikozou;
import DQMII.Client.MobEntity2.DqmEntityTonburero;
import DQMII.Client.MobEntity2.DqmEntityTutiwarasi;
import DQMII.Client.MobEntity2.DqmEntityUmiusi;
import DQMII.Client.MobEntity2.DqmEntityYouganmajin;
import DQMII.Client.MobEntityEnd.DqmEntityAkairai;
import DQMII.Client.MobEntityEnd.DqmEntityBiggumoai;
import DQMII.Client.MobEntityEnd.DqmEntityDakuhobitto;
import DQMII.Client.MobEntityEnd.DqmEntityDakunaito;
import DQMII.Client.MobEntityEnd.DqmEntityDasudragon;
import DQMII.Client.MobEntityEnd.DqmEntityDebirurodo;
import DQMII.Client.MobEntityEnd.DqmEntityDenga;
import DQMII.Client.MobEntityEnd.DqmEntityDesujakkaru;
import DQMII.Client.MobEntityEnd.DqmEntityDragondarknaito;
import DQMII.Client.MobEntityEnd.DqmEntityGamegonrejendo;
import DQMII.Client.MobEntityEnd.DqmEntityGigantesu;
import DQMII.Client.MobEntityEnd.DqmEntityGodraida;
import DQMII.Client.MobEntityEnd.DqmEntityKagenokisi;
import DQMII.Client.MobEntityEnd.DqmEntityRyuiso;
import DQMII.Client.MobEntityHell.DqmEntityAnkokumajin;
import DQMII.Client.MobEntityHell.DqmEntityAroinpu;
import DQMII.Client.MobEntityHell.DqmEntityBaburuking;
import DQMII.Client.MobEntityHell.DqmEntityBarakku;
import DQMII.Client.MobEntityHell.DqmEntityBariidodog;
import DQMII.Client.MobEntityHell.DqmEntityBatorurex;
import DQMII.Client.MobEntityHell.DqmEntityBehomasuraimu;
import DQMII.Client.MobEntityHell.DqmEntityBiggufeisu;
import DQMII.Client.MobEntityHell.DqmEntityBoureikensi;
import DQMII.Client.MobEntityHell.DqmEntityBuraddosodo;
import DQMII.Client.MobEntityHell.DqmEntityBurakkubejita;
import DQMII.Client.MobEntityHell.DqmEntityDarkslime;
import DQMII.Client.MobEntityHell.DqmEntityDeddopekka;
import DQMII.Client.MobEntityHell.DqmEntityDgizumo;
import DQMII.Client.MobEntityHell.DqmEntityDollmaster;
import DQMII.Client.MobEntityHell.DqmEntityDqmdragon;
import DQMII.Client.MobEntityHell.DqmEntityDragonnaito;
import DQMII.Client.MobEntityHell.DqmEntityDragonraida;
import DQMII.Client.MobEntityHell.DqmEntityGamegon;
import DQMII.Client.MobEntityHell.DqmEntityGamegonload;
import DQMII.Client.MobEntityHell.DqmEntityGanirasu;
import DQMII.Client.MobEntityHell.DqmEntityGoldman;
import DQMII.Client.MobEntityHell.DqmEntityGoremu;
import DQMII.Client.MobEntityHell.DqmEntityGorudensuraimu;
import DQMII.Client.MobEntityHell.DqmEntityHotatewarabi;
import DQMII.Client.MobEntityHell.DqmEntityJigokunohasami;
import DQMII.Client.MobEntityHell.DqmEntityKemunkurusu;
import DQMII.Client.MobEntityHell.DqmEntityKirakurabu;
import DQMII.Client.MobEntityHell.DqmEntityKiramasin;
import DQMII.Client.MobEntityHell.DqmEntityKisudragon;
import DQMII.Client.MobEntityHell.DqmEntityKuinsuraimu;
import DQMII.Client.MobEntityHell.DqmEntityMagematango;
import DQMII.Client.MobEntityHell.DqmEntityMagemomonja;
import DQMII.Client.MobEntityHell.DqmEntityMagumaron;
import DQMII.Client.MobEntityHell.DqmEntityMajikaruhatto;
import DQMII.Client.MobEntityHell.DqmEntityMaounokage;
import DQMII.Client.MobEntityHell.DqmEntityMaporena;
import DQMII.Client.MobEntityHell.DqmEntityMegazarurokku;
import DQMII.Client.MobEntityHell.DqmEntityMetaruhanta;
import DQMII.Client.MobEntityHell.DqmEntityMetaruhantaken;
import DQMII.Client.MobEntityHell.DqmEntityPandorabox;
import DQMII.Client.MobEntityHell.DqmEntityPikusi;
import DQMII.Client.MobEntityHell.DqmEntityPombom;
import DQMII.Client.MobEntityHell.DqmEntityPuyon;
import DQMII.Client.MobEntityHell.DqmEntityRedsaikuron;
import DQMII.Client.MobEntityHell.DqmEntitySaikuropusu;
import DQMII.Client.MobEntityHell.DqmEntitySirubadebiru;
import DQMII.Client.MobEntityHell.DqmEntitySiryounokisi;
import DQMII.Client.MobEntityHell.DqmEntitySodofantomu;
import DQMII.Client.MobEntityHell.DqmEntityStarkimera;
import DQMII.Client.MobEntityHell.DqmEntityStonman;
import DQMII.Client.MobEntityHell.DqmEntitySuraimubehomazun;
import DQMII.Client.MobEntityHell.DqmEntitySuraimuhaitawa;
import DQMII.Client.MobEntityHell.DqmEntitySuraimumadyura;
import DQMII.Client.MobEntityHell.DqmEntityUmibouzu;
import DQMII.Client.MobEntityMetaru.DqmEntityDaiyamondosuraimu;
import DQMII.Client.MobEntityMetaru.DqmEntityDragometaru;
import DQMII.Client.MobEntityMetaru.DqmEntityHagumeta;
import DQMII.Client.MobEntityMetaru.DqmEntityHaguremetaruking;
import DQMII.Client.MobEntityMetaru.DqmEntityMetaking;
import DQMII.Client.MobEntityMetaru.DqmEntityMetaruburazazu;
import DQMII.Client.MobEntityMetaru.DqmEntityMetasura;
import DQMII.Client.MobEntityMetaru.DqmEntityPuratinaking;
public class AddMobSpawn
{
/*
    //全部
    static BiomeGenBase[] allHellEnd = { BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.river, BiomeGenBase.beach,
                                         BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
                                         BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.frozenRiver,
                                         BiomeGenBase.extremeHills,
                                         BiomeGenBase.iceMountains, BiomeGenBase.icePlains,
                                         BiomeGenBase.jungle, BiomeGenBase.jungleHills,
                                         BiomeGenBase.plains,
                                         BiomeGenBase.swampland,
                                         BiomeGenBase.taiga, BiomeGenBase.taigaHills,
                                         BiomeGenBase.hell, BiomeGenBase.sky, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore
                                       };
    static BiomeGenBase[] all = { BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.river, BiomeGenBase.beach,
                                  BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
                                  BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.frozenRiver,
                                  BiomeGenBase.extremeHills,
                                  BiomeGenBase.iceMountains, BiomeGenBase.icePlains,
                                  BiomeGenBase.jungle, BiomeGenBase.jungleHills,
                                  BiomeGenBase.plains,
                                  BiomeGenBase.swampland,
                                  BiomeGenBase.taiga, BiomeGenBase.taigaHills,
                                  BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore
                                };

    static BiomeGenBase[] desert = { BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.swampland, BiomeGenBase.river, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.river, BiomeGenBase.beach };
    static BiomeGenBase[] plains = { BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.frozenRiver, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.beach };
    static BiomeGenBase[] ice = { BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.iceMountains, BiomeGenBase.icePlains, BiomeGenBase.river, BiomeGenBase.beach };

    static BiomeGenBase[] hell = { BiomeGenBase.hell};
    static BiomeGenBase[] end = { BiomeGenBase.sky, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore};

    //static BiomeGenBase[] hellboss = { BiomeGenBase.hell,BiomeGenBase.mushroomIsland,BiomeGenBase.mushroomIslandShore};
    //static BiomeGenBase[] endboss = { BiomeGenBase.sky,BiomeGenBase.mushroomIsland,BiomeGenBase.mushroomIslandShore};

    static BiomeGenBase[] all = { BiomeGenBase.forest, BiomeGenBase.swampland, BiomeGenBase.desert, BiomeGenBase.taiga, BiomeGenBase.icePlains, BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.jungle, BiomeGenBase.river, BiomeGenBase.beach, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore };
    static BiomeGenBase[] all = { BiomeGenBase.forest, BiomeGenBase.swampland, BiomeGenBase.desert, BiomeGenBase.taiga, BiomeGenBase.extremeHills, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore };
    static BiomeGenBase[] metaru3 = { BiomeGenBase.extremeHillsEdge, BiomeGenBase.forestHills, BiomeGenBase.taigaHills, BiomeGenBase.jungleHills, BiomeGenBase.desertHills, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore };
    static BiomeGenBase[] metaru4 = { BiomeGenBase.hell, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.taigaHills };
    static BiomeGenBase[] metaru5 = { BiomeGenBase.sky, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.jungleHills };
*/
    public float getSpawningChance()
    {
        return 0.52F;
    }

    public static void addSpawn()
    {
    	/*
    	if(EnumCreatureType.monster == null)
    	{
    		System.out.println("DEBUGLINE:EnumCreatureType.monster");
    	}
    	if(DqmBopAddon.bopCfg.allHellEnd == null)
    	{
    		System.out.println("DEBUGLINE:DqmBopAddon.bopCfg.allHellEnd");
    	}
    	*/

    	/*
        for(int cnt = 0; cnt < DqmBopAddon.bopCfg.allHellEnd.length; cnt ++)
        {
        	System.out.println("allHellEnd:" + DqmBopAddon.bopCfg.allHellEnd[cnt].biomeName);
        }
        for(int cnt = 0; cnt < DqmBopAddon.bopCfg.all.length; cnt ++)
        {
        	System.out.println("all:" + DqmBopAddon.bopCfg.all[cnt].biomeName);
        }
        for(int cnt = 0; cnt < DqmBopAddon.bopCfg.desert.length; cnt ++)
        {
        	System.out.println("desert:" + DqmBopAddon.bopCfg.desert[cnt].biomeName);
        }
        for(int cnt = 0; cnt < DqmBopAddon.bopCfg.plains.length; cnt ++)
        {
        	System.out.println("plains:" + DqmBopAddon.bopCfg.plains[cnt].biomeName);
        }
        for(int cnt = 0; cnt < DqmBopAddon.bopCfg.ice.length; cnt ++)
        {
        	System.out.println("ice:" + DqmBopAddon.bopCfg.ice[cnt].biomeName);
        }
        for(int cnt = 0; cnt < DqmBopAddon.bopCfg.hell.length; cnt ++)
        {
        	System.out.println("hell:" + DqmBopAddon.bopCfg.hell[cnt].biomeName);
        }
        for(int cnt = 0; cnt < DqmBopAddon.bopCfg.end.length; cnt ++)
        {
        	System.out.println("end:" + DqmBopAddon.bopCfg.end[cnt].biomeName);
        }

        for(int cnt = 0; cnt < DqmBopAddon.bopCfg.metaru3.length; cnt ++)
        {
        	System.out.println("metaru3:" + DqmBopAddon.bopCfg.metaru3[cnt].biomeName);
        }
        for(int cnt = 0; cnt < DqmBopAddon.bopCfg.metaru4.length; cnt ++)
        {
        	System.out.println("metaru4:" + DqmBopAddon.bopCfg.metaru4[cnt].biomeName);
        }
        for(int cnt = 0; cnt < DqmBopAddon.bopCfg.metaru5.length; cnt ++)
        {
        	System.out.println("metaru5:" + DqmBopAddon.bopCfg.metaru5[cnt].biomeName);
        }

        if(DqmBopAddon.bopCfg.allHellEnd != null)
        {
        	System.out.println("DEBUGLINE:NULL!!!!!!!!!!!!!!!!");
        }
*/
        ModLoader.addSpawn(DqmEvent1.class, 3, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.allHellEnd);
        ModLoader.addSpawn(DqmEvent2.class, 3, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityAkairai.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.end);
        ModLoader.addSpawn(DqmEntityBiggumoai.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.end);
        ModLoader.addSpawn(DqmEntityDakuhobitto.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.end);
        ModLoader.addSpawn(DqmEntityDakunaito.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.end);
        ModLoader.addSpawn(DqmEntityDasudragon.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.end);
        ModLoader.addSpawn(DqmEntityDebirurodo.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.end);
        ModLoader.addSpawn(DqmEntityDenga.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.end);
        ModLoader.addSpawn(DqmEntityDesujakkaru.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.end);
        //ModLoader.addSpawn(DqmEntityDesupisaro1.class, 1, 1, 1, EnumCreatureType.monster,endboss);
        ModLoader.addSpawn(DqmEntityDragondarknaito.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.end);
        //ModLoader.addSpawn(DqmEntityEsterk.class, 1, 1, 1, EnumCreatureType.monster,endboss);
        ModLoader.addSpawn(DqmEntityGamegonrejendo.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.end);
        ModLoader.addSpawn(DqmEntityGigantesu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.end);
        ModLoader.addSpawn(DqmEntityGodraida.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.end);
        ModLoader.addSpawn(DqmEntityKagenokisi.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.end);
        //ModLoader.addSpawn(DqmEntityNorowaretaturugi.class, 1, 1, 1, EnumCreatureType.monster,endboss);
        ModLoader.addSpawn(DqmEntityRyuiso.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.end);
        ModLoader.addSpawn(DqmEntityStarkimera.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.end);
/*
        ModLoader.addSpawn(DqmEntityAyasiikage.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityBaburin.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityBerobero.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityBigCrow.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityBigguhatto.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityBubsura.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityDoraki.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityDragosuraimu.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityGaikotukensi.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityGhost.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityGizumo.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityGizumoAZ.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityGuntaigani.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityHerughost.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityHitokuibako.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityHitokuisaberu.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityIkkakuusagi.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityItamogu.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityKingsura.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityMapetman.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityMeragosuto.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityMetoroghost.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityMimikku.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityMinidemon.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityMomon.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityObakekyandoru.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityOnikozou.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityOokiduti.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityOonamekuji.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityRippusu.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntitySamayoutamasii.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntitySimasimacat.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntitySkullgaroo.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntitySumoruguru.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntitySupini.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntitySura.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntitySuraimubesu.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntitySuraimubogu.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntitySuraimuburesu.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntitySyado.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityTogebouzu.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityTukaima.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityTutiwarasi.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityZinmentyou.class, 12, 1, 1, EnumCreatureType.monster);
        ModLoader.addSpawn(DqmEntityZukkinya.class, 12, 1, 1, EnumCreatureType.monster);
*/

        /*
        for(int cnt = 0; cnt < DqmBopAddon.bopCfg.allHellEnd.length; cnt ++)
        {
        	System.out.println("allHellEnd:" + DqmBopAddon.bopCfg.allHellEnd[cnt].biomeName);
        }
        for(int cnt = 0; cnt < DqmBopAddon.bopCfg.all.length; cnt ++)
        {
        	System.out.println("all:" + DqmBopAddon.bopCfg.all[cnt].biomeName);
        }
        for(int cnt = 0; cnt < DqmBopAddon.bopCfg.desert.length; cnt ++)
        {
        	System.out.println("desert:" + DqmBopAddon.bopCfg.desert[cnt].biomeName);
        }
        for(int cnt = 0; cnt < DqmBopAddon.bopCfg.plains.length; cnt ++)
        {
        	System.out.println("plains:" + DqmBopAddon.bopCfg.plains[cnt].biomeName);
        }
        for(int cnt = 0; cnt < DqmBopAddon.bopCfg.ice.length; cnt ++)
        {
        	System.out.println("ice:" + DqmBopAddon.bopCfg.ice[cnt].biomeName);
        }
        for(int cnt = 0; cnt < DqmBopAddon.bopCfg.hell.length; cnt ++)
        {
        	System.out.println("hell:" + DqmBopAddon.bopCfg.hell[cnt].biomeName);
        }
        for(int cnt = 0; cnt < DqmBopAddon.bopCfg.end.length; cnt ++)
        {
        	System.out.println("end:" + DqmBopAddon.bopCfg.end[cnt].biomeName);
        }

        for(int cnt = 0; cnt < DqmBopAddon.bopCfg.metaru3.length; cnt ++)
        {
        	System.out.println("metaru3:" + DqmBopAddon.bopCfg.metaru3[cnt].biomeName);
        }
        for(int cnt = 0; cnt < DqmBopAddon.bopCfg.metaru4.length; cnt ++)
        {
        	System.out.println("metaru4:" + DqmBopAddon.bopCfg.metaru4[cnt].biomeName);
        }
        for(int cnt = 0; cnt < DqmBopAddon.bopCfg.metaru5.length; cnt ++)
        {
        	System.out.println("metaru5:" + DqmBopAddon.bopCfg.metaru5[cnt].biomeName);
        }
*/
        ModLoader.addSpawn(DqmEntityAyasiikage.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityBaburin.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityBerobero.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityBigCrow.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityBigguhatto.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityBubsura.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityDoraki.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityDragosuraimu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityGaikotukensi.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityGhost.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityGizumo.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityGizumoAZ.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityGuntaigani.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityHerughost.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityHitokuibako.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityHitokuisaberu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityIkkakuusagi.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityItamogu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityKingsura.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityMapetman.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityMeragosuto.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityMetoroghost.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityMimikku.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityMinidemon.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityMomon.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityObakekyandoru.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityOnikozou.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityOokiduti.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityOonamekuji.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityRippusu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntitySamayoutamasii.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntitySimasimacat.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntitySkullgaroo.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntitySumoruguru.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntitySupini.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntitySura.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntitySuraimubesu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntitySuraimubogu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntitySuraimuburesu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntitySyado.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityTogebouzu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityTukaima.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityTutiwarasi.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityZinmentyou.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityZukkinya.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityAnkokumajin.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityAroinpu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityBaburuking.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityBarakku.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityBariidodog.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityBatorurex.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        //ModLoader.addSpawn(DqmEntityBazuzu.class, 1, 1, 1, EnumCreatureType.monster,hellboss);
        ModLoader.addSpawn(DqmEntityBehomasuraimu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityBiggufeisu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityBoureikensi.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityBuraddosodo.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityBurakkubejita.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        //ModLoader.addSpawn(DqmEntityDarkRamia.class, 1, 1, 1, EnumCreatureType.monster,hellboss);
        ModLoader.addSpawn(DqmEntityDarkslime.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityDeddopekka.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityDgizumo.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityDollmaster.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityDqmdragon.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityDragonnaito.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityDragonraida.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityGamegon.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityGamegonload.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityGanirasu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityGoldman.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityGoremu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityGorudensuraimu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityHotatewarabi.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityJigokunohasami.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityKemunkurusu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityKirakurabu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        //ModLoader.addSpawn(DqmEntityKiramajinga.class, 1, 1, 1, EnumCreatureType.monster,endboss);
        if(DQM.killKiramasin == 1)
        {
        	ModLoader.addSpawn(DqmEntityKiramasin.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        }
        ModLoader.addSpawn(DqmEntityKirapan2.class, 4, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityKisudragon.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityKuinsuraimu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityMagematango.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityMagemomonja.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityMagumaron.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityMajikaruhatto.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityMaounokage.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityMaporena.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        //ModLoader.addSpawn(DqmEntityMasterdoragon.class, 1, 1, 1, EnumCreatureType.monster,hellboss);
        ModLoader.addSpawn(DqmEntityMegazarurokku.class, 6, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityMetaruhanta.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityMetaruhantaken.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityPandorabox.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityPikusi.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityPombom.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityPuyon.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityRedsaikuron.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        //ModLoader.addSpawn(DqmEntityRyuuou.class, 1, 1, 1, EnumCreatureType.monster,endboss);
        ModLoader.addSpawn(DqmEntitySaikuropusu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntitySirubadebiru.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntitySiryounokisi.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntitySodofantomu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityStonman.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntitySuraimubehomazun.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntitySuraimuhaitawa.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        //ModLoader.addSpawn(DqmEntitySuraimujeneraru.class, 1, 1, 1, EnumCreatureType.monster,hellboss);
        ModLoader.addSpawn(DqmEntitySuraimumadyura.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        ModLoader.addSpawn(DqmEntityUmibouzu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.hell);
        //ModLoader.addSpawn(DqmEntityYamatanooroti.class, 1, 1, 1, EnumCreatureType.monster,hellboss);
        //ModLoader.addSpawn(DqmEntityZoma.class, 1, 1, 1, EnumCreatureType.monster,hellboss);
        ModLoader.addSpawn(DqmEntityMetasura.class, 1, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityMetaruburazazu.class, 1, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityHagumeta.class, 1, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.all);
        ModLoader.addSpawn(DqmEntityDragometaru.class, 1, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.metaru3);
        ModLoader.addSpawn(DqmEntityMetaking.class, 1, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.metaru3);
        ModLoader.addSpawn(DqmEntityPuratinaking.class, 1, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.metaru4);
        ModLoader.addSpawn(DqmEntityDaiyamondosuraimu.class, 1, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.metaru4);
        ModLoader.addSpawn(DqmEntityHaguremetaruking.class, 1, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.metaru5);
        ModLoader.addSpawn(DqmEntityBakudaniwa.class, 6, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.desert);
        ModLoader.addSpawn(DqmEntityBehoimusuraimu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.desert);
        ModLoader.addSpawn(DqmEntityBeronyaago.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.desert);
        ModLoader.addSpawn(DqmEntityDokuroarai.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.desert);
        ModLoader.addSpawn(DqmEntityDorozara.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.desert);
        ModLoader.addSpawn(DqmEntityHgizumo.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.desert);
        ModLoader.addSpawn(DqmEntityHiitogizumo.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.desert);
        ModLoader.addSpawn(DqmEntityMadohando.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.desert);
        ModLoader.addSpawn(DqmEntityMeijikimera.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.desert);
        ModLoader.addSpawn(DqmEntityMetaruraida.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.desert);
        ModLoader.addSpawn(DqmEntityObakeumiusi.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.desert);
        ModLoader.addSpawn(DqmEntityOdoruhouseki.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.desert);
        ModLoader.addSpawn(DqmEntitySibiredanbira.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.desert);
        ModLoader.addSpawn(DqmEntitySirudokozou.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.desert);
        ModLoader.addSpawn(DqmEntityUzusioking.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.desert);
        ModLoader.addSpawn(DqmEntityYouganmajin.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.desert);
        ModLoader.addSpawn(DqmEntityAnimaruzonbi.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityBakudanbebi.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityBebisatan.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityBehoimisuraimu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityBuchunpa.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityBurauni.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityButisuraimu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityButtizukinya.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityDesufuratta.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityDokuyazukin.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityDorakima.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityDoronuba.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityEnzeruslime.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityHitokuiga.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityHoimisura.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityKimera.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityKirapan.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityKirasuko.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityKirikabuobake.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityMatango.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityMeijidoraki.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityMrippusu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityNightwalker.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityObakekinoko.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityOokutibasi.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityOomedama.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityPapetkozou.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityPinkmomon.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityRiripat.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntitySibireageha.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntitySukippaa.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntitySupekutetto.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntitySura2.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntitySuraimuking.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntitySuraimunaito.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntitySuraimutawa.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityTonburero.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityUmiusi.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityWaraibukuro.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.plains);
        ModLoader.addSpawn(DqmEntityAkumanosyo.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.ice);
        ModLoader.addSpawn(DqmEntityArumiraji.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.ice);
        ModLoader.addSpawn(DqmEntityBuraddihando.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.ice);
        ModLoader.addSpawn(DqmEntityDucksbill.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.ice);
        ModLoader.addSpawn(DqmEntityFgizumo.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.ice);
        ModLoader.addSpawn(DqmEntityFurosutogizumo.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.ice);
        ModLoader.addSpawn(DqmEntityGorudentotemu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.ice);
        ModLoader.addSpawn(DqmEntityHoroghost.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.ice);
        ModLoader.addSpawn(DqmEntityHyouganmajin.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.ice);
        ModLoader.addSpawn(DqmEntityJeriman.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.ice);
        ModLoader.addSpawn(DqmEntityMarinsuraimu.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.ice);
        ModLoader.addSpawn(DqmEntityMomonja.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.ice);
        ModLoader.addSpawn(DqmEntityPurizunyan.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.ice);
        ModLoader.addSpawn(DqmEntitySibirekurage.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.ice);
        ModLoader.addSpawn(DqmEntitySumairurokku.class, 6, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.ice);
        ModLoader.addSpawn(DqmEntitySunomon.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.ice);
        ModLoader.addSpawn(DqmEntitySuraimutumuri.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.ice);
        ModLoader.addSpawn(DqmEntityTahodoraki.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.ice);
        ModLoader.addSpawn(DqmEntityTomosibikozou.class, 12, 1, 1, EnumCreatureType.monster, DqmBopAddon.bopCfg.ice);

    }
}