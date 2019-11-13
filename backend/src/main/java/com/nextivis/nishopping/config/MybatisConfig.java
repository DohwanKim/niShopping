package com.nextivis.nishopping.config;

import com.nextivis.nishopping.domain.entity.*;
import com.nextivis.nishopping.domain.repository.typehandler.*;
import org.apache.ibatis.type.*;
import org.mybatis.spring.boot.autoconfigure.*;
import org.springframework.context.annotation.*;

@Configuration
public class MybatisConfig {
    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        return configuration -> {
            TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();
            typeHandlerRegistry.register(User.GenderType.class, new CodeEnumTypeHandler<>(User.GenderType.class));
        };
    }
}
