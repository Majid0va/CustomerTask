package az.atl.customer.service.impl;


import az.atl.customer.dto.CustomerDto;
import az.atl.customer.exception.CustomerAlreadyExistsException;
import az.atl.customer.exception.CustomerNotFoundException;
import az.atl.customer.mapper.CustomerMapper;
import az.atl.customer.repository.CustomerRepo;
import az.atl.customer.request.CustomerRequest;
import az.atl.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepo customerRepo;
    private final CustomerMapper customerMapper;

    @Override
    public String create(CustomerRequest customerRequest) {
        try {
            customerRepo.save(customerMapper.requestToModel(customerRequest));
            return "Customer was created successfully.";
        } catch (Exception e) {
            log.error("Exception caught");
            e.printStackTrace();
            throw new CustomerAlreadyExistsException("Customer already exists!");
        }
    }

    @Override
    public CustomerDto findById(Long id) {
        var customer = customerRepo.findById(id);
        if (customer.isPresent()) {
            return customerMapper.entityToDto(customer.get());
        } else {
            throw new CustomerNotFoundException("No customer present with id= " + id);
        }
    }

    @Override
    public List<CustomerDto> findAll() {
        var customers = customerRepo.findAll();
        return customers.stream().map(customerMapper::entityToDto).collect(Collectors.toList());
    }
}