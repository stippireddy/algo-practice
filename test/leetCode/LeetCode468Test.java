package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode468Test {

  @Test
  public void validIPAddress() {
    LeetCode468 l = new LeetCode468();
    assertEquals(l.validIPAddress("0.0.0.0256"), "Neither");
    assertEquals(l.validIPAddress("0.0.0.0"), "IPv4");
    assertEquals(l.validIPAddress("0.0.0.256"), "Neither");
    assertEquals(l.validIPAddress("0.0.00.256"), "Neither");
    assertEquals(l.validIPAddress("0.0..256"), "Neither");
    assertEquals(l.validIPAddress("1e1.4.5.6"), "Neither");
    assertEquals(l.validIPAddress("12.12.12.12.12"), "Neither");
    assertEquals(l.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"), "Neither");
    assertEquals(l.validIPAddress("2001:0db8:85a3:0:0:8A2E:00370:7334"), "Neither");
    assertEquals(l.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"), "IPv6");
    assertEquals(l.validIPAddress("2001:0db8:85a3:00:000:8A2E:0000:7334"), "IPv6");
  }
}
