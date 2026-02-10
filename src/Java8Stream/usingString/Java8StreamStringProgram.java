package Java8Stream.usingString;

import java.util.*;
import java.util.stream.Collectors;

public class Java8StreamStringProgram {
    public static void getReverseStringBasedOnPosition() {
        //Reverse the string based on given length
        //Will reverse string which length is 4
        String input = "My Name is Badrul And I am a java developer";

        List<String> list = Arrays.stream(input.split(" "))
                .map(str -> str.length() == 4 ?/*new StringBuilder(str).reverse().toString()*/reverse(str) : str)
                .toList();
        System.out.println(list);
    }

    private static String reverse(String str) {
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        return reverse;
    }

    public static void sortWord() {
        List<String> listFruit = Arrays.asList("Apple", "Banana", "Cherry", "banana", "apple", "Papaya", "Apple", "banana");
        // Grouping the fruit with case-sensitive

        Map<String, Long> groupedFruits = listFruit.stream()
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

        System.out.println("Print the Fruit with count: " + groupedFruits);
    }

    public static void groupStringAndPrintTop3() {
        List<String> listFruit = Arrays.asList("Apple", "Banana", "Cherry", "banana", "apple", "Papaya", "Apple", "banana");
        // Grouping the fruit with case-sensitive and print top 3 with name and count

        Map<String, Long> groupedFruits = listFruit.stream().collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

        List<Map.Entry<String, Long>> map3 = groupedFruits.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(3).toList();

        map3.forEach(entry -> {
            System.out.println("{ " + entry.getKey() + " : " + entry.getValue() + " }");
        });

    }

    public static void groupStringBasedOnLength() {
        // write a code to group a list of strings based on their length
        // and count the number of Strings in each group.
        List<String> words = Arrays.asList("dog", "cat", "elephant", "rabbit", "fox",
                "giraffe", "ant", "zebra", "owl", "Leopard", "Beagle");

        Map<Integer, Long> groupedStringBasedOnLength = words
                .stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        // Read the Key and Value using forEach() and print the result

        groupedStringBasedOnLength.forEach((length, count) -> System.out.println("Length of String: " + length + ":" + count));

        // If we want to print the String as well the need use the below program

        groupedStringBasedOnLength.forEach((length, count) -> {
            List<String> list = words.stream().filter(s -> s.length() == length).toList();
            System.out.println("Length of String: " + length + ":" + count + " Strings are " + " { e.g." + String.join(", ", list) + " }");
        });

    }

    public static void check() {
        String[] str = {"abc", "cab", "abb", "bba", "bac", "bbb"};

        // Map to store sorted key and its list of anagrams
        Map<String, List<String>> map = new HashMap<>();

        // Single loop to process each string
        for (String s : str) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars); // Sort characters to create a unique key
            String sortedKey = new String(chars);

            // Add original string to the corresponding list in the map
            map.putIfAbsent(sortedKey, new ArrayList<>());
            map.get(sortedKey).add(s);
        }

        int totalPairs = 0;
        System.out.println("Anagram Groups found:");

        // Print the results from the map
        for (List<String> group : map.values()) {
            if (group.size() > 1) {
                System.out.println(group);
                // Calculate pairs: a group of 'n' has n*(n-1)/2 pairs
                totalPairs += (group.size() * (group.size() - 1)) / 2;
            }
        }
        System.out.println("Total anagram pairs: " + totalPairs);
        //Using Stream API
        checkWithStreams();
    }

    public static void checkWithStreams() {
        String[] str = {"abc", "cab", "abb", "bba", "bac", "bbb"};

        Map<String, List<String>> groups = Arrays.stream(str)
                .collect(Collectors.groupingBy(s -> {
                    char[] chars = s.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }));

        System.out.println("Anagram groups found:");
        groups.values().stream()
                .filter(g -> !g.isEmpty())
                .forEach(System.out::println);

        int totalPairs = groups.values().stream()
                .mapToInt(g -> g.size() > 1 ? g.size() * (g.size() - 1) / 2 : 0)
                .sum();

        System.out.println("Total anagram pairs: " + totalPairs);
    }

    public static void main(String[] args) {
        String[] staging = {"apple", "Banana", "Cherry"};

        // Simple way
        for (String s : staging) {
            String first = s.substring(0, 1).toUpperCase();
            String rest = s.substring(1).toLowerCase();
            System.out.println(first + rest);
        }
        // Long way
       String[] updated = addUppercase(staging);

        for (String s : updated) {
            System.out.println(s);
        }
    }

    static String[] addUppercase(String[] input) {
        String[] out = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            String original = input[i] == null ? "" : input[i];
            out[i] = original + " " + capitalizeFirst(original);
        }
        return out;
    }

    static String capitalizeFirst(String s) {
        if (s == null || s.isEmpty()) return "";
        String first = s.substring(0, 1).toUpperCase();
        String rest = s.length() > 1 ? s.substring(1).toLowerCase() : "";
        return first + rest;
    }

    public static void readPasswordAndValidateBasedOnCriteria() {
        //String password = "1-2,A,UYAMaaSA";
        //String password1 = "10-12,S,ALJLLSSMSS";
        //String password2 = "3-6,B,HBBKIBBBlibHi";

        List<String> passwords = Arrays.asList("1-2,A,UYAMaaSA", "10-12,S,ALJLLSSMSS", "3-6,B,HBBKIBBBlibHi");

        for(String str : passwords){
            String[] parts = str.split(",");
            String rangePart = parts[0];
            char characterToFind = parts[1].charAt(0);
            String passwordStr = parts[2];

            String[] rangeParts = rangePart.split("-");
            int minRange = Integer.parseInt(rangeParts[0]);
            int maxRange = Integer.parseInt(rangeParts[1]);

            long frequency = passwordStr.chars().filter(ch -> ch == characterToFind).count();

            if(frequency >= minRange && frequency <= maxRange){
                System.out.println(str + " -> valid");
            } else {
                System.out.println(str + " -> invalid");
            }

        }
    }
}

