package az.atl.customer.config;

import az.atl.customer.mapper.CustomerMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class MapperConfiguration {

    @Bean
    public CustomerMapper customerMapper() {
        return CustomerMapper.MAPPER;
    }

}
