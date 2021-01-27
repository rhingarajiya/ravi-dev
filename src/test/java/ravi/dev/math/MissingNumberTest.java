package ravi.dev.math;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MissingNumberTest {

  @Test
  public void testMissingNumber() {
    MissingNumber missingNumber = new MissingNumber();
    assertEquals(2, missingNumber.missingNumber(new int[]{0, 1}));
    assertEquals(8, missingNumber.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    assertEquals(1, missingNumber.missingNumber(new int[]{0}));
  }

  @Test
  public void testMissingNumberUsingXOR() {
    ravi.dev.bit.MissingNumber missingNumber = new ravi.dev.bit.MissingNumber();
    assertEquals(2, missingNumber.missingNumber(new int[]{0, 1}));
    assertEquals(8, missingNumber.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    assertEquals(1, missingNumber.missingNumber(new int[]{0}));
  }

}