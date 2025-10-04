package nivel2;

public class Main {
    public static void main(String[] args) {
        Smartphone Samsung = new Smartphone("Samsung", "Galaxy");
        System.out.println("Brand: " + Samsung.getBrand() + "\nModel: " + Samsung.getModel());
        Samsung.alarm();
        Samsung.takePicture();
        Samsung.toCall(15340513);
    }
}
