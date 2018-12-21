package controleprojetos.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity(name = "employee")
final public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(length = 64, nullable = false)
    private String name;


    @Column(length = 11, nullable = false, unique = true)
    private String cpf;


    @Column(columnDefinition = "char", nullable = false, length = 1)
    private String gender;


    @Column(nullable = false)
    private LocalDate birthdate;


    @Column(precision = 2, nullable = false)
    private BigDecimal salary;


    @Column(length = 64, nullable = false, unique = true)
    private String email;

    @ManyToOne()
    @JoinColumn(name = "city_id")
    private City city;


    @ManyToOne()
    @JoinColumn(name = "employee_id")
    private Department department;


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

}
