package osinovii.develop.productmanager.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import osinovii.develop.productmanager.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {


}
