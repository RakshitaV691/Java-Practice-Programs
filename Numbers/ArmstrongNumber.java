public class ArmstrongNumber 
{
    public static void main(String[] args) {
        int n = 153;
        int original = n;
        int sum = 0;
        int count = 0;
         
        while(n != 0){
            n = n / 10;
            count++;

        }
        n = original;
        while (n != 0) {
            int digit = n % 10;
            sum = sum + (int)Math.pow(digit, count);
            n = n / 10;
        }
        if(sum == original){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }



    }
    
}
