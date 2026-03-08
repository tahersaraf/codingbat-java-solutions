package warmup2;

public class Has271 {
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int a = nums[i];
            int b = nums[i+1];
            int c = nums[i+2];

            if (b == a + 5) {
                if (Math.abs(c - (a - 1)) <= 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
