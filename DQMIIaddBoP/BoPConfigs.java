package DQMIIaddBoP;

import java.util.ArrayList;
import java.util.Hashtable;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.Configuration;
import DQMII.DQM;

public class BoPConfigs {

	public static int DeadForestID = 185;
	public static int DeadForestSnowID = 186;
	public static int DeadSwampID = 187;
	public static int FenID = 191;
	public static int QuagmireID = 225;
	public static int BogID = 176;
	public static int MysticGroveID = 216;
	public static int OminousWoodsID = 218;
	public static int WastelandID = 245;
	public static int ThickOminousWoodsID = 47;

	public static int DeadlandsID = 188;
	public static int VolcanoID = 244;

	public static int FungiForestID = 194;



	public static int lgLog1 = 1933;
	public static int lgLog2 = 1934;
	public static int lgLog3 = 1935;
	public static int lgLog4 = 1974;

	public static int lvColorizedID = 1962;
	public static int lvFruitID = 1926;
	public static int lvLeaf1 = 1923;
	public static int lvLeaf2 = 1924;

	public static int flAshBlockID = 163;
	public static int flAshStoneID = 164;
	public static int flCragRockID = 172;
	public static int flDriedDirtID =161;
	public static int flHardDirtID = 168;
	public static int flHardIceID = 165;
	public static int flHardSandID = 167;
	public static int flMudID = 160;
	public static int flRedRockID = 162;

	public static int ntBoneyard = 69;
	public static int ntPhantasmagoricInferno = 68;
	public static int ntCorruptedSands = 67;
	public static int ntUndergarden = 66;
	public static int ntNetherBase = 65;


	public static Hashtable extraBiomeIDTb;
	public static Hashtable vanillaBiomeIDTb;
	public static Hashtable netherBiomeIDTb;

	public static BiomeGenBase[] allHellEnd;
	public static BiomeGenBase[] all;
	public static BiomeGenBase[] desert;
	public static BiomeGenBase[] plains;
	public static BiomeGenBase[] ice;
	public static BiomeGenBase[] hell;
	public static BiomeGenBase[] end;
	//public static BiomeGenBase[] metaru1;
	//public static BiomeGenBase[] metaru2;
	public static BiomeGenBase[] metaru3;
	public static BiomeGenBase[] metaru4;
	public static BiomeGenBase[] metaru5;


