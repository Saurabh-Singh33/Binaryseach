import java.util.regex.Pattern;

public class Patterns {
    public static void main(String[]args){
        Pattern5(9);
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
static void Pattern5(int n){
    for (int i = 0; i <= n; i++) {
        for (int j = 0; j <=n-i-1; j++) {
              System.out.print("*");
        }
        System.out.println();
    }
    }}
