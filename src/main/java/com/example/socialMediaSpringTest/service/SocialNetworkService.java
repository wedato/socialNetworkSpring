package com.example.socialMediaSpringTest.service;


import twitter4j.TwitterException;

import java.util.List;
import java.util.Map;

/**
 * Service qui va utiliser chaque differents services des réseaux sociaux afin de faire en sorte d'automatiser le post sur tout les réseaux en 1 clic
 * Twitter , Facebook , et Instagram sont à l'appel , via les librairies twitter4j , facebook4j , instagram4j
 */
public class SocialNetworkService {

    TwitterServiceDelegate twitterServiceDelegate;
    FacebookServiceDelegate facebookServiceDelegate;



    public SocialNetworkService() {
        this.twitterServiceDelegate = new TwitterServiceDelegate();
        this.facebookServiceDelegate = new FacebookServiceDelegate();

    }


    public void publierReseauxService(String message) throws TwitterException {

        twitterServiceDelegate.postTweet(message);
        facebookServiceDelegate.postOnAdminPageFb(message);
    }

    public List<String> tweetAccueil() throws TwitterException {
        return twitterServiceDelegate.tweetAccueil();
    }

    public List<String> feedFb() {
        return facebookServiceDelegate.feedFacebook();
    }


}
