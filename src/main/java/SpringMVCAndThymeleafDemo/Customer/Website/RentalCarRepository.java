package SpringMVCAndThymeleafDemo.Customer.Website;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalCarRepository extends JpaRepository<RentalCar, Long> {

}
