package company;

public class Main {
    public static void main(String[] args) {
        MyWater2 myWater2 = new MyWater2();

        myWater2.addLargeBottles(10);
        myWater2.addLargeBottles(2);

        myWater2.addMiddleBottles(2);
        myWater2.addSmallBottles(20);
        myWater2.getSizeOfAll();

    }


}
