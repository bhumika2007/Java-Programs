public class Rectangle {
    private double length;
    private double breadth;
    //Constructor having no parameters
    public Rectangle() {
        this.length=0;
        this.breadth=0;
    }
    //Constructor having two parameters
    public Rectangle(double length,double breadth) {
        this.length=length;
        this.breadth=breadth; 
} 
//Constructor having one parameters
    public Rectangle(double side) {
        this.length=side;
        this.breadth=side;
        }
        //Method to calculate the area 
        public double calculateArea() {
            return length*breadth;

        }
        public static void main (String args[]) 
        {
            Rectangle rectangle1=new Rectangle();
            Rectangle rectangle2=new Rectangle(5.0);
            Rectangle rectangle3=new Rectangle(4.0,7.0);
            System.out.println("Area of rectangle with no parameter:"+rectangle1.calculateArea() );
            System.out.println("Area of rectangle with one parameter:"+rectangle2.calculateArea() );
            System.out.println("Area of rectangle with two parameter:"+rectangle3.calculateArea() );
        }

        }