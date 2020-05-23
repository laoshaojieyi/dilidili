package videos.service;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import videos.entity.Videos;

@Service
public class VideosServiceImp implements VideosService {
	
	private SqlSession session;
	
	


	public int deleteVideo(int id) {
		SqlSessionFactory ssf=null;
		try {
			ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/mybatis-config.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		session = ssf.openSession();
		VideosService videos=session.getMapper(VideosService.class);
		 videos.deleteVideo(id);
		 session.commit();
		return 0;
	}


	public int pushVideo(int id) {
		SqlSessionFactory ssf=null;
		try {
			ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/mybatis-config.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		session = ssf.openSession();
		VideosService videos=session.getMapper(VideosService.class);
		videos.pushVideo(id);
		session.commit();
		return 0;
	}


	public int passVideo(int id) {
		SqlSessionFactory ssf=null;
		try {
			ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/mybatis-config.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		session = ssf.openSession();
		VideosService videos=session.getMapper(VideosService.class);
		videos.passVideo(id);
		session.commit();
		return 0;
	}


	public int prohibitVideo(int id) {
		SqlSessionFactory ssf=null;
		try {
			ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/mybatis-config.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		session = ssf.openSession();
		VideosService videos=session.getMapper(VideosService.class);
		videos.prohibitVideo(id);
		session.commit();
		return 0;
	}


	public List<Videos> selectVideoById(int id) {
		SqlSessionFactory ssf=null;
		try {
			ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/mybatis-config.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		session = ssf.openSession();
		VideosService videos=session.getMapper(VideosService.class);
		List<Videos> video=videos.selectVideoById(id);
		return video;
	}


	public List<Videos> selectAll() {
		SqlSessionFactory ssf=null;
		try {
			ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/mybatis-config.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		session = ssf.openSession();
		VideosService videos=session.getMapper(VideosService.class);
		List<Videos> videoS=videos.selectAll();
		session.commit();
		return videoS;
	}


	@Override
	public List<Videos> selectVideoByName(String name) {
		SqlSessionFactory ssf=null;
		try {
			ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/mybatis-config.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		session = ssf.openSession();
		VideosService videos=session.getMapper(VideosService.class);
		List<Videos> video=videos.selectVideoByName(name);
		return video;
	}


	@Override
	public List<Videos> selectVideoByUserId(int userId) {
		SqlSessionFactory ssf=null;
		try {
			ssf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/mybatis-config.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		session = ssf.openSession();
		VideosService videos=session.getMapper(VideosService.class);
		List<Videos> video=videos.selectVideoByUserId(userId);
		return video;
	}

	
	
}
