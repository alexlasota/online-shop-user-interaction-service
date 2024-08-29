package com.alexlasota.online_shop_user_interaction_service.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class CartDTO {
    private Long id;
    private LocalDateTime createdAt;
    private BigDecimal totalPrice;
    private List<CartItemDTO> items;
}