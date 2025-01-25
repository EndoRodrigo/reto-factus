package com.endorodrigo.retofactus.controller;

import com.endorodrigo.retofactus.Service.CustomerService;
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
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public String getCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("customers", customerService.findAll());
        return "customer";
    }

    @PostMapping
    public String addCustomer(Customer customer, BindingResult result, Model model, RedirectAttributes redirect, SessionStatus status) {
        Customer user = customerService.save(customer);
        return "redirect:/customer";
    }
}
