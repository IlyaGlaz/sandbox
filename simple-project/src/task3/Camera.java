package task3;

public class Camera extends Electronics {
    String cameraName;
    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Camera camera = new Camera();
        camera.setPrice(40);
        camera.displayPrice();
    }
}
