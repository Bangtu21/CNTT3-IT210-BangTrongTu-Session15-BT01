package spring_boot.session15bt01.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "books")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private Double price;
    private Integer stockQuantity;
}
