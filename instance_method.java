
public class instance_method{

    int square(int x){
        return x*x;
    }
    public static void main(String[] args){
        int x=5;
        instance_method obj = new instance_method();
        System.out.println("square of "+x+" is :"+obj.square(5));
    }
}