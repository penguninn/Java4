package poly.dto.res;

import java.time.LocalDate;

public class VideoDTO {
    private String title;
    private Integer shares;
    private LocalDate firstShareDate;
    private LocalDate lastShareDate;

    public VideoDTO() {
    }

    public VideoDTO(String title, Integer shares, LocalDate firstShareDate, LocalDate lastShareDate) {
        this.title = title;
        this.shares = shares;
        this.firstShareDate = firstShareDate;
        this.lastShareDate = lastShareDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getShares() {
        return shares;
    }

    public void setShares(Integer shares) {
        this.shares = shares;
    }

    public LocalDate getFirstShareDate() {
        return firstShareDate;
    }

    public void setFirstShareDate(LocalDate firstShareDate) {
        this.firstShareDate = firstShareDate;
    }

    public LocalDate getLastShareDate() {
        return lastShareDate;
    }

    public void setLastShareDate(LocalDate lastShareDate) {
        this.lastShareDate = lastShareDate;
    }
}
