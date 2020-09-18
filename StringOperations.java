import java.util.Scanner;

class StringOperations {
    public static void main (String [] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("\nInput String 1: ");
        String str1 = s.nextLine();

        System.out.println("\nInput String 2: ");
        String str2 = s.nextLine();

        System.out.println("\nEnter an index: ");
        int index = s.nextInt();

        System.out.println("\nIn String 1 character at index is: ");
        System.out.println(str1. charAt (index));

        System.out.println("\nLength of String 1: ");
        System.out.println(str1. length());

        System.out.println("\nCompare String 1 and String 2: ");
        System.out.println(str1. equals (str2));

        System.out.println("\nConcatenation of two Strings: ");
        System.out.println(str1 + str2);

        str1 += str2;
        System.out.println("\nResult of Append String is: ");
        System.out.println(str1);

        System.out.println("\nString 1 sub-string from 0th to 3rd index: ");
        System.out.println(str1. substring(0, 3));
    }    
}