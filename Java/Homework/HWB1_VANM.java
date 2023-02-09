/*
 * Isaac Van Meter
 * 1/26/23
 * Homework B-1
 * This is my own original work.
 */
import java.util.HashMap;
import java.util.Scanner;

public class HWB1_VANM {

    public static String getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("String: ");
        String x = sc.next();
        return x;
    }

    public static String caesar(String x, Integer y){
        String z = getLowerCase();
        HashMap<Integer, Character> alpha1 = new HashMap<Integer, Character>();
        HashMap<Character, Integer> alpha2 = new HashMap<Character, Integer>();
        char[] arr1 = z.toCharArray();
        for (int i = 0; i<arr1.length; i++){
            alpha1.put(i,arr1[i]);
            alpha2.put(arr1[i],i);
        }
        String ans = "";
        int index;
        char[] arr2 = x.toCharArray();
        for (int j = 0; j<arr2.length; j++){
            index = alpha2.get(arr2[j]);
            if (index+y > 26){
                ans = ans +alpha1.get(25-index+y);
            }
            else{
                ans = ans + alpha1.get(index+y);
            }
        }
        return ans;
    }

    public static String getLowerCase(){
        String out = "";
        for (char x = 'a'; x <= 'z'; x++){
            out+= Character.toString(x);
        }
        return out;
    }

    public static void main(String[] args) throws Exception{
        System.out.println(caesar(getInput(), 5));
    }
    
}
