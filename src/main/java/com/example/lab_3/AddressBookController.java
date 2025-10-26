package com.example.lab_3;

import com.example.lab_3.AddressBook;
import com.example.lab_3.AddressRepository;
import com.example.lab_3.BuddyInfo;
import com.example.lab_3.BuddyRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class AddressBookController {

    private final AddressRepository addressBookRepository;
    private final BuddyRepository buddyRepository;

    // Constructor-based dependency injection
    public AddressBookController(AddressRepository addressBookRepository, BuddyRepository buddyRepository) {
        this.addressBookRepository = addressBookRepository;
        this.buddyRepository = buddyRepository;
    }

    // List all address books
    @GetMapping("/addressbooks")
    public String getAllAddressBooks(Model model) {
        Iterable<AddressBook> addressBooks = addressBookRepository.findAll(); // Get all address books
        model.addAttribute("addressBooks", addressBooks); // Add them to the model
        return "addressbooks"; // Render Thymeleaf template `addressbooks.html`
    }

    // Show a single address book with its buddies
    @GetMapping("/addressbook")
    public String getAddressBook(@RequestParam Long id, Model model) {
        Optional<AddressBook> optionalAddressBook = addressBookRepository.findById(id); // Find address book by ID
        if (optionalAddressBook.isPresent()) {
            model.addAttribute("addressBook", optionalAddressBook.get());
            return "addressbook"; // Render Thymeleaf template `addressbook.html`
        }
        return "redirect:/addressbooks"; // Redirect to address books list if not found
    }

    // Create a new address book
    @PostMapping("/addressbooks/new")
    public String createAddressBook(@RequestParam String name) {
        AddressBook newAddressBook = new AddressBook();
        newAddressBook.setName(name);
        addressBookRepository.save(newAddressBook); // Save to database
        return "redirect:/addressbooks"; // Redirect back to address books page
    }

    // Add a buddy to an address book
    @PostMapping("/addressbook/new")
    public String addBuddy(@RequestParam Long addressBookId, @RequestParam String name, @RequestParam String phoneNumber) {
        System.out.println(addressBookId);
        System.out.println(name);
        System.out.println(phoneNumber);
        Optional<AddressBook> optionalAddressBook = addressBookRepository.findById(addressBookId);
        if (optionalAddressBook.isPresent()) {
            AddressBook addressBook = optionalAddressBook.get();
            BuddyInfo buddyInfo = new BuddyInfo(name, phoneNumber);
            buddyInfo.setBook(addressBook);
            addressBook.addBuddy(buddyInfo); // Add buddy to the address book
            addressBookRepository.save(addressBook); // Save the updated address book
        }
        System.out.println(addressBookRepository.findById(addressBookId).get().getBuddies());
        return "redirect:/addressbook?id=" + addressBookId; // Redirect to the specific address book
    }

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "<a href=\"/addressbooks\"> to Address Books</a>"; // Redirect back to address books page
    }
}