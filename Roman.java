package Assignments;

import java.util.HashMap;
import java.util.Map;

public class Roman {
    public static int roman(String str){
        Map<Character,Integer> m=new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        int result=m.get(str.charAt(str.length()-1));
        for(int i=str.length()-2;i>=0;i--){
            if(m.get(str.charAt(i))<m.get(str.charAt(i+1))){
                result-=m.get(str.charAt(i));
            }else{
                result+=m.get(str.charAt(i));
            }
        }
        return result;
    }
    public static void main(String agrs[]){
        String str="IX";
        System.out.println(roman(str));
    }
    
}
