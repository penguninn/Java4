package poly.dto.res;

import java.time.LocalDate;

public class VideoDTO {

    private String title;
    private Integer shares;
    private LocalDate firstShareDate;
    private LocalDate lastShareDate;

    // Constructor không tham số
    public VideoDTO() {
    }

    // Constructor có tham số
    public VideoDTO(String title, Integer shares, LocalDate firstShareDate, LocalDate lastShareDate) {
        this.title = title;
        this.shares = shares;
        this.firstShareDate = firstShareDate;
        this.lastShareDate = lastShareDate;
    }

    // Getter và Setter cho title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter và Setter cho shares
    public Integer getShares() {
        return shares;
    }

    public void setShares(Integer shares) {
        this.shares = shares;
    }

    // Getter và Setter cho firstShareDate
    public LocalDate getFirstShareDate() {
        return firstShareDate;
    }

    public void setFirstShareDate(LocalDate firstShareDate) {
        this.firstShareDate = firstShareDate;
    }

    // Getter và Setter cho lastShareDate
    public LocalDate getLastShareDate() {
        return lastShareDate;
    }

    public void setLastShareDate(LocalDate lastShareDate) {
        this.lastShareDate = lastShareDate;
    }
}
