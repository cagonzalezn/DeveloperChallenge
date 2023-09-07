package ChallengeTwo;

//Your String	Carlos Gonzalez
//MD5 Hash	b617170ec6b7ea9e2cc12359ab620a93  
//SHA1 Hash	cdb5be47fe388d7670b2cedaa7871ae8fd105c7b  

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class challengeTwo {

    public static void main(String[] args) {
        int S = 6;
        int[] inputArray = {-6, 4, 3, 4, 5, 6, 7, 8, 9};
        int[] result = squareAndFilter(inputArray, S);
        printArray(result);
    }

    public static int[] squareAndFilter(int[] arr, int S) {
        List<Integer> filteredList = new ArrayList<>();
        List<Integer> discardedList = new ArrayList<>();

        for (int num : arr) {
            int square = num * num;
            if (square >= 0 && square <= S * S) {
                filteredList.add(square);
                System.out.println(filteredList);
            } else {
                discardedList.add(num);
            }
        }

        int maxRange = S * S;
        List<Integer> finalList = new ArrayList<>();

        for (int num : filteredList) {
            if (num <= maxRange) {
                finalList.add(num);
            }
        }

        int[] finalArray = new int[finalList.size()];
        for (int i = 0; i < finalList.size(); i++) {
            finalArray[i] = finalList.get(i);
        }

        Arrays.sort(finalArray); // Ordena la matriz resultante en orden ascendente.
        
        System.out.println("Filtered: ");
        for (int num : filteredList) {
            System.out.print(num + " ");
        }
        System.out.println();

        
        // Imprime los números descartados.
        System.out.println("Discarded: ");
        for (int num : discardedList) {
            System.out.print(num + " ");
        }
        System.out.println();

        return finalArray;
    }

    public static void printArray(int[] arr) {
    /*for (int i = 0; i < arr.length; i++) {
        int num = arr[i];
        int square = (int) Math.sqrt(num); // Calcula la raíz cuadrada para obtener el número original
        System.out.println("Posición " + i + " con valor de " + num + " es " + square + " (" + num + "^2)");*/
        System.out.println("Ascending order list");
        for (int num : arr) {
        
        System.out.print(num + " ");
        }
        System.out.println();
    } 
   
}
