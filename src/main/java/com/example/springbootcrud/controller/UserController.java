package com.example.springbootcrud.controller;

import com.example.springbootcrud.entity.User;
import com.example.springbootcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showAllUsers(Model model) {
        model.addAttribute(userService.findAllUsers());
        return "list_users";
    }

    @GetMapping("/add")
    public String addNewUser(User user) {
        return "edit_page";
    }

    @PostMapping("/save")
    public String saveOrUpdate(User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/edit{id}")
    public String editUser(@PathVariable Long id, Model model) {
        model.addAttribute(userService.findUser(id));
        return "edit_page";
    }

    @GetMapping("/delete{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "redirect:/";
    }
}
