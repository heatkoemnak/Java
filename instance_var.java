public class instance_var {
    int var =10;
    public static void main(String[] args){
        instance_var obj = new instance_var();
        obj.var =20;
        System.out.println(obj.var);
        System.out.println(obj.var);
    }
    
}
