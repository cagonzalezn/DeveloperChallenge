/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChallengeThree;

/**
 *
 * @author Carlos Nova
 */
import java.util.Arrays;

public class challengeThree {

    public static int minUnusableChange(int[] coins) {
        Arrays.sort(coins);
        int minChange = 1;

        for (int coin : coins) {
            if (coin <= minChange) {
                minChange += coin;
            } else {
                break;
            }
        }

        return minChange;
    }

    public static void main(String[] args) {
        int[] coins1 = {5, 7, 1, 1, 2, 3, 22};
        int result1 = minUnusableChange(coins1);
        System.out.println(result1);

        int[] coins2 = {1, 1, 1, 1, 1};
        int result2 = minUnusableChange(coins2);
        System.out.println(result2); 

        int[] coins3 = {1, 5, 1, 1, 1, 10, 15, 20, 100};
        int result3 = minUnusableChange(coins3);
        System.out.println(result3); 
    }
}