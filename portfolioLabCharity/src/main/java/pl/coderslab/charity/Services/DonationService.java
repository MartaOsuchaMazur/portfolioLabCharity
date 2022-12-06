package pl.coderslab.charity.Services;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.entity.Donation;

@Service
public interface DonationService {

    void addDonation(Donation donation);
}
