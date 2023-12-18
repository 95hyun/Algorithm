import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            garo(a);
        }

    }

    static void garo (int a) {
        for (int i = 1; i <= a; i++) {
            System.out.print("*");

        }
        System.out.println();
    }
}