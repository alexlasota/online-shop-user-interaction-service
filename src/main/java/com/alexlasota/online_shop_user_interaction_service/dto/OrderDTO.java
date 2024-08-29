package com.alexlasota.online_shop_user_interaction_service.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDTO {
    private Long id;
    private LocalDateTime orderDate;
    private OrderStatus status;
    private BigDecimal totalPrice;
    private Long userId;
    private List<OrderItemDTO> items;
    private List<OrderAttributeDTO> attributes;
}