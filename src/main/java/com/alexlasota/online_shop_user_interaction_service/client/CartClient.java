package com.alexlasota.online_shop_user_interaction_service.client;

import com.alexlasota.online_shop_user_interaction_service.dto.CartDTO;
import com.alexlasota.online_shop_user_interaction_service.dto.CartItemDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "cart-service", url = "${cart-service.url}")
public interface CartClient {
    @PostMapping("/api/v1/carts")
    CartDTO createCart();

    @PostMapping("/api/v1/carts/{cartId}/items")
    CartDTO addItemToCart(@PathVariable Long cartId, @RequestBody CartItemDTO itemDTO);
}