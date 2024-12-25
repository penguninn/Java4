package poly.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "view_count", schema = "polyoe")
public class ViewCount {
    @Id
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "VisitorsCount")
    private Long visitorsCount;

}