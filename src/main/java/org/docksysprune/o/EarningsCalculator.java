package org.docksysprune.o;

public class EarningsCalculator {

    public double calculateEarnings(Video video){
        return switch (video.getCategory()){
            case GAMING -> calculateGamingEarnings(video);
            case EDUCATIONAL -> calculateEducationalEarnings(video);
            case ENTERTAINMENT -> calculateEntertainmentEarnings(video);
        };
    }

    private double calculateEntertainmentEarnings(Video video) {
        return 0.00;
    }

    private double calculateEducationalEarnings(Video video) {
        return 0.00;
    }

    private double calculateGamingEarnings(Video video) {
        return 0.00;
    }
}
