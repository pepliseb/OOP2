

public class MyWater {
        private int largeBottle;
        private int mediumBottle;
        private int SmallBottle;

        public static double LARGE_BOTTLE = 2.0;
        public static double MEDIUM_BOTTLE = 1.0;
        public static double SMALL_BOTTLE = 0.5;

    public void addLarge(int n) {
        this.largeBottle += n;
    }

    public void addMedium(int n) {
        this.largeBottle += n;
    }

    public void addSmall(int n) {
        this.largeBottle += n;
    }

    public int getLargeBottle() {
        return largeBottle;
    }

    public static void setLargeBottle(double largeBottle) {
        LARGE_BOTTLE = largeBottle;
    }

    public void setLargeBottle(int largeBottle) {
        this.largeBottle = largeBottle;
    }

    public int getMediumBottle() {
        return mediumBottle;
    }

    public static void setMediumBottle(double mediumBottle) {
        MEDIUM_BOTTLE = mediumBottle;
    }

    public void setMediumBottle(int mediumBottle) {
        this.mediumBottle = mediumBottle;
    }

    public int getSmallBottle() {
        return SmallBottle;
    }

    public static void setSmallBottle(double smallBottle) {
        SMALL_BOTTLE = smallBottle;
    }

    public void setSmallBottle(int smallBottle) {
        SmallBottle = smallBottle;
    }
}


