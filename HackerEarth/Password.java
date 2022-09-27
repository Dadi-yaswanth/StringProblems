// https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/password-1/
import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String[size];
        for(int i = 0; i < arr.length;i++){
            arr[i] = sc.next();
        }
        for (String s : arr) {
            boolean flag = false;
            for (int i = 1; i < arr.length; i++) {
                flag = check(s, arr[i]);
                if (flag) {
                    // int middle = arr[i].length()/2;
                    System.out.println(arr[i].length() + " " + arr[i].charAt((arr[i].length() / 2)));
                    break;
                }
            }
            if (flag) {
                return;
            }
        }

    }

    static boolean check(String str1, String str2){
        if(str1.length()!=str2.length()) return false;
        return help(str1,str2,0,str2.length()-1);

    }
    static boolean help(String str1, String str2, int f, int l){
        if(f>=l){
            return true;
        }
        if(str1.charAt(f)!=str2.charAt(l)) return false;
        return help(str1, str2, f+1,l-1);

    }
}
