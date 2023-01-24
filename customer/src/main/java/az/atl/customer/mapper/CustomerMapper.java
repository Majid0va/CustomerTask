package az.atl.customer.mapper;

import az.atl.customer.dto.CustomerDto;
import az.atl.customer.model.Customers;
import az.atl.customer.request.CustomerRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {
    CustomerMapper MAPPER = Mappers.getMapper(CustomerMapper.class);

    CustomerDto entityToDto(Customers customer);

    Customers requestToModel(CustomerRequest customerRequest);


}