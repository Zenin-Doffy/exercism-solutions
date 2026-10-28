public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven( int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return 2 * numberOfLayers;
    }
    
    public int totalTimeInMinutes(int numberOfLayersAdded, int minutesInOven ) {
    return preparationTimeInMinutes(numberOfLayersAdded) + minutesInOven;
    }
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();

        System.out.println(lasagna.remainingMinutesInOven(20));
        System.out.println(lasagna.preparationTimeInMinutes(3));
        System.out.println(lasagna.totalTimeInMinutes(3, 20));
    }
}
