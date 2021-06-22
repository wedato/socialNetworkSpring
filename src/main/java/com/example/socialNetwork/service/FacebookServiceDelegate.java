package com.example.socialNetwork.service;

import com.restfb.*;
import com.restfb.types.GraphResponse;
import com.restfb.types.Post;
import com.restfb.types.User;
import com.restfb.types.instagram.IgMedia;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacebookServiceDelegate {



    private FacebookClient fbClient;
    private String accessToken;

    public FacebookServiceDelegate() {
        this.fbClient = new DefaultFacebookClient("EAAQixJ10kEYBAMwWD8rYjpEm4y1WZCEqh0G5XJtRydXjJeKi3ZCpuDbHZAR5H2dnpwFTK1mkoAWdM2BExZB6xAJOizLNUN309zDXTVEoIAxf7kCuZC4NqsZCzri5D5povHpFe2ZAapHAIC3YdLXe42I2Rrsbbm3cuZAG4xhmyiKyArkgxTu53l6Y164986TAZCJvX8Cp2trGrWpF2ZCykZCvkcC", Version.VERSION_3_1 );
    }


    public List<String> feedFacebook(){
       fbClient = new DefaultFacebookClient("EAAQixJ10kEYBAMwWD8rYjpEm4y1WZCEqh0G5XJtRydXjJeKi3ZCpuDbHZAR5H2dnpwFTK1mkoAWdM2BExZB6xAJOizLNUN309zDXTVEoIAxf7kCuZC4NqsZCzri5D5povHpFe2ZAapHAIC3YdLXe42I2Rrsbbm3cuZAG4xhmyiKyArkgxTu53l6Y164986TAZCJvX8Cp2trGrWpF2ZCykZCvkcC",Version.VERSION_3_1 );
        List<String> feed = new ArrayList<>();
        Connection<Post> result = fbClient.fetchConnection("me/feed",Post.class);

        for (List<Post> page : result){
            for (Post aPost : page){
                feed.add("Id du post : " + aPost.getId() + "Message du post : " + aPost.getMessage() );
            }
        }
        return  feed;
    }

    public void postOnAdminPageFb(String message){

        fbClient = new DefaultFacebookClient("EAAQixJ10kEYBAMwWD8rYjpEm4y1WZCEqh0G5XJtRydXjJeKi3ZCpuDbHZAR5H2dnpwFTK1mkoAWdM2BExZB6xAJOizLNUN309zDXTVEoIAxf7kCuZC4NqsZCzri5D5povHpFe2ZAapHAIC3YdLXe42I2Rrsbbm3cuZAG4xhmyiKyArkgxTu53l6Y164986TAZCJvX8Cp2trGrWpF2ZCykZCvkcC",Version.VERSION_3_1 );

        GraphResponse publishMessageResponse =
                fbClient.publish("101193012199379/feed", GraphResponse.class,
                        Parameter.with("message", message));

        System.out.println("Published message ID: " + publishMessageResponse.getId());


    }


}


