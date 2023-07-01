package org.example.s.refactored;

public class VideoRefactored {
    private String title;
    private int time;
    private int likes;
    private int views;

    public VideoRefactored(String title, int time, int likes, int views) {
        this.title = title;
        this.time = time;
        this.likes = likes;
        this.views = views;
    }

    public double getNumberOfHoursPlayed(){
        return (time / 3600) * views;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
