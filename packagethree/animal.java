package packagethree;
abstract class monkey{
   abstract void jump();
    abstract void bite();
    }

    
    interface basicanimal{
        void eat ();
        void sleep();
    }
    class human extends monkey implements basicanimal{
        void jump(){
            System.out.println("jumping!!");
        }
        public void eat (){
            System.out.println("eating");
        }
        public void sleep(){
            System.out.println("sleeping");

        }
        void bite(){
            System.out.println("biting");
        }
    }
    public class animal{
        public static void main (String args[]){
        human aa = new human();
        aa.sleep();
        aa.eat();
        aa.bite();
        aa.jump();
        }
    }

