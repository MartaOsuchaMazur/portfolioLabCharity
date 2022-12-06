package pl.coderslab.charity.Services;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.Repository.InstitutionRepository;
import pl.coderslab.charity.entity.Institution;

import java.util.List;

@Service
public class JpaInstitutionService implements InstitutionService{
    private final InstitutionRepository institutionRepository;

    public JpaInstitutionService(InstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }
    @Override
    public List<Institution> getInstitutions() {
        return institutionRepository.findAll();
    }
}
