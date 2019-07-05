public class Hangar {
    public static void main(String[] args) {
        Boat barque = new Boat("Barque", 100);
        Car twingo = new Car("Twingo", 100);

        System.out.println(barque.doStuff());
        System.out.println(twingo.doStuff());
    }
}