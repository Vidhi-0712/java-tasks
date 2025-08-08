package Practice.Oops;

public class ReverseArray {
    public static void main(String[] args) {
        int marks[] = {90, 80, 70,85,95};
        System.out.println(marks.length);

        for(int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
    }
}
