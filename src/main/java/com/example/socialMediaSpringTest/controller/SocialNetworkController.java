package com.example.socialMediaSpringTest.controller;

import com.example.socialMediaSpringTest.service.SocialNetworkService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import twitter4j.TwitterException;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping("/api/socialNetwork")
public class SocialNetworkController {

    SocialNetworkService socialNetworkService;




    public SocialNetworkController() {
        this.socialNetworkService = new SocialNetworkService();
    }


    @GetMapping("/")
    public String test()  {

        return "pages/home";
    }

    @GetMapping("/fb")
    @ResponseBody
    public List<String> feed() {
            return socialNetworkService.feedFb();
    }







    @GetMapping("/publier")
    public String publierReseaux(HttpServletRequest request) throws TwitterException {
        String message = request.getParameter("message");
        socialNetworkService.publierReseauxService(message);
        return "pages/home";
    }


    @GetMapping("/homeTweets")
    @ResponseBody
    public List<String> home() throws TwitterException {

       return socialNetworkService.tweetAccueil();
    }

}
