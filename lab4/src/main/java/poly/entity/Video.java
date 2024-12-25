package poly.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @Size(max = 50)
    @Column(name = "Id", nullable = false, length = 50)
    private String id;

    @Size(max = 200)
    @NotNull
    @Column(name = "Title", nullable = false, length = 200)
    private String title;

    @Size(max = 200)
    @Column(name = "Poster", length = 200)
    private String poster;

    @ColumnDefault("0")
    @Column(name = "Views")
    private Integer views;

    @Lob
    @Column(name = "Description")
    private String description;

    @NotNull
    @Column(name = "Active", nullable = false)
    private Boolean active = false;

    @NotNull
    @OneToMany(mappedBy = "video")
    private List<Favorite> favorites;

    @NotNull
    @OneToMany(mappedBy = "video")
    private List<Share> shares;

}