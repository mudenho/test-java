package test;
import java.util.*;
import java.lang.*;

class Solution2 {
    /**
     ·* @param String[] ops - List of operations
     ·* @return int - Sum of scores after performing all operations
     ·*/
    public static int calPoints(String[] ops) {
        int result = Integer.MIN_VALUE;
        List<Integer> x = new ArrayList<>();
        for(String j : ops){

            if(Objects.equals(j, "+")){
                int n = x.get(x.size() - 1) + x.get(x.size()-2);
                x.add(n);
            }
            else if(Objects.equals(j, "D")){
                int pos = x.size() - 1;
                int n = 2 * x.get(pos);
                x.add(n);
            }
            else if(Objects.equals(j, "C")){
                int pos = x.size() - 1;
                x.remove(pos);
            }
            else{
                x.add(Integer.parseInt(j));
            }
        }
        int sumTotal = 0;
        for(int i : x){
            sumTotal = sumTotal + i;
        }
        result = sumTotal;
        return result;
    }
}
public class Main2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String[] ops = sc.nextLine().split(" ");
        System.out.println(Solution2.calPoints(ops));
    }
}