package com.nextivis.nishopping.config;

import com.nextivis.nishopping.domain.entity.User;
import com.nextivis.nishopping.domain.repository.typehandler.CodeEnumTypeHandler;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
