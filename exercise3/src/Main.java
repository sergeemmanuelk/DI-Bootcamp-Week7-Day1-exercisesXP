public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Tesla");
        car.setSpeed(100);
        System.out.println(car.getDetails("Roadster"));
    }
}