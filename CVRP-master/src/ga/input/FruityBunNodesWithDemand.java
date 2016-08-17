package ga.input;

import ga.core.Node;
import ga.cvrp.gene.NodeWithDemand;

import java.util.ArrayList;
import java.util.List;

public class FruityBunNodesWithDemand {
	public static List<Node> nodes = new ArrayList<Node>();
	public static int noOfDepos ;
	public static Node startDepo;
	public static Node endDepo;
	public static double totalDemand;
	public static double maxCapacityPerTruck = 1500;
	private static double[][] coords = new double[][]
            // dummy entry to make index of array match indexing of nodes in fruitybun-data.vrp
            {{-1, -1},
            {24.83,21.72},
            {32.61,17},
			{53.12,21.72},
			{26.19,-17.85},
			{3.00254,-9.85265},
			{9.980073,13.7622},
			{13.423,12.585},
			{14.229,15.44455},
			{2.343654,15.92851},
			{8.081236,14.50013},
			{12.45585,-11.2311},
			{5.425,14.412},
			{25.312,46.223},
			{21.312,46.223},
			{5.6,10.044},
			{32.01,-38.67},
			{-0.131,-38.67},
			{20.02,6.315},
			{-39.5217,-38.67},
			{19.49,23.456},
			{56,-43.97},
			{36,45},
			{39,26.408},
			{26.905,26.408},
			{15,15.95}};// node 26

	public static int[] demand = new int[]
            // dummy entry to make index of array match indexing of nodes in fruitybun-data.vrp
            {9999999,
            1000,
            400,
			150,
			50,
			300,
			100,
			200,
			50,
			250,
			75,
			250,
			500,
			150,
			50,
			200,
			300,
			150,
			250,
			300,
			350,
			150,
			180,
			350,
			250,
			275};// node 76
	static{
		for(int i = 2 ; i < coords.length; i ++){
			nodes.add(new NodeWithDemand(Integer.toString(i)  ,coords[i][0] , coords[i][1],demand[i]));
			totalDemand+=demand[i];
		}

		nodes.add(new NodeWithDemand("D1"  ,coords[1][0] , coords[1][1],0));
		nodes.get(nodes.size()-1).setName("1");
		nodes.add(new NodeWithDemand("D2"  ,coords[1][0] , coords[1][1],0));
		nodes.get(nodes.size()-1).setName("1");
		nodes.add(new NodeWithDemand("D3"  ,coords[1][0] , coords[1][1],0));
		nodes.get(nodes.size()-1).setName("1");
		nodes.add(new NodeWithDemand("D4"  ,coords[1][0] , coords[1][1],0));
		nodes.get(nodes.size()-1).setName("1");
		nodes.add(new NodeWithDemand("D5"  ,coords[1][0] , coords[1][1],0));
		nodes.get(nodes.size()-1).setName("1");
		nodes.add(new NodeWithDemand("D6"  ,coords[1][0] , coords[1][1],0));
		nodes.get(nodes.size()-1).setName("1");
		//nodes.add(new NodeWithDemand("D7"  ,coords[1][0] , coords[1][1],0));
		//nodes.get(nodes.size()-1).setName("1");

		//nodes.add(new NodeWithDemand("D7"  ,coords[1][0] , coords[1][1],0));

		startDepo = new NodeWithDemand("D" , coords[1][0] , coords[1][1],0);
		startDepo.setPos("S");
		startDepo.setName("1");
		endDepo = new NodeWithDemand("D" , coords[1][0] , coords[1][1],0);
		endDepo.setPos("E");
		endDepo.setName("1");
		noOfDepos =7;
	}


}
