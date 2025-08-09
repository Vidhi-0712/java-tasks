package LeetCode_Solutions;
import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if(numRows==0){return result;}

        ArrayList<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        result.add(firstrow);

        if(numRows==1){ return result;}

        for(int i=1; i<numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);

            ArrayList<Integer> Row = new ArrayList<>();
            Row.add(1);
            for (int j = 0; j < i - 1; j++) {
                Row.add(prevRow.get(j) + prevRow.get(j + 1));
            }
            Row.add(1);
            result.add(Row);
        }
        return result;
        }



    public static void main(String[] args) {
        generate(5);


//            int rows = 5;
//            for (int i = 0; i <rows; i++) {
//                System.out.print("1");
//                for (int j = 0; j < i; j++) {
//                    System.out.print(j+1);
//                }
//                System.out.print("\n");
//            }
        }
    }
