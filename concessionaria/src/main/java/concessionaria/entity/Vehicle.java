package concessionaria.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String chasis;

    @Column(length = 128, nullable = false)
    private String brand;

    @Column(length = 128, nullable = false)
    private String model;

    @Column(name = "year_fabrication", nullable = false)
    private Integer year;

    @Column(name = "year_model", nullable = false)
    private Integer yearModel;

    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal value;

    public Long getId() {
        return id;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYearModel() {
        return yearModel;
    }

    public void setYearModel(Integer yearModel) {
        this.yearModel = yearModel;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(id, vehicle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Vehicle {" +
                "id='" + id + '\'' +
                ", chasis='" + chasis + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", yearModel=" + yearModel +
                ", value=" + value +
                '}';
    }
}
