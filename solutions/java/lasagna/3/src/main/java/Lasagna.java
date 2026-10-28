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
    
}
