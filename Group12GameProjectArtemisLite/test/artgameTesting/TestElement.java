package artgameTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import artgame.AgencyName;
import artgame.Board;
import artgame.Element;
import artgame.ElementName;
import artgame.Players;
import artgame.SystemName;
import artgame.Systems;

class TestElement {
	int elementNumber, elementCost, elementRent, ownerNumber, elementDevLevel, systemNumber, developmentCost, plTurn,
			plTurn2, originalBalance1, originalBalance2, originalBalance3, originalBalance21, originalBalance31,
			originalDevLevel1, originalDevLevel2, originalDevCost3, originalDevCost2, originalElementOwner4,
			originalRent2, originalRent22, originalRent32, originalRent42, originalDevCost22, originalDevCost32,
			originalDevCost42;
	boolean elementSaleable, elementDevComplete;
	ElementName elementName;
	final double RENT_ADJ_DEV_LEV1 = 1.1;
	final double RENT_ADJ_DEV_LEV2 = 1.2;
	final double RENT_ADJ_DEV_LEV3 = 1.3;
	final int DEV_COS_ADJ_LEV1 = 10;
	final int DEV_COS_ADJ_LEV2 = 20;

	ArrayList<Systems> systems;
	Systems system0;
	Systems system1;
	Systems system2;
	Systems system3;
	Systems system4;

	Players player1;
	Players player21;
	Players player31;
	Players player2;
	Players player3;
	Players player4;
	ArrayList<Players> players;
	ArrayList<Players> players2;
	ArrayList<Players> players3;
	Element element1;
	Element element2;
	Element element22;
	Element element32;
	Element element42;
	Element element3;
	Element element4;
	Element element5;
	Element element6;
	Element element7;
	Element element8;
	Element element9;
	Element element10;
	Element element11;
	Element element12;
	ArrayList<Element> elements;

	Board board;
	ArrayList<Board> boards;

