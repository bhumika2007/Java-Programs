package packagethree;

interface monkeyactions {
    void eat();
}

class monkey implements monkeyactions {
    @Override
    public void eat() {
        System.out.println("eating bananas...");
    }
}

public class animal2 {
    public static void main(String[] args) {
        monkey aa = new monkey();
        aa.eat();
    }
}