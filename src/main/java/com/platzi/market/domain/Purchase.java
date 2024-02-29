package com.platzi.market.domain;

import java.time.LocalDateTime;

import java.util.List;

import lombok.Data;

@Data
public class Purchase {
    
    private int purchaseId;
    private String clientId;
    private LocalDateTime date;
    private String paymentMethod;
    private String comment;
    private String state;
    private List<PurchaseItem> items;
}
