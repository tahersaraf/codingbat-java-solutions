package array1;

public class Reverse3 {
    public int[] reverse3(int[] nums) {
        int[] revnum = new int[nums.length];
        for(int i=0; i<=nums.length-1 ; i++) {
            revnum[i]=nums[(nums.length-1)-i];
        }

        return revnum;
    }
}
