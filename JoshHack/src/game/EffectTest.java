package game;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EffectTest</code> contains tests for the class <code>{@link Effect}</code>.
 *
 * @generatedBy CodePro at 5/17/18 9:42 AM
 * @author tyler
 * @version $Revision: 1.0 $
 */
public class EffectTest {
	/**
	 * Run the Effect(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testEffect_1()
		throws Exception {
		int duration = 1;

		Effect result = new Effect(duration);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isDone());
	}

	/**
	 * Run the Effect(Effect) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testEffect_2()
		throws Exception {
		Effect other = new Effect(1);

		Effect result = new Effect(other);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isDone());
	}

	/**
	 * Run the void end(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testEnd_1()
		throws Exception {
		Effect fixture = new Effect(1);
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.end(creature);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the boolean isDone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testIsDone_1()
		throws Exception {
		Effect fixture = new Effect(0);

		boolean result = fixture.isDone();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testIsDone_2()
		throws Exception {
		Effect fixture = new Effect(1);

		boolean result = fixture.isDone();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void start(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testStart_1()
		throws Exception {
		Effect fixture = new Effect(1);
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.start(creature);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void update(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 9:42 AM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		Effect fixture = new Effect(1);
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.update(creature);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
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
		new org.junit.runner.JUnitCore().run(EffectTest.class);
	}
}