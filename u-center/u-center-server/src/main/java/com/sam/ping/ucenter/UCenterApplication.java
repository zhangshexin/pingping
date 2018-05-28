package com.sam.ping.ucenter;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.List;


@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class UCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(UCenterApplication.class, args);
	}

    @Bean
    public DozerBeanMapper getMapper(@Value("dozer/dozer-mapping.xml") List<String> resources) {
        DozerBeanMapper mapper=new DozerBeanMapper(resources);
        return mapper;
    }

}
