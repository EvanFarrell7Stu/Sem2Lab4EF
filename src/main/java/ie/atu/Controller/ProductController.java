package ie.atu.Controller;

import ie.atu.Model.Product;
import ie.atu.Service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> addProduct(
            @Valid @RequestBody Product product){


    Product saved = productService.addProduct(product);

    return ResponseEntity.status(HttpStatus.CREATED).body(saved);

    }

    @GetMapping("/get")
    public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok(productService.getAllProducts());
    }

}

