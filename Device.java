class Device {
    private String brand;
    private String model;
    private boolean powerStatus;

    Device(String brand, String model, boolean powerStatus) {
        this.brand = brand;
        this.model = model;
        this.powerStatus = powerStatus;
    }

    void powerOn() {
        powerStatus = true;
        System.out.println("Device turned ON");
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Power Status: " + powerStatus);
    }

    public String toString() {
        return brand + " " + model;
    }

}
