package SpringMVCAndThymeleafDemo.Customer.Website;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
