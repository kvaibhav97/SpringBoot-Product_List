package com.project.vaibhav.productlist.service;

import com.project.vaibhav.productlist.dto.CategoryDTO;
import com.project.vaibhav.productlist.entity.Category;
import com.project.vaibhav.productlist.mapper.CategoryMapper;
import com.project.vaibhav.productlist.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryService {

    private CategoryRepository categoryRepository;
    // create category
    public CategoryDTO createCategory(CategoryDTO categoryDTO){
        Category category = CategoryMapper.toCategoryEntity(categoryDTO);
        category = categoryRepository.save(category);
        return CategoryMapper.toCategoryDTO(category);
    }

    // get all category
    // get category by id
    // delete category

}
