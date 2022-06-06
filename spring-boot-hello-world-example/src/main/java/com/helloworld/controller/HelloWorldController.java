package com.helloworld.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController 
{
@RequestMapping("/")
public String hello() 
{
return "<h1> Congratulations. Gemma! After much toil You have finally successfully deployed the sample Spring Boot Application. </h1><p> Next I will alter the workflow to go from a manual Git Action to automate deployment on Git Push</p><p><b> Testing Automation!!</p></b> ";
}
}
