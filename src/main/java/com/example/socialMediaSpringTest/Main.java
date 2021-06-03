package com.example.socialMediaSpringTest;

import com.example.socialMediaSpringTest.controller.SocialNetworkController;
import twitter4j.TwitterException;

public class Main {


    public static void main(String[] args) throws TwitterException {

        SocialNetworkController socialNetworkController = new SocialNetworkController();
        socialNetworkController.publierReseaux("coucou from twitter4j");
    }
}
