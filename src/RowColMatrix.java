import java.lang.reflect.Array;
import java.util.Arrays;

public class RowColMatrix {
    public static void main(String [] args){
int [][] arr = {
        {10,20,30,40},
        {15,25,35,45},
        {28,29,37,49},
        {33,34,38,50}
};
System.out.println(Arrays.toString(search(arr , 49)));
    }
  static int[] search(int [][] Matrix , int target){
        int r = 0;
        int c = Matrix.length-1;
        while(c>=0 && r < Matrix.length ){
            if(Matrix [r][c] == target){
                return new int[]{r,c};
            }
            if (Matrix[r][c] < target){
                r++;
        }else{
            c--;
      }}
        return new int[]{-1 ,-1};
  }
}
