/**
 * 
 */
package artgame;

import java.util.ArrayList;

/**
 * This is the Element Class
 * 
 * @author Group 12
 *
 */
public class Element {

	private int elementNumber;
	private ElementName elementName;
	private int elementCost;
	private boolean elementSaleable;
	private int ownerNumber;
	private int elementRent;
	private int elementDevLevel;
	private boolean elementDevComplete;
	private int systemNumber;
	private int developmentCost;

	public static final double RENT_ADJ_DEV_LEV1 = 1.1;
	public static final double RENT_ADJ_DEV_LEV2 = 1.2;
	public static final double RENT_ADJ_DEV_LEV3 = 1.3;
	public static final int DEV_COS_ADJ_LEV2 = 10;
	public static final int DEV_COS_ADJ_LEV3 = 20;

	/**
	 * default constructor
	 */
	public Element() {
		
	}

	/**
	 * Constructor with parameter arguments.
	 * 
	 * @param elementNumber
	 * @param elementName
	 * @param elementCost
	 * @param elementSaleable
	 * @param ownerNumber
	 * @param elementRent
	 * @param elementDevLevel
	 * @param elementDevComplete
	 * @param systemNumber
	 * @param developmentCost
	 */
	public Element(int elementNumber, ElementName elementName, int elementCost, boolean elementSaleable,
			int ownerNumber, int elementRent, int elementDevLevel, boolean elementDevComplete, int systemNumber,
			int developmentCost) {
		this.elementNumber = elementNumber;
		this.elementName = elementName;
		this.elementCost = elementCost;
		this.elementSaleable = elementSaleable;
		this.ownerNumber = ownerNumber;
		this.elementRent = elementRent;
		this.elementDevLevel = elementDevLevel;
		this.elementDevComplete = elementDevComplete;
		this.systemNumber = systemNumber;
		this.developmentCost = developmentCost;
	}

	/**
	 * This method creates an instance of the Element Array List and adds the
	 * Elements to the list.
	 * 
	 * @return - returns the array list of Elements
	 */
	public static ArrayList<Element> elementCreation() {
		Element element1 = new Element(1, ElementName.KENNEDY_SPACE_CENTRE, 0, true, 0, 0, 0, false, 0, 0);
		Element element2 = new Element(2, ElementName.RS25_LIQUID_ROCKET_ENGINES, 100, false, 0, 25, 0, false, 1, 50);
		Element element3 = new Element(3, ElementName.INTERIM_CRYOGENIC_PROPULSION_STAGE, 120, false, 0, 30, 0, false, 1,
				60);
		Element element4 = new Element(4, ElementName.HEAT_SHIELD, 140, false, 0, 35, 0, false, 2, 70);
		Element element5 = new Element(5, ElementName.SERVICE_MODULE, 160, false, 0, 40, 0, false, 2, 80);
		Element element6 = new Element(6, ElementName.LAUNCH_ABORT_SYSTEM, 180, false, 0, 45, 0, false, 2, 90);
		Element element7 = new Element(7, ElementName.ANNUAL_LEAVE, 0, true, 0, 0, 0, false, 0, 0);
		Element element8 = new Element(8, ElementName.POWER_AND_PROPULSION_ELEMENT, 200, false, 0, 50, 0, false, 3, 100);
		Element element9 = new Element(9, ElementName.HABITATION_AND_LOGISTICS_OUTPOST, 220, false, 0, 55, 0, false, 3,
				110);
		Element element10 = new Element(10, ElementName.PAYLOAD_AND_RESEARCH_INVESTIGATION, 240, false, 0, 60, 0, false,
				3, 120);
		Element element11 = new Element(11, ElementName.LUNAR_TERRAIN_VEHICLE, 280, false, 0, 65, 0, false, 4, 130);
		Element element12 = new Element(12, ElementName.POLAR_EXPLORATION_ROVER, 280, false, 0, 70, 0, false, 4, 140);
		ArrayList<Element> elements = new ArrayList<Element>();

		elements.add(element1);
		elements.add(element2);
		elements.add(element3);
		elements.add(element4);
		elements.add(element5);
		elements.add(element6);
		elements.add(element7);
		elements.add(element8);
		elements.add(element9);
		elements.add(element10);
		elements.add(element11);
		elements.add(element12);

		return elements;
	}