	@BeforeEach
	void setUp() throws Exception {
		elementNumber = 1;
		elementName = ElementName.KENNEDY_SPACE_CENTRE;
		elementCost = 0;
		elementSaleable = true;
		ownerNumber = 0;
		elementRent = 0;
		elementDevLevel = 0;
		elementDevComplete = false;
		systemNumber = 0;
		developmentCost = 0;
		plTurn = 1;
		plTurn2 = 2;
		system0 = new Systems(0, false, false, SystemName.FREE_SQUARE, 0, 0);
		system1 = new Systems(1, true, false, SystemName.SPACE_LAUNCH_SYSTEM, 0, 1);
		system2 = new Systems(2, false, false, SystemName.ORION_SPACECRAFT, 0, 0);
		system3 = new Systems(3, false, false, SystemName.THE_GATEWAY, 0, 0);
		system4 = new Systems(4, false, false, SystemName.ARTEMIS_BASECAMP, 0, 0);

		systems = new ArrayList<Systems>();

		systems.add(system0);
		systems.add(system1);
		systems.add(system2);
		systems.add(system3);
		systems.add(system4);

		player1 = new Players("Name1", 1000, 1, 4, AgencyName.NASA, 0);
		player21 = new Players("Name1", 10, 1, 4, AgencyName.NASA, 0);
		player31 = new Players("Name1", 55, 1, 4, AgencyName.NASA, 0);
		player2 = new Players("Name2", 1000, 2, 1, AgencyName.CSA, 0);
		player3 = new Players("Name3", 1000, 3, 1, AgencyName.JAXA, 0);
		player4 = new Players("Name4", 1000, 4, 1, AgencyName.ESA, 0);

		players = new ArrayList<Players>();
		players2 = new ArrayList<Players>();
		players3 = new ArrayList<Players>();
		players.add(player1);
		players.add(player2);
		players.add(player3);
		players.add(player4);
		players2.add(player21);
		players2.add(player2);
		players2.add(player3);
		players2.add(player4);
		players3.add(player31);
		players3.add(player2);
		players3.add(player3);
		players3.add(player4);
		
		element1 = new Element(1, ElementName.KENNEDY_SPACE_CENTRE, 0, true, 0, 0, 0, false, 0, 0);
		element2 = new Element(2, ElementName.RS25_LIQUID_ROCKET_ENGINES, 100, true, 1, 25, 0, false, 1, 50);
		element22 = new Element(2, ElementName.RS25_LIQUID_ROCKET_ENGINES, 100, true, 1, 10, 1, false, 1, 50);
		element32 = new Element(2, ElementName.RS25_LIQUID_ROCKET_ENGINES, 100, true, 1, 10, 2, false, 1, 60);
		element42 = new Element(2, ElementName.RS25_LIQUID_ROCKET_ENGINES, 100, true, 1, 10, 3, true, 1, 60);
		element3 = new Element(3, ElementName.INTERIM_CRYOGENIC_PROPULSION_STAGE, 120, false, 0, 30, 0, false, 1, 60);
		element4 = new Element(4, ElementName.HEAT_SHIELD, 140, false, 0, 35, 0, false, 2, 70);
		element5 = new Element(5, ElementName.SERVICE_MODULE, 160, false, 0, 40, 0, false, 2, 80);
		element6 = new Element(6, ElementName.LAUNCH_ABORT_SYSTEM, 180, false, 0, 45, 0, false, 2, 90);
		element7 = new Element(7, ElementName.ANNUAL_LEAVE, 0, true, 0, 0, 0, false, 0, 0);
		element8 = new Element(8, ElementName.POWER_AND_PROPULSION_ELEMENT, 200, false, 0, 50, 0, false, 3, 100);
		element9 = new Element(9, ElementName.HABITATION_AND_LOGISTICS_OUTPOST, 220, false, 0, 55, 0, false, 3, 110);
		element10 = new Element(10, ElementName.PAYLOAD_AND_RESEARCH_INVESTIGATION, 240, false, 0, 60, 0, false, 3,
				120);
		element11 = new Element(11, ElementName.LUNAR_TERRAIN_VEHICLE, 280, false, 0, 65, 0, false, 4, 130);
		element12 = new Element(12, ElementName.POLAR_EXPLORATION_ROVER, 280, true, 2, 70, 0, false, 4, 140);

		elements = new ArrayList<Element>();

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

		originalBalance1 = player1.getPlayerBalance();
		originalBalance2 = player2.getPlayerBalance();
		originalBalance3 = player3.getPlayerBalance();
		originalBalance21 = player21.getPlayerBalance();
		originalBalance31 = player31.getPlayerBalance();
		originalDevCost2 = element2.getDevelopmentCost();
		originalDevCost3 = element3.getDevelopmentCost();
		originalDevLevel1 = 0;
		originalDevLevel2 = 0;
		originalElementOwner4 = element4.getOwnerNumber();
		originalRent2 = element2.getElementRent();
		originalRent22 = element22.getElementRent();
		originalRent32 = element32.getElementRent();
		originalRent42 = element42.getElementRent();
		originalDevCost22 = element22.getDevelopmentCost();
		originalDevCost32 = element32.getDevelopmentCost();
		originalDevCost42 = element42.getDevelopmentCost();

		board = new Board(1, 0, false);
		boards = new ArrayList<Board>();

		boards.add(board);
	}

	@Test
	void UC01007testConstructorNoArgs() {
		Element element = new Element();
		assertNotNull(element);
	}

	@Test
	void UC01008testConstructorWithArgs() {
		Element element = new Element(elementNumber, elementName, elementCost, elementSaleable, ownerNumber,
				elementRent, elementDevLevel, elementDevComplete, systemNumber, developmentCost);
		assertNotNull(element);
		assertEquals(element.getElementNumber(), elementNumber);
		assertEquals(element.getElementName(), elementName);
		assertEquals(element.getElementCost(), elementCost);
		assertEquals(element.isElementSaleable(), elementSaleable);
		assertEquals(element.getOwnerNumber(), ownerNumber);
		assertEquals(element.getElementRent(), elementRent);
		assertEquals(element.getElementDevLevel(), elementDevLevel);
		assertEquals(element.isElementDevComplete(), elementDevComplete);
		assertEquals(element.getSystemNumber(), systemNumber);
		assertEquals(element.getDevelopmentCost(), developmentCost);
	}

	@Test
	void UC02002testElementNumberGetterSetter() {
		Element element = new Element();
		element.setElementNumber(elementNumber);
		assertEquals(element.getElementNumber(), elementNumber);
	}

	@Test
	void UC02003testElementNameGetterSetter() {
		Element element = new Element();
		element.setElementName(elementName);
		assertEquals(element.getElementName(), elementName);
	}

	@Test
	void UC02005testElementCostGetterSetter() {
		Element element = new Element();
		element.setElementCost(elementCost);
		assertEquals(element.getElementCost(), elementCost);
	}

