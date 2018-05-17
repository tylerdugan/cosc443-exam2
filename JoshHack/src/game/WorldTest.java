package game;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>WorldTest</code> contains tests for the class <code>{@link World}</code>.
 *
 * @generatedBy CodePro at 5/17/18 9:44 AM
 * @author tyler
 * @version $Revision: 1.0 $
 */
public class WorldTest {
	/**
	 * Run the World(Tile[][][]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testWorld_1()
		throws Exception {
		Tile[][][] tiles = new Tile[][][] {};

		World result = new World(tiles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the void add(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Creature pet = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.add(pet);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@28fa2915
	}

	/**
	 * Run the void addAtEmptyLocation(Creature,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testAddAtEmptyLocation_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.z = 1;
		creature.x = 1;
		creature.y = 1;
		int z = 1;

		fixture.addAtEmptyLocation(creature, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@762bab45
	}

	/**
	 * Run the void addAtEmptyLocation(Creature,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testAddAtEmptyLocation_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.z = 1;
		creature.x = 1;
		creature.y = 1;
		int z = 1;

		fixture.addAtEmptyLocation(creature, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@94a1d86
	}

	/**
	 * Run the void addAtEmptyLocation(Creature,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testAddAtEmptyLocation_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.z = 1;
		creature.x = 1;
		creature.y = 1;
		int z = 1;

		fixture.addAtEmptyLocation(creature, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@268a332
	}

	/**
	 * Run the void addAtEmptyLocation(Item,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testAddAtEmptyLocation_4()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");
		int depth = 1;

		fixture.addAtEmptyLocation(item, depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@13cd72f4
	}

	/**
	 * Run the void addAtEmptyLocation(Item,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testAddAtEmptyLocation_5()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");
		int depth = 1;

		fixture.addAtEmptyLocation(item, depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@42b9beaf
	}

	/**
	 * Run the void addAtEmptyLocation(Item,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testAddAtEmptyLocation_6()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");
		int depth = 1;

		fixture.addAtEmptyLocation(item, depth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2784f794
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testAddAtEmptySpace_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = null;
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@12d79ca4
		assertTrue(result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testAddAtEmptySpace_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@54be0458
		assertTrue(result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testAddAtEmptySpace_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@338285ed
		assertTrue(result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testAddAtEmptySpace_4()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5b663769
		assertTrue(result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testAddAtEmptySpace_5()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1ee17903
		assertTrue(result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testAddAtEmptySpace_6()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4e1cd4b8
		assertTrue(result);
	}

	/**
	 * Run the Color color(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testColor_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Color result = fixture.color(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4ef5c989
		assertNotNull(result);
	}

	/**
	 * Run the Color color(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testColor_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Color result = fixture.color(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@72fbcc96
		assertNotNull(result);
	}

	/**
	 * Run the Color color(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testColor_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Color result = fixture.color(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4c960b44
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testCreature_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testCreature_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testCreature_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testCreature_4()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testCreature_5()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the int depth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testDepth_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);

		int result = fixture.depth();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the void dig(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testDig_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		fixture.dig(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4a3720b8
	}

	/**
	 * Run the void dig(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testDig_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		fixture.dig(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@38cb4b9f
	}

	/**
	 * Run the char glyph(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testGlyph_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		char result = fixture.glyph(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@48bc43c3
		assertEquals(' ', result);
	}

	/**
	 * Run the char glyph(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testGlyph_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		char result = fixture.glyph(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@15708fed
		assertEquals(' ', result);
	}

	/**
	 * Run the char glyph(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testGlyph_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		char result = fixture.glyph(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4e568694
		assertEquals(' ', result);
	}

	/**
	 * Run the int height() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testHeight_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);

		int result = fixture.height();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the Item item(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testItem_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Item result = fixture.item(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@333c3038
		assertNotNull(result);
	}

	/**
	 * Run the void remove(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.remove(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7a56d62d
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@25dc9e8d
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testRemove_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4b658225
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testRemove_4()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6a0add6
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testRemove_5()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@179fa236
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testRemove_6()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@29cf26df
	}

	/**
	 * Run the void remove(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testRemove_7()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		fixture.remove(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@62fa7871
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testTile_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = -1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testTile_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testTile_3()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = -1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testTile_4()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testTile_5()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = -1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testTile_6()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testTile_7()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@25df8d22
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testUpdate_2()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@71b18fbd
	}

	/**
	 * Run the int width() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	@Test
	public void testWidth_1()
		throws Exception {
		World fixture = new World(new Tile[][][] {});
		fixture.addAtEmptyLocation(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1);

		int result = fixture.width();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
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
	 * @generatedBy CodePro at 5/17/18 9:44 AM
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
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WorldTest.class);
	}
}