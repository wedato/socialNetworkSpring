package com.example.socialMediaSpringTest;



import com.restfb.types.instagram.IgMedia;
import org.brunocvcunha.instagram4j.Instagram4j;
import org.brunocvcunha.instagram4j.requests.InstagramSearchUsernameRequest;
import org.brunocvcunha.instagram4j.requests.InstagramUploadPhotoRequest;
import org.brunocvcunha.instagram4j.requests.payload.InstagramSearchUsernameResult;
import twitter4j.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class instagramTest {

    public static void main(String[] args) throws TwitterException, IOException {




//
//        IgMedia igMedia = new IgMedia();
//
//        igMedia.setMediaUrl("https://c8.alamy.com/compfr/f67apn/oui-timbres-en-caoutchouc-rouge-sur-un-fond-blanc-f67apn.jpg");
//        System.out.println(igMedia);



//        Instagram4j instagram = Instagram4j.builder().username("wedatoo").password("").build();
//        instagram.setup();
//        instagram.login();
//        InstagramSearchUsernameResult usernameResult = instagram.sendRequest(new InstagramSearchUsernameRequest("wedatoo"));
////        System.out.println(usernameResult.getUser().biography);
////        System.out.println(usernameResult.getUser().username);
////        System.out.println(usernameResult.getUser().getFollower_count());
////

         // Get  suscribers
////        InstagramGetUserFollowersResult followerResult = instagram.sendRequest(
////                new InstagramGetUserFollowersRequest(usernameResult.getUser().getPk()));
////        for (InstagramUserSummary user : followerResult.getUsers()){
////            System.out.println(user.full_name + " " +  user.pk);
////        }


        // Follow Unfollow

//        InstagramSearchUsernameResult githubResult = instagram.sendRequest(new InstagramSearchUsernameRequest("github"));
////        instagram.sendRequest(new InstagramFollowRequest(githubResult.getUser().getPk()));
//        instagram.sendRequest(new InstagramUnfollowRequest(githubResult.getUser().getPk()));


        // Get post instagram of user
//        InstagramFeedResult postList = instagram.sendRequest(new InstagramUserFeedRequest(usernameResult.getUser().getPk()));
//        for (InstagramFeedItem post : postList.getItems()){
//            System.out.println(post.caption.getText());
//        }

//        instagram.sendRequest(new InstagramUploadPhotoRequest(new File("src/main/java/com/example/socialMediaSpringTest/test.jpg"), "test instagram api with java"));




    }
}
