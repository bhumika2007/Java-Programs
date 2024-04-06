package packagethree;
interface runnable{
    void run();
}
interface swimmable{
    void swim();
}
class animal implements runnable,swimmable{
    public void run (){
        System.out.println("animal is running...");
    }
    public void swim (){
        System.out.println("animal is swimming...");
    }
}
public class animal4{
    public static void main (String[] args){
        animal cc = new animal();
        cc.run();
        cc.swim();
    }
}