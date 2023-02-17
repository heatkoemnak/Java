
public class instance{

    int square(int x){
        return x*x;
    }
    public static void main(String[] args){
        int x=5;
        instance obj = new instance();
        System.out.println("square of "+x+" is :"+obj.square(5));
    }
}