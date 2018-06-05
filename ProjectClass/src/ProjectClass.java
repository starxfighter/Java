import java.util.*;

class Project {
	private String name;
	private String description;
	private double cost;
//	Set Constructors
	public Project () {};
//	name only constructor
	public Project (String iname) {
		name = iname;
	}
//name and description constructor
	public Project (String iname, String idescription) {
		name = iname;
		description = idescription;
	}
//	Mutators
	public void setName(String setName) {
		name = setName;
	}
	
	public void setDescription(String setDesc) {
		description = setDesc;
	}
	
	public void setCost(Double setCost) {
		cost = setCost;
	}
//	Accessors
	public String getName() {
		return name;
	}
	
	public String getDesc() {
		return description;
	}
	
	public Double getCost() {
		return cost;
	}
	
//	Methods
	public String elevatorPitch() {
		return name + "(" + cost + "):" + description;
	}
	
	@Override
	public String toString() {
		return "Project: Name = " + name + " Description = " + description + " Cost = " + cost;
	}
}
class Portfolio{
	private ArrayList<Project> projects = new ArrayList<Project>();
	
	public Portfolio() {};
//	Mutators
	public void setProjects(Project setProject) {
		projects.add(setProject);
	}
//	Accessors
	public Project getProjects(int index) {
		return projects.get(index);
	}
//	Methods
	public Double getPortfolioCost() {
		Double sum = 0.00;
		Double temp = 0.00;
		Project proj = new Project();
		for(int x = 0; x < projects.size(); x++) {
			proj = projects.get(x);
			temp = proj.getCost();
			sum = sum + temp;
		}
		return sum;
	}
	
	public void showPortfolio() {
		for(int x = 0; x < projects.size(); x++) {
			System.out.println(projects.get(x));
		}
	}
}
public class ProjectClass {

	public static void main(String[] args) {
		Project projectA = new Project();
		System.out.println(projectA);
		Project projectB = new Project("Whirlwind");
		System.out.println(projectB);
		Project projectC = new Project("TradWars", "An interactive trading game");
		System.out.println(projectC);
		String test;
		test = projectC.elevatorPitch();
		System.out.println(test);
		projectA.setCost(100.50);
		projectB.setCost(225.10);
		projectC.setCost(300.00);
		test = projectC.elevatorPitch();
		System.out.println(test);
		System.out.println("Start Portfolio stuff");
		Portfolio port = new Portfolio();
		port.setProjects(projectA);
		port.setProjects(projectB);
		port.setProjects(projectC);
		System.out.println("Print Portfolio" + port);
		Double portcost = 0.00;
		portcost = port.getPortfolioCost();
		System.out.println("The portfolio cost is " + portcost);
		port.showPortfolio();
		
	}
}


