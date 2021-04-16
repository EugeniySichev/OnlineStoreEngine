package com.example.OnlineStoreEngine.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Map;

@Data
public class FinishPurchaseRequest {

    @NotNull
    private Map<Integer, Integer> productIdProuctCount;
    @NotEmpty
    private String userName;
    private String userSurname;
    @NotEmpty
    private String email;
    @NotEmpty
    private String phone;
    private String address;
    private String comment;

}
