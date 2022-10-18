package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("/")
//    public ModelAndView welcome() {
//    	
//        ApplicationContext context = new AnnotationConfigApplicationContext(User.class);
//        User user = context.getBean("user", User.class);
//
//        ModelAndView mv=new ModelAndView();
//        mv.addObject("name", user.getName());
//      
//        return mv;        
//    	
//    }
    public ModelAndView welcome() {
    	System.out.println("fired");   	
    	
      ApplicationContext context = new AnnotationConfigApplicationContext(User.class);
      User user = context.getBean("user", User.class);

      ModelAndView mv=new ModelAndView();
      mv.addObject("name", user.getName());
      mv.setViewName("index");
    
      return mv; 
    }

}