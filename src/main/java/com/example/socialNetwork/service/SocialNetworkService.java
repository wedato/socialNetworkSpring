package com.example.socialNetwork.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import twitter4j.TwitterException;

import java.util.List;


@Service
public class SocialNetworkService {

    @Autowired
    TwitterServiceDelegate twitterServiceDelegate;
    @Autowired
    FacebookServiceDelegate facebookServiceDelegate;



    public void publierReseauxService(String message) throws TwitterException {

        twitterServiceDelegate.postTweet(message);
        facebookServiceDelegate.postOnAdminPageFb(message);
    }

    public List<String> tweetUser(String user) throws TwitterException {
        return twitterServiceDelegate.tweetUser(user);
    }

    public List<String> searchTweetLocation(String motclef){
        return twitterServiceDelegate.searchTweetLocation(motclef);
    }

    public List<String> feedFb() {
        return facebookServiceDelegate.feedFacebook();
    }


}
