package com.example.socialMediaSpringTest;

import lombok.val;
import twitter4j.*;

public class maintest {

    public static void main(String[] args) throws TwitterException {








//        val tweet4u = TwitterFactory.getSingleton();
        Twitter twitter = TwitterFactory.getSingleton();
        twitter.updateStatus("t4j test1");

//         Post un tweet
//        twitter.updateStatus("Test twitter4j ereraare");

        // Recuperer les dernier tweet de mon accueil

//        List<Status> statuses = tweet4u.getHomeTimeline();
//        System.out.println("Showing home timeLine");
//        for (Status status : statuses) {
//            System.out.println(status.getUser().getName() + ":" + status.getText());
//        }

        // Envoyer et recevoir des messages , ne marche pas

//        DirectMessage message = tweet4u.sendDirectMessage("Mediavenir","test from twitter4j");
//        System.out.println("Sent : " + message.getText() + " to @" + message.getRecipientScreenName());

        // Rechercher des Tweets 1ere tentative

//        Query query = new Query("source:twitter4j wedato");
//        QueryResult result = tweet4u.search(query);
//        for (Status status : result.getTweets()) {
//            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
//        }

//        //Rechercher des Tweets
//
//        List<Status> tweets = Collections.emptyList();
//        Query query = new Query("booba");
//        query.setCount(100);
//
//        try {
//            QueryResult queryResult = tweet4u.search(query);
//            tweets = queryResult.getTweets();
//        } catch (TwitterException e) {}
//
//     for(Status status: tweets){
//         String text = status.getText();
//         System.out.println(text);
//     }






    }
}
