package com.pegasus.backend.controller;

import com.pegasus.backend.model.Contact;
import com.pegasus.backend.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping
    public String submitContact(@RequestBody Contact contact) {
        contactRepository.save(contact);
        return "Contact form submitted successfully!";
    }
}
