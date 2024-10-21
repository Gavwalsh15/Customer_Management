package ie.atu.customer_management;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long customerId;

    @NotBlank
    @Size(min=2)
    String firstName;

    @Email
    String email;

    @Size(min=10, max=10)
    String phoneNumber;

    //yyyy-MM-dd
    //@Past()
    String dateOfBirth;

    //@Pattern(regexp=("c{1}d{6}"))
    String eircode;
}
