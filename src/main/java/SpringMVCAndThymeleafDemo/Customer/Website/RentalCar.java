package SpringMVCAndThymeleafDemo.Customer.Website;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rentalcar")
@Builder
@Getter
@Setter
public class RentalCar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, updatable = false)
    private String brand;

    @Column(nullable = false, updatable = false)
    private String model;

}
