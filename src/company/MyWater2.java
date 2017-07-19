package company;

public class MyWater2 {

    public static int BIG_BOTTLE = 2;
    public static int MID_BOTTLE = 1;
    public  double SMALL_BOTTLE = 0.5;

    private int countBig;
    private int countMid;
    private int countSmall;


    public  MyWater2() {
    }
        public void addLargeBottles(int n){
            countBig += n;

        }
        public void addMiddleBottles(int n){
            countMid += n;

        }
        public void addSmallBottles(int n){
            countSmall += n;

        }
    public double getSizeOfAll(){
            return countBig * BIG_BOTTLE + countMid * MID_BOTTLE + countSmall * SMALL_BOTTLE;

    }
    public void show(){
        System.out.println(" Pojemnosc all" + getSizeOfAll());
        System.out.println(" Ilosc małych" + countSmall);
        System.out.println(" Ilosc srednich" + countMid);
        System.out.println(" Ilosc duzych" + countBig);
    }

    }



