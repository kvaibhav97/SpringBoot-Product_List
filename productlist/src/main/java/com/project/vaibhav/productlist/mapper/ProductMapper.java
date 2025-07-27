package com.project.vaibhav.productlist.mapper;

import com.project.vaibhav.productlist.dto.ProductDTO;
import com.project.vaibhav.productlist.entity.Category;
import com.project.vaibhav.productlist.entity.Product;

public class ProductMapper {

    // Convert ProductDTO to ProductEntity
    public static Product toProductEntity(ProductDTO productDTO, Category category){
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setCategory(category);
        return product;
    }

    // Convert ProductEntity to ProductDTO
    public static ProductDTO toProductDTO(Product product){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setDescription(product.getDescription());
        productDTO.setPrice(product.getPrice());
        productDTO.setCategoryId(product.getCategory().getId());
        return productDTO;
    }

}
