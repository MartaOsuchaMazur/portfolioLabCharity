package pl.coderslab.charity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.charity.entity.Institution;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {

}
