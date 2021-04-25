import Martyr2.*;
import leetcode.SearchInsertPosition;

public class Main {
    public static void main(String[] args) {
/*        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000*/
        CostOfTile ct = new CostOfTile();

        System.out.println(ct.findCostOfTile(100,20,20,100,100));
    }

}
