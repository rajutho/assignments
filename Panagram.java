package Assignments;

public class Panagram {
    public static boolean isPanagram(String str){
        if(str.length()<26){
            return false;
        }
        for(char ch='a';ch<='z';ch++){
            if(str.indexOf(ch)<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str="abcdefghijklmnopqrstuvWxyz";
        
        System.err.println(isPanagram(str));
    }
    
}
