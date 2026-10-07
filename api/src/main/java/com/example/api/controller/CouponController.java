package com.example.api.controller;

import com.example.api.dto.CouponRequestDTO;
import com.example.api.model.Coupon;
import com.example.api.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/coupon")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @PostMapping("/event/{eventId}")
    public ResponseEntity<Coupon> addCouponsToEvent(@PathVariable UUID eventId, @RequestBody CouponRequestDTO couponRequestDTO) {
        Coupon coupons = couponService.addCouponToEvent(eventId, couponRequestDTO);
        return ResponseEntity.ok(coupons);
    }
}