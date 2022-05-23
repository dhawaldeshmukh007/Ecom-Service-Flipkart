package com.app.transformer;

import com.app.dto.ProductDto;
import com.app.entity.Brand;

public class BrandTransformer {
	
	
	public static  Brand brandDtoBrandEntity(ProductDto productDto) {
		
		Brand brand= new Brand();
		brand.setId(productDto.getBrandId());
		
		return brand;
		
		
		
		
	}
	
	
	

}
