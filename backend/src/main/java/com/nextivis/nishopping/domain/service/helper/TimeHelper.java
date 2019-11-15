package com.nextivis.nishopping.domain.service.helper;

import org.springframework.stereotype.*;

import java.time.*;

@Component
public class TimeHelper {
    public LocalDateTime now(){
        return LocalDateTime.now();
    }
}