	/**
	 * This gets the System Number associated with the Element The System numbers
	 * will be between 0-4
	 * 
	 * @return
	 */
	public int getSystemNumber() {
		return systemNumber;
	}

	/**
	 * This sets the System Number associated with the Element THe system numbers
	 * are set between 0-4
	 * 
	 * @param systemNumber
	 */
	public void setSystemNumber(int systemNumber) {
		this.systemNumber = systemNumber;
	}

	/**
	 * This gets the Element Number The Element numbers will be between 1-12
	 * 
	 * @return the elementNumber
	 */
	public int getElementNumber() {
		return elementNumber;
	}

	/**
	 * This sets the Element Number THe Element numbers are set between 1-12
	 * 
	 * @param elementNumber the elementNumber to set
	 */
	public void setElementNumber(int elementNumber) {
		this.elementNumber = elementNumber;
	}

	/**
	 * This gets the Element Name The Element Names are related to the aspects of
	 * the real Artemis Project
	 * 
	 * @return the elementName
	 */
	public ElementName getElementName() {
		return elementName;
	}

	/**
	 * This sets the Element Name The Element Names are set to aspects of the real
	 * Artemis Project
	 * 
	 * @param elementName the elementName to set
	 */
	public void setElementName(ElementName elementName) {
		this.elementName = elementName;
	}

	/**
	 * This gets the Element Cost The Element costs vary depending on the Element
	 * 
	 * @return the elementCost
	 */
	public int getElementCost() {
		return elementCost;
	}

	/**
	 * This sets the Element Cost The Element costs are set depending on the Element
	 * 
	 * @param elementCost the elementCost to set
	 */
	public void setElementCost(int elementCost) {
		this.elementCost = elementCost;
	}

	/**
	 * This gets the indicator for determining whether the Element is for sale
	 * 
	 * @return the elementSaleable
	 */
	public boolean isElementSaleable() {
		return elementSaleable;
	}

	/**
	 * This sets the indicator for determining whether the Element is for sale
	 * 
	 * @param elementSaleable the elementSaleable to set
	 */
	public void setElementSaleable(boolean elementSaleable) {
		this.elementSaleable = elementSaleable;
	}

	/**
	 * This gets the rent amount of the Element The rent amount is 25% of the
	 * Element Cost and varies according to the Development Level
	 * 
	 * @return the elementRent
	 */
	public int getElementRent() {
		return elementRent;
	}

	/**
	 * This sets the rent amount of the Element The rent amount is set at 25% of the
	 * Element Cost and then varies according to the Development Level
	 * 
	 * @param elementRent the elementRent to set
	 */
	public void setElementRent(int elementRent) {
		this.elementRent = elementRent;
	}

	/**
	 * This gets the development level of the Element Values will be between 1-3
	 * after a development has occurred
	 * 
	 * @return the elementDevLevel
	 */
	public int getElementDevLevel() {
		return elementDevLevel;
	}

	/**
	 * This sets the development level of the Element Values will be set between 1-3
	 * after a development has occurred
	 * 
	 * @param elementDevLevel the elementDevLevel to set
	 */
	public void setElementDevLevel(int elementDevLevel) {
		this.elementDevLevel = elementDevLevel;
	}

	/**
	 * This gets the indicator for determining whether the Element Development Level
	 * is complete
	 * 
	 * @return the elementDevComplete
	 */
	public boolean isElementDevComplete() {
		return elementDevComplete;
	}

	/**
	 * This sets the indicator for determining whether the Element Development Level
	 * is complete
	 * 
	 * @param elementDevComplete the elementDevComplete to set
	 */
	public void setElementDevComplete(boolean elementDevComplete) {
		this.elementDevComplete = elementDevComplete;
	}

