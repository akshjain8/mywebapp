package mywebapp.mywebapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/Menu")
    public String Index(){
     return "index";
    }
}
