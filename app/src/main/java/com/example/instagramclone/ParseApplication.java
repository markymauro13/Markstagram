package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import java.io.PipedOutputStream;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

       // ParseObject.registerSubclass(Post.class); this line of code is not working. Post.class seems to be unrecognizeable
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("HCp9uApQ3sKsgkzYNGoRfXMhCYmXfVQPHInC06R9")
                .clientKey("HX9izNn7SbvMO4exFak6BWstYEEGbm1nSBUJyit8")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
