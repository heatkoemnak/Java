import java.util.Scanner;
//static method
class non_instance{
    static int square(int x){
        return x*x;

    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = in.nextInt();
        System.out.println("Sqaure of "+num+" is: "+square(num));
    }

}
