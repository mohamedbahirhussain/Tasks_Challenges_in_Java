package DayTry.Day1test;

public class looptest {
    public static void main(String[] args){
        int marks[] = {50, 70, 60, 90, 40, 20};
        int average = getSum(marks) / marks.length;
        System.out.println(average);
    }

    static int getSum(int []marks){
        int result  = 0;
        for(int i=0; i<marks.length; i++){
            result = result + marks[i];
        }
        return result;
    }
}
