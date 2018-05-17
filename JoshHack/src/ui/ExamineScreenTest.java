package ui;

import java.awt.Color;
import game.Tile;
import game.Creature;
import game.Item;
import game.World;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ExamineScreenTest</code> contains tests for the class <code>{@link ExamineScreen}</code>.
 *
 * @generatedBy CodePro at 5/17/18 9:40 AM
 * @author tyler
 * @version $Revision: 1.0 $
 */
public class ExamineScreenTest {
	/**
	 * Run the ExamineScreen(Creature) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:40 AM
	 */
	@Test
	public void testExamineScreen_1()
		throws Exception {
		Creature player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		ExamineScreen result = new ExamineScreen(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String getVerb() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:40 AM
	 */
	@Test
	public void testGetVerb_1()
		throws Exception {
		ExamineScreen fixture = new ExamineScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		fixture.player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		String result = fixture.getVerb();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean isAcceptable(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:40 AM
	 */
	@Test
	public void testIsAcceptable_1()
		throws Exception {
		ExamineScreen fixture = new ExamineScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		fixture.player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		Item item = new Item('', new Color(1), "", "");

		boolean result = fixture.isAcceptable(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the Screen use(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:40 AM
	 */
	@Test
	public void testUse_1()
		throws Exception {
		ExamineScreen fixture = new ExamineScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		fixture.player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		Item item = new Item('', new Color(1), "", "");

		Screen result = fixture.use(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Screen use(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:40 AM
	 */
	@Test
	public void testUse_2()
		throws Exception {
		ExamineScreen fixture = new ExamineScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));
		fixture.player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		Item item = new Item('', new Color(1), "", "");

		Screen result = fixture.use(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/18 9:40 AM
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
	 * @generatedBy CodePro at 5/17/18 9:40 AM
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
	 * @generatedBy CodePro at 5/17/18 9:40 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ExamineScreenTest.class);
	}
}