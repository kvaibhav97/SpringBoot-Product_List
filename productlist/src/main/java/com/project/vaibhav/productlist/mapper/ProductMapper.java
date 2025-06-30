package com.project.vaibhav.productlist.mapper;

import com.project.vaibhav.productlist.dto.ProductDTO;
import com.project.vaibhav.productlist.entity.Category;
import com.project.vaibhav.productlist.entity.Product;

public class ProductMapper {

    // convert entity to DTO
    public static ProductDTO toProductDTO(Product product){
        return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getCategory().getId()
        );
    }

    // convert DTO to entity
    public static Product toProductEntity(ProductDTO productDTO, Category category){
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setDescription(productDTO.getDescription());
        product.setCategory(category);
        return product;
    }
}
