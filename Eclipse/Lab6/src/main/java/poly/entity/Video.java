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

    // Constructor không tham số
    public Video() {
    }

    // Constructor đầy đủ tham số
    public Video(String id, String title, String poster, Integer views, String description, Boolean active, List<Favorite> favorites, List<Share> shares) {
        this.id = id;
        this.title = title;
        this.poster = poster;
        this.views = views;
        this.description = description;
        this.active = active;
        this.favorites = favorites;
        this.shares = shares;
    }

    // Getter và Setter cho id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter và Setter cho title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter và Setter cho poster
    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    // Getter và Setter cho views
    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    // Getter và Setter cho description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getter và Setter cho active
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    // Getter và Setter cho favorites
    public List<Favorite> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Favorite> favorites) {
        this.favorites = favorites;
    }

    // Getter và Setter cho shares
    public List<Share> getShares() {
        return shares;
    }

    public void setShares(List<Share> shares) {
        this.shares = shares;
    }
}
