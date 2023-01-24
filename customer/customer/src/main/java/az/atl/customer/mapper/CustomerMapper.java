package az.atl.customer.mapper;

import az.atl.customer.dto.CustomerDto;
import az.atl.customer.model.Customer;
import az.atl.customer.request.CustomerRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {
    CustomerMapper MAPPER = Mappers.getMapper(CustomerMapper.class);

    CustomerDto entityToDto(Customer customer);

    Customer requestToModel(CustomerRequest customerRequest);


}
