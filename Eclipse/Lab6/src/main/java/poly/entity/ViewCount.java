package poly.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "view_count")
public class ViewCount {

    @Id
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "VisitorsCount")
    private Long visitorsCount;

    // Constructor không tham số
    public ViewCount() {
    }

    // Constructor đầy đủ tham số
    public ViewCount(Long id, Long visitorsCount) {
        this.id = id;
        this.visitorsCount = visitorsCount;
    }

    // Getter và Setter cho id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter và Setter cho visitorsCount
    public Long getVisitorsCount() {
        return visitorsCount;
    }

    public void setVisitorsCount(Long visitorsCount) {
        this.visitorsCount = visitorsCount;
    }
}
