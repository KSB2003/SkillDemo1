import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Assert.*;


public class SkillDemoTest {
    @Test
    public void MultiplyTest(){
        assertEquals(1, SkillDemo.multiply(1, 1)); //a test that passes
    }
}
