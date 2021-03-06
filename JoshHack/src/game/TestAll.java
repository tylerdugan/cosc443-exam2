package game;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 5/17/18 9:44 AM
 * @author tyler
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	WorldTest.class,
	EatScreenTest.class,
	PointTest.class,
	PlayerAiTest.class,
	WorldBuilderTest.class,
	EffectTest.class,
	ZombieAiTest.class,
	CreatureAiTest.class,
	FungusAiTest.class,
	TileTest.class,
	BatAiTest.class,
	FieldOfViewTest.class,
	CreatureTest.class,
	SpellTest.class,
	StuffFactoryTest.class,
	GoblinAiTest.class,
	ItemTest.class,
	InventoryTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/17/18 9:44 AM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
