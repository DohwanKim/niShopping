package com.nextivis.nishopping.domain.service.helper;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RandomHelper {
    public String getUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
