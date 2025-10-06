package com.example.lab_3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class buddyController {

    @GetMapping("/buddies")
    public String buddy(@RequestParam(name="name", required=false, defaultValue="test") String name, Model model) {
        model.addAttribute("buddies", name);
        return "buddy";
    }

}