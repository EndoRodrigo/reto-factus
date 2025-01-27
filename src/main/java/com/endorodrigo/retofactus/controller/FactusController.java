package com.endorodrigo.retofactus.controller;

import com.endorodrigo.retofactus.Service.CustomerService;
import com.endorodrigo.retofactus.Service.ItemService;
import com.endorodrigo.retofactus.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/cart")
@Slf4j
public class FactusController {

    private final CustomerService customerService;
    private final ItemService itemService;
    private Factus factus = new Factus();

    public FactusController(CustomerService customerService, ItemService itemService) {
        this.customerService = customerService;
        this.itemService = itemService;
    }

    @GetMapping
    public String getInformaion(Model model) {
        model.addAttribute("consulta", new Consulta());
        model.addAttribute("crear", factus);
        log.info("Consulta informada GET {}", factus);
        return "cart";
    }

    @PostMapping
    public String addInformaion(Consulta consulta, Model model) {

        Optional<Customer> client = customerService.findByIdentification(consulta.getConsultCustomer());
        log.info(client.toString());
        client.ifPresent(factus::setCustomer);

        Optional<Items> product = itemService.findById(consulta.getConsultProduct());
        List<Items> items = new ArrayList<>();
        product.ifPresent(items::add);

        factus.setItems(items);
        log.info("Factura -> {}", factus.toString());

        return "redirect:/cart";
    }
}
