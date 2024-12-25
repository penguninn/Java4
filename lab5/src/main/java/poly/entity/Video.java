package poly.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "video", schema = "polyoe")
public class Video {
    @Id
    @Column(name = "Id", nullable = false, length = 50)
    private String id;

    @Column(name = "Title", nullable = false, length = 200)
    private String title;

    @Column(name = "Poster", length = 200)
    private String poster;

    @ColumnDefault("0")
    @Column(name = "Views")
    private Integer views;

    @Lob
    @Column(name = "Description")
    private String description;

    @Column(name = "Active", nullable = false)
    private Boolean active = false;

    @OneToMany(mappedBy = "video")
    private List<Favorite> favorites;

    @OneToMany(mappedBy = "video")
    private List<Share> shares;

}