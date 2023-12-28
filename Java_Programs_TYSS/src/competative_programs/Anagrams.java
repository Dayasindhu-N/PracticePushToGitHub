package competative_programs;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        String A = a.toLowerCase();
        String B = b.toLowerCase();
        boolean isSame = false;
        if (A.length()!=B.length()) {
            return isSame=false;
        } else {
            char[] s1=A.toCharArray();
            char[] s2=B.toCharArray();
            for(int i=0;i<s1.length;i++){
                for(int j=i+1;j<s1.length;j++){
                    if(s1[i]>s1[j]){
                        char temp=s1[i];
                        s1[i]=s1[j];
                        s1[j]=temp;
                    }
                }
            }
            for(int i=0;i<s2.length;i++){
                for(int j=i+1;j<s2.length;j++){
                    if(s2[i]>s2[j]){
                        char temp=s2[i];
                        s2[i]=s2[j];
                        s2[j]=temp;
                    }
                }
            }
            for(int k=0;k<s1.length;k++){
                if(s1[k]==s2[k]){
                    isSame=true;
                }else{
                    isSame=false;
                    break;
                }
            }
            return isSame;
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}