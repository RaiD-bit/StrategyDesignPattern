package example.Strategy;

public class GoodsStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("goods capability");
    }
}
