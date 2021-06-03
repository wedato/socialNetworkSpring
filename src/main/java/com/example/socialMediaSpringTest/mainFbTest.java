package com.example.socialMediaSpringTest;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Version;
import com.restfb.types.User;
import facebook4j.*;
import facebook4j.conf.ConfigurationBuilder;

public class mainFbTest {

    public static void main(String[] args) throws FacebookException {


//        String accessToken = "EAANdgZC1aeGwBAD9GX6WFz0NQHnuiCbrwCpwOM8tFH8sgo6rkaSpZBYaPdpj6WZAuAsyeg4n8GGfNOOpZAGZC0CSuNOBhpUZA2zgqdlBu9Ig816vBDo66WH7hgbmx4Bynm4FIyNrXVEMZA6Epf80RZBzNWBzh1cZCyuYUhtRwuUxAaBF2QJLAAYNsYoakWQ62ZAZAJIZAcZAhT5SrrFEmOo4nyAQovZAZAmXbOwHL8SIbqIDNsIyMUtBj97AD2p";
//
//        ConfigurationBuilder cb = new ConfigurationBuilder();
//        cb.setDebugEnabled(true)
//                .setOAuthAppId("947246402795628")
//                .setOAuthAppSecret("a219f43c33f2d5f9a37acd1f744e7df6")
//                .setOAuthAccessToken(accessToken)
//                .setOAuthPermissions("page_read_user_content");
//
//        FacebookFactory ff = new FacebookFactory(cb.build());
//        Facebook facebook = ff.getInstance();
//
//        ResponseList<Post> feed = facebook.getFeed("eclipse.org");

    String accessToken = "EAANdgZC1aeGwBAHP11cp33qF7g8cLY7PXlPE9ZBVV48JWjcMxbEKNXlWGPzSPudSijjYCym1QZCbt0orroao7jpMeXToeB1g76ZBxPHtIkfu124IZAchljRJpxaXrNdNINsJGLSaQlp9KJHc3WN0ZAwgty5Xrt93lYXoFGXM3aRWeZBA1wsCfr0TVXQ7K7ZBPyZA2OfoaUHHZAFvhJYXXsLkqMOZCgf0a8l6aSs8reZAQmKijbey7Ncjo8Dm";
        FacebookClient fbClient = new DefaultFacebookClient(accessToken, Version.VERSION_3_1);
        User me = fbClient.fetchObject("me" , User.class);
        System.out.println(me.getName());
       

    }
}
