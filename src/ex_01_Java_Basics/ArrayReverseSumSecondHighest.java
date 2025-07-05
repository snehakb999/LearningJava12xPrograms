package ex_01_Java_Basics;

public class ArrayReverseSumSecondHighest {
    public static void main(String[] args) {
        //Array reverse
        int[] marks={78,90,98,32,45,23,76,98};
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);

        }
        //sum of array
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum=sum+marks[i];
        }
        System.out.println("sum of this array is = "+sum);

        //second highest number without using sort
        int highest=0;
        int secondHighest=0;
        for(int mark:marks){
            if(mark>highest){
                secondHighest=highest;
                highest=mark;

            } else if (mark>secondHighest && mark!=highest) {
                secondHighest=mark;


            }

        }
        System.out.println("The second highest number without using sort is = "+secondHighest);






    }
}
