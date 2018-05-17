package game;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CreatureAiTest</code> contains tests for the class <code>{@link CreatureAi}</code>.
 *
 * @generatedBy CodePro at 5/17/18 9:42 AM
 * @author tyler
 * @version $Revision: 1.0 $
 */
public class CreatureAiTest {
	/**
	 * Run the CreatureAi(Creature) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCreatureAi_1()
		throws Exception {
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		CreatureAi result = new CreatureAi(creature);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean canPickup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanPickup_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canPickup();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1eab5eec
		assertTrue(result);
	}

	/**
	 * Run the boolean canPickup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanPickup_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canPickup();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4541c449
		assertTrue(result);
	}

	/**
	 * Run the boolean canPickup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanPickup_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canPickup();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@324d53a9
		assertTrue(result);
	}

	/**
	 * Run the boolean canRangedWeaponAttack(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanRangedWeaponAttack_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		other.z = 1;
		other.y = 1;
		other.x = 1;

		boolean result = fixture.canRangedWeaponAttack(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6d366f3c
		assertTrue(result);
	}

	/**
	 * Run the boolean canRangedWeaponAttack(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanRangedWeaponAttack_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		boolean result = fixture.canRangedWeaponAttack(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@357e4151
		assertTrue(result);
	}

	/**
	 * Run the boolean canRangedWeaponAttack(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanRangedWeaponAttack_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		boolean result = fixture.canRangedWeaponAttack(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4a5c9a01
		assertTrue(result);
	}

	/**
	 * Run the boolean canRangedWeaponAttack(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanRangedWeaponAttack_4()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		other.z = 1;
		other.y = 1;
		other.x = 1;

		boolean result = fixture.canRangedWeaponAttack(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3d0a0c44
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanSee_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanSee_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanSee_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanSee_4()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanSee_5()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanSee_6()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanSee_7()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean canThrowAt(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanThrowAt_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		other.z = 1;
		other.y = 1;
		other.x = 1;

		boolean result = fixture.canThrowAt(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@132a7824
		assertTrue(result);
	}

	/**
	 * Run the boolean canThrowAt(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanThrowAt_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		other.z = 1;
		other.y = 1;
		other.x = 1;

		boolean result = fixture.canThrowAt(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1faf6499
		assertTrue(result);
	}

	/**
	 * Run the boolean canThrowAt(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanThrowAt_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		other.z = 1;
		other.y = 1;
		other.x = 1;

		boolean result = fixture.canThrowAt(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@699bc8ef
		assertTrue(result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanUseBetterEquipment_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@258f6719
		assertTrue(result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanUseBetterEquipment_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4a64ebd6
		assertTrue(result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanUseBetterEquipment_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@9ea5543
		assertTrue(result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanUseBetterEquipment_4()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@19fda1a0
		assertTrue(result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanUseBetterEquipment_5()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@44d595d9
		assertTrue(result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testCanUseBetterEquipment_6()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3e3bd977
		assertTrue(result);
	}

	/**
	 * Run the String getName(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");

		String result = fixture.getName(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String getName(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testGetName_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");

		String result = fixture.getName(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testGetWeaponToThrow_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@15dbf784
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testGetWeaponToThrow_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@42a49c6
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testGetWeaponToThrow_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3cb166ef
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testGetWeaponToThrow_4()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4e067b76
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testGetWeaponToThrow_5()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@673724e2
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testGetWeaponToThrow_6()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@d6555ad
		assertNotNull(result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testGetWeaponToThrow_7()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@53152d34
		assertNotNull(result);
	}

	/**
	 * Run the void hunt(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testHunt_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Creature target = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		target.y = 1;
		target.x = 1;

		fixture.hunt(target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6bc01420
	}

	/**
	 * Run the void onEnter(int,int,int,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testOnEnter_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;
		Tile tile = Tile.BOUNDS;

		fixture.onEnter(x, y, z, tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void onEnter(int,int,int,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testOnEnter_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int x = 1;
		int y = 1;
		int z = 1;
		Tile tile = Tile.BOUNDS;

		fixture.onEnter(x, y, z, tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void onGainLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testOnGainLevel_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.onGainLevel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6c4b5604
	}

	/**
	 * Run the void onNotify(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testOnNotify_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		String message = "";

		fixture.onNotify(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testOnUpdate_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the Tile rememberedTile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testRememberedTile_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Tile result = fixture.rememberedTile(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@75eb5252
		assertNotNull(result);
	}

	/**
	 * Run the void setName(Item,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		Item item = new Item('', new Color(1), "", "");
		String name = "";

		fixture.setName(item, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testUseBetterEquipment_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@108d8122
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testUseBetterEquipment_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@57beb387
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testUseBetterEquipment_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4bb20eb3
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testUseBetterEquipment_4()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4f4dbbff
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testUseBetterEquipment_5()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@414b238f
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testUseBetterEquipment_6()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2bcc4df0
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testUseBetterEquipment_7()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@787e06e6
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testUseBetterEquipment_8()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3e4ab1d6
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testUseBetterEquipment_9()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1887fa3c
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testUseBetterEquipment_10()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1578e1f8
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testUseBetterEquipment_11()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2bf3c2b2
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testUseBetterEquipment_12()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2f9d7995
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testUseBetterEquipment_13()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@21405c5d
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testUseBetterEquipment_14()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@11a9e61e
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testUseBetterEquipment_15()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@13559689
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testUseBetterEquipment_16()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.useBetterEquipment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3afc7277
	}

	/**
	 * Run the void wander() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testWander_1()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.wander();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void wander() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testWander_2()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.wander();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5e509d97
	}

	/**
	 * Run the void wander() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testWander_3()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.wander();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2c386565
	}

	/**
	 * Run the void wander() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testWander_4()
		throws Exception {
		CreatureAi fixture = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.wander();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@55dc2e15
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
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
	 * @generatedBy CodePro at 5/17/18 9:42 AM
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
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CreatureAiTest.class);
	}
}