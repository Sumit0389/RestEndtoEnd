package sumit.rest.RestEndtoEnd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String  printMessage()
    {
      return "Welcome to my Page///Added by Sumit/" ;
    }

    @GetMapping("/home/{id}")
    public String  printMessage(@PathVariable int id)
    {
        return "Welcome to my Page" +id;
    }
}