	/**
	 * This gets the owner number of the Element
	 * 
	 * @return the ownerNumber
	 */
	public int getOwnerNumber() {
		return ownerNumber;
	}

	/**
	 * This sets the owner number of the Element
	 * 
	 * @param ownerNumber the ownerNumber to set
	 */
	public void setOwnerNumber(int ownerNumber) {
		this.ownerNumber = ownerNumber;
	}

	/**
	 * This gets the Development Cost of the Element
	 * 
	 * @return
	 */
	public int getDevelopmentCost() {
		return developmentCost;
	}

	/**
	 * This sets the Development Cost of the Element
	 * 
	 * @param developmentCost
	 */
	public void setDevelopmentCost(int developmentCost) {
		this.developmentCost = developmentCost;
	}

	/**
	 * This method allows Players to develop elements they own. It also checks: (i)
	 * the number of developments per turn (ii) whether all the elements in a system
	 * are fully owned by the same Player (iii) the development levels of each of
	 * the Elements (iV) whether an Element is fully developed
	 * 
	 * @param elements
	 * @param players
	 * @param inTurn
	 * @param boards
	 * @param systems
	 */
	public static void developElement(ArrayList<Element> elements, ArrayList<Players> players, int inTurn,
			ArrayList<Board> boards, ArrayList<Systems> systems) {

		int options, develop;
		boolean devCheck1, devCheck2;
		int numberDevelopments = 0;
		int check = 1;
		// check for if the player has already developed twice this turn
		if (players.get(inTurn - 1).getNumberDevelopments() == 2) {
			System.out.println("You are not able to develop anything else in this turn.");
		} else {
			// loops through systems for user to divide which to develop on if they own all
			// in multiple
			for (Systems s : systems) {

				options = 0;
				develop = 0;
				devCheck1 = false;
				devCheck2 = false;
				ArrayList<Element> elementsToDevelop = new ArrayList<Element>();
				// stops a player being allowed to try to develop elements on a system if it's
				// fully developed
				if (s.isFullyDeveloped() == true) {
					System.out.println("\n"+s.getSystemName() + " is fully developed.  No further development is required.");
				} else if (s.getOwnerNumber() == players.get(inTurn - 1).getPlayerNumber()
						&& players.get(inTurn - 1).getNumberDevelopments() != 2) {
					// while with check which is used to see if the player would like to stop
					// developing
					// goes through elements in the system and presents their name and cost to user
					// to decide which to develop
					for (Element e : elements) {
						if (e.getSystemNumber() == s.getSystemNumber() && e.isElementDevComplete() == false) {
							elementsToDevelop.add(e);
						}
					}
					while (check == 1) {
						// checking the player fully owns the system in order to allow them to develop
						options = 0;
						if (s.getSystemNumber() == 0) {
							break;
						}
						if (s.isFullyBought() == true) {
							System.out.println("From " + s.getSystemName()
									+ ": please select the number of the Element you would like to develop.");
							for (Element e : elementsToDevelop) {
								options++;
								System.out.println(options + " : To develop " + e.getElementName()
										+ " the cost will be " + e.getDevelopmentCost() + " dogecoin.");
							}
							// do while loop for scanner
							do {
								do {
									try {
										// scanner used to get user choice for what element to develop
										System.out.println(
												"Please choose the number of the Element you would you like to develop, or press 0 to cancel this process:");
										develop = Integer.parseInt(PlayerInput.input());
										devCheck1 = true;
									} catch (Exception ex) {
										System.out.println(
												"Houston we have a problem! - Invalid choice, please try again.");
										devCheck1 = false;
									}
								} while (!devCheck1);
								// if they hit 0, breaks loop allowing them to stop with this system
								if (develop == 0) {
									break;
								}
								// if statement to check that the player's choice is a valid option (i.e. within
								// the range of their values for their elements to develop
								if (develop < 1 || develop > options) {
									System.out.println("Houston we have a problem! - Please choose a valid option.");
								}
							} while (develop < 1 || develop > options);
							if (develop == 0) {
								break;
							}
							// if statement to check that the entry was over 0 and equal to or less than the
							// number of options available
							if (develop > 0 && develop <= options) {
								// if to make sure they have enough money
								if (players.get(inTurn - 1).getPlayerBalance() >= elementsToDevelop.get(develop - 1)
										.getDevelopmentCost()) {
									// for loop to go round and make sure that the right element has the development
									// level is added to
									for (Element e : elements) {
										if (e.getElementName() == elementsToDevelop.get(develop - 1).getElementName()) {
											if (e.isElementDevComplete() == false) {
												e.setElementDevLevel(e.getElementDevLevel() + 1);
												players.get(inTurn - 1).setPlayerBalance(
														players.get(inTurn - 1).getPlayerBalance() - elementsToDevelop
																.get(develop - 1).getDevelopmentCost());
												rentAmount(e);
												devAmount(e);
												// telling the user that the element was developed and its new level
												System.out.println(
														"\nYou had enough dogecoin to pay for this development. The development has been applied, and "
																+ elementsToDevelop.get(develop - 1).getElementName()
																+ " is now at development level " + elementsToDevelop
																		.get(develop - 1).getElementDevLevel());
												System.out.println("\nThe new development cost of this Element is now: "
														+ e.getDevelopmentCost()
														+ "\nThe new rent cost of this Element is now: "
														+ e.getElementRent() + ".");
												// adding 1 to number of times player has developed this turn
												players.get(inTurn - 1).setNumberDevelopments(
														players.get(inTurn - 1).getNumberDevelopments() + 1);
												// taking cost of development from player balance
											} else {
												System.out.println("\nThis element is already fully developed.");
											}
											// if to check if the element is now fully developed
											if (e.getElementDevLevel() == 3 && e.isElementDevComplete() == false) {
												e.setElementDevComplete(true);
												// adding 1 to number of elements in a system fully developed
												s.setNumberDeveloped(s.getNumberDeveloped() + 1);
												// if statements to check if the systems are fully developed or not
												if (s.getSystemNumber() == 1 || s.getSystemNumber() == 4) {
													if (s.getNumberDeveloped() == 2) {
														s.setFullyDeveloped(true);
														System.out.println("\nCongratulations, all Elements within "
																+ s.getSystemName() + " are now fully developed!");
													}
												}
												if (s.getSystemNumber() == 2 || s.getSystemNumber() == 3) {
													if (s.getNumberDeveloped() == 3) {
														s.setFullyDeveloped(true);
														System.out.println("\nCongratulations, all Elements within "
																+ s.getSystemName() + " are now fully developed!");
													}
												}
											}
										}
									}
									if (s.isFullyDeveloped()) {
										break;
									}
									// if number of developments is two then user removed from develop element
									// option
									if (players.get(inTurn - 1).getNumberDevelopments() == 2) {
										break;
									}
									// do while loop for when user enters with scanner
									do {
										do {
											try {
												// scanner used to get user choice for if user wants to develop another
												// element
												System.out.println(
														"\nWould you like to develop another element in this system? \nPress 1 (yes) or 0 (quit)");
												check = Integer.parseInt(PlayerInput.input());
												devCheck2 = true;
											} catch (Exception ex) {
												System.out.println(
														"Houston we have a problem! - Please choose a valid option.");
												devCheck2 = false;
											}
										} while (!devCheck2);
										// if statement to check that the player's choice is a valid option (i.e. within
										// the range of their values for their elements to develop
										if (check > 1 || check < 0) {
											System.out.println(
													"Houston we have a problem! - Please choose a valid option.");
										}
									} while (check > 1 || check < 0);
								} else {
									System.out.println(
											"\nSorry, you do not have enough dogecoin to afford the development of this Element!");
								}
							}
						} else {
							System.out.println("\nYou cannot develop system: " + s.getSystemName() + " at this time.");
							break;
						}
					}
					if (numberDevelopments == 2) {
						break;
					}
				} else if (players.get(inTurn - 1).getNumberDevelopments() == 2) {
					System.out.println(
							"\nYou have already completed the maximum of two developments in this turn. \nPlease select another option.");
					break;
				} else {
					if (s.getSystemNumber() != 0) {
						System.out.println("\nYou cannot develop system: " + s.getSystemName() + " at this time");
					}
				}
			}
		}
	} // end of develop element method

