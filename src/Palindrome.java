import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        // for palindrome
        // abbcbba
        boolean flag=true;
        for(int i=0, j=str.length()-1;i<j;i++,j--) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
        }
        if(flag)System.out.println("The given string is palindrome");
        else System.out.println("The given string is not palindrome");
    }
}
