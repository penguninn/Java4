package com.poly.entity;

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
    private com.poly.entity.User user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "VideoId", nullable = false)
    private com.poly.entity.Video video;

    @Column(name = "LikeDate")
    private LocalDate likeDate;

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

	public LocalDate getLikeDate() {
		return likeDate;
	}

	public void setLikeDate(LocalDate likeDate) {
		this.likeDate = likeDate;
	}

    
}