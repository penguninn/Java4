package poly.dto.res;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class VideoDTO {
    private String title;
    private Integer shares;
    private LocalDate firstShareDate;
    private LocalDate lastShareDate;
}
