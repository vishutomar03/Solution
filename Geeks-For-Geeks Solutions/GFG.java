
import java.util.Scanner;

class GFG {
    public static void main (String[] args) {
        Scanner scan =new Scanner(System.in);
        int t = scan.nextInt();
        for (int k = 1; k <= t; k++) {
        
            int n = scan.nextInt();
           
            int m = n;
            int[][] array = new int[n][m];
          
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = scan.nextInt();
                }
            }
            int[][] arr= returnArray(array, n, m);
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static int[][] returnArray(int[][] arr , int n , int m){
        int temp=0;
        for (int i=0; i < n-1; i++) {
            for (int j = i+1; j < m; j++) {
                temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]= temp;
            }
        }
        for(int i=0;i<n;i++){
           int count=0 , t=0;
            for(int j=0;j<m/2;j++){

                t= arr[i][j];
                arr[i][j]=arr[i][m-1-count];
                arr[i][m-1-count] =t;
                count+=1;
            }
        }
     return arr;
    }

}