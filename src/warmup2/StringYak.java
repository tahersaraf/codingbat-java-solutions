package warmup2;

public class StringYak {

    public String stringYak(String str) {
        int len = str.length();
        String result = "";
        for(int i=0;i<len;i++){
            if(len > i+2 && str.charAt(i)=='y' && str.charAt(i+2)=='k'){
                i+=2;
            }else{
                result += str.charAt(i);
            }
        }
        return result;
    }

}
