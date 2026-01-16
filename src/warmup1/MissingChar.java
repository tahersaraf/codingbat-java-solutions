package warmup1;

public class MissingChar {
    public String missingChar(String str, int n) {
        if (str == null || str.isEmpty() || n < 0){
            return str;
        }

        return str.substring(0,n) + str.substring(n+1);
    }
}