package videos.service;

import java.util.List;

import videos.entity.Videos;

public interface VideosService {
	public int deleteVideo(int id);
	public int pushVideo(int id);
	public int passVideo(int id);
	public int prohibitVideo(int id);
	public List<Videos> selectVideoById(int id);
	public List<Videos> selectAll();
	public List<Videos> selectVideoByName(String name);
	public List<Videos> selectVideoByUserId(int userId);
}
