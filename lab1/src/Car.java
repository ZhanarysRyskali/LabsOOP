public class Car {
    enum Color{
        Red,
        Green,
        Blue,
        Violet,
        Metallic;
    }
    static private String engine;
    private String brand;
    final private String wheels = "SemiSlick";
    double volume;
    private int max_speed;
    static private Color color;

    public Car(){
    }
    public void Car(String brand) {
        this.brand = brand;
    }
    public void Car(String brand, String engine, Color color) {
        this.brand = brand;
        Car.engine = engine;
        Car.color = color;
    }
    public void setDetail(String brand){
        this.brand = brand;
    }
    public void setDetail(double volume){
        this.volume = volume;
    }
    public void setDetail(Color color){
        Car.color = color;
    }
    public void setEngine(String engine){
        Car.engine = engine;
    }
    {
        max_speed = 240;
    }
    static {
        System.out.println("Static Initialization Block activated");
    }
    public void showDetails(){
        System.out.println("Car's brand is " + this.brand);
        System.out.println("Car's engine is " + this.engine);
        System.out.println("Car's volume is " + this.volume);
        System.out.println("Car's wheels are " + this.wheels);
        System.out.println("Car's max speed is " + this.max_speed);
        System.out.println("Car's color is " + this.color);
    }
}
