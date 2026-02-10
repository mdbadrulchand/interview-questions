import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

        //i want to display all permutations of characters in string "abc" in java
        //abc, bac, cab

        String str = "abc";
        UpdateHashSet.permutation(str, 0, str.length() - 1);

        UpdateHashSet.checkSizeOfHashSet();
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;
        // removeDuplicates() returns new size of array
        int[] result = UpdateHashSet.removeDuplicates(arr, n);
        // Print updated array
        for (int j : result) System.out.print(j + " ");


        String input = "My Name is Badrul And I am a java developer";

        String[] str1 = input.split(" ");
        List<String> list2  = Arrays.stream(str1).map(s->s.length()==4?reverse(s):s).toList();
        System.out.println("List2: "+ list2);
        List<String> list = List.of(str);//.stream().filter(s->s.length()==4).map(s->new StringBuilder(s).reverse().toString()).toList();
        ArrayList<String> list1 = new ArrayList<>(list);
        list1.add("w");
        System.out.println(list1);
        //list.add("w");
        System.out.println(list);

        List<String> listFruit = Arrays.asList("Apple", "Banana","Cherry", "banana","apple","Papaya","Apple","banana");



        Map<String, Long> map1 = listFruit.stream().collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

        //List<Long> map2= map1.entrySet().stream().map(Map.Entry::getValue).sorted((s1, s2)-> s2.compareTo(s1)).limit(3).toList();

        List<Map.Entry<String,Long>> map3 = map1.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(3).collect(Collectors.toList());

        map3.forEach(entry-> System.out.print(" "+entry.getKey()+" = "+entry.getValue()+" "));

        System.out.println();
        System.out.println(map3);
    }
    private static String reverse(String s) {
        StringBuilder reverse = new StringBuilder();
        for (int i=0;i<s.length();i++){
            reverse.insert(0, s.charAt(i));
        }
        return reverse.toString();
    }
}