	@Test
	void UC02004testElementSaleableGetterSetter() {
		Element element = new Element();
		element.setElementSaleable(elementSaleable);
		assertEquals(element.isElementSaleable(), elementSaleable);
	}

	@Test
	void UC02006testOwnerNumberGetterSetter() {
		Element element = new Element();
		element.setOwnerNumber(ownerNumber);
		assertEquals(element.getOwnerNumber(), ownerNumber);
	}

	@Test
	void UC06001testElementRentGetterSetter() {
		Element element = new Element();
		element.setElementRent(elementRent);
		assertEquals(element.getElementRent(), elementRent);
	}

	@Test
	void UC05001testElementDevLevelGetterSetter() {
		Element element = new Element();
		element.setElementDevLevel(elementDevLevel);
		assertEquals(element.getElementDevLevel(), elementDevLevel);
	}

	@Test
	void UC05003testElementDevCompleteGetterSetter() {
		Element element = new Element();
		element.setElementDevComplete(elementDevComplete);
		assertEquals(element.isElementDevComplete(), elementDevComplete);
	}

	@Test
	void UC02007testSystemNumberGetterSetter() {
		Element element = new Element();
		element.setSystemNumber(systemNumber);
		assertEquals(element.getSystemNumber(), systemNumber);
	}

	@Test
	void UC05003testDevelopmentCostGetterSetter() {
		Element element = new Element();
		element.setDevelopmentCost(developmentCost);
		assertEquals(element.getDevelopmentCost(), developmentCost);
	}

	// done assuming the player does two developments of the first element in the
	// list, second in order
	@Test
	void UC05009testDevelopElementDevelopedTwiceSameElement() {
		System.out.println("\nThis is assuming player develops same element (option 1) twice");
		Element.developElement(elements, players, plTurn, boards, systems);
		assertEquals(players.get(plTurn - 1).getPlayerBalance(),
				originalBalance1 - originalDevCost2 - (originalDevCost2 + DEV_COS_ADJ_LEV1));
		assertEquals(elements.get(1).getElementDevLevel(), originalDevLevel1 + 2);
		assertEquals(elements.get(2).getElementDevLevel(), originalDevLevel2);
	}

	// done assuming player does one development on first element in list then quits
	@Test
	void UC05005testDevelopElementDevelopedOnceThenQuit() {
		System.out.println("\nThis is assuming player develops element 1 once then quits");
		Element.developElement(elements, players, plTurn, boards, systems);
		assertEquals(players.get(plTurn - 1).getPlayerBalance(), originalBalance1 - originalDevCost2);
		assertEquals(elements.get(1).getElementDevLevel(), originalDevLevel1 + 1);
		assertEquals(elements.get(2).getElementDevLevel(), originalDevLevel2);
	}

	@Test
	void UC05006testDevelopElementDevelopedOnceOnEach() {
		System.out.println("\nThis is assuming player develops once on each element");
		Element.developElement(elements, players, plTurn, boards, systems);
		assertEquals(players.get(plTurn - 1).getPlayerBalance(),
				originalBalance1 - originalDevCost2 - originalDevCost3);
		assertEquals(elements.get(1).getElementDevLevel(), originalDevLevel1 + 1);
		assertEquals(elements.get(2).getElementDevLevel(), originalDevLevel2 + 1);
	}

	@Test
	void UC05007testDevelopElementImmediateQuit() {
		System.out.println("\nThis is assuming player quits immediately");
		Element.developElement(elements, players, plTurn, boards, systems);
		assertEquals(players.get(plTurn - 1).getPlayerBalance(), originalBalance1);
		assertEquals(elements.get(1).getElementDevLevel(), originalDevLevel1);
		assertEquals(elements.get(2).getElementDevLevel(), originalDevLevel2);
	}

	@Test
	void UC05004testDevelopElementCantAffordOne() {
		System.out.println("\nThis is assuming player can't afford to develop");
		Element.developElement(elements, players2, plTurn, boards, systems);
		assertEquals(players2.get(plTurn - 1).getPlayerBalance(), originalBalance21);
		assertEquals(elements.get(1).getElementDevLevel(), originalDevLevel1);
		assertEquals(elements.get(2).getElementDevLevel(), originalDevLevel2);
	}

