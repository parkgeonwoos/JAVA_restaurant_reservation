package eatgo.parkgeonwoo.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //컨트롤러를 만들기 위해서 필요한 어노테이션
public class WelcomeController {
    
    
    @GetMapping("/") //실행시 자동 실행이 되도록 하는 어노테이션
    public String hello(){
        return "Hello,world";
    }
}
