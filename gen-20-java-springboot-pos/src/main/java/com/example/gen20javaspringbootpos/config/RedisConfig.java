package com.example.gen20javaspringbootpos.config;

import com.example.gen20javaspringbootpos.dto.CategoryDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<String, CategoryDTO> redisTemplate(RedisConnectionFactory connectionFactory) {
        RedisTemplate<String, CategoryDTO> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(connectionFactory);
        // Serializer untuk key Redis (String)
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        // Serializer untuk value Redis (CategoryDTO)
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(CategoryDTO.class));
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }
}
