// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/anti-plaindrome-2-72ff6f62/

import java.util.Arrays;
import java.util.Scanner;

public class AntiPalindromeString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String[size];
        for(int i = 0; i < arr.length;i++){
            arr[i] = sc.next();
        }
        for(String str: arr){
            if(checkPalindrome(str)){
                System.out.println(-1);
            }else {
                char[] charArr =str.toCharArray();
                Arrays.sort(charArr);
                String check = String.copyValueOf(charArr);
                if(checkPalindrome(check)){
                    System.out.println(-1);
                }else {
                    System.out.println(check);
                }
            }
        }

    }
    static boolean checkPalindrome(String str){
    return palindromeHelper(0,str.length()-1,str);
    }

    static boolean palindromeHelper(int f, int l, String str){
        if(f>=l) return true;
        if(str.charAt(f)!=str.charAt(l)) return false;
        return palindromeHelper(f+1,l-1,str);
    }
}
