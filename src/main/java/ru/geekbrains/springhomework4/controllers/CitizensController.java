package ru.geekbrains.springhomework4.controllers;
import lombok.AllArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.geekbrains.springhomework4.model.Citizens;
import ru.geekbrains.springhomework4.service.CitizensService;

import java.util.List;

@Controller
@AllArgsConstructor
public class CitizensController {

    private final CitizensService citizensService;

    @GetMapping("/citizens")
    public String viewCitizens(Model model)
    {
        List<Citizens> citizens = citizensService.findAll();
        model.addAttribute("citizens",citizens);
        return "registrationform";
    }

    @PostMapping("/citizens")
    public String addCitizens(Citizens p,Model model)
    {
        citizensService.addCitizens(p);
        List<Citizens> citizens = citizensService.findAll();
        model.addAttribute("citizens",citizens);
        return "registrationform";
    }
}
