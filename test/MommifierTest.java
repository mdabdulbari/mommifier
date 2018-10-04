import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MommifierTest {
    @Test
    public void shouldReturnEmptyString() {
        Mommifier mommifier = new Mommifier();
        String output = mommifier.mommify("");

        assertEquals("", output);
    }

    @Test
    public void shouldReturnConsonantGiven() {
        Mommifier mommifier = new Mommifier();
        String output = mommifier.mommify("b");

        assertEquals("b", output);
    }

    @Test
    public void shouldReturnMommyWhen_a_IsGiven() {
        Mommifier mommifier = new Mommifier();
        String output = mommifier.mommify("a");

        assertEquals("mommy", output);
    }

    @Test
    public void shouldReturnMommyWhen_his_IsGiven() {
        Mommifier mommifier = new Mommifier();
        String output = mommifier.mommify("his");

        assertEquals("hmommys", output);
    }
}
