package pl.coderslab.charity.Services;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.Repository.CategoryRepository;
import pl.coderslab.charity.entity.Category;

import java.util.List;

@Service
public class JpaCategoryService implements CategoryService{

    private final CategoryRepository categoryRepository;

    public JpaCategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public void addCategories(Category category) {
        categoryRepository.save(category);
    }
}
