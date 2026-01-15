package runnable;

import warmup1.SleepIn;

public class Test {
    public static void main(String[] args) {
        System.out.println(SleepIn.sleepIn(false, true)); // true
        System.out.println(SleepIn.sleepIn(true, false)); // false
    }
}
