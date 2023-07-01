package org.example.l.exampleone.refactored;

public class PremiumVideo extends Video {
    private int premiumId;

    @Override
    public void playRandomAdd() throws Exception {
        throw new Exception("" +
                "No Ads play during Premium Videos");
    }
}
