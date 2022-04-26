import static org.junit.Assert.*;
import org.junit.*;


public class SkillTest {
    @Test
    public void minusTest() {
	    assertEquals(2, Skill.minus(4, 2)); // the test passes
    }
}
