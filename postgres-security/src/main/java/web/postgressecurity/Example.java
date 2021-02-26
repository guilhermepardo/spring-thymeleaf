package web.postgressecurity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {

    @RequestMapping("/")
    public String FirstPage() {
        return "We succeed. We are viewing our first page.";
    }
}
