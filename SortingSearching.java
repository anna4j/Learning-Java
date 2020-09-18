import java.util.Scanner;
import java.util.Arrays; 

public class SortingSearching {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter number of elements in Array: ");
        int n = s.nextInt();

        int a[] = new int[n];
        
        System.out.println("Enter all the Array elements:");
        
        for(int i = 0; i < n; i++)
        {
            a [i] = s. nextInt();
        }

        System.out.println("\nSorted Array is: ");
        Arrays.sort(a); 
        
        for(int i = 0; i < n; i++)
        {
            System.out.print(a [i] + " ");
        }

        System.out.println("\nEnter the element to search: ");
        int x = s. nextInt();

        int answer = -1;

        for(int i = 0; i < n; i++)
        {
            if (a [i] == x) {
                answer = i;
                break;
            }
        }

        System.out.print("Index of element is: " + answer + "\n");
    }
}