class Laptop extends Computer {
    private int batteryLevel;
    private double screenSize;

    Laptop(String brand, String model, boolean powerStatus,
           String processor, int ram, int storage,
           int batteryLevel, double screenSize) {

        super(brand, model, powerStatus, processor, ram, storage);
        this.batteryLevel = batteryLevel;
        this.screenSize = screenSize;
    }
    void chargeBattery() {
        batteryLevel = 100;
        System.out.println("Battery charged to 100%");
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Battery: " + batteryLevel + "%");
        System.out.println("Screen Size: " + screenSize);
    }

    public String toString() {
        return "Laptop screen: " + screenSize;
    }

}

