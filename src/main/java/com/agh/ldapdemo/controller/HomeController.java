package com.agh.ldapdemo.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Welcome to the home page!";
    }

    @RequestMapping(value = "/logged", method = RequestMethod.GET)
    public String logged() {
        return "Welcome to the logged user page!";
    }

    @Secured("ROLE_MANAGERS")
    @RequestMapping(value = "/pageForManagers", method = RequestMethod.GET)
    public String pageForManagers() {
        return "Welcome to the page for managers!";
    }

}
