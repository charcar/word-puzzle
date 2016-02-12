import org.junit.*;
import static org.junit.Assert.*;

public class UnitTest {

  @Test
  public void vowelReplacer_aEqualsDash_a() {
    App testApp = new App();
    assertEquals("-", testApp.vowelReplacer("a"));
  }

  @Test
  public void vowelReplacer_bEqualsb_b() {
    App testApp = new App();
    assertEquals("b", testApp.vowelReplacer("b"));
  }

  @Test
  public void vowelReplacer_stringHasVowelsReplacedByDash_interesting() {
    App testApp = new App();
    assertEquals("-nt-r-st-ng", testApp.vowelReplacer("interesting"));
  }



}
