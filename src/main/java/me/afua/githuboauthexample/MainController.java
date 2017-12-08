package me.afua.githuboauthexample;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
@EnableOAuth2Sso
public class MainController {

    @RequestMapping("/")
    public  String showIndex(Principal p)
    {
        //This re-routes the user to the /loggedin route, because the callback url
        //from GitHub was looping eternally. Create a pull request if you find out how to fix it!
        //p should never return null, but just in case...
        if(p==null)
            return "index";
        else return "redirect:/loggedin";
    }


    @RequestMapping("/loggedin")
    public @ResponseBody String showLoggedIn(HttpServletRequest request, Principal p)
    {
        //Prints a message in the console so it can be read
        System.out.println("It actually does come back");
        //Can be edited to show the user's name when the index page is shown.
        return "index for <h2>"+p.getName()+"</h2>";
    }
}
