package com.rahulbhaya.newsfromindia;

/**
 * Created by rahulbhaya on 9/24/17.
 */

public class learnLanguages {
    private String nameOfLang;
    private int imageID;


    public String getNameOfLang() {
        return nameOfLang;
    }

    public int getImageID() {
        return imageID;
    }

    public int getTutorialNumber() {
        return tutorialNumber;
    }

    public learnLanguages(String nameOfLang, int imageID, int tutorialNumber) {
        this.nameOfLang = nameOfLang;
        this.imageID = imageID;
        this.tutorialNumber = tutorialNumber;
    }

    private int tutorialNumber;

}
