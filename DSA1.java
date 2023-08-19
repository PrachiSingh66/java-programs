import java.util.Scanner;

public class DSA1 {
        public static int maxDifference(int[] arr) {
            if (arr.length < 2) {
                return 0;
            }
            
            int minElement = arr[0];
            int maxDifference = 0;
            
            for (int num : arr) {
                if (num < minElement) {
                    minElement = num;
                } else if (num - minElement > maxDifference) {
                    maxDifference = num - minElement;
                }
            }
            
            return maxDifference;
        }
    
        public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int output = maxDifference(arr);
        System.out.println("Largest difference between two elements: " + output);
        
        scanner.close();
        }
    }
    
    

