package az.atl.customer.service;

import az.atl.customer.dto.CustomerDto;
import az.atl.customer.request.CustomerRequest;

import java.util.List;


public interface CustomerService {
    String create(CustomerRequest customerRequest);

    CustomerDto findById(Long id);

    List<CustomerDto> findAll();

}
