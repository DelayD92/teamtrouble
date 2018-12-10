package teamtrouble;

import org.hibernate.Session;

import javax.persistence.*;

@Entity
@Table(name = "hMovie")
public class hMovie {
    @Id @GeneratedValue
    @Column(name="movId")
    private Long id;
    @Column (name = "title")
    private String title;
    @Column (name = "year")
    private Integer year;
    @Column (name = "type")
    private Character type;



    // -----------------------------------GETTERS &
    // SETTERS--------------------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }
}
