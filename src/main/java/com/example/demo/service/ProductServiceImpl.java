package com.example.demo.service;

import com.example.demo.model.dto.ProductDto;
import com.example.demo.model.mapper.ProductMapper;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    private final static String PRODUCT_SAVED_MSG = "product added";

    private ProductMapper productMapper= new ProductMapper();

    @Override
    public String save(ProductDto productDto) {
        productRepository.save(productMapper.mapDtoToEntity(productDto));
        return PRODUCT_SAVED_MSG;
    }
}
