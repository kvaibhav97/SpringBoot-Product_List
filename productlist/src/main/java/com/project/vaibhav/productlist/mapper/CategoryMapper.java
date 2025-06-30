package com.project.vaibhav.productlist.mapper;

import com.project.vaibhav.productlist.dto.CategoryDTO;
import com.project.vaibhav.productlist.entity.Category;

public class CategoryMapper {

    // convert entity to DTO
    public static CategoryDTO toCategoryDTO(Category category){
        if(category == null){
            return null;
        }
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        categoryDTO.setProducts(category.getProducts().stream()
                .map(ProductMapper::toProductDTO).toList());
        return categoryDTO;
    }

    // convert DTO to entity
    public static Category toCategoryEntity(CategoryDTO categoryDTO){
        Category category = new Category();
        category.setName(categoryDTO.getName());
        return category;
    }

}
