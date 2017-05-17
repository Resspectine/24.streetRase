import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("input.txt"));
        int N = sc.nextInt();
        int[][] array = new int[N][N];
        int i = 0;
        sc.nextLine();
        while(sc.hasNext()){
            String buffer = sc.nextLine();
            String[] buff = buffer.split(" ");
            for (int j = 0; j < buff.length-1; j++) {
                array[i][Integer.valueOf(buff[j])] = 1;
            }
            i++;
        }
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int j = 0; j < N; j++) {
            System.out.print(j+" ");
            for (int k = 0; k < N; k++) {
                System.out.print(array[j][k]+" ");
            }
            System.out.println();
        }
    }
}