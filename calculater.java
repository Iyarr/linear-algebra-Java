
import java.util.*;

// 項の中身の整理
class Contents {
    int number;
    Map<Character,Integer> compose = new HashMap<>();

    public Contents (){
        this.number = 0;
        for (char c = 'a'; c <= 'z'; c++) compose.put(c, 0);
    }

    public void Create (String str){
        if( str.substring(0,1) == "-") {
            this.number = -1;
            str = str.substring(1);
        }
        else{
            this.number = 1;
        }
        int isdigit = 0;
        String num = "";
        for( char c : str.toCharArray() ){
            if( Character.isDigit(c) ){
                if( isdigit == 0 ){
                    isdigit = 1;
                    num = "";
                }
            } else {
                if( isdigit == 1 ){
                    this.number *= Integer.valueOf(num);
                }
                isdigit = 0;
            }

            if( isdigit == 1 ){
                num += c;
            } else {
                for (char a = 'a'; a <= 'z'; a++){
                    if ( c == a ){
                        this.compose.replace(a, this.compose.get(a) + 1 );
                        break;
                    }
                }
            }
        }
        if( isdigit == 1 )this.number *= Integer.valueOf(num);
        
    }
}

public class calculater {
    
}
