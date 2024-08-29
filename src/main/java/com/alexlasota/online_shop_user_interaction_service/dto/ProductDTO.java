package com.alexlasota.online_shop_user_interaction_service.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private BigDecimal basePrice;
    private BigDecimal finalPrice;
    private String type;
    private Set<ProductAttributeDTO> attributes = new HashSet<>();
}