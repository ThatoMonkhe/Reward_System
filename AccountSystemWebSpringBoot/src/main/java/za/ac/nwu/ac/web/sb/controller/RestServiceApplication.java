package za.ac.nwu.ac.web.sb.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@RestController
@EnableSwagger2

public class RestServiceApplication {
    public static void main(String[] args) {SpringApplication.run(RestServiceApplication.class, args);
    }
    @GetMapping
    public String hello()
    {
        return "hello world";
    }
}
