public class Hangar {
    public static void main(String[] args) {
        Car clio = new Car("Renault", 33000);
        Boat family = new Boat("Family Boat", 777007);

        System.out.println(clio.doStuff());
        System.out.println(family.doStuff());
    }
}
