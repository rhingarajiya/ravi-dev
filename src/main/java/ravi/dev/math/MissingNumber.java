package ravi.dev.math;

public class MissingNumber {

  /**
   * It is solved using math formula n*(n+1)/2
   */
  public int missingNumber(int[] nums) {
    int length = nums.length;
    int total = (length * (length + 1))/2;
    for (int number : nums) {
      total = total - number;
    }
    return total;
  }

}
