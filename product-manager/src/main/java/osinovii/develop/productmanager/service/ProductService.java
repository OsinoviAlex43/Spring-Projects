package osinovii.develop.productmanager.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import osinovii.develop.productmanager.dto.ProductDTO;
import osinovii.develop.productmanager.entity.Product;
import osinovii.develop.productmanager.repository.ProductRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product create(ProductDTO dto){
        Product product = Product.builder()
                .name(dto.getName())
                .amount(dto.getAmount())
                .build();
        return productRepository.save(product);
    }

    public List<Product> readAll(){
        return productRepository.findAll();
    }

    public Product update(Product product){
        return productRepository.save(product);
    }

    public void delete(Long id){
        productRepository.deleteById(id);
    }


}
