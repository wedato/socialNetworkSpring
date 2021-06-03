package com.example.socialMediaSpringTest.controller;

import com.example.socialMediaSpringTest.service.SocialNetworkService;
import twitter4j.TwitterException;

public class SocialNetworkController {

    SocialNetworkService socialNetworkService;



    public SocialNetworkController() {
        this.socialNetworkService = new SocialNetworkService();
    }

    public void publierReseaux(String message) throws TwitterException {
        socialNetworkService.publierReseauxService(message);
    }


}
