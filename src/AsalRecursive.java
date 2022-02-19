import java.util.Scanner;

public class AsalRecursive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number Enter:");
        int n= scan.nextInt();
        System.out.println(isPrime(n,2)?"Prime Number":"Not A Prime Number");
    }
    static boolean isPrime(int number,int i){
        if(i>=number){
            return true;
        }
        if(number%i==0){
            return false;
        }
        else return isPrime(number,i+1);
    }
}