package game;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InventoryTest</code> contains tests for the class <code>{@link Inventory}</code>.
 *
 * @generatedBy CodePro at 5/17/18 9:42 AM
 * @author tyler
 * @version $Revision: 1.0 $
 */
public class InventoryTest {
	/**
	 * Run the Inventory(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testInventory_1()
		throws Exception {
		int max = 1;

		Inventory result = new Inventory(max);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isFull());
	}

	/**
	 * Run the void add(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");

		fixture.add(item);

		// add additional test code here
	}

	/**
	 * Run the void add(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testAdd_2()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");

		fixture.add(item);

		// add additional test code here
	}

	/**
	 * Run the void add(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testAdd_3()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");

		fixture.add(item);

		// add additional test code here
	}

	/**
	 * Run the boolean contains(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testContains_1()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");

		boolean result = fixture.contains(item);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean contains(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testContains_2()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");

		boolean result = fixture.contains(item);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean contains(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testContains_3()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");

		boolean result = fixture.contains(item);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Item get(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testGet_1()
		throws Exception {
		Inventory fixture = new Inventory(1);
		int i = 1;

		Item result = fixture.get(i);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at game.Inventory.get(Inventory.java:7)
		assertNotNull(result);
	}

	/**
	 * Run the Item[] getItems() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testGetItems_1()
		throws Exception {
		Inventory fixture = new Inventory(1);

		Item[] result = fixture.getItems();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals(null, result[0]);
	}

	/**
	 * Run the boolean isFull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testIsFull_1()
		throws Exception {
		Inventory fixture = new Inventory(1);

		boolean result = fixture.isFull();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isFull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testIsFull_2()
		throws Exception {
		Inventory fixture = new Inventory(1);

		boolean result = fixture.isFull();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isFull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testIsFull_3()
		throws Exception {
		Inventory fixture = new Inventory(1);

		boolean result = fixture.isFull();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testRemove_3()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(InventoryTest.class);
	}
}