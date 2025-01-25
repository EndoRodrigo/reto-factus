package com.endorodrigo.retofactus.controller;

import com.endorodrigo.retofactus.Service.LoginService;
import com.endorodrigo.retofactus.model.Customer;
import com.endorodrigo.retofactus.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/login")
public class LoginController {

    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping
    public String form(Model model) {
        model.addAttribute("data", new Login());
        return "login";
    }

    @PostMapping
    public String getLoginService(Login user, BindingResult result, Model model, RedirectAttributes redirect, SessionStatus status) {
        String rs = loginService.login(user.getUsername(), user.getPassword());
        if (rs == null) {
            return "redirect:/login";
        }else{
            status.setComplete();
            //redirect.addFlashAttribute("success", message);
            return "home.html";
        }
    }
}
