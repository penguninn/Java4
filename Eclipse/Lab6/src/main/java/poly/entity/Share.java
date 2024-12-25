package poly.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "share")
public class Share {

    @Id
    @Column(name = "Id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UserId", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "VideoId", nullable = false)
    private Video video;

    @Lob
    @Column(name = "Emails", nullable = false)
    private String emails;

    @Column(name = "ShareDate")
    private LocalDate shareDate;

    // Constructor không tham số
    public Share() {
    }

    // Constructor đầy đủ tham số
    public Share(Long id, User user, Video video, String emails, LocalDate shareDate) {
        this.id = id;
        this.user = user;
        this.video = video;
        this.emails = emails;
        this.shareDate = shareDate;
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

    // Getter và Setter cho emails
    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    // Getter và Setter cho shareDate
    public LocalDate getShareDate() {
        return shareDate;
    }

    public void setShareDate(LocalDate shareDate) {
        this.shareDate = shareDate;
    }
}
