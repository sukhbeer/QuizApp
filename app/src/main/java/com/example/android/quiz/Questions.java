package com.example.android.quiz;


class Questions {

    String mQuestions[] ={
            " What was the first phone released that ran the Android OS?",
            " What operating system is used as the base of the Android stack?",
            " What does the .apk extension stand for?",
            " Which of these are not one of the three main components of the APK?",
            " Which one is not a nickname of a version of Andriod??",
            " Which Android version had the greatest share of the market as of January 2011?",
            " When developing for the Android OS, Java byte code is compiled into what?",
            " Android is licensed under which open source licensing license?",
            " When did Google purchase Android ?",
    };


    private String mChoices[][]= new String[][]{
            {"T-Mobile G1", "Google gPhone", "HTC Hero", "Motorola Droid"},
            {"Linux", "Java", "Windows", "XML"},
            {"Application Package", "Application Program Kit", "Android Proprietary Kit", "Android Package"},
            {"Webkit", "Native Libraries", "Resources", " Dalvik Executable"},
            {"Honeycomb", "Muffin", "Gingerbread", "cupcake"},
            {"1.1", "1.5", "2.3", "3.4"},
            {"C source code", "Dalvik byte code", "Dalvik application code", "Java source code"},
            {"Gnu's GPL", "OSS", "Apache/MIT", "Sourceforge"},
            {"2003", "2004", "2005", "2006"},

    };
    private String mCorrectAnswers[]={"T-Mobile G1","Linux","Android Package","Webkit","Muffin","1.5","Dalvik byte code","Apache/MIT","2005"};

    String getQuestion(int a){
        return mQuestions[a];
    }

     String getChoice1(int a){
        return mChoices[a][0];
    }

     String getChoice2(int a){
        return mChoices[a][1];
    }

     String getChoice3(int a){
         return mChoices[a][2];
    }

    String getChoice4(int a){
        return mChoices[a][3];
    }

     String getCorrectAnswer(int a){
         return mCorrectAnswers[a];
    }
}