	/**
	 * This method allows a Player to sell Elements they own to other Players. The
	 * offer to purchase the Element will be given to all the Players in turn
	 * 
	 * @param elements
	 * @param players
	 * @param inTurn
	 * @param boards
	 * @param systems
	 */
	public static void sellElement(ArrayList<Element> elements, ArrayList<Players> players, int inTurn,
			ArrayList<Board> boards, ArrayList<Systems> systems) {
		// variables created for the use of this method
		// int created for holding the player's choice for what element to sell
		int sell = 0;
		// int created for holding the amount of properties available to sell, used in
		// checking that the number chosen for which property to sell is valid
		int options = 0;
		// inturn + 1 so it starts at next player
		int otherPlayers = inTurn + 1;
		// checks for try and catch when entering data with scanner from user
		boolean ok = false;
		boolean ok2 = false;
		// int for asking the player if they wish to buy
		int yOrN = 0;
		// creating an arraylist to hold all the elements the seller owns
		ArrayList<Element> elementToSell = new ArrayList<Element>();
		System.out.println("\n'" + players.get(inTurn - 1).getPlayerName() + "' you can sell the following Elements:");
		System.out.println("--------------------------------------------------------------");
		// for loop to go round all the elements and check which ones are owned by this
		// seller so they can be added to the arraylist
		for (Element e : elements) {
			if (e.getOwnerNumber() == inTurn) {
				options++;
				System.out.println("Option " + options + " : " + e.getElementName() + " costing " + e.getElementCost());
				elementToSell.add(e);
			}
		}

		// do while loop for getting the user to choose which element they wish to sell
		if (options > 0) {
			do {
				// do while loop to hold the try catch so that the game won't crash if the user
				// enters an invalid character for their choice and will then repeat the demand,
				// after the user has done this
				do {
					try {
						// scanner used to get user choice for what element to sell
						System.out.println("\nTo sell an Element - Press the Option number of the Element.");
						System.out.println(
								"\nAlternatively, to cancel the selling process and return the Main Menu - Press 0.");
						sell = Integer.parseInt(PlayerInput.input());
						ok = true;
						// scanner.close();
					} catch (Exception ex) {
						System.out.println("Houston we have a problem! - Invalid option entered.");
						ok = false;
						// scanner.next();
					}
				} while (!ok);

				// if statement to check that the player's choice is a valid option (i.e. within
				// the range of their values for their elements to sell
				if (sell < 0 || sell > options) {
					System.out.println("Houston we have a problem! - Invalid option entered.");
				}
			} while (sell < 0 || sell > options);
			// if statement so that if their choice is valid then it tells them which
			// element they're selling
			if (sell > 0 && sell <= options) {
				System.out.println("'" + players.get(inTurn - 1).getPlayerName() + "' you have chosen to sell: "
						+ elementToSell.get(sell - 1).getElementName());
			}
			if (sell == 0) {
				System.out.println("\nYou have chosen to quit the selling process!");
			} else {
				// for loop for looping round and offering each player other than the one
				// selling the property the opportunity to buy
				for (int offer = 0; offer < players.size() - 1; offer++) {
					// if statement to reset the other players int back to 1 so that it will loop
					// back to the start rather than counting out of the limits of the array list
					if (otherPlayers > players.size()) {
						otherPlayers = 1;
					}
					// if statement to get round asking players who aren't initialised
					if (players.get(otherPlayers - 1).getPlayerName().equals("void")) {
						otherPlayers++;
					} else {
						// offering the player by name the opportunity to buy
						System.out.println(
								"\n'" + players.get(otherPlayers - 1).getPlayerName() + "', would you like to buy "
										+ elementToSell.get(sell - 1).getElementName() + "?\nPress 1 (yes) or 2 (no).");
						// do while loop for making sure their choice is within the correct range (in
						// this case 1 and 2)
						do {
							// do while loop for holding the try catch, to avoid issues with users entering
							// something other than valid integers and breaking the program
							do {
								try {
									// int entered by the possible buyer used to check if they wish to buy or not
									yOrN = Integer.parseInt(PlayerInput.input());
									ok2 = true;
								} catch (Exception ex) {
									System.out
											.println("Houston we have a problem! - Invalid choice, please try again.");
									ok2 = false;
									// scanner.next();
								}
							} while (!ok2);
							// if the value is not 1 or 2 then they are informed and asked to try again
							if (yOrN > 2 || yOrN < 1) {
								System.out.println("Houston we have a problem! - Please enter 1 or 2");
							}
						} while (yOrN > 2 || yOrN < 1);
						// if statement for if they have said they would like to buy
						if (yOrN == 1) {
							System.out.println("You have chosen to purchase the Element. '"
									+ players.get(otherPlayers - 1).getPlayerName()
									+ "', your balance is being checked.\n");
							// if statement to check that the player planning to buy has equal to or greater
							// than the required amount to buy
							if (players.get(otherPlayers - 1).getPlayerBalance() >= elementToSell.get(sell - 1)
									.getElementCost()) {
								// updates balance of seller
								players.get(inTurn - 1).setPlayerBalance(players.get(inTurn - 1).getPlayerBalance()
										+ elementToSell.get(sell - 1).getElementCost());
								// updates balance of buyer
								players.get(otherPlayers - 1)
										.setPlayerBalance(players.get(otherPlayers - 1).getPlayerBalance()
												- elementToSell.get(sell - 1).getElementCost());
								// sets new owner value for element
								for (Element e : elements) {
									if (e.getElementName() == elementToSell.get(sell - 1).getElementName()) {
										e.setOwnerNumber(otherPlayers);
									}
								}
								// gives messages to buyer and seller about what they have gained and lost
								System.out.println("'" + players.get(otherPlayers - 1).getPlayerName()
										+ "' you can afford the element! Your account has been debited by "
										+ elementToSell.get(sell - 1).getElementCost() + " dogecoin and you now own "
										+ elementToSell.get(sell - 1).getElementName()
										+ ". \nYour account balance is now: "
										+ players.get(otherPlayers - 1).getPlayerBalance() + " dogecoin.\n'");
								System.out.println(
										players.get(inTurn - 1).getPlayerName() + "' your account has been credited by "
												+ elementToSell.get(sell - 1).getElementCost()
												+ " dogecoin and you no longer own "
												+ elementToSell.get(sell - 1).getElementName()
												+ ". \nYour account balance is now: "
												+ players.get(inTurn - 1).getPlayerBalance() + " dogecoin.");
								break;
							}
							// else statement to inform the buyer they can't afford the element
							else {
								System.out.println("\nSorry, you cannot afford to purchase this element.");
							}
						}
						// else statement for when the buyer decides not to purchase
						else {
							System.out.println("\nYou have chosen not to purchase this element.");
						}
						// adding 1 to the counter
						otherPlayers++;
					}
				}
				// if statement for if the element is still owned by the person trying to sell
				// to say this didn't happen
				if (elementToSell.get(sell - 1).getOwnerNumber() == inTurn) {
					System.out.println("\nNo one has chosen to purchase the Element from '"
							+ players.get(inTurn - 1).getPlayerName() + "'");
				}
			}
		}
		if (options == 0) {
			System.out.println("Sorry, you have no options to sell at this time.");
		}
	} // end of sell element method

