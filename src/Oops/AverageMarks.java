package Oops;

public class AverageMarks {
    public static void main(String[] args) {
        float [] phy = {45.0f, 56.0f, 57.0f, 78.0f, 90.0f, 67.0f};


        float sum=0;
        float avg=0;

        for(int i=0; i<phy.length; i++){
            sum=sum+phy[i];
        }

        System.out.printf("total marks is %.2f\n",sum);
        avg = sum/phy.length;
        System.out.printf("Average marks is %.2f\n",avg);


    }
}
