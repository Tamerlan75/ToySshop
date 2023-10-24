// import java.time.LocalDateTime;
// import java.util.Scanner;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Prov {
    // public static void main(String[] args){
    // System.out.println("Hello world");
    // System.out.println(LocalDateTime.now());
    // Scanner iScanner = new Scanner(System.in);
    // System.out.println("int a: ");
    // int a = iScanner.nextInt();
    // System.out.println("double b: ");
    // double b = iScanner.nextDouble();
    // System.out.printf("a = , %s!", a);
    // System.out.printf("b = , %s!", b);
    // iScanner.close();
    // }

    public static void main(String[] args) {
        int[] arr = new int[] {}; // {5,7,3,2,9,10,12,8,1};
        System.out.println(arr.length);
        jobArr(arr);

    }

    public static void jobArr(int[] arr) {
        if (arr.length != 0) {
            
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int max = 0;
        int min = arr[0];
        
            
         
            for (int i = 0; i < arr.length; i++) {

                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {

                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            int Sum = 0;
            for (int i = 0; i < arr.length; i++) {
                Sum += arr[i];
            
            }
            double Average = (double) Sum / (double) arr.length;
            System.out.println("Minimum is" + " " + min);
            System.out.println("Maximum is" + " " + max);
            System.out.println("Average is" + "=" + Average);
            }
            else {
            System.out.println("Список пустой");
            }    
        }
    }
 
