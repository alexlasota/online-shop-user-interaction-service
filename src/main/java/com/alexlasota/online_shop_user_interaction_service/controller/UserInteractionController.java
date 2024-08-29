package com.alexlasota.online_shop_user_interaction_service.controller;

import com.alexlasota.online_shop_user_interaction_service.dto.CartDTO;
import com.alexlasota.online_shop_user_interaction_service.dto.CartItemDTO;
import com.alexlasota.online_shop_user_interaction_service.dto.OrderDTO;
import com.alexlasota.online_shop_user_interaction_service.dto.ProductDTO;
import com.alexlasota.online_shop_user_interaction_service.service.UserInteractionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user-interaction")
@RequiredArgsConstructor
public class UserInteractionController {
    private final UserInteractionService userInteractionService;

    @GetMapping("/products")
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        return ResponseEntity.ok(userInteractionService.getAllProducts());
    }

    @GetMapping("/products/{type}")
    public ResponseEntity<List<ProductDTO>> getProductsByType(@PathVariable String type) {
        return ResponseEntity.ok(userInteractionService.getProductsByType(type));
    }

    @PostMapping("/cart")
    public ResponseEntity<CartDTO> createCart() {
        return ResponseEntity.status(HttpStatus.CREATED).body(userInteractionService.createCart());
    }

    @PostMapping("/cart/{cartId}/items")
    public ResponseEntity<CartDTO> addItemToCart(@PathVariable Long cartId, @RequestBody CartItemDTO itemDTO) {
        return ResponseEntity.ok(userInteractionService.addItemToCart(cartId, itemDTO));
    }

    @PostMapping("/orders")
    public ResponseEntity<OrderDTO> createOrder(@RequestBody OrderDTO orderDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userInteractionService.createOrder(orderDTO));
    }

    @GetMapping("/orders/{orderId}")
    public ResponseEntity<OrderDTO> getOrderSummary(@PathVariable Long orderId) {
        return ResponseEntity.ok(userInteractionService.getOrderSummary(orderId));
    }
}