package ravi.dev.java.bit;

public class MissingNumber {

  //It is solved using XOR
  public int missingNumber(int[] nums) {
    int result = nums.length;
    for (int i=0; i<nums.length; i++) {
      result ^= i ^ nums[i];
    }
    return result;
  }

}