import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Hourglass {
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        List<Integer> hourglassList = new ArrayList<Integer>();
        
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            
            for (int j = 0; j < 4; j++) {
                sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1]
                + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                hourglassList.add(sum);
            }   
        }
        
        return hourglassList.stream().max(Integer::compare).get();
    }
}