import java.awt.*;

public class Car extends Vehicle{

    public Car(){};


    public Car( Color vehicleColor,
               int height, int width, int xPosition, int yPosition
               /*,int xSpeed, int ySpeed*/){

        this.setVehicleColor(vehicleColor);
        this.setHeight(height);
        this.setWidth(width);
        this.setxPosition(xPosition);
        this.setyPosition(yPosition);


        // not importing from super bc dont want to pass speed in constructor
        //super(vehicleColor, height, width, xPosition, yPosition /*,xSpeed, ySpeed*/);

    }


    @Override
    public void drawVehicle(Graphics g){

        // first set color of each car using setter.
        // drawing first car
        Color myColor = this.getVehicleColor();
        g.setColor(myColor);
        g.fillRect(getxPosition(),getyPosition(),getWidth(),getHeight());
        // formula
        int wheelSize = this.getWidth()/4;
        // get left wheel xPosition
        int leftWheelX = this.getxPosition()+ this.getWidth()/8;
        int leftWheelY = this.getyPosition() + (this.getHeight() - (wheelSize / 2));
        this.setVehicleColor(this.getVehicleColor());
        // creating wheels
        g.fillOval(leftWheelX,leftWheelY,wheelSize,wheelSize);

        int rightWheelX = leftWheelX + (this.getWidth()/2);
        int rightWheelY = leftWheelY;

        //drawing circles
        g.fillOval(rightWheelX, rightWheelY, wheelSize, wheelSize);

        // need to draw windshield
        g.setColor(getVehicleColor());
        int windShieldX = leftWheelX + (wheelSize/2);
        int windShieldY = this.getyPosition() - (this.getHeight()/2);
        int windShieldHeight = this.getHeight()/2;
        int windShieldWidth = this.getWidth()/2;


        g.drawRect(windShieldX, windShieldY, windShieldWidth, windShieldHeight);
        // drawing color and line of line in windshield
        int windShieldLineX = this.getxPosition()+(this.getWidth()/2);
        int windShieldLineY = this.getyPosition()+(this.getHeight()/2);
        int windShieldLineX2 = windShieldLineX;
        int windShieldLineY2 = this.getyPosition();
        g.setColor(Color.BLACK);
        g.drawLine(windShieldLineX, windShieldLineY, windShieldLineX2, windShieldLineY2);
    };
}
