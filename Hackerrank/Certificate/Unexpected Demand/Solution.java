import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'filledOrders' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY order
     *  2. INTEGER k
     */

    public static int filledOrders(List<Integer> order, int k) {
        int result = 0;
        Collections.sort(order);
        for(int l: order) {
            if(l <= k) {
                result++;
                k -= l;
            }
        }
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int orderCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> order = new ArrayList<>();

        for (int i = 0; i < orderCount; i++) {
            int orderItem = Integer.parseInt(bufferedReader.readLine().trim());
            order.add(orderItem);
        }

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.filledOrders(order, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}