package org.example;

public class Main {
    public static void main(String[] args) {
        SearchAll searchAll = new SearchAll();
        searchAll.search();
        searchAll.message();

        SearchImage searchImage = new SearchImage();
        searchImage.search();
        searchAll.message();

        SearchVideo searchVideo = new SearchVideo();
        searchVideo.search();
        searchImage.message();
    }
}