/*
*
*
* Use this file to test all the solutions
*
*
* */

package runnable;
import array1.*;
import warmup1.*;
import string1.*;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Reverse3 reverse3 = new Reverse3();
        int[] nums = new int[] {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(reverse3.reverse3(nums)));
    }
}