	@Test
	void UC05008testDevelopElementCantAffordTwo() {
		System.out.println("\nThis is assuming player can afford one (first) but not two developments");
		Element.developElement(elements, players3, plTurn, boards, systems);
		assertEquals(players3.get(plTurn - 1).getPlayerBalance(), originalBalance31 - originalDevCost2);
		assertEquals(elements.get(1).getElementDevLevel(), originalDevLevel1 + 1);
		assertEquals(elements.get(2).getElementDevLevel(), originalDevLevel2);
	}

	@Test
	void UC04004testBuyElementSuccessfully() {
		System.out.println("\nThis is assuming player buys element and affords it.");
		Element.buyElement(elements, players, plTurn, boards, systems);
		assertEquals(players.get(plTurn - 1).getPlayerBalance(), originalBalance1 - elements.get(3).getElementCost());
		assertEquals(elements.get(3).getOwnerNumber(), players.get(plTurn - 1).getPlayerNumber());
	}

	@Test
	void UC04005testBuyElementDecline() {
		System.out.println("\nThis is assuming player chooses not to buy element.");
		Element.buyElement(elements, players, plTurn, boards, systems);
		assertEquals(players.get(plTurn - 1).getPlayerBalance(), originalBalance1);
		assertEquals(elements.get(3).getOwnerNumber(), originalElementOwner4);
	}

	@Test
	void UC04003testBuyElementCantAfford() {
		System.out.println("\nThis is assuming player can't afford the element.");
		Element.buyElement(elements, players2, plTurn, boards, systems);
		assertEquals(players2.get(plTurn - 1).getPlayerBalance(), originalBalance21);
		assertEquals(elements.get(3).getOwnerNumber(), originalElementOwner4);
	}

	@Test
	void UC07001testSellElementFine() {
		System.out.println("\nThis is assuming player 2 sells to player 3 and it all goes fine");
		Element.sellElement(elements, players, plTurn2, boards, systems);
		assertEquals(players.get(plTurn2 - 1).getPlayerBalance(), originalBalance2 + elements.get(11).getElementCost());
		assertEquals(players.get(plTurn2).getPlayerBalance(), originalBalance3 - elements.get(11).getElementCost());
		assertEquals(elements.get(11).getOwnerNumber(), players.get(plTurn2).getPlayerNumber());
	}

	@Test
	void UC07002testSellElementCantAfford() {
		System.out.println("\nThis is assuming player 2 tries to sell to player 1 and they can't afford");
		Element.sellElement(elements, players2, plTurn2, boards, systems);
		assertEquals(players2.get(plTurn2 - 1).getPlayerBalance(), originalBalance2);
		assertEquals(players2.get(plTurn2 - 2).getPlayerBalance(), originalBalance21);
		assertEquals(elements.get(11).getOwnerNumber(), players2.get(plTurn2 - 1).getPlayerNumber());
	}

	@Test
	void UC07003testSellElementNoOneBuys() {
		System.out.println("\nThis is assuming player 2 tries to sell and no one chooses");
		Element.sellElement(elements, players, plTurn2, boards, systems);
		assertEquals(players.get(plTurn2 - 1).getPlayerBalance(), originalBalance2);
		assertEquals(elements.get(11).getOwnerNumber(), players.get(plTurn2 - 1).getPlayerNumber());
	}

	@Test
	void UC06004testRentAmount() {
		Element.rentAmount(element2);
		assertEquals(element2.getElementRent(), originalRent2);
	}

	@Test
	void UC06005testRentAmountLev1() {
		Element.rentAmount(element22);
		assertEquals(element22.getElementRent(), (int) originalRent22 * RENT_ADJ_DEV_LEV1);
	}

	@Test
	void UC06006testRentAmountLev2() {
		Element.rentAmount(element32);
		assertEquals(element32.getElementRent(), (int) originalRent32 * RENT_ADJ_DEV_LEV2);
	}

	@Test
	void UC06007testRentAmountLev3() {
		Element.rentAmount(element42);
		assertEquals(element42.getElementRent(), (int) originalRent42 * RENT_ADJ_DEV_LEV3);
	}

	@Test
	void UC05010testDevAmountLev0() {
		Element.devAmount(element2);
		assertEquals(element2.getDevelopmentCost(), originalDevCost2);
	}

	@Test
	void UC05011testDevAmountLev1() {
		Element.devAmount(element22);
		assertEquals(element22.getDevelopmentCost(), originalDevCost22 + DEV_COS_ADJ_LEV1);
	}

	@Test
	void UC05012testDevAmountLev2() {
		Element.devAmount(element32);
		assertEquals(element32.getDevelopmentCost(), originalDevCost32 + DEV_COS_ADJ_LEV2);
	}

