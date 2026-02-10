import java.util.HashSet;


public class UpdateHashSet {

    public static void checkSizeOfHashSet() {
        HashSet<Student> studentList = new HashSet<>();

        Student st1 = new Student("Nimit", 1);
        Student st2 = new Student("Rahul", 3);
        Student st3 = new Student("Nimit", 2);

        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);

        System.out.println(studentList.size());//3
        //st1.id = 2;
        st1 = new Student("Nimit", 2);
        System.out.println(studentList.size());// 3
    }

    public static void permutation(String str, int startIndex, int endIndex) {

        if (startIndex == endIndex) {
            System.out.print(str + " ");
        } else {
            for (int k = 0; k < str.length(); k++) {
                String str1 = swapString(str, k, endIndex);
                permutation(str1, startIndex + 1, endIndex);
            }
        }
    }

    private static String swapString(String str, int startIndex, int endIndex) {
        char[] arr = str.toCharArray();

        char temp = arr[startIndex];
        arr[startIndex] = arr[endIndex];
        arr[endIndex] = temp;

        return String.valueOf(arr);
    }

    public static int[] removeDuplicates(int arr[], int n) {
        //int len =arr.length;
        int[] temp = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[count] = arr[i];
                count++;
            }
        }
        int result[] = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}