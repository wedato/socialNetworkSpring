package com.example.socialNetwork.controller;

import com.example.socialNetwork.service.SocialNetworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import twitter4j.TwitterException;

import java.util.List;


@Controller
@RequestMapping("/api/socialNetwork")
public class SocialNetworkController {

    @Autowired
    SocialNetworkService socialNetworkService;


    @GetMapping("/")
    public String test() {

        return "pages/home";
    }

    @GetMapping("/fb")
    @ResponseBody
    public List<String> feed() {
        return socialNetworkService.feedFb();
    }


    @GetMapping("/publier")
    @ResponseBody
    public List<String> publierReseaux(@RequestParam String message) throws TwitterException {
        socialNetworkService.publierReseauxService(message);
        return tweetUser("wedato_");
    }


    /*
       On recupere l'user en paramètre dans l'URI Path ,  exemple /tweetUser?user=
     */
    @GetMapping("/tweetUser")
    @ResponseBody
    public List<String> tweetUser(@RequestParam String user) throws TwitterException {

        return socialNetworkService.tweetUser(user);
    }

    @GetMapping("/searchTweetLocation")
    @ResponseBody
    public List<String> searchTweetLocation(@RequestParam String motclef) {

        return socialNetworkService.searchTweetLocation(motclef);

    }
}
