package com.poly.entity;
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
    private com.poly.entity.User user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "VideoId", nullable = false)
    private com.poly.entity.Video video;
    
    @Lob
    @Column(name = "Emails", nullable = false)
    private String emails;

    @Column(name = "ShareDate")
    private LocalDate shareDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public com.poly.entity.User getUser() {
		return user;
	}

	public void setUser(com.poly.entity.User user) {
		this.user = user;
	}

	public com.poly.entity.Video getVideo() {
		return video;
	}

	public void setVideo(com.poly.entity.Video video) {
		this.video = video;
	}

	public String getEmails() {
		return emails;
	}

	public void setEmails(String emails) {
		this.emails = emails;
	}

	public LocalDate getShareDate() {
		return shareDate;
	}

	public void setShareDate(LocalDate shareDate) {
		this.shareDate = shareDate;
	}

}