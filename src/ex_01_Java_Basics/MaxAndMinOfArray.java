package ex_01_Java_Basics;

public class MaxAndMinOfArray {
    static int max_of_array(int[] marks){
        int max=marks[0];
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
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]<min)
                min=marks[i];
        }

        return min;
    }
    public static void main(String[] args) {
        int[] marks={90,78,23,24,54,34,12,67,87,56,97};
        int result=max_of_array(marks);
        System.out.println("max of this array is ,"+result);
        int result1=min_of_array(marks);
        System.out.println("min of this array is ,"+result1);


    }
}
