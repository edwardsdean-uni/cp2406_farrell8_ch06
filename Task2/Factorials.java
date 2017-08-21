

public class Factorials {
    public static void main(String[] args){
        for(int num = 1; num <= 10; num++){
            System.out.println(factorial(num));
        }
    }

    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
}
