package com.app.transformer;

import com.app.dto.ProductDto;
import com.app.entity.Brand;
import com.app.entity.Product;

public class ProductTransformer {
	
	public static Product productDtoToProductEntity(ProductDto productDto) {
		
		Product product= new Product();
		
		product.setName(productDto.getName());
		product.setPrice(productDto.getPrice());
		product.setQty(productDto.getQty());
		
		Brand brand=BrandTransformer.brandDtoBrandEntity(productDto);
		product.setBrand(brand);
		return product;
		
		
		
	}

}
