package com.example.socialMediaSpringTest.service;

import com.restfb.*;
import com.restfb.types.GraphResponse;
import com.restfb.types.Post;
import com.restfb.types.User;
import com.restfb.types.instagram.IgMedia;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

public class FacebookServiceDelegate {




    private FacebookClient fbClient;
    private String accessToken;

    public FacebookServiceDelegate() {
        this.fbClient = new DefaultFacebookClient("EAAQixJ10kEYBAAJIA6BP8Ec3MzzWuafoCCTrwVSKEJwnPZAhpaySLdlqSdQtMelSeNM7n5sPwtHBt9Dz4YC4AhMNJYBDnttQDSJ5NQ5Nef3JM4pyFoHq6U1rdv1Wq5nz6VZBOLz8dj4XTw7AZCLR7GAcNLHoNljELnxKZAPOnsbbZAoDGx18mwn7cPMS1h5IzJ0MyGFcTIKdu7Fb0zBsCmUQXZB0xdZAu7M8WZBpzuhpGi2z18EZCBMnF", Version.VERSION_3_1 );
    }


    public List<String> feedFacebook(){
       fbClient = new DefaultFacebookClient("EAAQixJ10kEYBAAJIA6BP8Ec3MzzWuafoCCTrwVSKEJwnPZAhpaySLdlqSdQtMelSeNM7n5sPwtHBt9Dz4YC4AhMNJYBDnttQDSJ5NQ5Nef3JM4pyFoHq6U1rdv1Wq5nz6VZBOLz8dj4XTw7AZCLR7GAcNLHoNljELnxKZAPOnsbbZAoDGx18mwn7cPMS1h5IzJ0MyGFcTIKdu7Fb0zBsCmUQXZB0xdZAu7M8WZBpzuhpGi2z18EZCBMnF",Version.VERSION_3_1 );
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

        fbClient = new DefaultFacebookClient("EAAQixJ10kEYBAKpLuWrN8ds5gYYG0yHps5GRNeBNBNpcLu17Wx5ZAL7cICDQXPrnNZBWxYozG1ZA8lIzTZBNG0nGrYhz56bGOyne4CH4KvO9mMJ7V0lBwXzhEYrPgzSvIEVT6WnEvuRYbIF3YfMY2CJQl5uY2K55SfYjnqCxYA5M8NbseUH1Tno4PTyJ9sk5TmIS5x4ygsNk7bQkLdJQ",Version.VERSION_3_1 );

        GraphResponse publishMessageResponse =
                fbClient.publish("101193012199379/feed", GraphResponse.class,
                        Parameter.with("message", message));

        System.out.println("Published message ID: " + publishMessageResponse.getId());


    }


}


