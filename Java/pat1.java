package File1_Basics.Patterns;

import java.util.Scanner;

// 4
// ****
// ****
// ****
// ****

public class pat1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int row = 1;

        while(row<=n){

            int col = 1;
            while(col<=n){
                System.out.print("*");
                col++;
            }

            System.out.println();

            row++;
        }

    }
}
