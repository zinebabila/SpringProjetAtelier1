package com.example.SpringProjetAtelier1.validator;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

    @PostMapping("/register")
    public String registerUser(@Valid @ModelAttribute("userForm") UserForm userForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // Gérer les erreurs de validation ici
            return "register";
        }

        // Logique d'enregistrement de l'utilisateur
        return "success";}}

