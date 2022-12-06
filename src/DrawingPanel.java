import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;

public class DrawingPanel extends Panel {

    private ArrayList<Vehicle> vehicles; //= new ArrayList<Vehicle>();


    // constructor
    public DrawingPanel(){

        vehicles = new ArrayList<Vehicle>();

        // creating array list to add cars


        // xPosition and yPosition are the initial positions where objects appear on the screen
        // height and width is the size of the car
        Car car1 = new Car(Color.RED, 70, 200,100, 80);
        Car car2 = new Car(Color.BLUE, 90, 100,300, 90);
        Car car3 = new Car(Color.GREEN, 20, 150,70, 100);
        Car car4 = new Car(Color.BLACK, 90, 160,400, 1800);

        // adding cars to the vehicle arrayList
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(car3);
        vehicles.add(car4);

        // define main component where we loop over the vhicles and for each one we draw




    }



}
