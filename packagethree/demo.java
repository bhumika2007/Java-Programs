package packagethree;
abstract class pen1{
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen1{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
}
void changenib(){
    System.out.println("change the nib");
}
}
public class demo{
public static void main(String args[]){
    fountainpen aa=new fountainpen();
    aa.changenib();
    aa.refill();
    }

}

    
    
    
    
    

