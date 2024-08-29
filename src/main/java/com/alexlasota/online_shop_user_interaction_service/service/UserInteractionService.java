package com.alexlasota.online_shop_user_interaction_service.service;

import com.alexlasota.online_shop_user_interaction_service.client.CartClient;
import com.alexlasota.online_shop_user_interaction_service.client.OrderClient;
import com.alexlasota.online_shop_user_interaction_service.client.ProductClient;
import com.alexlasota.online_shop_user_interaction_service.dto.CartDTO;
import com.alexlasota.online_shop_user_interaction_service.dto.CartItemDTO;
import com.alexlasota.online_shop_user_interaction_service.dto.OrderDTO;
import com.alexlasota.online_shop_user_interaction_service.dto.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserInteractionService {
    private final ProductClient productClient;
    private final CartClient cartClient;
    private final OrderClient orderClient;

    public List<ProductDTO> getAllProducts() {
        return productClient.getAllProducts();
    }

    public List<ProductDTO> getProductsByType(String type) {
        return productClient.getProductsByType(type);
    }

    public CartDTO createCart() {
        return cartClient.createCart();
    }

    public CartDTO addItemToCart(Long cartId, CartItemDTO itemDTO) {
        return cartClient.addItemToCart(cartId, itemDTO);
    }

    public OrderDTO createOrder(OrderDTO orderDTO) {
        return orderClient.createOrder(orderDTO);
    }

    public OrderDTO getOrderSummary(Long orderId) {
        return orderClient.getOrderById(orderId);
    }
}