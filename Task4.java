public class Task4{
    public static void main(String[]args){
        int x=1;
        int y=2;
        System.out.println("Before swap x:"+ x + "y:" +y);
        x= x+y;
        y= x-y;
        x= x-y;
        System .out.println("After swap x:"+ x + "y:" +y);
    }
}