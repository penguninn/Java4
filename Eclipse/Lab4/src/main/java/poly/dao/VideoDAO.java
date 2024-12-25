package poly.dao;

import poly.entity.Video;

import java.util.List;

public interface VideoDAO extends DAO<Video, String> {
    public List<Video> findByKeyWordOfTitle(String keyword);
    public List<Video> findTop10VideoByLike();
    public List<Video> findVideoNoFavorite();
    public List<Video> findVideoByShare(long year, String sort);
}
