package hackerrank.strings;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class RichieRichTest {

  @Test
  public void richieRich() {
    assertEquals(RichieRich.richieRich("9343", 4, 2), "9449");
    assertEquals(RichieRich.richieRich("3943", 4, 1), "3993");
    assertEquals(RichieRich.richieRich("9443", 4, 1), "9449");
    assertEquals(RichieRich.richieRich("3943", 4, 1), "3993");
    assertEquals(RichieRich.richieRich("3943", 4, 3), "9999");
    assertEquals(RichieRich.richieRich("3943", 4, 3), "9999");
    assertEquals(RichieRich.richieRich("092282", 6, 3), "992299");
    assertEquals(RichieRich.richieRich("0011", 4, 1), "-1");
    assertEquals(RichieRich.richieRich("33434", 5, 2), "93439");
    assertEquals(RichieRich.richieRich("33433", 5, 1), "33933");
    assertEquals(RichieRich.richieRich("33432", 5, 1), "33433");
    assertEquals(RichieRich.richieRich("33432", 5, 2), "93439");
  }
}
