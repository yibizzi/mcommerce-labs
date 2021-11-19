package com.mproduits.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("custom-configs")
@RefreshScope
public class ApplicationPropertiesConfig {
    private int limitProducts;

    public int getLimitProducts() {
        return limitProducts;
    }

    public void setLimitProducts(int limitProducts) {
        this.limitProducts = limitProducts;
    }
}
