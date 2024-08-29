package com.alexlasota.online_shop_user_interaction_service.dto;

import lombok.Data;

@Data
public class OrderAttributeDTO {
    private Long id;
    private String name;
    private String attributeValue;
}