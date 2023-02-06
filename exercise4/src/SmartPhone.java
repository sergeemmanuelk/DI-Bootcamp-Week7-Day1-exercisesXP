public class SmartPhone extends Computer {
    String operatingSystem;

    SmartPhone(String brand, String processor, int memory, String operatingSystem) {
        super(brand, processor, memory);
        this.operatingSystem = operatingSystem;
    }

    public void printSpecs() {
        super.printSpecs();
        System.out.println("Operating System: " + this.operatingSystem);
    }

    public void makeCall() {
        System.out.println("Ongoing call...");
    }
}
