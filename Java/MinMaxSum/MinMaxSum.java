import java.util.ArrayList;
import java.util.List;

class Result {
    public static void minMaxSum(List<Integer> arr) {
        Long total = arr.stream().mapToLong(Long::valueOf).sum();

        long maxSum = 0;
        long minSum = total;
        for (int currNum : arr) {
            long currSum = total - currNum;

            if (currSum < minSum) minSum = currSum;
            if (currSum > maxSum) maxSum = currSum;
        }

        System.out.println(String.format("%s %s", minSum, maxSum));
    }

}

public class MinMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        // long test case
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(256741038);
        arr2.add(623958417);
        arr2.add(467905213);
        arr2.add(714532089);
        arr2.add(938071625);

        Result.minMaxSum(arr);
        Result.minMaxSum(arr2);
    }
}
