package ru.code4fun.demo.springsecuritykerberos;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

import static java.util.Optional.ofNullable;

/**
 * Created by: Denis Timofeev
 * Date: 15.07.2019
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "Hello " + ofNullable(SecurityContextHolder.getContext().getAuthentication())
                .map(Principal::getName)
                .orElse("Anonymous");
    }

    @GetMapping("/profile")
    public String profile() {
        return "Profile page. User is authenticated? " + SecurityContextHolder.getContext().getAuthentication().isAuthenticated();
    }
}
