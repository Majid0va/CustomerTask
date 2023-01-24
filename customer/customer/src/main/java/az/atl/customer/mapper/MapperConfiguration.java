package az.atl.customer.mapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class MapperConfiguration {

    @Bean
    public CustomerMapper customerMapper() {
        return CustomerMapper.MAPPER;
    }

}