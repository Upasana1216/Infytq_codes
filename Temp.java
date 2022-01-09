package collectionz;

import java.util.HashMap;
import java.util.Scanner;

class Temp {

    static void print(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [][] array = new int[N][N];
        HashMap<Integer, Integer> map = new HashMap<>();

        int powerpoints = 1 + (N*N)/11;

        int counter = 1;
        int row = 0, col = 0; // for the current row/col that we are end
        int endRow = 0, endColumn = 0; // for the row/col where we need to stop

        map.put(0,0);

        for(int i=0;i<N/2;i++){
            row = col = i;
            endColumn = N-i-1;

            while (col < endColumn) {
                array[row][col] = counter;

                if (counter % 11==0)
                    map.put(row,col);

                counter++;
                col++;
            }
            endRow = N-i-1;
            while (row<endRow){
                array[row][col] = counter;
                if (counter % 11==0)
                    map.put(row,col);
                counter++;
                row++;
            }

            endColumn = i;
            while (col>endColumn){
                array[row][col] = counter;
                if (counter % 11==0)
                    map.put(row,col);
                counter++;
                col--;
            }

            endRow = i;
            while (row>endRow){
                array[row][col] = counter;
                if (counter % 11==0)
                    map.put(row,col);
                counter++;
                row--;
            }


        }
        if (N%2==1)
            array[N/2][N/2] = N*N;

        print(array);
        System.out.println("Total Power Points: " + powerpoints);
        for (Integer key: map.keySet()) {
            System.out.println("("+key+ ","+map.get(key)+")");

        }

    }

}
