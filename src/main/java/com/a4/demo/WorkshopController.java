package com.a4.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



import jakarta.validation.Valid;

@Controller
public class WorkshopController {

	@Autowired
    private WorkshopRepo repository; // Injecting WorkshopRepo for database operations

    @GetMapping("/") // Loads the registration form
    public String showForm(Model model) {
        model.addAttribute("registration", new Workshop()); // Adds empty Workshop object
        return "registration"; // Returns registration.html
    }

    @PostMapping("/register") // Handles form submission
    public String register(@Valid @ModelAttribute("registration") Workshop registration, 
                           BindingResult result, Model model) {
        if (result.hasErrors()) return "registration"; // Reloads form if validation fails
        repository.save(registration); // Saves registration to DB
        return "redirect:/success"; // Redirects to success page
    }

    @GetMapping("/success") // Loads success page after registration
    public String showSuccess() {
        return "success"; // Returns success.html
    }
}
