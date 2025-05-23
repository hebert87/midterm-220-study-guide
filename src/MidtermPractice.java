import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MidtermPractice {

    public static void main(String[] args) {
        // After implementing a method, call it here with
        // some sample input and print the result to
        // check if it works. Fix any issues you find.
        
        // i forgot how to make a list to store the strings
        List<String> words =Arrays.asList ("apple", "banana", "kiwi");
        System.out.println(findLongestWord(words));

        Map<String, Integer> keyWord = new HashMap<>();
        keyWord.put("why",7);
        keyWord.put("hello",8);
        keyWord.put("brilliant",99);
        keyWord.put("world",15);
        keyWord.put("amazing",17);
        int answer =countLongWords(keyWord);
        System.out.println(answer);

     
        System.out.println(findAverage(new float[] {1.5f, 3.5f, 2.0f, 3.0f}));
 
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("a",7);
        testMap.put("x",4);
        testMap.put("z",5);
        System.out.println(countOddNumbers(testMap));

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(canPartitionWithEqualSums(arr));



    }

    /**
     * Finds the longest word in an List of Strings.
     * @param list an ArrayList of words
     * @return the longest word in the list
     * Example: input: ["apple", "banana", "kiwi"] -> output: "banana"
     */
    public static String findLongestWord(List<String> list) {

        String longest = "";
        
        for (String word : list) {
            if(word.length()> longest.length()){
                longest = word;
            }
        }
        return longest;
    }

    /**
     * Counts how many words are longer than 5 characters in the keys of a Map.
     * @param map a Map of strings to integers
     * @return the count of words longer than 5 characters
     * Example: input: ["why"=7, "hello"=8, "brilliant"=99, "world"=15, "amazing"=17] -> output: 2
     */
    public static int countLongWords(Map<String, Integer> map) {
        int count = 0;
        
        for (String key : map.keySet()){
            if (key.length() > 5){
                count ++;
            }
        }
        return count;
    }

    /**
     * Finds the average of the floats in an array.
     * @param arr an array of floats
     * @return the average of the values
     * Example: input: [1.5, 3.5, 2.0, 3.0] -> output: 2.5
     */
    // i had trouble with the floats and double 
    public static double findAverage(float[] arr) {
        double total = 0;

        for(float each: arr){
            total+= each;
        
        }
        return total/arr.length;
    }

    /**
     * Counts how many odd numbers there are in the values of a Map.
     * @param map a HashMap of String keys and Integer values
     * @return the count of odd numbers in the values
     * Example: input: {"a"=7, "x"=4, "z"=5} -> output: 2
     */
    public static int countOddNumbers(Map<String, Integer> map) {
        int count = 0;
        
        for (Integer num : map.values()){
            if(num % 2 != 0){
                count++;
            }
        }
        return count;
    }

    /**
     * Returns true if all values are divisible by 3 in an array.
     * @param arr an array of integers
     * @return true if all values are divisible by 3, false otherwise
     * Example: input: [3, 6, 9] -> output: true
     * Example 2: input: [3, 4, 6, 9] -> output: false
     */
    
    // i had trouble with returning ture logic was worng 
     public static boolean allDivisibleBy3(int[] arr) {
        for(int num : arr){
            if (num % 3 != 0){
                return false;
            }
        }
        return true;
    }

    /**
     * Returns true if all words start with 'a' in an ArrayList of Strings.
     * @param list an ArrayList of words
     * @return true if all words start with 'a', false otherwise
     * Example: input: ["apple", "apricot", "avocado"] -> output: true
     * Example: input: ["apple", "banana", "avocado"] -> output: false
     */
    
    // didnt do this one right i was trying index the first letter. re-doing it.
    public static boolean allStartWithA(List<String> list) {
        for(String word : list){
            if (!word.contains("a")){
                return false;
            }
        }
        return true;
    }

    /**
     * OPTIONAL MORE CHALLENGING PROBLEM
     * NOT REQUIRED
     *
     * Determines if the array can be split into two contiguous subarrays with equal sums.
     * The method checks if there exists an index where the sum of elements to the left of the index
     * is equal to the sum of elements to the right. Both subarrays must be contiguous.
     *
     * @param arr an array of integers to evaluate
     * @return true if there exists a split point where the left and right contiguous subarrays have equal sums, false otherwise
     *
     * Example:
     * Input: [1, 3, 8, 2, 1, 2, 7]
     * Output: true (since [1, 3, 8] and [2, 1, 2, 7] both sum to 12)
     *
     * Input: [1, 2, 3, 4, 5]
     * Output: false (no contiguous split results in equal sums)
     */

    // didnt know how to figure out how to contiguous split the arry 
    public static boolean canPartitionWithEqualSums(int[] arr) {
        int total = 0;

        for (int eachNum : arr){
            total +=eachNum;
        }

        int leftSide = 0;
        for(int i = 0 ; i <arr.length -1; i++){
            leftSide+= arr[i];
            int rightSide = total-leftSide;

            if (rightSide== leftSide) return true;
        }
        return false;
    }
}