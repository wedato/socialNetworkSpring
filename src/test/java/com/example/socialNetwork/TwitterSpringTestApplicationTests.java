package com.example.socialNetwork;

import org.springframework.boot.test.context.SpringBootTest;
import twitter4j.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class TwitterSpringTestApplicationTests {

    public static void main(String[] args) throws TwitterException {

        Twitter twitter = TwitterFactory.getSingleton();
        List<String> lesTweets = new ArrayList<>();
//        String handle = "test";
            String motclef = "test";

        Query query = new Query(motclef);
        // nombre de tweet max que l'on veut
        query.setCount(100);
        // La geoLocation de Saint Jean de Braye que l'on peut retrouvé via l'url de googleMap , dans un rayon de 50 km autour de ce point
        query.setGeoCode(new GeoLocation(47.905523,1.9797664),50,Query.KILOMETERS);
        query.setSince("2021-06-20");

        try {
            QueryResult result = twitter.search(query);
            int counter = 0;
            System.out.println("Count : " + result.getTweets().size());
            for (Status tweet: result.getTweets())
            {
                counter++;
                System.out.println("Tweet #" + counter + " : @ " +tweet.getUser().getName() + "tweeted \"" + tweet.getText() + "\"");
                lesTweets.add("Tweet #" + counter + " : @ " + tweet.getUser().getName() + "tweeted \"" + tweet.getText() + "\"");
            }
        }catch (TwitterException e)
        {
            e.printStackTrace();
        }
        System.out.println(lesTweets);




//        Twitter twitter = TwitterFactory.getSingleton();
//
//        String motclef = "test";
//
//        List<String> lesTweets = new ArrayList<>();
//        Query query = new Query(motclef);
//        // nombre de tweet max que l'on veut
//        query.setCount(100);
//        // La geoLocation de Saint Jean de Braye que l'on peut retrouvé via l'url de googleMap , dans un rayon de 50 km autour de ce point
//        query.setGeoCode(new GeoLocation(47.905523,1.9797664),50,Query.KILOMETERS);
//        // depuis cette date
//        query.setSince("2021,06,20");
//
//        System.out.println(query.getQuery());
//        try {
//
//            QueryResult result = twitter.search(query);
//            int counter = 0;
//            for (Status tweet : result.getTweets())
//            {
//
//                counter++;
//                System.out.println("Tweet #" + counter + " : @ " +tweet.getUser().getName() + "tweeted \"" + tweet.getText() + "\"");
//                lesTweets.add("Tweet #" + counter + " : @ " + tweet.getUser().getName() + "tweeted \"" + tweet.getText() + "\"");
//            }
//        }catch (TwitterException e) {
//            e.printStackTrace();
//        }
    }
}
