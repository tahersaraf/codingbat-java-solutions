package warmup2;

public class StringSplosion {
    public String stringSplosion(String str) {
        String result = "";
        for(int i = str.length() - 1; i>0; i--){
            result = result + str.substring(0,str.length()-i);
        }
        return result + str;
    }

}
