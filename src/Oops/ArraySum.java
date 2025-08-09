package Oops;

public class ArraySum {
    public static void main(String[] args) {
        float [] abc= {1.2f, 1.3f, 1.4f, 1.5f};
        float sum=0.0f;

        for(int i=0; i<=abc.length-1; i++){
            sum=sum+abc[i];
        }
        System.out.println(sum);
    }
}
