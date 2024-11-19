package com.lowjungxuan.dreamshop.controllers;

import com.lowjungxuan.dreamshop.exceptions.ResourceNotFoundException;
import com.lowjungxuan.dreamshop.response.ApiResponse;
import com.lowjungxuan.dreamshop.service.order.IOrderService;
import lombok.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.prefix}/orders")
public class OrderController {
    private final IOrderService orderService;

    @PostMapping("/order")
    public ResponseEntity<ApiResponse> createOrder(@RequestParam Long userId) {
        try {
            return ResponseEntity.ok(new ApiResponse("Item Order Success!", orderService.convertToDto(orderService.placeOrder(userId))));
        } catch (Exception e) {
            return  ResponseEntity.status(INTERNAL_SERVER_ERROR).body(new ApiResponse("Error Occurred!", e.getMessage()));
        }
    }

    @GetMapping("/{orderId}/order")
    public ResponseEntity<ApiResponse> getOrderById(@PathVariable Long orderId) {
        try {
            return ResponseEntity.ok(new ApiResponse("Item Order Success!", orderService.getOrder(orderId)));
        } catch (ResourceNotFoundException e) {
            return  ResponseEntity.status(NOT_FOUND).body(new ApiResponse("Oops!", e.getMessage()));
        }
    }

    @GetMapping("/user/{userId}/order")
    public ResponseEntity<ApiResponse> getUserOrders(@PathVariable Long userId) {
        try {
            return ResponseEntity.ok(new ApiResponse("Item Order Success!", orderService.getUserOrders(userId)));
        } catch (ResourceNotFoundException e) {
            return  ResponseEntity.status(NOT_FOUND).body(new ApiResponse("Oops!", e.getMessage()));
        }
    }
}
