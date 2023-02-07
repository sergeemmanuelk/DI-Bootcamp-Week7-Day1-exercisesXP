public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Lenovo", "Core i5", 8, 14);
        laptop.printSpecs();
        laptop.start();
        laptop.closeLid();

        System.out.println("***************");

        SmartPhone phone = new SmartPhone("Iphone 13", "A15 Bionic chip" , 8, "iOS");
        phone.printSpecs();
        phone.makeCall();
    }
}