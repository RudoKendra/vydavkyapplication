package sk.rudokendra.vydavkyapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import sk.rudokendra.vydavkyapplication.model.Vydavok;
import sk.rudokendra.vydavkyapplication.service.VydavokService;

@Controller
public class VydavkyController {

    @Autowired
    private VydavokService vydavokService;

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @GetMapping("/pridaj-novy-vydavok")
    public String pridaNovyVydavok(Model model) {
        Vydavok vydavokObjekt = new Vydavok();
        model.addAttribute("vydavokObjektThymeleaf", vydavokObjekt);
        return "pridaj-novy-vydavok";
    }

    @PostMapping("/uloz-novy-vydavok")
    public String ulozVydavok(@ModelAttribute("vydavokObjektThymeleaf") Vydavok vydavokObjekt) {
        vydavokService.ulozVydavok(vydavokObjekt);
        return "redirect:/"; // presmeruje na hlavnú stranku
    }

    @GetMapping("/zobraz-vsetky-vydavky")
    public String zobrazVsetkyVydavky(Model model) {
        model.addAttribute("zoznamVydavkyThymeleaf", vydavokService.zobrazVsetkyVydavky());
        return "zobraz-vsetky-vydavky";
    }

    @GetMapping("/uprav-vydavok/{id}")
    public String upravVydavok(@PathVariable(value = "id") long id, Model model) {
        Vydavok vytiahnutyVydavok = vydavokService.ziskajVydavokPodlaId(id);
        model.addAttribute("vytiahnutyVydavokThymeleaf", vytiahnutyVydavok);
        return "uprav-vydavok";
    }

    @GetMapping("/uloz-upraveny-vydavok")
    public String ulozUpravenyVydavok(@ModelAttribute("vytiahnutyVydavokThymeleaf") Vydavok vydavokObjekt) {
        vydavokService.ulozVydavok(vydavokObjekt);
        return "redirect:/";
    }

    @GetMapping("/vymaz-vydavok/{id}")
    public String vymazVydavok(@PathVariable(value = "id") long id, Model model) {
        vydavokService.ostranVydavok(id);
        return "redirect:/";
    }
    @GetMapping("/o-mne")
    public String oMne (){
        return "o-mne";
    }

}