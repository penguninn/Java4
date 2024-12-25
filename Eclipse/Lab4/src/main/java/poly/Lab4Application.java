package poly;

import poly.dao.ShareDAO;
import poly.dao.UserDAO;
import poly.dao.VideoDAO;
import poly.daoImp.ShareDaoImp;
import poly.daoImp.UserDaoImp;
import poly.daoImp.VideoDaoImp;
import poly.entity.Share;
import poly.entity.User;
import poly.entity.Video;

import java.util.ArrayList;
import java.util.List;

public class Lab4Application {

	public static void main(String[] args) {
		UserDAO userDAO = new UserDaoImp();
		VideoDAO videoDAO = new VideoDaoImp();
		ShareDAO shareDAO = new ShareDaoImp();
		List<Share> shares = shareDAO.findAll();

		List<Video> videos = new ArrayList<Video>();
		User user = userDAO.findByIdOrEmail("U001");
		System.out.println("\nID: " + user.getId() + ", Email: " + user.getEmail()) ;

		System.out.println("\nFind videos by key word: ");
		videos = videoDAO.findByKeyWordOfTitle("Video ");
		videos.forEach(video -> System.out.println(video.getTitle()));

		System.out.println("\nFind Top 10 video by like");
		videos = videoDAO.findTop10VideoByLike();
		videos.forEach(video -> {
			System.out.println("Title: " + video.getTitle() + ", Like: " + video.getFavorites().size());
		});

		System.out.println("\nFind videos no one like");
		videos = videoDAO.findVideoNoFavorite();
		videos.forEach(video -> {
			System.out.println("Title: " + video.getTitle() + ", Like: " + video.getFavorites().size());
		});

		System.out.println("\nFind videos by share in 2024 and sort by asc");
		videos = videoDAO.findVideoByShare(2024, "asc");
		videos.forEach(video -> {
			System.out.println("Title: " + video.getTitle() + ", Share date: " + video.getShares().stream().map(Share::getShareDate).toList());
		});

		videos = videoDAO.findAll();
		videos.forEach(
				video -> {
					System.out.println(video.getTitle() + " " + video.getShares().size() + " " + video.getShares().stream().map(Share::getShareDate).toList());
				}
		);
	}

}
