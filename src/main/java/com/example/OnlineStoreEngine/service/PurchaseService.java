package com.example.OnlineStoreEngine.service;


import com.example.OnlineStoreEngine.controller.dto.FinishPurchaseRequest;

public interface PurchaseService {

    Integer finishPurchase(FinishPurchaseRequest request);
}