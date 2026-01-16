package warmup1;

public class Max1020 {
    public int max1020(int a, int b) {
        boolean isAInRange = (a >= 10 && a <= 20);
        boolean isBInRange = (b >= 10 && b <= 20);

        if(isAInRange && isBInRange) {
            if(a > b) {
                return a;
            }
            else return b;
        }
        else if(isAInRange && !isBInRange) {
            return a;
        }

        else if(!isAInRange && isBInRange) {
            return b;
        }
        else
            return 0;
    }
}
