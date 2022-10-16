package SpringMVCAndThymeleafDemo.Customer.Website;

import java.util.List;

public interface RentalCarService {
    List<RentalCar> getAllCars();

    RentalCar saveCar(RentalCar rentalCar);

    RentalCar getCar(Long id);

    void deleteCar(Long id);

    List<RentalCar> saveAllCar(List<RentalCar> rentalCarList);
}
