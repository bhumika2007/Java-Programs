import java.util.ArrayList;
//boolean java.util.ArrayList.removeAll;

public class car {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("volvo");
        cars.add("ford");
        cars.add("thar");
        cars.add("BMW");
        System.out.println(cars.get(0));
        System.out.println(cars.size());
        for (String car : cars) {
            System.out.println(car);
        }
        cars.remove("ford");
        cars.remove(0);
        System.out.println(cars);
        ArrayList<String> cycle = new ArrayList<String>();
        cycle.add("tyre");
        cycle.add("brake");
        cycle.removeIf(element -> element.equals("brake"));
        for (String cycleItem : cycle) {
            System.out.println(cycleItem);
        }
        // boolean changed = ArrayList.removeAll(cycle);
        // if (changed)
        // System.out.println("Collection removed");
        // else
        // System.out.println("Collection not removed");

        // Print the final Stack
        // System.out.println("Final Array: " + ArrayList);
    }
}
