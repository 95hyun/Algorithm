import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        String[] board = new String[n];
        
        for (int i = 0; i < n; i++) {
            board[i] = sc.next();
        }
        
        int min = 64;
        
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                int wCount = 0;
                int bCount = 0;
                
                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        char crt = board[i + x].charAt(j + y);
                        
                        if ((x + y) % 2 == 0) {
                            if (crt != 'W') {
                                wCount++;
                            }
                            if (crt != 'B') {
                                bCount++;
                            }
                        } else {
                            if (crt != 'B') {
                                wCount++;
                            }
                            if (crt != 'W') {
                                bCount++;
                            }
                        }
                    }
                }
                min = Math.min(min, Math.min(wCount, bCount));
            }
        }
        System.out.println(min);
    }
}