package com.crud.tokobangunan.delivery.rest;

import com.crud.tokobangunan.model.DataSupplier;
import com.crud.tokobangunan.repository.DataBarangRepository;
import com.crud.tokobangunan.repository.DataSupplierRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class SupplierController {
    private final DataSupplierRepository dataSupplierRepository;

    @Autowired
    public SupplierController(DataSupplierRepository dataSupplierRepository) {
        this.dataSupplierRepository = dataSupplierRepository;
    }

    @GetMapping("/supplier")
    public String supplier(Model model) {
        String title_web = "List Supplier";
        model.addAttribute("title_web", title_web);
        model.addAttribute("items", dataSupplierRepository.getAllDataSupplier()); //samakan di repositorynya
        return "supplier";
    }
}
