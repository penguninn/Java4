package poly.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "favorite")
public class Favorite {

    @Id
    @Column(name = "Id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UserId", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "VideoId", nullable = false)
    private Video video;

    @Column(name = "LikeDate")
    private LocalDate likeDate;

    // Constructor không tham số
    public Favorite() {
    }

    // Constructor đầy đủ tham số
    public Favorite(Long id, User user, Video video, LocalDate likeDate) {
        this.id = id;
        this.user = user;
        this.video = video;
        this.likeDate = likeDate;
    }

    // Getter và Setter cho id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter và Setter cho user
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Getter và Setter cho video
    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    // Getter và Setter cho likeDate
    public LocalDate getLikeDate() {
        return likeDate;
    }

    public void setLikeDate(LocalDate likeDate) {
        this.likeDate = likeDate;
    }
}
