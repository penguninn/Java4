package poly.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import java.util.List;

@Entity
@Table(name = "video")
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

    // Getter and Setter methods for id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter and Setter methods for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter methods for poster
    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    // Getter and Setter methods for views
    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    // Getter and Setter methods for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getter and Setter methods for active
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    // Getter and Setter methods for favorites
    public List<Favorite> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Favorite> favorites) {
        this.favorites = favorites;
    }

    // Getter and Setter methods for shares
    public List<Share> getShares() {
        return shares;
    }

    public void setShares(List<Share> shares) {
        this.shares = shares;
    }
}
