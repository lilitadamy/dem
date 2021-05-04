package com.example.demo.model.mapper;

import com.example.demo.model.dto.ProductDto;
import com.example.demo.model.entity.Product;
import org.modelmapper.ModelMapper;

public class ProductMapper {
    ModelMapper modelMapper = new ModelMapper();

    public ProductDto mapEntityToDto(Product product) {
        return modelMapper.map(product, ProductDto.class);
    }

    public Product mapDtoToEntity(ProductDto productDto) {
        return modelMapper.map(productDto, Product.class);
    }
}
