package com.sam.ping.ucenter.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.sam.ping.ucenter.dao")
public class MyBatisConfig {    
}