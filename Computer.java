class Computer extends Device {

    private String processor;
    private int ram;
    private int storage;

    Computer(String brand, String model, boolean powerStatus,
             String processor, int ram, int storage) {

        super(brand, model, powerStatus);

        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    void showSpecs() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
    }

    int calculatePowerUsage() {
        int power = ram * 5;
        return power;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
    }

    public String toString() {
        return "Computer: " + processor;
    }

}
