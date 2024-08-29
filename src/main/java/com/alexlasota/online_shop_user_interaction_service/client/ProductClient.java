package com.alexlasota.online_shop_user_interaction_service.client;

import com.alexlasota.online_shop_user_interaction_service.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "product-service", url = "${product-service.url}")
public interface ProductClient {
    @GetMapping("/api/products")
    List<ProductDTO> getAllProducts();

    @GetMapping("/api/products/type/{type}")
    List<ProductDTO> getProductsByType(@PathVariable String type);
}
