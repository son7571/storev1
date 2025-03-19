package com.metacoding.storev1.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller // IoC(제어의 역전) => HashSet
public class StoreController {

    @GetMapping("/")
    public String list() {
        return "store/list";
    }

    @GetMapping("/store/save-form")
    public String saveForm() {
        return "store/save-form";
    }

    @GetMapping("/store/{id}")
    public String detail(@PathVariable("id") int id) {
        return "store/detail";
    }

    @GetMapping("/store/{id}/update-form")
    public String updateForm(@PathVariable("id") int id) {
        return "store/update-form";
    }

    @PostMapping("/store/{id}/delete")
    public String delete(@PathVariable("id") int id) {
        return "redirect:/";
    }

    @PostMapping("/store/save")
    public String save() {
        return "redirect:/";
    }

    @PostMapping("/store/update")
    public String update() {
        return "redirect:/";
    }
}
