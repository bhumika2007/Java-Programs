package packagetwo;
import packageone.Classone;
public class classtwo 
{
    public static void main(String args[])
    { 
        Classone obj = new Classone();
        System.out.println("public variables from classone:"+obj.publicVariable);
      //  System.out.println("protected variables from classone:"+obj.protectedVariable);
       // System.out.println("private variables from classone:"+obj.getprivateVariable());
        obj.setprivateVariable(50);
       // System.out.println("updated private variablefrom classone:"+obj.privateVariable());
    }
}