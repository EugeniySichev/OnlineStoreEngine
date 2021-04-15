package com.example.OnlineStoreEngine.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "order_table")
@Entity
@Data
public class OrderEntity extends BaseEntity{

    @Column
    private String comment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "purchase_item_id")
    private PurchaseItemEntity purchaseItemEntity;
}
