package com.example.socialNetwork.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import twitter4j.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class TwitterServiceDelegate {


    private Twitter twitter;

    public TwitterServiceDelegate()
    {
        this.twitter = TwitterFactory.getSingleton();
    }

    public void postTweet(String message) throws TwitterException {

        twitter.updateStatus(message);

    }

    public List<String> tweetUser(String user) throws TwitterException {

        Twitter twitter = TwitterFactory.getSingleton();

        List<String> lesTweets = new ArrayList<>();
        List<Status> statuses = twitter.getUserTimeline(user);

        for (Status status : statuses) {

            lesTweets.add("@" + status.getUser().getName() + " Tweeted : " + status.getText() );
        }

        return lesTweets;
    }

    public List<String> searchTweetLocation(String motclef){
        Twitter twitter = TwitterFactory.getSingleton();

        List<String> lesTweets = new ArrayList<>();
        Query query = new Query(motclef);
        // nombre de tweet max que l'on veut
        query.setCount(100);
        // La geoLocation de Saint Jean de Braye que l'on peut retrouvé via l'url de googleMap , dans un rayon de 50 km autour de ce point
        query.setGeoCode(new GeoLocation(47.905523,1.9797664),50,Query.KILOMETERS);
        // depuis cette date
        query.setSince("2021-06-20");

        try {

            QueryResult result = twitter.search(query);
            int counter = 0;
            for (Status tweet : result.getTweets())
            {

                counter++;
                System.out.println("Tweet #" + counter + " : @ " +tweet.getUser().getName() + "tweeted \"" + tweet.getText() + "\"");
                lesTweets.add("Tweet #" + counter + " : @ " + tweet.getUser().getName() + "tweeted \"" + tweet.getText() + "\"");
            }
        }catch (TwitterException e) {
            e.printStackTrace();
        }
            return lesTweets;
    }


}
