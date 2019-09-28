import java.util.Scanner;

public class MaxArray {
    public static void main(String[] agvr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Max column:= ");
        int maxColumn = sc.nextInt();
        int[] All_arr = new int[maxColumn];
        boolean check = true;
        int max=0;
        for (int i : All_arr) {
            i = (int)(Math.random() * 100);
            if (check) {
                max = i;
                check = false;
            }
            if (max < i) {
                max = i;
            }
            System.out.print(i+" ");
        }
        System.out.print("\n");
        System.out.println("Max Array = " + max);
    }
}
