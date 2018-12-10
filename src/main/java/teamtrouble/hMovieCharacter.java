package teamtrouble;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "hMovieCharacter")
public class hMovieCharacter {
    @Id
    @Column(name="movCharId")
    private Long id;
    @Column (name = "movId")
    private Long movieId;
    @Column (name = "character")
    private String character;
    @Column (name = "alias")
    private String alias;
    @Column (name = "position")
    private Integer position;


    // -------------------------GETTERS & SETTERS--------------------------------
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

}
