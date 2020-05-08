import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); //Takes number of test cases
        for(int i = 1; i <= T; i++){ //This is the counter for each test case
            int R = in.nextInt(); //R is # of rows
            int C = in.nextInt(); //C is # of columns
            int K = in.nextInt(); //K is the thickness allowed
            int numArray[][] = new int[R+1][C+1];

            for(int j = 0; j < R; j++){
                for(int k = 0; k < C; k++){
                    numArray[j][k] = in.nextInt();
                    System.out.println(numArray[j][k]);
                }
            }

            boolean checkGrid[][] = new boolean[R+1][C+1]; //Will be used to create a grid of trues that will be eligible subrectangles in the row
            for(int l = 0; l < R; l++){
                for(int m = 0; m < C; m++){
                    if(numArray[l][m] == numArray[l][m+1]){ //*****If code doesn't work, possible overflow error here accessing the last column+1
                        checkGrid[l][m] = true;
                        checkGrid[l][m+1] = true;
                        m++;
                    }
                    else checkGrid[l][m] = false;
                }
            }
            for(int j = 0; j < R; j++){
                for(int k = 0; k < C; k++){
                    System.out.println(checkGrid[j][k]);
                }
            }

        }
        in.close();
    }//End of main

}//End of main class
