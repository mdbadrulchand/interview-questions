package Java8Stream.usingIntegerArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Java8StreamProgramUsingIntegerArray {

    public static void reversedBasedOnGivenIndexPosition() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int start = 2; // index of '2'
        int end = list.size() - 1;   // index of '5'

        // Map each index 'i' to its mirrored value if it's in the target range
        List<Integer> reversedList = IntStream.range(0, list.size())
                .mapToObj(i -> (i >= start && i <= end) ? list.get(start + end - i) : list.get(i))
                .toList();

        System.out.println("Result: " + reversedList);
        List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));

        // Two-pointer logic
        int left = 1;
        int right = 4;

        while (left < right) {
            // Swap elements at left and right indices
            Integer temp = list1.get(left);
            list1.set(left, list1.get(right));
            list1.set(right, temp);

            left++;
            right--;
        }

        System.out.println("Reversed List: " + list1);
    }
}
