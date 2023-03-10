package az.atl.customer.request;

import az.atl.customer.annotation.ValidPinCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {
    @NotNull(message = "Name cannot be null")
    @Size(min = 2, max = 30)
    private String name;
    @NotNull(message = "Surname cannot be null")
    private String surname;
    @NotNull(message = "Age cannot be null")
    @Min(18)
    private int age;
    @NotNull(message = "Address cannot be null")
    private String address;
    private double balance;
    @ValidPinCode
    private String pinCode;
}
