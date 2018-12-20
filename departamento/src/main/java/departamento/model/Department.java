package departamento.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.*;

@Entity(name = "department")
final public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(length = 64, nullable = false)
    private String name;


    @Column(columnDefinition = "longtext")
    private String description;


    @Column(nullable = false)
    private BigDecimal contingency;


    @OneToMany(mappedBy = "department")
    private Set<Employee> employees = new HashSet<>();


    @OneToMany(mappedBy = "department")
    private List<Project> projects = new ArrayList<>();


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getContingency() {
        return contingency;
    }

    public void setContingency(BigDecimal contingency) {
        this.contingency = contingency;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void add(Employee ... employees) {
        this.employees.addAll(Arrays.asList(employees));
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void add(Project ... projects) {
        this.projects.addAll(Arrays.asList(projects));
    }
}
