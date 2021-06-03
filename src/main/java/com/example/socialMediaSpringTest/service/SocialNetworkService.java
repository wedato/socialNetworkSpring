package com.example.socialMediaSpringTest.service;


import twitter4j.TwitterException;

/**
 * Service qui va utiliser chaque differents services des réseaux sociaux afin de faire en sorte d'automatiser le post sur tout les réseaux en 1 clic
 * Twitter , Facebook , et Instagram sont à l'appel , via les librairies twitter4j , facebook4j , instagram4j
 */
public class SocialNetworkService {

    TwitterServiceDelegate twitterServiceDelegate;

    public SocialNetworkService() {
        this.twitterServiceDelegate = new TwitterServiceDelegate();
    }


    public void publierReseauxService(String message) throws TwitterException {

        twitterServiceDelegate.postTweet(message);
    }


}
