package ChallengeOne;

//Your String	Carlos Gonzalez
//MD5 Hash	b617170ec6b7ea9e2cc12359ab620a93  
//SHA1 Hash	cdb5be47fe388d7670b2cedaa7871ae8fd105c7b


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Collections;

public class challengeOne {

    public static void main(String[] args) {
        int S = 6;
        List<Integer> numbers = new ArrayList<>();
        numbers.add(16);
        numbers.add(46);
        numbers.add(36);
        numbers.add(56);
        numbers.add(56);
        numbers.add(61);
        System.out.println(numbers);
        List<Integer> result = switchNumbers(numbers, S);
        Collections.sort(result, Collections.reverseOrder());
        System.out.println(result);
    }

    public static List<Integer> switchNumbers(List<Integer> numbers, int S) {
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : numbers) {
            int filteredNum = removeDigitsGreaterThanEqualToS(num, S);
            if (filteredNum != 0) {
                stack.push(filteredNum);
                System.out.print(filteredNum + " ");
            }
        }

        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }

    public static int removeDigitsGreaterThanEqualToS(int num, int S) {
        int result = 0;
        int position = 1;

        while (num > 0) {
            int digit = num % 10;
            if (digit < S) {
                result += digit * position;
                position *= 10;
            }
            num /= 10;
        }

        return result;
    }
}