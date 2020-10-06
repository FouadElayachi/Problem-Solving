import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        String input = in.nextLine();
        String res = "";
        for(char c: input.toCharArray()) {
            if(c == a.charAt(0)) res+=b;
            else res+= a;
        }

        System.out.println(res);
    }
}