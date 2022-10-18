package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {

        User user = new User(request.getParameter("userName"), request.getParameter("userPassword"));
        ModelAndView mv = new ModelAndView();
        mv.addObject("userName", user.getUserName());
        mv.setViewName("display");
        return mv;
    }

}