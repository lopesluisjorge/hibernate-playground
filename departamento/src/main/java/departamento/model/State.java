package departamento.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "state")
final public class State {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "name", length = 64, nullable = false)
    private String name;


    @Column(name = "uf", length = 2, nullable = false, unique = true)
    private String federativeUnit;

    @OneToMany(mappedBy = "state")
    private Set<City> cities = new HashSet<>();


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFederativeUnit() {
        return federativeUnit;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
