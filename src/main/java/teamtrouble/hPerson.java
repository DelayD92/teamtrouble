package teamtrouble;

import javax.persistence.*;

@Entity
@Table(name = "hPerson")
public class hPerson {
    @Id @GeneratedValue
    @Column (name = "personId")
    private int id;
    @Column (name = "name")
    private String name;
    @Column (name = "sex")
    private String sex;

    // ---------------------------------GETTER & SETTERS---------------------------
    public int getId() {
        return id;
    }

    public void setId(int personId) {
        this.id = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String personName) {
        this.name = personName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
