package teamtrouble;

import javax.persistence.*;

@Entity
@Table(name = "hGenre")
public class hGenre {
    @Id @GeneratedValue
    @Column(name = "genreId")
    private Long id;
    @Column (name="genre")
    private String genre;


    // -----------------------------------GETTERS & SETTERS-----------------------
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
