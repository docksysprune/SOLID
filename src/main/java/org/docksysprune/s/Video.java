package org.docksysprune.s;

import java.sql.SQLException;

public class Video {
    private String title;
    private int time;
    private int likes;
    private int views;

    public double getNumberOfHoursPlayed(){
        return (time / 3600) * views;
    }

    public void persist() throws SQLException {
        /*
        * Logics for persisting info using JDBC...
        * */
    }
}
