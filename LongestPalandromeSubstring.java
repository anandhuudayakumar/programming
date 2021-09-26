import java.util.HashSet;

public class LongestPalandromeSubstring {

    public String LPS(String str){
        if(str.length()==1)return str;
        HashSet<Character> stringCharacters = new HashSet<>();
        for(int i = 0; i<str.length(); i++){
            if(stringCharacters.contains( str.charAt(i) ) ){
                String palandromSubString = str.substring(0, i);
                String reverserPalandromeString = new StringBuilder(palandromSubString).toString();
                if (palandromSubString == reverserPalandromeString) return palandromSubString;
            }
        }
        return Character.toString(str.charAt(0));

    }
    
}
