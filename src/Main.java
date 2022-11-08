import example.GoodsVehicle;
import example.OffRoadVehicle;
import example.SportVehicle;

public class Main {
    public static void main(String[] args) {
        SportVehicle bmw = new SportVehicle();
        OffRoadVehicle gclass = new OffRoadVehicle();
        bmw.drive();
        gclass.drive();
    }
}