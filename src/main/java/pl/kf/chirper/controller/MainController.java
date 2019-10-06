package pl.kf.chirper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.kf.chirper.model.user.User;
import pl.kf.chirper.service.UserService;

import javax.validation.Valid;

@Controller
public class MainController {

    UserService userService;

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("newUser", new User());
        return "index";
    }

    @RequestMapping(value = "/newUser", method = {RequestMethod.POST, RequestMethod.GET})
    public String saveUser(@Valid User newUser, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "/";
        }
        userService.createNewUser(newUser);
        return "redirect:/userAdded";
    }

    @GetMapping("/userAdded")
    public String userAdded(){
        return "userAdded";
    }
}
