package pl.coderslab.charity.Services;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.entity.Category;
import pl.coderslab.charity.entity.Donation;

import java.util.List;

@Service
public interface CategoryService {

    List<Category> getCategories();
    void addCategories(Category category);

}
