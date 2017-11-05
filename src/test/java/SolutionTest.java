import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals(ReverseWords.reverseWords("I like eating"), "eating like I");
        assertEquals(ReverseWords.reverseWords("I like flying"), "flying like I");
        assertEquals(ReverseWords.reverseWords("The world is nice"), "nice is world The");
    }
}