	/**
	 * This method allows Players to buy an Element they have landed on.
	 * 
	 * @param elements
	 * @param players
	 * @param plTurn
	 * @param boards
	 * @param systems
	 */
	public static void buyElement(ArrayList<Element> elements, ArrayList<Players> players, int plTurn,
			ArrayList<Board> boards, ArrayList<Systems> systems) {

		int playerChoice = 0;
		int playerInTurn = plTurn;
		int elementAmount = 0;
		int buyerNewBalance = 0;
		int playerLoc = 0;
		boolean checkValue = false;

		playerLoc = players.get(plTurn - 1).getPlayerLocation();

		if (elements.get(playerLoc - 1).getSystemNumber() != 0) {
			if (playerInTurn == elements.get(playerLoc - 1).getOwnerNumber()) {
				System.out.println("'" + players.get(playerInTurn - 1).getPlayerName()
						+ "' you already own this Element.  Please select another option.");
			} else if (elements.get(playerLoc - 1).isElementSaleable() == false) {
				System.out.println("Element " + elements.get(playerLoc - 1).getElementNumber() + " - "
						+ elements.get(playerLoc - 1).getElementName() + " will cost "
						+ elements.get(playerLoc - 1).getElementCost() + " dogecoin.");
				elementAmount = elements.get(playerLoc - 1).getElementCost();

				do {
					System.out.println("\nIf you would like to proceed with the purchase of Element "
							+ elements.get(playerLoc - 1).getElementNumber() + " - "
							+ elements.get(playerLoc - 1).getElementName() + "\nPress: 1 (continue) or 2 (reject)");
					do {
						try {
							playerChoice = Integer.parseInt(PlayerInput.input());
							checkValue = true;
						} catch (NumberFormatException nfe) {
							System.out.println("Houston we have a problem! - Invalid choice, please try again.");
							checkValue = false;
						}
					} while (!checkValue);

				} while (playerChoice < 1 || playerChoice > 2);

				if (playerChoice == 1) {

					if (players.get(playerInTurn - 1).getPlayerBalance() < elementAmount) {
						System.out.println("Sorry, you do not have enough dogecoin to buy this Element.");
					} else {
						buyerNewBalance = players.get(playerInTurn - 1).getPlayerBalance() - elementAmount;
						players.get(playerInTurn - 1).setPlayerBalance(buyerNewBalance);

						// update element ownership
						elements.get(playerLoc - 1).setElementSaleable(true);
						elements.get(playerLoc - 1).setOwnerNumber(plTurn);

						System.out.println("Congratulations '" + players.get(playerInTurn - 1).getPlayerName()
								+ "' you are the new owner of Element " + elements.get(playerLoc - 1).getElementNumber()
								+ " - " + elements.get(playerLoc - 1).getElementName());
					}
				}

			} else {
				System.out.println("The Element was not purchased.");
			}
		}
	}// end of buy element method

