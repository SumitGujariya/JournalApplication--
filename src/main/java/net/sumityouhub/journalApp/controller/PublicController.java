package net.sumityouhub.journalApp.controller;

import net.sumityouhub.journalApp.entity.User;
import net.sumityouhub.journalApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class PublicController {

    @Autowired
    private UserService userService;

    @GetMapping("/health-check")
    public String healthCheck() {
        return "Okayy";
    }

    @PostMapping("/create-user")
    public void createUser(@RequestBody User user) {
        userService.saveNewUser(user);
    }

}
