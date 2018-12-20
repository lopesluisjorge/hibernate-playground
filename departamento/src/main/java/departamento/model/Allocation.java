package departamento.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "allocation")
final public class Allocation implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;


    @Id
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;


    @Column(columnDefinition = "smallint")
    private Integer workload;


    private String situation;

    public Employee getEmployee() {
        return employee;
    }

    public Project getProject() {
        return project;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Allocation that = (Allocation) o;
        return Objects.equals(employee, that.employee) &&
                Objects.equals(project, that.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, project);
    }
}
