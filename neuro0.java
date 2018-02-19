import java.io.*;
import java.util.Scanner;
public class neuro0 {
    public static double main(String[] args) {
        int pixel[][] = new int[11][11]; //кол-во 1
        int newpixel [][]=new int[11][11];
        int i,j,all=0;
        double chance=0;
        try {
            Scanner datain = new Scanner(new File("data/data0.txt"));
            Scanner input = new Scanner(new File("input.txt"));
            all = datain.nextInt();
            for (i=1;i<=10;i++){
                for (j=1;j<=10;j++){
                    pixel[i][j]=datain.nextInt();
                    newpixel[i][j]=input.nextInt();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (all>0) {
            //     Scanner console = new Scanner(System.in);
            //     if (console.nextLine().equals("Yes")){//если тренировка
            //all++;
            //       int z=console.nextInt();
            for (i = 1; i <= 10; i++) {
                for (j = 1; j <= 10; j++) {
                    if (newpixel[i][j] == 1) {
                        chance = chance + (pixel[i][j] / all);
                    } else {
                        chance = chance + (all - pixel[i][j]) / all;
                    }
                }
            }
        }
        return chance;
        //     }
    }
}
