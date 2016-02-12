import org.junit.*;
import static org.junit.Assert.*;

public class UnitTest {

  @Test
  public void vowelReplacer_aEqualsDash_a() {
    App testApp = new App();
    assertEquals("-", testApp.vowelReplacer("a"));
  }



}
