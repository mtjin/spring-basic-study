package mtjin.firstspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(Model model){
        System.out.println("Asdadsadasdasd");
        model.addAttribute("data", "헬로");
        return "hello";
    }
}
