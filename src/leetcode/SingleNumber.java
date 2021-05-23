package leetcode;

class SingleNumber{
  public int singleNumber(int[] nums) {
        int i=0;
        for(int a: nums){
            i^=a;
        }
        return i;
  }
}
