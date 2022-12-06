import java.awt.*;

public abstract class Vehicle {



    public Vehicle(){};
    private String make;
    private String model;



    private Color VehicleColor; // must import

    private int height;
    private int width;
    private int xPosition;
    private int yPosition;
    private int xSpeed;
    private int ySpeed;

    /*
    public Vehicle( Color vehicleColor,
                   int height, int width, int xPosition, int yPosition,
                   int xSpeed, int ySpeed) {
       // this.make = make;
        // this.model = model;
        VehicleColor = vehicleColor;
        this.height = height;
        this.width = width;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
*/
    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }


    public Color getVehicleColor() {
        return VehicleColor;
    }


    public int getHeight() {
        return height;
    }


    public int getWidth() {
        return width;
    }


    public int getxPosition() {
        return xPosition;
    }


    public int getyPosition() {
        return yPosition;
    }


    public int getxSpeed() {
        return xSpeed;
    }


    public int getySpeed() {
        return ySpeed;
    }





    // Setters
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setVehicleColor(Color vehicleColor) {
        VehicleColor = vehicleColor;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }
    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }


    public void drawVehicle(Graphics g){};

}
