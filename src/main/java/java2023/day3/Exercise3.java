package java2023.day3;

public class Exercise3 {

	public static void main(String[] args) {
// create the 3 data fiels
		public class Node {
		    private double xCoordinate;
		    private double yCoordinate;
		    private String id;

		    public Node(double xCoordinate, double yCoordinate, String id) {
		        this.xCoordinate = xCoordinate;
		        this.yCoordinate = yCoordinate;
		        this.id = id;
		    }

		    public double getXCoordinate() {
		        return xCoordinate;
		    }

		    public double getYCoordinate() {
		        return yCoordinate;
		    }

		    public String getId() {
		        return id;
		    }
		}


		public class Link {
	//create the data fields for the class link
		    private Node fromNode;
		    private Node toNode;
		    private String id;
		    private String[] modes;
		    private double length;
		    private int allowedSpeed;
		    private double capacity;

		    public Link(Node fromNode, Node toNode, String id, String[] modes, double length, int allowedSpeed, double capacity) {
		        this.fromNode = fromNode;
		        this.toNode = toNode;
		        this.id = id;
		        this.modes = modes;
		        this.length = length;
		        this.allowedSpeed = allowedSpeed;
		        this.capacity = capacity;
		    }
//create the getter methods for the class link 
		    public Node getFromNode() {
		        return fromNode;
		    }

		    public Node getToNode() {
		        return toNode;
		    }

		    public String getId() {
		        return id;
		    }

		    public String[] getModes() {
		        return modes;
		    }

		    public double getLength() {
		        return length;
		    }

		    public int getAllowedSpeed() {
		        return allowedSpeed;
		    }

		    public double getCapacity() {
		        return capacity;
		    }
		}
		
//create a class network with the required data fields
		public class Network {
		    private Node[] nodes;
		    private Link[] links;

		    public Network(Node[] nodes, Link[] links) {
		        this.nodes = nodes;
		        this.links = links;
		    }
//create the  two getter methods
		    public Node[] getNodes() {
		        return nodes;
		    }

		    public Link[] getLinks() {
		        return links;
		    }
		}

		public class TestNetwork {
		    public static void main(String[] args) {
// Create 4 nodes
		        Node nodeA = new Node(0.0, 0.0, "A");
		        Node nodeB = new Node(0.0, 1.0, "B");
		        Node nodeC = new Node(1.0, 0.0, "C");
		        Node nodeD = new Node(1.0, 1.0, "D");

// Create 4 links
		        Link linkAB = new Link(nodeA, nodeB, "AB", new String[]{"Mode1"}, 1.0, 60, 1000.0);
		        Link linkBC = new Link(nodeB, nodeC, "BC", new String[]{"Mode2"}, 2.0, 50, 800.0);
		        Link linkCD = new Link(nodeC, nodeD, "CD", new String[]{"Mode1", "Mode2"}, 1.5, 70, 1200.0);
		        Link linkDA = new Link(nodeD, nodeA, "DA", new String[]{"Mode1"}, 1.2, 55, 900.0);
		        
// Create the network with nodes and links
		        Node[] nodes = {nodeA, nodeB, nodeC, nodeD};
		        Link[] links = {linkAB, linkBC, linkCD, linkDA};
		        Network network = new Network(nodes, links);

// Display coordinates of all nodes in the network
		        System.out.println("Coordinates of Nodes in the Network:");
		        for (Node node : network.getNodes()) {
		            System.out.println("Node " + node.getId() + ": (" + node.getXCoordinate() + ", " + node.getYCoordinate() + ")");
		        }
		    }
		}


	}

}
