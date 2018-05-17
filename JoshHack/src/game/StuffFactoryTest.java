package game;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>StuffFactoryTest</code> contains tests for the class <code>{@link StuffFactory}</code>.
 *
 * @generatedBy CodePro at 5/17/18 9:43 AM
 * @author tyler
 * @version $Revision: 1.0 $
 */
public class StuffFactoryTest {
	/**
	 * Run the StuffFactory(World) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testStuffFactory_1()
		throws Exception {
		World world = new World(new Tile[][][] {});

		StuffFactory result = new StuffFactory(world);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature newBat(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewBat_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Creature result = fixture.newBat(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newBlueMagesSpellbook(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewBlueMagesSpellbook_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newBlueMagesSpellbook(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5f705a3c
		assertNotNull(result);
	}

	/**
	 * Run the Item newBow(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewBow_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newBow(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newBread(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewBread_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newBread(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newDagger(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewDagger_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newDagger(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newEdibleWeapon(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewEdibleWeapon_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newEdibleWeapon(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newFruit(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewFruit_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newFruit(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature newFungus(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewFungus_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Creature result = fixture.newFungus(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature newGoblin(int,Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewGoblin_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;
		Creature player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		Creature result = fixture.newGoblin(depth, player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newHeavyArmor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewHeavyArmor_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newHeavyArmor(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@729dc231
		assertNotNull(result);
	}

	/**
	 * Run the Item newLightArmor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewLightArmor_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newLightArmor(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newMediumArmor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewMediumArmor_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newMediumArmor(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6bd6b36c
		assertNotNull(result);
	}

	/**
	 * Run the Creature newPlayer(List<String>,FieldOfView) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewPlayer_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		List<String> messages = new LinkedList();
		FieldOfView fov = new FieldOfView(new World(new Tile[][][] {}));

		Creature result = fixture.newPlayer(messages, fov);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newPotionOfArcher(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewPotionOfArcher_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newPotionOfArcher(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@61e02f9c
		assertNotNull(result);
	}

	/**
	 * Run the Item newPotionOfExperience(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewPotionOfExperience_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newPotionOfExperience(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6667cabb
		assertNotNull(result);
	}

	/**
	 * Run the Item newPotionOfHealth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewPotionOfHealth_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newPotionOfHealth(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@408d22d0
		assertNotNull(result);
	}

	/**
	 * Run the Item newPotionOfMana(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewPotionOfMana_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newPotionOfMana(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4a22f4f5
		assertNotNull(result);
	}

	/**
	 * Run the Item newPotionOfPoison(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewPotionOfPoison_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newPotionOfPoison(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2bcfb5f4
		assertNotNull(result);
	}

	/**
	 * Run the Item newPotionOfSlowHealth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewPotionOfSlowHealth_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newPotionOfSlowHealth(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@61cbd686
		assertNotNull(result);
	}

	/**
	 * Run the Item newPotionOfWarrior(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewPotionOfWarrior_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newPotionOfWarrior(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4c737f83
		assertNotNull(result);
	}

	/**
	 * Run the Item newRock(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewRock_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newRock(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newStaff(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewStaff_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newStaff(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newSword(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewSword_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newSword(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newVictoryItem(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewVictoryItem_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newVictoryItem(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item newWhiteMagesSpellbook(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewWhiteMagesSpellbook_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.newWhiteMagesSpellbook(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@631629dd
		assertNotNull(result);
	}

	/**
	 * Run the Creature newZombie(int,Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testNewZombie_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;
		Creature player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		Creature result = fixture.newZombie(depth, player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item randomArmor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testRandomArmor_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomArmor(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3d5703df
		assertNotNull(result);
	}

	/**
	 * Run the Item randomArmor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testRandomArmor_2()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomArmor(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@698fe2a6
		assertNotNull(result);
	}

	/**
	 * Run the Item randomArmor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testRandomArmor_3()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomArmor(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@70556cdd
		assertNotNull(result);
	}

	/**
	 * Run the Item randomPotion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testRandomPotion_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomPotion(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@55b18e2f
		assertNotNull(result);
	}

	/**
	 * Run the Item randomPotion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testRandomPotion_2()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomPotion(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@29a45dc9
		assertNotNull(result);
	}

	/**
	 * Run the Item randomPotion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testRandomPotion_3()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomPotion(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@515f71c9
		assertNotNull(result);
	}

	/**
	 * Run the Item randomPotion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testRandomPotion_4()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomPotion(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6d8d8e69
		assertNotNull(result);
	}

	/**
	 * Run the Item randomPotion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testRandomPotion_5()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomPotion(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4be528c0
		assertNotNull(result);
	}

	/**
	 * Run the Item randomPotion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testRandomPotion_6()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomPotion(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@a50ce1b
		assertNotNull(result);
	}

	/**
	 * Run the Item randomPotion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testRandomPotion_7()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomPotion(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@255614da
		assertNotNull(result);
	}

	/**
	 * Run the Item randomPotion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testRandomPotion_8()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomPotion(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6c92bb83
		assertNotNull(result);
	}

	/**
	 * Run the Item randomPotion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testRandomPotion_9()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomPotion(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3fc42f0b
		assertNotNull(result);
	}

	/**
	 * Run the Item randomSpellBook(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testRandomSpellBook_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomSpellBook(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3365e5de
		assertNotNull(result);
	}

	/**
	 * Run the Item randomSpellBook(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testRandomSpellBook_2()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomSpellBook(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1c88a2f1
		assertNotNull(result);
	}

	/**
	 * Run the Item randomWeapon(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testRandomWeapon_1()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomWeapon(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1a28f343
		assertNotNull(result);
	}

	/**
	 * Run the Item randomWeapon(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testRandomWeapon_2()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomWeapon(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1e7ef107
		assertNotNull(result);
	}

	/**
	 * Run the Item randomWeapon(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testRandomWeapon_3()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomWeapon(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@17e7b31f
		assertNotNull(result);
	}

	/**
	 * Run the Item randomWeapon(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Test
	public void testRandomWeapon_4()
		throws Exception {
		StuffFactory fixture = new StuffFactory(new World(new Tile[][][] {}));
		int depth = 1;

		Item result = fixture.randomWeapon(depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7f40462a
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/17/18 9:43 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(StuffFactoryTest.class);
	}
}