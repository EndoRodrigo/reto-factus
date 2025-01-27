package com.endorodrigo.retofactus.controller;

import com.endorodrigo.retofactus.Service.CustomerService;
import com.endorodrigo.retofactus.Service.ItemService;
import com.endorodrigo.retofactus.model.Consulta;
import com.endorodrigo.retofactus.model.Customer;
import com.endorodrigo.retofactus.model.Factus;
import com.endorodrigo.retofactus.model.Items;
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
    private Factus factus;

    public FactusController(CustomerService customerService, ItemService itemService) {
        this.customerService = customerService;
        this.itemService = itemService;
        this.factus = new Factus();
    }

    @GetMapping
    public String getInformaion(Model model) {
        model.addAttribute("consulta", new Consulta());
        model.addAttribute("crear", factus);
        return "cart";
    }

    @PostMapping
    public String addInformaion(Consulta consulta, Model model) {

        Optional<Customer> client = customerService.findByIdentification(consulta.getConsultCustomer());
        log.info(client.toString());
        client.ifPresent(factus::setCustomer);

        Optional<Items> products = itemService.findById(consulta.getConsultProduct());
        List<Items> items = new ArrayList<>();
        products.ifPresent(items::add);

        factus.setItems(items);
        log.info(" Factura -> {}",factus.toString());

        return "cart";
    }
}
