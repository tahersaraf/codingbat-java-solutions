package warmup1;

public class StringE {
    public boolean stringE(String str) {
        String[] arrayE = str.split("");
        int countE=0;
        for(String s1 : arrayE) {
            if(s1.contains("e")) {
                countE++;
            }
        }
        return countE>=1&&countE<=3;
    }
}
