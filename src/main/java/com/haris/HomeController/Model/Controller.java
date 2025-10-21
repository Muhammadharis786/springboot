package com.haris.HomeController.Model;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@GetMapping ("home")

    public String home (HttpServletRequest request){
    System.out.println("Hello world");
        return "This is my home and my session id: "
                + request.getRequestedSessionId();
}


}
