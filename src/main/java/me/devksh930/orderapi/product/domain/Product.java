package me.devksh930.orderapi.product.domain;

import lombok.Builder;
import lombok.NoArgsConstructor;
import me.devksh930.orderapi.common.BaseTimeEntity;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Product extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Embedded
    private ProductName productName;


    @Builder
    public Product(final String productName) {
        this.productName = new ProductName(productName);
    }

    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName.getProductName();
    }
}
