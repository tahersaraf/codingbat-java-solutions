package warmup2;

public class StringX {

    public String stringX(String str) {
        String removedX = "";
        if(str.length() > 1){
            for(int i=1;i<=str.length()-2;i++){
                if(str.charAt(i)!='x'){
                    removedX += str.charAt(i);
                }
            }
            return str.charAt(0) + removedX + str.charAt(str.length()-1);
        }

        return str;
    }
}
