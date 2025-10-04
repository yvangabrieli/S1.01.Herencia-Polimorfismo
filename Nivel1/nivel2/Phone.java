package nivel2;

public abstract class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toCall(int number) {
        String phoneNumber = String.format("%09d", number);
        System.out.println( "Calling " + phoneNumber);
        return phoneNumber;
    }
}
