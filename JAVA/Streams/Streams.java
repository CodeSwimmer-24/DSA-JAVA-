package JAVA.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import JAVA.Array.Array;

public class Streams {
   public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);

    // Stream doesn't take change/effect values in array lIst

    // Stream<Integer> s1 = nums.stream();
    // Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
    // Stream<Integer> s3 = s2.map(n -> n*2);
    // int result = s3.reduce(0, (c,e) -> c+e);

    int result = nums.stream().filter(n -> n%2 == 0).map(n -> n*2).reduce(0, (c,e) -> c+e);
    System.out.println(result);
   }
}
