package audreyhu.donedone.data;

import java.util.ArrayList;

public class Notes_Data_Generation {

    public static ArrayList<Note_Content> getData(){

        ArrayList<Note_Content> data = new ArrayList<>();

        String [] testTitles = {"Title 1", "Title 2", "Title 3" ,"Title 4", "Title 5"};
        String [] testOverviews = {"* Aptitude Test: 30 multi-choice questions",
                "* Programming questions: 20 multi-choice/ code gaps questions",
                "Overview 3" ,
                "* Programming Exercise #1: 25 minutes",
                "Overview 5"};

        for(int i=0; i<testOverviews.length; i++){

            data.add(new Note_Content(testTitles[i], testOverviews[i]));
        }
        return data;
    }



}
