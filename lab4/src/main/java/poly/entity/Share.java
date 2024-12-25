package poly.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "share", schema = "polyoe")
public class Share {
    @Id
    @Column(name = "Id", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UserId", nullable = false)
    private User user;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "VideoId", nullable = false)
    private Video video;

    @NotNull
    @Lob
    @Column(name = "Emails", nullable = false)
    private String emails;

    @Column(name = "ShareDate")
    private LocalDate shareDate;

}