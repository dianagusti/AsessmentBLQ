package com.crud.tokobangunan.delivery.rest;

import com.crud.tokobangunan.model.DataBarang;
import com.crud.tokobangunan.repository.DataBarangRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Slf4j
@Controller
public class CrudController {

    private final DataBarangRepository dataBarangRepository;

    @Autowired
    public CrudController(DataBarangRepository dataBarangRepository) {
        this.dataBarangRepository = dataBarangRepository;
    }

    @GetMapping("/list-barang")
    public String index(Model model) {
        String title_web = "List Barang";
        model.addAttribute("title_web", title_web);
        model.addAttribute("items", dataBarangRepository.getAllDataBarang());
        return "list-barang";
    }

    @GetMapping("/insert-barang")
    public String addPersonForm(Model model) {
        String title_web = "Insert Barang";
        model.addAttribute("title_web", title_web);
        model.addAttribute("barang", new DataBarang());
        return "insert-barang";
    }

    @PostMapping("/insert-barang")
    public String addPerson(@ModelAttribute DataBarang dataBarang) {
        dataBarangRepository.insertDataBarang(dataBarang);
        return "redirect:/list-barang";
    }

    @GetMapping("/edit-barang/{id}")
    public String editPersonForm(@PathVariable String id, Model model) {
        String title_web = "Edit Barang";
        model.addAttribute("title_web", title_web);
        DataBarang dataBarang = dataBarangRepository.findDataBarangBySeqId(id);
        model.addAttribute("barang", dataBarang);
        return "edit-barang";
    }

    @PostMapping("/edit-barang/{id}")
    public String editPerson(@PathVariable String id, @ModelAttribute DataBarang dataBarang) {
        DataBarang dataBarangBySeqId = dataBarangRepository.findDataBarangBySeqId(id);
        if (dataBarangBySeqId != null) {
            dataBarangRepository.updateDataBarang(dataBarang);
        }
        return "redirect:/list-barang";
    }

    @GetMapping("/delete-barang/{id}")
    public String deleteBarang(@PathVariable String id, Model model) {
        model.addAttribute("seqId", id);
        return "confirm-delete";
    }

    @PostMapping("/delete-barang/{id}")
    public String confirmDelete(@PathVariable String id, RedirectAttributes redirectAttributes) {
        dataBarangRepository.deleteDataBarangBySeqId(id);
        redirectAttributes.addFlashAttribute("deleteSuccess", "Barang berhasil dihapus.");
        return "redirect:/list-barang";
    }




//    @PostMapping("/delete-barang/{id}")
//    public String confirmDelete(@PathVariable String id, RedirectAttributes redirectAttributes) {
//        dataBarangRepository.deleteDataBarangBySeqId(id);
//        redirectAttributes.addFlashAttribute("deleteSuccess", "Barang berhasil dihapus.");
//        return "redirect:/list-barang";
//    }
}