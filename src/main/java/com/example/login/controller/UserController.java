package com.example.login.controller;

import com.example.login.Service.UserDao;
import com.example.login.model.LogIn;
import com.example.login.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/home")
public class UserController {
 @GetMapping("")
    public ModelAndView home(){
     ModelAndView modelAndView = new ModelAndView("home","login",new LogIn());
     //modelAndView.addObject("login",new LogIn());
     return modelAndView;
 }
 @PostMapping("/login")
    public ModelAndView view(@ModelAttribute("LogIn") LogIn logIn){
      User user=UserDao.checkLogIn(logIn);
   if(user ==null){
       ModelAndView modelAndView =new ModelAndView("error");
       return modelAndView;
   }
   else {
       ModelAndView modelAndView= new ModelAndView("view");
       modelAndView.addObject("user",user);
       return modelAndView;
   }


 }
}
