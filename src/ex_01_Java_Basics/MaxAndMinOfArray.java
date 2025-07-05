
package ex_01_Java_Basics;

import java.util.Scanner;
public class MaxAndMinOfArray {
    static int max_of_array(int[] marks){
        int max=marks[0];
        //using for loop
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]>max)
                max=marks[i];
        }

        return max;
    }
    static int min_of_array(int[] marks)
    {
        int min=marks[0];
        //using enhanced loop
        for(int i:marks)
        {
            if(i<min)
                min=i;
        }

        return min;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number of elements: ");
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();


        int[] marks = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            marks[i] = scanner.nextInt();
        }


        // int[] marks={90,78,23,24,54,34,12,67,87,56,97};
        int result=max_of_array(marks);
        System.out.println("max of this array is ,"+result);
        int result1=min_of_array(marks);
        System.out.println("min of this array is ,"+result1);


    }
}
