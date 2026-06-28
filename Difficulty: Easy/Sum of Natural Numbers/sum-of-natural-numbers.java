import java.util.Scanner;

class GFG {
    public static int sum_n(int n){
        if(n == 1 || n == 0)
            return n;
        return n + sum_n(n-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        System.out.println(sum_n(n));
    }
}