package org.deloitte.telecom.controller;

import org.deloitte.telecom.dto.SessionData;
import org.deloitte.telecom.entities.Customer;
import org.deloitte.telecom.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HelloController {

    private IUserService service;

    public IUserService getService() {
        return service;
    }

    @Autowired
    public void setService(IUserService service) {
        this.service = service;
    }

    private SessionData sessionData;

    @Autowired
    public void setSessionData(SessionData data) {
        this.sessionData = data;

    }

    public SessionData getSessionData() {
        return sessionData;
    }


    @GetMapping("/userinput")
    public ModelAndView userInput() {
        System.out.println("inside userinput");
        return new ModelAndView("userinput");
    }

    @GetMapping("/logincheck")
    public RedirectView loginCheck(@RequestParam("id") int id,
                                   @RequestParam("password") String password) {

        boolean correct = service.credentialsCorrect(id, password);
        if (!correct) {
            return new RedirectView("/userinput");
        }
        Customer user = service.findUserById(id);
        sessionData.setUser(user);
        return new RedirectView("/home");
    }

    @GetMapping("/home")
    public Object home() {
        if (sessionData.getUser() == null) {
            return new RedirectView("/userinput");
        }
        Customer user = sessionData.getUser();
        ModelAndView mv = new ModelAndView("home", "user", user);
        return mv;
    }


}
