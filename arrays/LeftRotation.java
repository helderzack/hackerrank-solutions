import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class LeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        List<Integer> swapList = Arrays.stream(a).boxed().collect(Collectors.toList());
        Collections.rotate(swapList, -d);
        a = swapList.stream().mapToInt(i -> i).toArray();
        return a;
    }
}