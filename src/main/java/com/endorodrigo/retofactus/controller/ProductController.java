package com.endorodrigo.retofactus.controller;

import com.endorodrigo.retofactus.Service.ItemService;
import com.endorodrigo.retofactus.model.Login;
import com.endorodrigo.retofactus.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/product")
public class ProductController {

    private final ItemService itemService;

    public ProductController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public String getProduct(Model model) {
        model.addAttribute("producto", new Product());
        model.addAttribute("allproducto", itemService.findAll());
        return "product";
    }

    @PostMapping
    public String addProduct(Product product, BindingResult result, Model model, RedirectAttributes redirect, SessionStatus status) {
        Product rs = itemService.save(product);
        return "redirect:/product";
    }
}
