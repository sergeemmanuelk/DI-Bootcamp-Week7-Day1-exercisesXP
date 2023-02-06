public class Computer {
    private String brand;
    private String processor;
    private int memory;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    Computer(String brand, String processor, int memory) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
    }

    public void printSpecs() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Processor: " + this.processor);
        System.out.println("Memory: " + this.memory + "GB");
    }

    public void start() {
        System.out.println("Computer is starting up...");
    }
}

