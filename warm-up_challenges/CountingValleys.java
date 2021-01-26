import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class CountingValleys {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
    // Write your code here
        int step = 0;
        int valleys = 0;
        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'D') {
                if (step == 0) {
                    valleys++;
                }
                step--;
            } else {
                step++;
            }
        }
        
        return valleys;
    }

}