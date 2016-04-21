import org.junit.*;
import static org.junit.Assert.*;

public class ChangeMakerTest {

  @Test
  public void TotalChange_GiveInputReceiveOutput_AnyOutput() {
    ChangeMaker newChangeMaker = new ChangeMaker();
    assertEquals("1 quarter(s)", newChangeMaker.makeChange(25));
  }

  @Test
  public void TotalChange_CorrectQuarterChange_Calculated() {
    ChangeMaker newChangeMaker = new ChangeMaker();
    assertEquals("1 quarter(s) 3 dime(s) 4 nickel(s)", newChangeMaker.makeChange(75));
  }

  @Test
  public void TotalChange_CorrectDimeChange_Calculated() {
    ChangeMaker newChangeMaker = new ChangeMaker();
    assertEquals("1 quarter(s) 3 dime(s) 4 nickel(s) 20 pennie(s)", newChangeMaker.makeChange(95));
  }

  @Test
  public void TotalChange_CorrectNickelChange_Calculated() {
    ChangeMaker newChangeMaker = new ChangeMaker();
    assertEquals("1 quarter(s) 1 dime(s) 1 nickel(s)", newChangeMaker.makeChange(40));
  }

  @Test
  public void TotalChange_CorrectPenniesChange_Calculated() {
    ChangeMaker newChangeMaker = new ChangeMaker();
    assertEquals("1 quarter(s) 1 dime(s) 1 nickel(s) 4 pennie(s)", newChangeMaker.makeChange(44));
  }

  @Test
  public void TotalChange_MAXCASH_Calculated() {
    ChangeMaker newChangeMaker = new ChangeMaker();
    assertEquals("1 quarter(s) 3 dime(s) 4 nickel(s) 234082355 pennie(s)", newChangeMaker.makeChange(234082430));
  }
}
