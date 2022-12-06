package pl.coderslab.charity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.Repository.DonationRepository;
import pl.coderslab.charity.Services.InstitutionService;


@Controller
public class HomeController {

    private final InstitutionService institutionService;
    private final DonationRepository donationRepository;


    public HomeController(InstitutionService institutionService, DonationRepository donationRepository) {
        this.institutionService = institutionService;
        this.donationRepository = donationRepository;

    }

    @RequestMapping("/")
    public String homeAction(Model model){
      model.addAttribute("institutions", institutionService.getInstitutions());
      model.addAttribute("totalQuantity", donationRepository.totalQuantity().orElse(0));
      model.addAttribute("totalDonation", donationRepository.count());
      return "index";
    }
}
