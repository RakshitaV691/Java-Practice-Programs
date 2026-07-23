import java.util.Scanner;

public class PalindromeNumber 
{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int num = sc.nextInt();
       int orig = num;
       int reverse = 0;
       while(num != 0){
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        num = num / 10;

       } 
       if(reverse == orig){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }
    }
    
}
