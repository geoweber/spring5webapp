package guru.springframework.spring5webapp.controllers;


import guru.springframework.spring5webapp.repositories.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class PublisherController {

    private final PublisherRepository publisherRepository;


    @GetMapping("/publishers")
    public String publishers(Model model){

        model.addAttribute("publishers", publisherRepository.findAll());

        return  "publishers";
    }

}