	/**
	 * This method calculates the rent amount for an Element based upon the
	 * development level. The adjustments for the rent amount are stored as
	 * constants. At development level 1 - the rent will be increased by 10% At
	 * development level 2 - the rent will be increased by 20% from the Level 1
	 * amount At development level 3 - the rent will be increased by 30% from the
	 * Level 2 amount
	 * 
	 * @param element
	 */
	public static void rentAmount(Element element) {
		if (element.getElementDevLevel() == 1) {
			element.setElementRent((int) (element.getElementRent() * RENT_ADJ_DEV_LEV1));
		} else if (element.getElementDevLevel() == 2) {
			element.setElementRent((int) (element.getElementRent() * RENT_ADJ_DEV_LEV2));
		} else if (element.getElementDevLevel() == 3) {
			element.setElementRent((int) (element.getElementRent() * RENT_ADJ_DEV_LEV3));
		}
	}// End rent amount method

	/**
	 * This method calculates the development cost for an Element based upon the
	 * development level. The adjustments for the development cost are stored as
	 * constants. At development level 2 - the development cost will be the
	 * development cost at Level 1 plus 10. At development level 3 - the development
	 * cost will be the development cost at Level 2 plus 20.
	 * 
	 * @param element
	 */
	public static void devAmount(Element element) {
		if (element.getElementDevLevel() == 1) {
			element.setDevelopmentCost(element.getDevelopmentCost() + DEV_COS_ADJ_LEV2);
		} else if (element.getElementDevLevel() == 2) {
			element.setDevelopmentCost(element.getDevelopmentCost() + DEV_COS_ADJ_LEV3);
		}
	}// end of development cost method

}