	@Test
	void UC01002testElementCreation() {
		ArrayList<Element> elements = new ArrayList<Element>();
		elements = Element.elementCreation();
		assertEquals(elements.get(0).getElementNumber(), 1);
		assertEquals(elements.get(1).getElementNumber(), 2);
		assertEquals(elements.get(2).getElementNumber(), 3);
		assertEquals(elements.get(3).getElementNumber(), 4);
		assertEquals(elements.get(4).getElementNumber(), 5);
		assertEquals(elements.get(5).getElementNumber(), 6);
		assertEquals(elements.get(6).getElementNumber(), 7);
		assertEquals(elements.get(7).getElementNumber(), 8);
		assertEquals(elements.get(8).getElementNumber(), 9);
		assertEquals(elements.get(9).getElementNumber(), 10);
		assertEquals(elements.get(10).getElementNumber(), 11);
		assertEquals(elements.get(11).getElementNumber(), 12);
		assertEquals(elements.get(0).getElementName(), ElementName.KENNEDY_SPACE_CENTRE);
		assertEquals(elements.get(1).getElementName(), ElementName.RS25_LIQUID_ROCKET_ENGINES);
		assertEquals(elements.get(2).getElementName(), ElementName.INTERIM_CRYOGENIC_PROPULSION_STAGE);
		assertEquals(elements.get(3).getElementName(), ElementName.HEAT_SHIELD);
		assertEquals(elements.get(4).getElementName(), ElementName.SERVICE_MODULE);
		assertEquals(elements.get(5).getElementName(), ElementName.LAUNCH_ABORT_SYSTEM);
		assertEquals(elements.get(6).getElementName(), ElementName.ANNUAL_LEAVE);
		assertEquals(elements.get(7).getElementName(), ElementName.POWER_AND_PROPULSION_ELEMENT);
		assertEquals(elements.get(8).getElementName(), ElementName.HABITATION_AND_LOGISTICS_OUTPOST);
		assertEquals(elements.get(9).getElementName(), ElementName.PAYLOAD_AND_RESEARCH_INVESTIGATION);
		assertEquals(elements.get(10).getElementName(), ElementName.LUNAR_TERRAIN_VEHICLE);
		assertEquals(elements.get(11).getElementName(), ElementName.POLAR_EXPLORATION_ROVER);
		assertEquals(elements.get(0).getElementCost(), 0);
		assertEquals(elements.get(1).getElementCost(), 100);
		assertEquals(elements.get(2).getElementCost(), 120);
		assertEquals(elements.get(3).getElementCost(), 140);
		assertEquals(elements.get(4).getElementCost(), 160);
		assertEquals(elements.get(5).getElementCost(), 180);
		assertEquals(elements.get(6).getElementCost(), 0);
		assertEquals(elements.get(7).getElementCost(), 200);
		assertEquals(elements.get(8).getElementCost(), 220);
		assertEquals(elements.get(9).getElementCost(), 240);
		assertEquals(elements.get(10).getElementCost(), 280);
		assertEquals(elements.get(11).getElementCost(), 280);
		assertEquals(elements.get(0).isElementSaleable(), true);
		assertEquals(elements.get(1).isElementSaleable(), false);
		assertEquals(elements.get(2).isElementSaleable(), false);
		assertEquals(elements.get(3).isElementSaleable(), false);
		assertEquals(elements.get(4).isElementSaleable(), false);
		assertEquals(elements.get(5).isElementSaleable(), false);
		assertEquals(elements.get(6).isElementSaleable(), true);
		assertEquals(elements.get(7).isElementSaleable(), false);
		assertEquals(elements.get(8).isElementSaleable(), false);
		assertEquals(elements.get(9).isElementSaleable(), false);
		assertEquals(elements.get(10).isElementSaleable(), false);
		assertEquals(elements.get(11).isElementSaleable(), false);
		assertEquals(elements.get(0).getOwnerNumber(), 0);
		assertEquals(elements.get(1).getOwnerNumber(), 0);
		assertEquals(elements.get(2).getOwnerNumber(), 0);
		assertEquals(elements.get(3).getOwnerNumber(), 0);
		assertEquals(elements.get(4).getOwnerNumber(), 0);
		assertEquals(elements.get(5).getOwnerNumber(), 0);
		assertEquals(elements.get(6).getOwnerNumber(), 0);
		assertEquals(elements.get(7).getOwnerNumber(), 0);
		assertEquals(elements.get(8).getOwnerNumber(), 0);
		assertEquals(elements.get(9).getOwnerNumber(), 0);
		assertEquals(elements.get(10).getOwnerNumber(), 0);
		assertEquals(elements.get(11).getOwnerNumber(), 0);
		assertEquals(elements.get(0).getElementRent(), 0);
		assertEquals(elements.get(1).getElementRent(), 25);
		assertEquals(elements.get(2).getElementRent(), 30);
		assertEquals(elements.get(3).getElementRent(), 35);
		assertEquals(elements.get(4).getElementRent(), 40);
		assertEquals(elements.get(5).getElementRent(), 45);
		assertEquals(elements.get(6).getElementRent(), 0);
		assertEquals(elements.get(7).getElementRent(), 50);
		assertEquals(elements.get(8).getElementRent(), 55);
		assertEquals(elements.get(9).getElementRent(), 60);
		assertEquals(elements.get(10).getElementRent(), 65);
		assertEquals(elements.get(11).getElementRent(), 70);
		assertEquals(elements.get(0).getElementDevLevel(), 0);
		assertEquals(elements.get(1).getElementDevLevel(), 0);
		assertEquals(elements.get(2).getElementDevLevel(), 0);
		assertEquals(elements.get(3).getElementDevLevel(), 0);
		assertEquals(elements.get(4).getElementDevLevel(), 0);
		assertEquals(elements.get(5).getElementDevLevel(), 0);
		assertEquals(elements.get(6).getElementDevLevel(), 0);
		assertEquals(elements.get(7).getElementDevLevel(), 0);
		assertEquals(elements.get(8).getElementDevLevel(), 0);
		assertEquals(elements.get(9).getElementDevLevel(), 0);
		assertEquals(elements.get(10).getElementDevLevel(), 0);
		assertEquals(elements.get(11).getElementDevLevel(), 0);
		assertEquals(elements.get(0).isElementDevComplete(), false);
		assertEquals(elements.get(1).isElementDevComplete(), false);
		assertEquals(elements.get(2).isElementDevComplete(), false);
		assertEquals(elements.get(3).isElementDevComplete(), false);
		assertEquals(elements.get(4).isElementDevComplete(), false);
		assertEquals(elements.get(5).isElementDevComplete(), false);
		assertEquals(elements.get(6).isElementDevComplete(), false);
		assertEquals(elements.get(7).isElementDevComplete(), false);
		assertEquals(elements.get(8).isElementDevComplete(), false);
		assertEquals(elements.get(9).isElementDevComplete(), false);
		assertEquals(elements.get(10).isElementDevComplete(), false);
		assertEquals(elements.get(11).isElementDevComplete(), false);
		assertEquals(elements.get(0).getSystemNumber(), 0);
		assertEquals(elements.get(1).getSystemNumber(), 1);
		assertEquals(elements.get(2).getSystemNumber(), 1);
		assertEquals(elements.get(3).getSystemNumber(), 2);
		assertEquals(elements.get(4).getSystemNumber(), 2);
		assertEquals(elements.get(5).getSystemNumber(), 2);
		assertEquals(elements.get(6).getSystemNumber(), 0);
		assertEquals(elements.get(7).getSystemNumber(), 3);
		assertEquals(elements.get(8).getSystemNumber(), 3);
		assertEquals(elements.get(9).getSystemNumber(), 3);
		assertEquals(elements.get(10).getSystemNumber(), 4);
		assertEquals(elements.get(11).getSystemNumber(), 4);
		assertEquals(elements.get(0).getDevelopmentCost(), 0);
		assertEquals(elements.get(1).getDevelopmentCost(), 50);
		assertEquals(elements.get(2).getDevelopmentCost(), 60);
		assertEquals(elements.get(3).getDevelopmentCost(), 70);
		assertEquals(elements.get(4).getDevelopmentCost(), 80);
		assertEquals(elements.get(5).getDevelopmentCost(), 90);
		assertEquals(elements.get(6).getDevelopmentCost(), 0);
		assertEquals(elements.get(7).getDevelopmentCost(), 100);
		assertEquals(elements.get(8).getDevelopmentCost(), 110);
		assertEquals(elements.get(9).getDevelopmentCost(), 120);
		assertEquals(elements.get(10).getDevelopmentCost(), 130);
		assertEquals(elements.get(11).getDevelopmentCost(), 140);
	}
}
