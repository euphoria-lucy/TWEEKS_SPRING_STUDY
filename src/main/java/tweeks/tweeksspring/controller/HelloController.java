package tweeks.tweeksspring.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HelloController {

    @GetMapping("hello") // 주소/hello로 접속
    @ModelAttribute("Hello")
    public String hello(Model model) {
        // addAttribute ("key", "value")
        model.addText("Hello");
        return "hello";
    }

}
