package ie.atu.Model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Long id;

    @NotBlank(message="Product name is required")
    private String name;

    @Positive(message = "Price must be greater than 0")
    private Double price;
}

