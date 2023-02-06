public class Laptop extends Computer {
    double screenSize;

    Laptop(String brand, String processor, int memory, double screenSize) {
        super(brand, processor, memory);
        this.screenSize = screenSize;
    }

    public void printSpecs() {
        super.printSpecs();
        System.out.println("Screen size: " + this.screenSize + " inches");
    }

    public void closeLid() {
        System.out.println("Closing laptop lid...");
    }
}
