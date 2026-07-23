public class FibonacciSeries 
{
    public static void main(String[] args) {
        int n = 8;
        int num1 = 0;
        int num2 = 1;

        System.out.print(num1 + " " + num2 + " ");
        for(int i=1; i <= n-2; i++){
            int result = num1 + num2;
            System.out.print(result + " ");
            num1 = num2;
            num2 = result;
        }

    }
    
}
