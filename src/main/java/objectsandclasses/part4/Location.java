package objectsandclasses.part4;

import java.util.Scanner;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    public static Location locateLargest(double[][] a) {
        Location result = new Location();
        result.maxValue = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j] > result.maxValue){
                    result.maxValue = a[i][j];
                    result.row = i;
                    result.column = j;
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Location{" +
                "row=" + row +
                ", column=" + column +
                ", maxValue=" + maxValue +
                '}';
    }

    public static void main(String[] args) {
        /*
        23,5 3 2 10
        4,5 3 45 3,5
        35 44 5,5 9,6
        */
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\\s+");
        System.out.print("Введите количество строчек и столбцов массива: ");
        int r = in.nextInt();
        int c = in.nextInt();
        
        double[][] initialA = new double[r][c];
        System.out.println("Введите массив: ");
        for (int i = 0; i < r; i++) {
            double[] row = new double[c];
            for (int j = 0; j < c; j++) {
                //in.nextDouble();
                row[j] = in.nextDouble();
            }
            initialA[i] = row;
        }
        in.close();
        Location result = Location.locateLargest(initialA);
        System.out.println(result.toString());
    }
}
