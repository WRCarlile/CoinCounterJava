import org.junit.*;
import static org.junit.Assert.*;

public class CoinCounterTest {

  @Test
  public void coinCombo_countquarters_1() {
    CoinCounter coinCounterTest = new CoinCounter();
    Integer[] expected = {1,0,0,0};
    assertEquals(expected, coinCounterTest.coinCombo(25));
  }

  @Test
  public void coinCombo_countquarters_2() {
   CoinCounter coinCounterTest = new CoinCounter();
   Integer[] expected = {2,0,0,0};
   assertEquals(expected, coinCounterTest.coinCombo(50));
  }

  @Test
  public void coinCombo_countquartersanddime_21() {
    CoinCounter coinCounterTest = new CoinCounter();
    Integer[] expected = {2,1,0,0};
    assertEquals(expected, coinCounterTest.coinCombo(60));
  }

  @Test
  public void coinCombo_countquartersdimeandnickel_211() {
    CoinCounter coinCounterTest = new CoinCounter();
    Integer[] expected = {2,1,1,0};
    assertEquals(expected, coinCounterTest.coinCombo(65));
  }

  @Test
  public void coinCombo_countquartersdimesnickelsandpennies_2111() {
    CoinCounter coinCounterTest = new CoinCounter();
    Integer[] expected = {2,1,1,1};
    assertEquals(expected, coinCounterTest.coinCombo(66));
  }

}
