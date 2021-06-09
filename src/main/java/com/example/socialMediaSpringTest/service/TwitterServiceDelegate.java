package com.example.socialMediaSpringTest.service;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Service qui s'occupe de la gestion de twitter
 * utilisation de la librairie twitter4j qui est connecté à l'API Twitter
 * On recupere notamment la fonction updateStatus de la librairie qui va nous permettre de poster un tweet sur son compte
 * TODO : Il faut que l'utilisateur post sur son propre compte et pas le mien ... et ce sans qu'il ai forcément de compte twitterDev
 */
public class TwitterServiceDelegate {


    private Twitter twitter;

    public TwitterServiceDelegate()
    {
        this.twitter = TwitterFactory.getSingleton();
    }

    public void postTweet(String message) throws TwitterException {

        // fonction de la librairie twitter4j pour poster un tweet
        // attention pas de doublon
        twitter.updateStatus(message);

    }

    public List<String> tweetAccueil() throws TwitterException {

        Twitter twitter = TwitterFactory.getSingleton();

        List<String> lesTweets = new ArrayList<>();
        List<Status> statuses = twitter.getHomeTimeline();

        System.out.println("Showing home timeLine");
        for (Status status : statuses) {
//            System.out.println(status.getUser().getName() + ":" + status.getText());
            lesTweets.add("Nom de l'user : " + status.getUser().getName() + " Tweet : " + status.getText() );
        }

        return lesTweets;
    }

}