	static BiomeGenBase[] vanillaBiome = { BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.river, BiomeGenBase.beach,
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

	//static BiomeGenBase[] vanillaBiome = {};

	public BoPConfigs(Configuration config)
	{
		config.load();

		//特殊バイオーム
		BogID = config.get("biome ids", "Bog ID", BogID).getInt();
		DeadForestSnowID  = config.get("biome ids", "Dead Forest (Snow) ID", DeadForestSnowID).getInt();
		DeadForestID  = config.get("biome ids", "Dead Forest ID", DeadForestID).getInt();
		DeadSwampID  = config.get("biome ids", "Dead Swamp ID", DeadSwampID).getInt();
		DeadlandsID  = config.get("biome ids", "Deadlands ID", DeadlandsID).getInt();
		FenID  = config.get("biome ids", "Fen ID", FenID).getInt();
		MysticGroveID  = config.get("biome ids", "Mystic Grove ID", MysticGroveID).getInt();
		OminousWoodsID  = config.get("biome ids", "Ominous Woods ID", OminousWoodsID).getInt();
		QuagmireID  = config.get("biome ids", "Quagmire ID", QuagmireID).getInt();
		VolcanoID  = config.get("biome ids", "Volcano ID", VolcanoID).getInt();
		WastelandID  = config.get("biome ids", "Wasteland ID", WastelandID).getInt();
		ThickOminousWoodsID  = config.get("biome ids", "Thick Ominous Woods (Sub-Biome) ID", ThickOminousWoodsID).getInt();
		FungiForestID = config.get("biome ids", "Fungi Forest ID", FungiForestID).getInt();

		//ネザーバイオーム
		ntBoneyard =  config.get("biome ids", "Boneyard (Nether) ID", ntBoneyard).getInt();
		ntCorruptedSands =  config.get("biome ids", "Corrupted Sands (Nether) ID", ntCorruptedSands).getInt();
		ntNetherBase =  config.get("biome ids", "Nether Base (Nether) ID", ntNetherBase).getInt();
		ntPhantasmagoricInferno =  config.get("biome ids", "Phantasmagoric Inferno (Nether) ID", ntPhantasmagoricInferno).getInt();
		ntUndergarden =  config.get("biome ids", "Undergarden (Nether) ID", ntUndergarden).getInt();

		//原木ブロックID
		lgLog1  = config.get("block", "Log Block ID 1", lgLog1).getInt();
		lgLog2  = config.get("block", "Log Block ID 2", lgLog2).getInt();
		lgLog3  = config.get("block", "Log Block ID 3", lgLog3).getInt();
		lgLog4  = config.get("block", "Log Block ID 4", lgLog4).getInt();

		//葉ブロックID
		lvColorizedID  = config.get("block", "Colourized Leaves ID", lvColorizedID).getInt();
		lvFruitID  = config.get("block", "Fruit Leaf Block ID", lvFruitID).getInt();
		lvLeaf1  = config.get("block", "Leaf Block ID 1", lvLeaf1).getInt();
		lvLeaf2  = config.get("block", "Leaf Block ID 2", lvLeaf2).getInt();

		//フィールドブロック
		flAshBlockID  = config.get("terrain block ids - must be below 255", "Ash Block ID", flAshBlockID).getInt();
		flAshStoneID  = config.get("terrain block ids - must be below 255", "Ash Stone ID", flAshStoneID).getInt();
		flCragRockID  = config.get("terrain block ids - must be below 255", "Crag Rock ID", flCragRockID).getInt();
		flDriedDirtID  = config.get("terrain block ids - must be below 255", "Dried Dirt ID", flDriedDirtID).getInt();
		flHardDirtID  = config.get("terrain block ids - must be below 255", "Hard Dirt ID", flHardDirtID).getInt();
		flHardIceID  = config.get("terrain block ids - must be below 255", "Hard Ice ID", flHardIceID).getInt();
		flHardSandID  = config.get("terrain block ids - must be below 255", "Hard Sand ID", flHardSandID).getInt();
		flMudID  = config.get("terrain block ids - must be below 255", "Mud ID", flMudID).getInt();
		flRedRockID  = config.get("terrain block ids - must be below 255", "Red Rock ID 2", flRedRockID).getInt();

		createBiomeTb();
		createGenBiomes();

	}


	public static void createBiomeTb()
	{
		extraBiomeIDTb = new Hashtable();
		extraBiomeIDTb.put(BogID, true);
		extraBiomeIDTb.put(DeadForestSnowID, true);
		extraBiomeIDTb.put(DeadForestID, true);
		extraBiomeIDTb.put(DeadSwampID, true);
		extraBiomeIDTb.put(DeadlandsID, true);
		extraBiomeIDTb.put(FenID, true);
		extraBiomeIDTb.put(MysticGroveID, true);
		extraBiomeIDTb.put(OminousWoodsID, true);
		extraBiomeIDTb.put(QuagmireID, true);
		extraBiomeIDTb.put(VolcanoID, true);
		extraBiomeIDTb.put(WastelandID, true);
		extraBiomeIDTb.put(ThickOminousWoodsID, true);

		vanillaBiomeIDTb = new Hashtable();
		for(int cnt = 0; cnt < vanillaBiome.length; cnt++)
		{
			vanillaBiomeIDTb.put(vanillaBiome[cnt].biomeID, true);
		}

		netherBiomeIDTb = new Hashtable();
		netherBiomeIDTb.put(ntBoneyard, true);
		netherBiomeIDTb.put(ntPhantasmagoricInferno, true);
		netherBiomeIDTb.put(ntCorruptedSands, true);
		netherBiomeIDTb.put(ntUndergarden, true);
		netherBiomeIDTb.put(ntNetherBase, true);
	}

	public static void createGenBiomes()
	{
		BiomeGenBase[] preBeach = BiomeDictionary.getBiomesForType(Type.BEACH);
		BiomeGenBase[] preDesert = BiomeDictionary.getBiomesForType(Type.DESERT);
		BiomeGenBase[] preEnd = BiomeDictionary.getBiomesForType(Type.END);
		BiomeGenBase[] preForest = BiomeDictionary.getBiomesForType(Type.FOREST);
		BiomeGenBase[] preFrozen = BiomeDictionary.getBiomesForType(Type.FROZEN);
		BiomeGenBase[] preHills = BiomeDictionary.getBiomesForType(Type.HILLS);
		BiomeGenBase[] preJungle = BiomeDictionary.getBiomesForType(Type.JUNGLE);
		BiomeGenBase[] preMagical = BiomeDictionary.getBiomesForType(Type.MAGICAL);
		BiomeGenBase[] preMountain = BiomeDictionary.getBiomesForType(Type.MOUNTAIN);
		BiomeGenBase[] preMushroom = BiomeDictionary.getBiomesForType(Type.MUSHROOM);
		BiomeGenBase[] preNether = BiomeDictionary.getBiomesForType(Type.NETHER);
		BiomeGenBase[] prePlains = BiomeDictionary.getBiomesForType(Type.PLAINS);
		BiomeGenBase[] preSwamp = BiomeDictionary.getBiomesForType(Type.SWAMP);
		BiomeGenBase[] preWasteland = BiomeDictionary.getBiomesForType(Type.WASTELAND);
		BiomeGenBase[] preWater = BiomeDictionary.getBiomesForType(Type.WATER);

		/*
		for(int dCnt = 0; dCnt < preBeach.length; dCnt++)
		{
			System.out.println("DEBUGLINE_preBime:" + preBeach[dCnt].biomeID);
		}
		for(int dCnt = 0; dCnt < preDesert.length; dCnt++)
		{
			System.out.println("DEBUGLINE_preBime:" + preDesert[dCnt].biomeID);
		}
		for(int dCnt = 0; dCnt < preEnd.length; dCnt++)
		{
			System.out.println("DEBUGLINE_preBime:" + preEnd[dCnt].biomeID);
		}
		for(int dCnt = 0; dCnt < preForest.length; dCnt++)
		{
			System.out.println("DEBUGLINE_preBime:" + preForest[dCnt].biomeID);
		}
		for(int dCnt = 0; dCnt < preFrozen.length; dCnt++)
		{
			System.out.println("DEBUGLINE_preBime:" + preFrozen[dCnt].biomeID);
		}
		for(int dCnt = 0; dCnt < preHills.length; dCnt++)
		{
			System.out.println("DEBUGLINE_preBime:" + preHills[dCnt].biomeID);
		}
		for(int dCnt = 0; dCnt < preJungle.length; dCnt++)
		{
			System.out.println("DEBUGLINE_preBime:" + preJungle[dCnt].biomeID);
		}
		for(int dCnt = 0; dCnt < preMagical.length; dCnt++)
		{
			System.out.println("DEBUGLINE_preBime:" + preMagical[dCnt].biomeID);
		}
		for(int dCnt = 0; dCnt < preMountain.length; dCnt++)
		{
			System.out.println("DEBUGLINE_preBime:" + preMountain[dCnt].biomeID);
		}
		for(int dCnt = 0; dCnt < preMushroom.length; dCnt++)
		{
			System.out.println("DEBUGLINE_preBime:" + preMushroom[dCnt].biomeID);
		}
		for(int dCnt = 0; dCnt < preNether.length; dCnt++)
		{
			System.out.println("DEBUGLINE_preBime:" + preNether[dCnt].biomeID);
		}
		for(int dCnt = 0; dCnt < prePlains.length; dCnt++)
		{
			System.out.println("DEBUGLINE_preBime:" + prePlains[dCnt].biomeID);
		}
		for(int dCnt = 0; dCnt < preSwamp.length; dCnt++)
		{
			System.out.println("DEBUGLINE_preBime:" + preSwamp[dCnt].biomeID);
		}
		for(int dCnt = 0; dCnt < preWasteland.length; dCnt++)
		{
			System.out.println("DEBUGLINE_preBime:" + preWasteland[dCnt].biomeID);
		}
		for(int dCnt = 0; dCnt < preWater.length; dCnt++)
		{
			System.out.println("DEBUGLINE_preBime:" + preWater[dCnt].biomeID);
		}
		*/
		/*
		System.out.println("DEBUGLINE:" + preBeach.length);
		System.out.println("DEBUGLINE:" + preDesert.length);
		System.out.println("DEBUGLINE:" + preEnd.length);
		System.out.println("DEBUGLINE:" + preForest.length);
		System.out.println("DEBUGLINE:" + preFrozen.length);
		System.out.println("DEBUGLINE:" + preHills.length);
		System.out.println("DEBUGLINE:" + preJungle.length);
		System.out.println("DEBUGLINE:" + preMagical.length);
		System.out.println("DEBUGLINE:" + preMountain.length);
		System.out.println("DEBUGLINE:" + preMushroom.length);
		System.out.println("DEBUGLINE:" + preNether.length);
		System.out.println("DEBUGLINE:" + prePlains.length);
		System.out.println("DEBUGLINE:" + preSwamp.length);
		System.out.println("DEBUGLINE:" + preWasteland.length);
		System.out.println("DEBUGLINE:" + preWater.length);
*/

		ArrayList<Integer> wkBiomeBEACH;
		ArrayList<Integer> wkBiomeDESERT;
		ArrayList<Integer> wkBiomeEND;
		ArrayList<Integer> wkBiomeFOREST;
		ArrayList<Integer> wkBiomeFROZEN;
		ArrayList<Integer> wkBiomeHILLS;
		ArrayList<Integer> wkBiomeJUNGLE;
		ArrayList<Integer> wkBiomeMAGICAL;
		ArrayList<Integer> wkBiomeMOUNTAIN;
		ArrayList<Integer> wkBiomeMUSHROOM;
		ArrayList<Integer> wkBiomeNETHER;
		ArrayList<Integer> wkBiomePLAINS;
		ArrayList<Integer> wkBiomeSWAMP;
		ArrayList<Integer> wkBiomeWASTELAND;
		ArrayList<Integer> wkBiomeWATER;


		wkBiomeBEACH = new ArrayList<Integer>();
		for(int cnt = 0; cnt < preBeach.length; cnt++)
		{
			int wkBiomeID = preBeach[cnt].biomeID;
			//System.out.println("DEBUGLINE:" + wkBiomeID + "/" + preBeach[cnt].biomeName);
			if(CheckVanillaBiome(wkBiomeID) == false && CheckExtraBiome(wkBiomeID) == false && CheckNetherBiome(wkBiomeID) == false)
			{
				//System.out.println("DEBUGLINE:ArraySet" + wkBiomeID);
				wkBiomeBEACH.add(wkBiomeID);
			}
		}
		/*
		System.out.println("CNTer:" + wkBiomeBEACH.size());
		for(int dCnt = 0; dCnt < wkBiomeBEACH.size(); dCnt++)
		{
			System.out.println("DEBUG_wkBiome:" + wkBiomeBEACH.get(dCnt));
		}
*/

		wkBiomeDESERT = new ArrayList<Integer>();
		for(int cnt = 0; cnt < preDesert.length; cnt++)
		{
			int wkBiomeID = preDesert[cnt].biomeID;
			//System.out.println("DEBUGLINE:" + wkBiomeID + "/" + preDesert[cnt].biomeName);
			if(CheckVanillaBiome(wkBiomeID) == false && CheckExtraBiome(wkBiomeID) == false && CheckNetherBiome(wkBiomeID) == false)
			{
				wkBiomeDESERT.add(wkBiomeID);
			}
		}
		/*
		System.out.println("CNTer:" + wkBiomeDESERT.size());
		for(int dCnt = 0; dCnt < wkBiomeDESERT.size(); dCnt++)
		{
			System.out.println("DEBUG_wkBiome:" + wkBiomeDESERT.get(dCnt));
		}
*/

		wkBiomeEND = new ArrayList<Integer>();
		for(int cnt = 0; cnt < preEnd.length; cnt++)
		{
			int wkBiomeID = preEnd[cnt].biomeID;
			//System.out.println("DEBUGLINE:" + wkBiomeID + "/" + preEnd[cnt].biomeName);
			if(CheckVanillaBiome(wkBiomeID) == false && CheckExtraBiome(wkBiomeID) == false && CheckNetherBiome(wkBiomeID) == false)
			{
				wkBiomeEND.add(wkBiomeID);
			}
		}
		/*
		System.out.println("CNTer:" + wkBiomeEND.size());
		for(int dCnt = 0; dCnt < wkBiomeEND.size(); dCnt++)
		{
			System.out.println("DEBUG_wkBiome:" + wkBiomeEND.get(dCnt));
		}
*/

		wkBiomeFOREST = new ArrayList<Integer>();
		for(int cnt = 0; cnt < preForest.length; cnt++)
		{
			int wkBiomeID = preForest[cnt].biomeID;
			//System.out.println("DEBUGLINE:" + wkBiomeID + "/" + preForest[cnt].biomeName);
			if(CheckVanillaBiome(wkBiomeID) == false && CheckExtraBiome(wkBiomeID) == false && CheckNetherBiome(wkBiomeID) == false)
			{
				wkBiomeFOREST.add(wkBiomeID);
			}
		}
		/*
		System.out.println("CNTer:" + wkBiomeFOREST.size());
		for(int dCnt = 0; dCnt < wkBiomeFOREST.size(); dCnt++)
		{
			System.out.println("DEBUG_wkBiome:" + wkBiomeFOREST.get(dCnt));
		}
*/


		wkBiomeFROZEN = new ArrayList<Integer>();
		for(int cnt = 0; cnt < preFrozen.length; cnt++)
		{
			int wkBiomeID = preFrozen[cnt].biomeID;
			//System.out.println("DEBUGLINE:" + wkBiomeID + "/" + preFrozen[cnt].biomeName);
			if(CheckVanillaBiome(wkBiomeID) == false && CheckExtraBiome(wkBiomeID) == false && CheckNetherBiome(wkBiomeID) == false)
			{
				wkBiomeFROZEN.add(wkBiomeID);
			}
		}
		/*
		System.out.println("CNTer:" + wkBiomeFROZEN.size());
		for(int dCnt = 0; dCnt < wkBiomeFROZEN.size(); dCnt++)
		{
			System.out.println("DEBUG_wkBiome:" + wkBiomeFROZEN.get(dCnt));
		}
*/


		wkBiomeHILLS = new ArrayList<Integer>();
		for(int cnt = 0; cnt < preHills.length; cnt++)
		{
			int wkBiomeID = preHills[cnt].biomeID;
			//System.out.println("DEBUGLINE:" + wkBiomeID + "/" + preHills[cnt].biomeName);
			if(CheckVanillaBiome(wkBiomeID) == false && CheckExtraBiome(wkBiomeID) == false && CheckNetherBiome(wkBiomeID) == false)
			{
				wkBiomeHILLS.add(wkBiomeID);
			}
		}
		/*
		System.out.println("CNTer:" + wkBiomeHILLS.size());
		for(int dCnt = 0; dCnt < wkBiomeHILLS.size(); dCnt++)
		{
			System.out.println("DEBUG_wkBiome:" + wkBiomeHILLS.get(dCnt));
		}
*/


		wkBiomeJUNGLE = new ArrayList<Integer>();
		for(int cnt = 0; cnt < preJungle.length; cnt++)
		{
			int wkBiomeID = preJungle[cnt].biomeID;
			//System.out.println("DEBUGLINE:" + wkBiomeID + "/" + preJungle[cnt].biomeName);
			if(CheckVanillaBiome(wkBiomeID) == false && CheckExtraBiome(wkBiomeID) == false && CheckNetherBiome(wkBiomeID) == false)
			{
				wkBiomeJUNGLE.add(wkBiomeID);
			}
		}
		/*
		System.out.println("CNTer:" + wkBiomeJUNGLE.size());
		for(int dCnt = 0; dCnt < wkBiomeJUNGLE.size(); dCnt++)
		{
			System.out.println("DEBUG_wkBiome:" + wkBiomeJUNGLE.get(dCnt));
		}
*/


		wkBiomeMAGICAL = new ArrayList<Integer>();
		for(int cnt = 0; cnt < preMagical.length; cnt++)
		{
			int wkBiomeID = preMagical[cnt].biomeID;
			//System.out.println("DEBUGLINE:" + wkBiomeID + "/" + preMagical[cnt].biomeName);
			if(CheckVanillaBiome(wkBiomeID) == false && CheckExtraBiome(wkBiomeID) == false && CheckNetherBiome(wkBiomeID) == false)
			{
				wkBiomeMAGICAL.add(wkBiomeID);
			}
		}
		/*
		System.out.println("CNTer:" + wkBiomeMAGICAL.size());
		for(int dCnt = 0; dCnt < wkBiomeMAGICAL.size(); dCnt++)
		{
			System.out.println("DEBUG_wkBiome:" + wkBiomeMAGICAL.get(dCnt));
		}
*/


		wkBiomeMOUNTAIN = new ArrayList<Integer>();
		for(int cnt = 0; cnt < preMountain.length; cnt++)
		{
			int wkBiomeID = preMountain[cnt].biomeID;
			//System.out.println("DEBUGLINE:" + wkBiomeID + "/" + preMountain[cnt].biomeName);
			if(CheckVanillaBiome(wkBiomeID) == false && CheckExtraBiome(wkBiomeID) == false && CheckNetherBiome(wkBiomeID) == false)
			{
				wkBiomeMOUNTAIN.add(wkBiomeID);
			}
		}
		/*
		System.out.println("CNTer:" + wkBiomeMOUNTAIN.size());
		for(int dCnt = 0; dCnt < wkBiomeMOUNTAIN.size(); dCnt++)
		{
			System.out.println("DEBUG_wkBiome:" + wkBiomeMOUNTAIN.get(dCnt));
		}
*/


		wkBiomeMUSHROOM = new ArrayList<Integer>();
		for(int cnt = 0; cnt < preMushroom.length; cnt++)
		{
			int wkBiomeID = preMushroom[cnt].biomeID;
			//System.out.println("DEBUGLINE:" + wkBiomeID + "/" + preMushroom[cnt].biomeName);
			if(CheckVanillaBiome(wkBiomeID) == false && CheckExtraBiome(wkBiomeID) == false && CheckNetherBiome(wkBiomeID) == false)
			{
				wkBiomeMUSHROOM.add(wkBiomeID);
			}
		}
		/*
		System.out.println("CNTer:" + wkBiomeMOUNTAIN.size());
		for(int dCnt = 0; dCnt < wkBiomeMUSHROOM.size(); dCnt++)
		{
			System.out.println("DEBUG_wkBiome:" + wkBiomeMUSHROOM.get(dCnt));
		}
*/


		wkBiomeNETHER = new ArrayList<Integer>();
		for(int cnt = 0; cnt < preNether.length; cnt++)
		{
			int wkBiomeID = preNether[cnt].biomeID;
			//System.out.println("DEBUGLINE:" + wkBiomeID + "/" + preNether[cnt].biomeName);
			if(CheckVanillaBiome(wkBiomeID) == false && CheckExtraBiome(wkBiomeID) == false)
			{
				wkBiomeNETHER.add(wkBiomeID);
			}
		}
		/*
		System.out.println("CNTer:" + wkBiomeNETHER.size());
		for(int dCnt = 0; dCnt < wkBiomeNETHER.size(); dCnt++)
		{
			System.out.println("DEBUG_wkBiome:" + wkBiomeNETHER.get(dCnt));
		}
*/


		wkBiomePLAINS = new ArrayList<Integer>();
		for(int cnt = 0; cnt < prePlains.length; cnt++)
		{
			int wkBiomeID = prePlains[cnt].biomeID;
			//System.out.println("DEBUGLINE:" + wkBiomeID + "/" + prePlains[cnt].biomeName);
			if(CheckVanillaBiome(wkBiomeID) == false && CheckExtraBiome(wkBiomeID) == false && CheckNetherBiome(wkBiomeID) == false)
			{
				wkBiomePLAINS.add(wkBiomeID);
			}
		}
		/*
		System.out.println("CNTer:" + wkBiomePLAINS.size());
		for(int dCnt = 0; dCnt < wkBiomePLAINS.size(); dCnt++)
		{
			System.out.println("DEBUG_wkBiome:" + wkBiomePLAINS.get(dCnt));
		}
*/


		wkBiomeSWAMP = new ArrayList<Integer>();
		for(int cnt = 0; cnt < preSwamp.length; cnt++)
		{
			int wkBiomeID = preSwamp[cnt].biomeID;
			//System.out.println("DEBUGLINE:" + wkBiomeID + "/" + preSwamp[cnt].biomeName);
			if(CheckVanillaBiome(wkBiomeID) == false && CheckExtraBiome(wkBiomeID) == false && CheckNetherBiome(wkBiomeID) == false)
			{
				wkBiomeSWAMP.add(wkBiomeID);
			}
		}
		/*
		System.out.println("CNTer:" + wkBiomeSWAMP.size());
		for(int dCnt = 0; dCnt < wkBiomeSWAMP.size(); dCnt++)
		{
			System.out.println("DEBUG_wkBiome:" + wkBiomeSWAMP.get(dCnt));
		}
*/


		wkBiomeWASTELAND = new ArrayList<Integer>();
		for(int cnt = 0; cnt < preWasteland.length; cnt++)
		{
			int wkBiomeID = preWasteland[cnt].biomeID;
			//System.out.println("DEBUGLINE:" + wkBiomeID + "/" + preWasteland[cnt].biomeName);
			if(CheckVanillaBiome(wkBiomeID) == false && CheckExtraBiome(wkBiomeID) == false && CheckNetherBiome(wkBiomeID) == false)
			{
				wkBiomeWASTELAND.add(wkBiomeID);
			}
		}
		/*
		System.out.println("CNTer:" + wkBiomeWASTELAND.size());
		for(int dCnt = 0; dCnt < wkBiomeWASTELAND.size(); dCnt++)
		{
			System.out.println("DEBUG_wkBiome:" + wkBiomeWASTELAND.get(dCnt));
		}
*/


		wkBiomeWATER = new ArrayList<Integer>();
		for(int cnt = 0; cnt < preWater.length; cnt++)
		{
			int wkBiomeID = preWater[cnt].biomeID;
			//System.out.println("DEBUGLINE:" + wkBiomeID + "/" + preWater[cnt].biomeName);
			if(CheckVanillaBiome(wkBiomeID) == false && CheckExtraBiome(wkBiomeID) == false && CheckNetherBiome(wkBiomeID) == false)
			{
				wkBiomeWATER.add(wkBiomeID);
			}
		}
		/*
		System.out.println("CNTer:" + wkBiomeWATER.size());
		for(int dCnt = 0; dCnt < wkBiomeWATER.size(); dCnt++)
		{
			System.out.println("DEBUG_wkBiome:" + wkBiomeWATER.get(dCnt));
		}
*/


		int addHellCount = 0;

		if(BiomeGenBase.biomeList[DeadForestID] != null)
		{
			addHellCount = addHellCount + 1;
		}
		if(BiomeGenBase.biomeList[DeadForestSnowID] != null)
		{
			addHellCount = addHellCount + 1;
		}
		if(BiomeGenBase.biomeList[DeadSwampID] != null)
		{
			addHellCount = addHellCount + 1;
		}
		if(BiomeGenBase.biomeList[FenID] != null)
		{
			addHellCount = addHellCount + 1;
		}
		if(BiomeGenBase.biomeList[QuagmireID] != null)
		{
			addHellCount = addHellCount + 1;
		}
		if(BiomeGenBase.biomeList[BogID] != null)
		{
			addHellCount = addHellCount + 1;
		}
		if(BiomeGenBase.biomeList[MysticGroveID] != null)
		{
			addHellCount = addHellCount + 1;
		}
		if(BiomeGenBase.biomeList[OminousWoodsID] != null)
		{
			addHellCount = addHellCount + 1;
		}
		if(BiomeGenBase.biomeList[WastelandID] != null)
		{
			addHellCount = addHellCount + 1;
		}
		if(BiomeGenBase.biomeList[ThickOminousWoodsID] != null)
		{
			addHellCount = addHellCount + 1;
		}

		int addEndCount = 0;
		if(BiomeGenBase.biomeList[DeadlandsID] != null)
		{
			addEndCount = addEndCount + 1;
		}

		if(BiomeGenBase.biomeList[VolcanoID] != null)
		{
			addEndCount = addEndCount + 1;
		}
		if(BiomeGenBase.biomeList[FungiForestID] != null)
		{
			addEndCount = addEndCount + 1;
		}

		/*
		System.out.println("DEBUGLINE:" + wkBiomeBEACH.size());
		System.out.println("DEBUGLINE:" + wkBiomeDESERT.size());
		System.out.println("DEBUGLINE:" + wkBiomeEND.size());
		System.out.println("DEBUGLINE:" + wkBiomeFOREST.size());
		System.out.println("DEBUGLINE:" + wkBiomeFROZEN.size());
		System.out.println("DEBUGLINE:" + wkBiomeHILLS.size());
		System.out.println("DEBUGLINE:" + wkBiomeJUNGLE.size());
		System.out.println("DEBUGLINE:" + wkBiomeMAGICAL.size());
		System.out.println("DEBUGLINE:" + wkBiomeMOUNTAIN.size());
		System.out.println("DEBUGLINE:" + wkBiomeMUSHROOM.size());
		System.out.println("DEBUGLINE:" + wkBiomeNETHER.size());
		System.out.println("DEBUGLINE:" + wkBiomePLAINS.size());
		System.out.println("DEBUGLINE:" + wkBiomeSWAMP.size());
		System.out.println("DEBUGLINE:" + wkBiomeWASTELAND.size());
		System.out.println("DEBUGLINE:" + wkBiomeWATER.size());
*/

		int wkCnt;
		//allHellEnd
		wkCnt = 0;
		allHellEnd = new BiomeGenBase[wkBiomeBEACH.size() + wkBiomeDESERT.size() + wkBiomeEND.size() +
		                              wkBiomeFOREST.size() + wkBiomeFROZEN.size() + wkBiomeHILLS.size() +
		                              wkBiomeJUNGLE.size() + wkBiomeMAGICAL.size() + wkBiomeMOUNTAIN.size() +
		                              wkBiomeMUSHROOM.size() + wkBiomeNETHER.size() + wkBiomePLAINS.size() +
		                              wkBiomeSWAMP.size() + wkBiomeWASTELAND.size() + wkBiomeWATER.size() + addEndCount + addHellCount];
		for(int cnt = 0; cnt < wkBiomeBEACH.size(); cnt++)
		{
			//System.out.println("DEBUGLINE:getCnt_" + wkBiomeBEACH.get(cnt) + ":" + cnt);
			if(BiomeGenBase.biomeList[wkBiomeBEACH.get(cnt)] != null)
			{
				//System.out.println("DEBUGLINE:SET_" + wkBiomeBEACH.get(cnt) + ":" + cnt);
				allHellEnd[cnt] = BiomeGenBase.biomeList[wkBiomeBEACH.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeDESERT.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeDESERT.get(cnt)] != null)
			{
				allHellEnd[wkCnt] = BiomeGenBase.biomeList[wkBiomeDESERT.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeEND.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeEND.get(cnt)] != null)
			{
				allHellEnd[wkCnt] = BiomeGenBase.biomeList[wkBiomeEND.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeFOREST.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeFOREST.get(cnt)] != null)
			{
				allHellEnd[wkCnt] = BiomeGenBase.biomeList[wkBiomeFOREST.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeFROZEN.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeFROZEN.get(cnt)] != null)
			{
				allHellEnd[wkCnt] = BiomeGenBase.biomeList[wkBiomeFROZEN.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeHILLS.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeHILLS.get(cnt)] != null)
			{
				allHellEnd[wkCnt] = BiomeGenBase.biomeList[wkBiomeHILLS.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeJUNGLE.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeJUNGLE.get(cnt)] != null)
			{
				allHellEnd[wkCnt] = BiomeGenBase.biomeList[wkBiomeJUNGLE.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeMAGICAL.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeMAGICAL.get(cnt)] != null)
			{
				allHellEnd[wkCnt] = BiomeGenBase.biomeList[wkBiomeMAGICAL.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeMOUNTAIN.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeMOUNTAIN.get(cnt)] != null)
			{
				allHellEnd[wkCnt] = BiomeGenBase.biomeList[wkBiomeMOUNTAIN.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeMUSHROOM.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeMUSHROOM.get(cnt)] != null)
			{
				allHellEnd[wkCnt] = BiomeGenBase.biomeList[wkBiomeMUSHROOM.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeNETHER.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeNETHER.get(cnt)] != null)
			{
				allHellEnd[wkCnt] = BiomeGenBase.biomeList[wkBiomeNETHER.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomePLAINS.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomePLAINS.get(cnt)] != null)
			{
				allHellEnd[wkCnt] = BiomeGenBase.biomeList[wkBiomePLAINS.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeSWAMP.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeSWAMP.get(cnt)] != null)
			{
				allHellEnd[wkCnt] = BiomeGenBase.biomeList[wkBiomeSWAMP.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeWASTELAND.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeWASTELAND.get(cnt)] != null)
			{
				allHellEnd[wkCnt] = BiomeGenBase.biomeList[wkBiomeWASTELAND.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeWATER.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeWATER.get(cnt)] != null)
			{
				allHellEnd[wkCnt] = BiomeGenBase.biomeList[wkBiomeWATER.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}

		if(BiomeGenBase.biomeList[DeadForestID] != null)
		{
			allHellEnd[wkCnt] = BiomeGenBase.biomeList[DeadForestID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[DeadForestSnowID] != null)
		{
			allHellEnd[wkCnt] = BiomeGenBase.biomeList[DeadForestSnowID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[DeadSwampID] != null)
		{
			allHellEnd[wkCnt] = BiomeGenBase.biomeList[DeadSwampID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[FenID] != null)
		{
			allHellEnd[wkCnt] = BiomeGenBase.biomeList[FenID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[QuagmireID] != null)
		{
			allHellEnd[wkCnt] = BiomeGenBase.biomeList[QuagmireID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[BogID] != null)
		{
			allHellEnd[wkCnt] = BiomeGenBase.biomeList[BogID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[MysticGroveID] != null)
		{
			allHellEnd[wkCnt] = BiomeGenBase.biomeList[MysticGroveID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[OminousWoodsID] != null)
		{
			allHellEnd[wkCnt] = BiomeGenBase.biomeList[OminousWoodsID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[WastelandID] != null)
		{
			allHellEnd[wkCnt] = BiomeGenBase.biomeList[WastelandID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[ThickOminousWoodsID] != null)
		{
			allHellEnd[wkCnt] = BiomeGenBase.biomeList[ThickOminousWoodsID];
			wkCnt = wkCnt + 1;
		}


		if(BiomeGenBase.biomeList[DeadlandsID] != null)
		{
			allHellEnd[wkCnt] = BiomeGenBase.biomeList[DeadlandsID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[VolcanoID] != null)
		{
			allHellEnd[wkCnt] = BiomeGenBase.biomeList[VolcanoID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[FungiForestID] != null)
		{
			allHellEnd[wkCnt] = BiomeGenBase.biomeList[FungiForestID];
			wkCnt = wkCnt + 1;
		}

		/*
		System.out.println("DEBUGLINE:CNT_" + allHellEnd.length);
		for(int bCnt = 0; bCnt < allHellEnd.length; bCnt++)
		{
			if(allHellEnd[bCnt] == null)
			{
				System.out.println("DEBUGLINE:" + bCnt + ":NULL");
			}else
			{
				System.out.println("DEBUGLINE:" + bCnt);
				System.out.println("DEBUGLINE:" + bCnt + ":" + allHellEnd[bCnt].biomeID + ":" + allHellEnd[bCnt].biomeName);
			}
		}
*/
		//all
		wkCnt = 0;
		all = new BiomeGenBase[wkBiomeBEACH.size() + wkBiomeDESERT.size() +
		                       wkBiomeFOREST.size() + wkBiomeFROZEN.size() + wkBiomeHILLS.size() +
		                       wkBiomeJUNGLE.size() + wkBiomeMOUNTAIN.size() +
		                       wkBiomeMUSHROOM.size() + wkBiomePLAINS.size() +
		                       wkBiomeSWAMP.size() + wkBiomeWASTELAND.size() + wkBiomeWATER.size()];
		for(int cnt = 0; cnt < wkBiomeBEACH.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeBEACH.get(cnt)] != null)
			{
				all[cnt] = BiomeGenBase.biomeList[wkBiomeBEACH.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeDESERT.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeDESERT.get(cnt)] != null)
			{
				all[wkCnt] = BiomeGenBase.biomeList[wkBiomeDESERT.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeFOREST.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeFOREST.get(cnt)] != null)
			{
				all[wkCnt] = BiomeGenBase.biomeList[wkBiomeFOREST.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeFROZEN.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeFROZEN.get(cnt)] != null)
			{
				all[wkCnt] = BiomeGenBase.biomeList[wkBiomeFROZEN.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeHILLS.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeHILLS.get(cnt)] != null)
			{
				all[wkCnt] = BiomeGenBase.biomeList[wkBiomeHILLS.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeJUNGLE.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeJUNGLE.get(cnt)] != null)
			{
				all[wkCnt] = BiomeGenBase.biomeList[wkBiomeJUNGLE.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		/*
		for(int cnt = 0; cnt < wkBiomeMAGICAL.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeMAGICAL.get(cnt)] != null)
			{
				all[wkCnt] = BiomeGenBase.biomeList[wkBiomeMAGICAL.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		*/
		for(int cnt = 0; cnt < wkBiomeMOUNTAIN.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeMOUNTAIN.get(cnt)] != null)
			{
				all[wkCnt] = BiomeGenBase.biomeList[wkBiomeMOUNTAIN.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeMUSHROOM.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeMUSHROOM.get(cnt)] != null)
			{
				all[wkCnt] = BiomeGenBase.biomeList[wkBiomeMUSHROOM.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomePLAINS.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomePLAINS.get(cnt)] != null)
			{
				all[wkCnt] = BiomeGenBase.biomeList[wkBiomePLAINS.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeSWAMP.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeSWAMP.get(cnt)] != null)
			{
				all[wkCnt] = BiomeGenBase.biomeList[wkBiomeSWAMP.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeWASTELAND.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeWASTELAND.get(cnt)] != null)
			{
				all[wkCnt] = BiomeGenBase.biomeList[wkBiomeWASTELAND.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeWATER.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeWATER.get(cnt)] != null)
			{
				all[wkCnt] = BiomeGenBase.biomeList[wkBiomeWATER.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}


		//desert
		wkCnt = 0;
		desert = new BiomeGenBase[wkBiomeDESERT.size() + wkBiomeHILLS.size() + wkBiomeJUNGLE.size() + wkBiomeBEACH.size()];
		for(int cnt = 0; cnt < wkBiomeDESERT.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeDESERT.get(cnt)] != null)
			{
				desert[wkCnt] = BiomeGenBase.biomeList[wkBiomeDESERT.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeHILLS.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeHILLS.get(cnt)] != null)
			{
				desert[wkCnt] = BiomeGenBase.biomeList[wkBiomeHILLS.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeJUNGLE.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeJUNGLE.get(cnt)] != null)
			{
				desert[wkCnt] = BiomeGenBase.biomeList[wkBiomeJUNGLE.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeBEACH.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeBEACH.get(cnt)] != null)
			{
				desert[wkCnt] = BiomeGenBase.biomeList[wkBiomeBEACH.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}


		//plains
		wkCnt = 0;
		plains = new BiomeGenBase[wkBiomeBEACH.size() + wkBiomeFOREST.size() + wkBiomeMOUNTAIN.size() + wkBiomePLAINS.size() + wkBiomeWASTELAND.size()];
		for(int cnt = 0; cnt < wkBiomeBEACH.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeBEACH.get(cnt)] != null)
			{
				plains[cnt] = BiomeGenBase.biomeList[wkBiomeBEACH.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeFOREST.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeFOREST.get(cnt)] != null)
			{
				plains[wkCnt] = BiomeGenBase.biomeList[wkBiomeFOREST.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeMOUNTAIN.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeMOUNTAIN.get(cnt)] != null)
			{
				plains[wkCnt] = BiomeGenBase.biomeList[wkBiomeMOUNTAIN.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomePLAINS.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomePLAINS.get(cnt)] != null)
			{
				plains[wkCnt] = BiomeGenBase.biomeList[wkBiomePLAINS.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeWASTELAND.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeWASTELAND.get(cnt)] != null)
			{
				plains[wkCnt] = BiomeGenBase.biomeList[wkBiomeWASTELAND.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}


		//ice
		wkCnt = 0;
		ice = new BiomeGenBase[wkBiomeFROZEN.size() + wkBiomeBEACH.size()];
		for(int cnt = 0; cnt < wkBiomeFROZEN.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeFROZEN.get(cnt)] != null)
			{
				ice[wkCnt] = BiomeGenBase.biomeList[wkBiomeFROZEN.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeBEACH.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeBEACH.get(cnt)] != null)
			{
				ice[wkCnt] = BiomeGenBase.biomeList[wkBiomeBEACH.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}

		//hell
		wkCnt = 0;
		hell = new BiomeGenBase[wkBiomeNETHER.size()  + addHellCount];
		for(int cnt = 0; cnt < wkBiomeNETHER.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeNETHER.get(cnt)] != null)
			{
				hell[wkCnt] = BiomeGenBase.biomeList[wkBiomeNETHER.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}

		if(BiomeGenBase.biomeList[DeadForestID] != null)
		{
			hell[wkCnt] = BiomeGenBase.biomeList[DeadForestID];
			wkCnt = wkCnt + 1;
		}

		if(BiomeGenBase.biomeList[DeadForestSnowID]!= null)
		{
			hell[wkCnt] = BiomeGenBase.biomeList[DeadForestSnowID];
			wkCnt = wkCnt + 1;
		}

		if(BiomeGenBase.biomeList[DeadSwampID] != null)
		{
			hell[wkCnt] = BiomeGenBase.biomeList[DeadSwampID];
			wkCnt = wkCnt + 1;
		}

		if(BiomeGenBase.biomeList[FenID] != null)
		{
			hell[wkCnt] = BiomeGenBase.biomeList[FenID];
			wkCnt = wkCnt + 1;
		}

		if(BiomeGenBase.biomeList[QuagmireID] != null)
		{
			hell[wkCnt] = BiomeGenBase.biomeList[QuagmireID];
			wkCnt = wkCnt + 1;
		}

		if(BiomeGenBase.biomeList[BogID] != null)
		{
			hell[wkCnt] = BiomeGenBase.biomeList[BogID];
			wkCnt = wkCnt + 1;
		}

		if(BiomeGenBase.biomeList[MysticGroveID] != null)
		{
			hell[wkCnt] = BiomeGenBase.biomeList[MysticGroveID];
			wkCnt = wkCnt + 1;
		}

		if(BiomeGenBase.biomeList[OminousWoodsID] != null)
		{
			hell[wkCnt] = BiomeGenBase.biomeList[OminousWoodsID];
			wkCnt = wkCnt + 1;
		}

		if(BiomeGenBase.biomeList[WastelandID] != null)
		{
			hell[wkCnt] = BiomeGenBase.biomeList[WastelandID];
			wkCnt = wkCnt + 1;
		}

		if(BiomeGenBase.biomeList[ThickOminousWoodsID] != null)
		{
			hell[wkCnt] = BiomeGenBase.biomeList[ThickOminousWoodsID];
			wkCnt = wkCnt + 1;
		}

		//end
		wkCnt = 0;
		end = new BiomeGenBase[wkBiomeEND.size() + wkBiomeMUSHROOM.size() + addEndCount];
		for(int cnt = 0; cnt < wkBiomeEND.size(); cnt++)
		{
			end[wkCnt] = BiomeGenBase.biomeList[wkBiomeEND.get(cnt)];
			wkCnt = wkCnt + 1;
		}
		for(int cnt = 0; cnt < wkBiomeMUSHROOM.size(); cnt++)
		{
			end[wkCnt] = BiomeGenBase.biomeList[wkBiomeMUSHROOM.get(cnt)];
			wkCnt = wkCnt + 1;
		}

		if(BiomeGenBase.biomeList[DeadlandsID] != null)
		{
			end[wkCnt] = BiomeGenBase.biomeList[DeadlandsID];
			wkCnt = wkCnt + 1;
		}

		if(BiomeGenBase.biomeList[VolcanoID] != null)
		{
			end[wkCnt] = BiomeGenBase.biomeList[VolcanoID];
			wkCnt = wkCnt + 1;
		}

		if(BiomeGenBase.biomeList[FungiForestID] != null)
		{
			end[wkCnt] = BiomeGenBase.biomeList[FungiForestID];
			wkCnt = wkCnt + 1;
		}

		//metaru3
		wkCnt = 0;
		metaru3 = new BiomeGenBase[wkBiomeHILLS.size() + wkBiomeMUSHROOM.size()  + addEndCount];
		for(int cnt = 0; cnt < wkBiomeHILLS.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeHILLS.get(cnt)] != null)
			{
				metaru3[wkCnt] = BiomeGenBase.biomeList[wkBiomeHILLS.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}
		for(int cnt = 0; cnt < wkBiomeMUSHROOM.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeMUSHROOM.get(cnt)] != null)
			{
				metaru3[wkCnt] = BiomeGenBase.biomeList[wkBiomeMUSHROOM.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}

		if(BiomeGenBase.biomeList[DeadlandsID] != null)
		{
			metaru3[wkCnt] = BiomeGenBase.biomeList[DeadlandsID];
			wkCnt = wkCnt + 1;
		}

		if(BiomeGenBase.biomeList[VolcanoID] != null)
		{
			metaru3[wkCnt] = BiomeGenBase.biomeList[VolcanoID];
			wkCnt = wkCnt + 1;
		}

		if(BiomeGenBase.biomeList[FungiForestID] != null)
		{
			metaru3[wkCnt] = BiomeGenBase.biomeList[FungiForestID];
		}

		//metaru4
		wkCnt = 0;
		metaru4 = new BiomeGenBase[wkBiomeNETHER.size() + addHellCount + addEndCount];
		for(int cnt = 0; cnt < wkBiomeNETHER.size(); cnt++)
		{
			if(BiomeGenBase.biomeList[wkBiomeNETHER.get(cnt)] != null)
			{
				metaru4[cnt] = BiomeGenBase.biomeList[wkBiomeNETHER.get(cnt)];
				wkCnt = wkCnt + 1;
			}
		}

		if(BiomeGenBase.biomeList[DeadForestID] != null)
		{
			metaru4[wkCnt] = BiomeGenBase.biomeList[DeadForestID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[DeadForestSnowID] != null)
		{
			metaru4[wkCnt] = BiomeGenBase.biomeList[DeadForestSnowID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[DeadSwampID] != null)
		{
			metaru4[wkCnt] = BiomeGenBase.biomeList[DeadSwampID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[FenID] != null)
		{
			metaru4[wkCnt] = BiomeGenBase.biomeList[FenID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[QuagmireID] != null)
		{
			metaru4[wkCnt] = BiomeGenBase.biomeList[QuagmireID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[BogID] != null)
		{
			metaru4[wkCnt] = BiomeGenBase.biomeList[BogID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[MysticGroveID] != null)
		{
			metaru4[wkCnt] = BiomeGenBase.biomeList[MysticGroveID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[OminousWoodsID] != null)
		{
			metaru4[wkCnt] = BiomeGenBase.biomeList[OminousWoodsID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[WastelandID] != null)
		{
			metaru4[wkCnt] = BiomeGenBase.biomeList[WastelandID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[ThickOminousWoodsID] != null)
		{
			metaru4[wkCnt] = BiomeGenBase.biomeList[ThickOminousWoodsID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[DeadlandsID] != null)
		{
			metaru4[wkCnt] = BiomeGenBase.biomeList[DeadlandsID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[FungiForestID] != null)
		{
			metaru4[wkCnt] = BiomeGenBase.biomeList[FungiForestID];
			wkCnt = wkCnt + 1;
		}

		if(BiomeGenBase.biomeList[VolcanoID] != null)
		{
			metaru4[wkCnt] = BiomeGenBase.biomeList[VolcanoID];
			wkCnt = wkCnt + 1;
		}

		//metaru5
		wkCnt = 0;
		metaru5 = new BiomeGenBase[wkBiomeEND.size() + wkBiomeMUSHROOM.size() + wkBiomeHILLS.size()  + addEndCount];
		for(int cnt = 0; cnt < wkBiomeEND.size(); cnt++)
		{
			metaru5[cnt] = BiomeGenBase.biomeList[wkBiomeEND.get(cnt)];
			wkCnt = wkCnt + 1;
		}
		for(int cnt = 0; cnt < wkBiomeMUSHROOM.size(); cnt++)
		{
			metaru5[wkCnt] = BiomeGenBase.biomeList[wkBiomeMUSHROOM.get(cnt)];
			wkCnt = wkCnt + 1;
		}
		for(int cnt = 0; cnt < wkBiomeHILLS.size(); cnt++)
		{
			metaru5[wkCnt] = BiomeGenBase.biomeList[wkBiomeHILLS.get(cnt)];
			wkCnt = wkCnt + 1;
		}

		if(BiomeGenBase.biomeList[VolcanoID] != null)
		{
			metaru5[wkCnt] = BiomeGenBase.biomeList[VolcanoID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[FungiForestID] != null)
		{
			metaru5[wkCnt] = BiomeGenBase.biomeList[FungiForestID];
			wkCnt = wkCnt + 1;
		}
		if(BiomeGenBase.biomeList[DeadlandsID] != null)
		{
			metaru5[wkCnt] = BiomeGenBase.biomeList[DeadlandsID];
			wkCnt = wkCnt + 1;
		}
	}

    public static void setCanSpawn()
    {
    	DQM.CheckBlock.FieldBlockIDTb.put(flAshBlockID, true);
    	DQM.CheckBlock.FieldBlockIDTb.put(flAshStoneID, true);
    	DQM.CheckBlock.FieldBlockIDTb.put(flCragRockID, true);
    	DQM.CheckBlock.FieldBlockIDTb.put(flDriedDirtID, true);
    	DQM.CheckBlock.FieldBlockIDTb.put(flHardDirtID, true);
    	DQM.CheckBlock.FieldBlockIDTb.put(flHardIceID, true);
    	DQM.CheckBlock.FieldBlockIDTb.put(flHardSandID, true);
    	DQM.CheckBlock.FieldBlockIDTb.put(flMudID, true);
    	DQM.CheckBlock.FieldBlockIDTb.put(flRedRockID, true);

    	DQM.CheckBlock.FieldBlockIDTb.put(lvColorizedID, true);
    	DQM.CheckBlock.FieldBlockIDTb.put(lvFruitID, true);
    	DQM.CheckBlock.FieldBlockIDTb.put(lvLeaf1, true);
    	DQM.CheckBlock.FieldBlockIDTb.put(lvLeaf2, true);
    }

    public static void setBassai()
    {
    	//原木
        DQM.CheckBassai.addBassaiWoodBlock(lgLog1);
        DQM.CheckBassai.addBassaiWoodBlock(lgLog2);
        DQM.CheckBassai.addBassaiWoodBlock(lgLog3);
        DQM.CheckBassai.addBassaiWoodBlock(lgLog4);

        //葉
        DQM.CheckBassai.addBassaiLeaveBlock(lvColorizedID);
        DQM.CheckBassai.addBassaiLeaveBlock(lvFruitID);
        DQM.CheckBassai.addBassaiLeaveBlock(lvLeaf1);
        DQM.CheckBassai.addBassaiLeaveBlock(lvLeaf2);
    }

    public static boolean CheckVanillaBiome(int par1)
    {
    	if(vanillaBiomeIDTb.containsKey(par1))
    	{
    		return true;
    	}
    	return false;
    }

    public static boolean CheckExtraBiome(int par1)
    {
    	if(extraBiomeIDTb.containsKey(par1))
    	{
    		return true;
    	}
    	return false;
    }

    public static boolean CheckNetherBiome(int par1)
    {
    	if(netherBiomeIDTb.containsKey(par1))
    	{
    		return true;
    	}
    	return false;
    }
}


