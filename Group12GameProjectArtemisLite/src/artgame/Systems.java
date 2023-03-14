package artgame;

import java.util.ArrayList;

/**
 * This is the Systems Class
 * @author Group 12
 *
 */
public class Systems {
	private boolean fullyBought; 
	private boolean fullyDeveloped;
	private SystemName systemName;
	private int systemNumber;
	private int numberDeveloped;
	private int ownerNumber;
	
	/**
	 * default constructor
	 */
	public Systems() {	
	}
	
	/**
	 * Constructor with parameter arguments
	 * @param systemNumber
	 * @param fullyBought
	 * @param fullyDeveloped
	 * @param systemName
	 * @param numberDeveloped
	 * @param ownerNumber
	 */
	public Systems (int systemNumber, boolean fullyBought, boolean fullyDeveloped, SystemName systemName, int numberDeveloped, int ownerNumber) {
		this.systemNumber = systemNumber;
		this.fullyBought = fullyBought;
		this.fullyDeveloped = fullyDeveloped;
		this.systemName = systemName;
		this.numberDeveloped = numberDeveloped;
		this.ownerNumber = ownerNumber;
	}
	
	/**
	 * This method creates and Array List of Systems and adds systems to the list
	 * @return - returns an array list of systems
	 */
	public static ArrayList<Systems> createSystems(){
		ArrayList<Systems> systems = new ArrayList<Systems>();
		Systems system0 = new Systems(0, false, false, SystemName.FREE_SQUARE, 0, 0);
		Systems system1 = new Systems(1, false, false, SystemName.SPACE_LAUNCH_SYSTEM, 0, 0);
		Systems system2 = new Systems(2, false, false, SystemName.ORION_SPACECRAFT, 0, 0);
		Systems system3 = new Systems(3, false, false, SystemName.THE_GATEWAY, 0, 0);
		Systems system4 = new Systems(4, false, false, SystemName.ARTEMIS_BASECAMP, 0, 0);
		systems.add(system0);
		systems.add(system1);
		systems.add(system2);
		systems.add(system3);
		systems.add(system4);
		return systems;
	}

	/**
	 * This gets the indicator for a Fully Bought System
	 * @return
	 */
	public boolean isFullyBought() {
		return fullyBought;
	}

	/**
	 * This sets the indicator for a Fully Bought System
	 * @param fullyBought
	 */
	public void setFullyBought(boolean fullyBought) {
		this.fullyBought = fullyBought;
	}

	/**
	 * This gets the indicator for a Fully Developed System
	 * @return
	 */
	public boolean isFullyDeveloped() {
		return fullyDeveloped;
	}

	/**
	 * This sets the indicator for a Fully Developed System
	 * @param fullyDeveloped
	 */
	public void setFullyDeveloped(boolean fullyDeveloped) {
		this.fullyDeveloped = fullyDeveloped;
	}

	/**
	 * This gets the System Name
	 * @return
	 */
	public SystemName getSystemName() {
		return systemName;
	}

	/**
	 * This sets the System Name
	 * @param systemName
	 */
	public void setSystemName(SystemName systemName) {
		this.systemName = systemName;
	}

	/**
	 * This gets the System Number
	 * @return
	 */
	public int getSystemNumber() {
		return systemNumber;
	}

	/**
	 * This sets the System Number
	 * @param systemNumber
	 */
	public void setSystemNumber(int systemNumber) {
		this.systemNumber = systemNumber;
	}

	/**
	 * This gets the indicator for the number of developed elements in the System
	 * @return
	 */
	public int getNumberDeveloped() {
		return numberDeveloped;
	}

	/**
	 * This sets the indicator for the number of developed elements in the System
	 * @param numberDeveloped
	 */
	public void setNumberDeveloped(int numberDeveloped) {
		this.numberDeveloped = numberDeveloped;
	}
	
	/**
	 * This gets the Owner Number of a System
	 * @return
	 */
	public int getOwnerNumber() {
		return ownerNumber;
	}

	/**
	 * This sets the Owner Number of a System
	 * @param ownerNumber
	 */
	public void setOwnerNumber(int ownerNumber) {
		this.ownerNumber = ownerNumber;
	}
	
	/**
	 * This method checks whether the all the elements in a system are bought by the same Player and sets the fully bought variable.
	 * @param elements
	 * @param players
	 * @param inTurn
	 * @param boards
	 * @param systems
	 */
	public static void checkFullyBought(ArrayList<Element> elements, ArrayList<Players> players, int inTurn,
			ArrayList<Board> boards, ArrayList<Systems> systems) {
		// if statements to check if all elements in a system have the same owner and
		// set the systems to fully bought for element development
		if (elements.get(1).getOwnerNumber() == elements.get(2).getOwnerNumber()) {
			if (elements.get(1).getOwnerNumber() != 0) {
				systems.get(1).setFullyBought(true);
				systems.get(1).setOwnerNumber(elements.get(1).getOwnerNumber());
			}
		} else {
			systems.get(1).setFullyBought(false);
			systems.get(1).setOwnerNumber(0);
		}
		if (elements.get(3).getOwnerNumber() == elements.get(4).getOwnerNumber()
				&& elements.get(3).getOwnerNumber() == elements.get(5).getOwnerNumber()) {
			if (elements.get(3).getOwnerNumber() != 0) {
				systems.get(2).setFullyBought(true);
				systems.get(2).setOwnerNumber(elements.get(3).getOwnerNumber());
			}
		} else {
			systems.get(2).setFullyBought(false);
			systems.get(2).setOwnerNumber(0);
		}
		if (elements.get(7).getOwnerNumber() == elements.get(8).getOwnerNumber()
				&& elements.get(7).getOwnerNumber() == elements.get(9).getOwnerNumber()) {
			if (elements.get(7).getOwnerNumber() != 0) {
				systems.get(3).setFullyBought(true);
				systems.get(3).setOwnerNumber(elements.get(7).getOwnerNumber());
			}
		} else {
			systems.get(3).setFullyBought(false);
			systems.get(3).setOwnerNumber(0);
		}
		if (elements.get(10).getOwnerNumber() == elements.get(11).getOwnerNumber()) {
			if (elements.get(10).getOwnerNumber() != 0) {
				systems.get(4).setFullyBought(true);
				systems.get(4).setOwnerNumber(elements.get(10).getOwnerNumber());
			}
		} else {
			systems.get(4).setFullyBought(false);
			systems.get(4).setOwnerNumber(0);
		}
	}// end of check fully bought method
	
}
