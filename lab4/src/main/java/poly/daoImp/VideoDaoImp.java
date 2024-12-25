package poly.daoImp;

import poly.dao.VideoDAO;
import poly.entity.Video;
import poly.utils.XJPA;
import jakarta.persistence.EntityManager;

import java.util.List;

public class VideoDaoImp implements VideoDAO {
    EntityManager em = XJPA.getEntityManager();

    @Override
    public void create(Video entity) {

    }

    @Override
    public void update(Video entity) {

    }

    @Override
    public void deleteByID(String id) {

    }

    @Override
    public List<Video> findAll() {
        return em.createQuery("select v from Video v", Video.class).getResultList();
    }

    @Override
    public Video findByID(String id) {
        return null;
    }

    @Override
    public List<Video> findByKeyWordOfTitle(String keyword) {
        return em.createQuery("select v from Video v where v.title like :title", Video.class)
                .setParameter("title", "%" + keyword + "%")
                .getResultList();
    }

    @Override
    public List<Video> findTop10VideoByLike() {
        return em.createQuery("select v from Video v join Favorite f on v.id = f.video.id group by v order by count(f.id) desc", Video.class)
                .setMaxResults(10)
                .getResultList();
    }

    @Override
    public List<Video> findVideoNoFavorite() {
        return em.createQuery("select v from Video v left join Favorite f on v.id = f.video.id where f.id is null ", Video.class)
                .getResultList();
    }

    @Override
    public List<Video> findVideoByShare(long year, String sort) {
        return em.createQuery("select v FROM Video v join Share s on v.id = s.video.id where year(s.shareDate) = :year group by v order by max(s.shareDate)" + sort, Video.class)
                .setParameter("year", year)
                .getResultList();
    }
}
