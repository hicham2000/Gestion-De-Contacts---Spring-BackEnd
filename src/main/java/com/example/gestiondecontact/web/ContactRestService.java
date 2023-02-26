package com.example.gestiondecontact.web;

import com.example.gestiondecontact.dao.ContactRepository;
import com.example.gestiondecontact.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class ContactRestService {
    @Autowired
    private ContactRepository contactRepository;

    @RequestMapping(value = "/contacts",method = RequestMethod.GET)
    public List<Contact> getContacts(){
        return contactRepository.findAll();
    }

    @RequestMapping(value = "/contacts",method = RequestMethod.POST)
    public Contact saveContact(@RequestBody Contact c){return contactRepository.save(c);}

    @RequestMapping(value = "/contacts/{id}", method = RequestMethod.GET)
    public Optional<Contact> getContact(@PathVariable int id){
        return contactRepository.findById(id);
    }
    @RequestMapping(value = "/chercherContact", method = RequestMethod.GET)
    public List<Contact> getContact(@RequestParam(name = "mc",defaultValue = "") String mc){
        return contactRepository.chercher("%"+mc+"%");
    }
@RequestMapping(value = "/contacts/{id}",method = RequestMethod.DELETE)
    public Boolean deleteContact(@PathVariable int id) {
        contactRepository.deleteById(id);
        return true;
    }

    @RequestMapping(value = "/contacts/{id}" , method = RequestMethod.PUT)
    public Contact saveContact(@PathVariable int id,@RequestBody Contact c){
        c.setId(id);
        return contactRepository.save(c);
    }

}
