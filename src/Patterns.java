import java.util.regex.Pattern;

public class Patterns {
    public static void main(String[]args){
        Pattern8(5);
    }
    // Pattern 1
    /*static  void pattern1(int n ){
        for (int i = 1; i <=n; i++) {
            // run for each rows
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();}*/
    // Pattern 2
   /* static  void Pattern2(int n){
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=n; j++) {
                System.out.print("*");
            }
            System.out.println();}*/

    //Pattern 3
   /* static void Pattern3(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=n-i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();}*/
    //Pattern 4
    /*static void Pattern4(int n) {
    for (int i =0;i <= n;i++) {
        for (int j = 1; j <=i; j++) {
            System.out.print(j);}
        System.out.println();}*/

    // Pattern 5

/*static void Pattern5(int n){
    for (int i = 0; i <= 2 * n; i++) {
        int  totalCIR = i > n ? 2 *n - i  : i;
        for (int j = 0; j <totalCIR; j++) {
              System.out.print("*");
        }
        System.out.println();}*/

    // Pattern 6
    /*static void Pattern6(int n){
        for (int i = 0; i < 2 * n; i++) {
            int totalCIR = i > n ? 2 * n -i:i;
             int NoOfSpaces = n - totalCIR;
            for (int s = 0; s < NoOfSpaces ; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totalCIR; j++) {
                System.out.print("* ");}
                System.out.println();}*/

    // Pattern 7
    /*static void Pattern7(int n){
        for (int i = 0; i <=n ; i++) {
           // int S = 0;
            for (int S = 0; S <n-i; S++) {
                System.out.print("  ");}
            for (int j = i; j >=1; j--) {
                System.out.print(j + " "); }
            for (int j = 2; j <=i; j++) {
               System.out.print(j + " ");}
               System.out.println();}*/

    //Pattern 8
    static void Pattern8(int n) {
        int originalN = n;
        n = 2 * n;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int atEveryIndex = originalN - Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }}


