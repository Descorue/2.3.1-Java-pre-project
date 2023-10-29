package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
public class UsersController {

    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String printUsers(ModelMap modelMap) {
        modelMap.addAttribute("usersList", userService.getAllUsers());
        return "users";
    }


    @GetMapping(value = "/create")
    public String create(ModelMap modelMap) {
        modelMap.addAttribute("user", new User());
        return "/create";
    }

    @PostMapping("/users")
    public String addUser(@ModelAttribute(value = "user") User user) {
        userService.add(user);
        return "redirect:/users";
    }

}

