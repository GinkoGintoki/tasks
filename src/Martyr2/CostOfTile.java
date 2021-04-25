package Martyr2;

public class CostOfTile {
    public double findCostOfTile(double cost, double heightOfTile,double widthOfTile,double heightOfFloor,double widthOfFloor){
        return (heightOfFloor*widthOfFloor*cost)/(widthOfTile*heightOfTile);
    }
}
