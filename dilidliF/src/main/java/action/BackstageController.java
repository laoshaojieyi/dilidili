package action;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import users.service.UsersServiceImp;
import videos.service.VideosServiceImp;

@Controller
@RequestMapping("/backstageControl")
public class BackstageController {
	@Autowired
	private UsersServiceImp users;
	@Autowired
	private VideosServiceImp videos;
	
	@RequestMapping(value="/deleteVideo", method= {RequestMethod.GET})
	public String deleteVideo(@RequestParam("id") int id) {
		videos.deleteVideo(id);
		return "backstageControl/selectAllVideos";
		
	}
	@RequestMapping(value="/pushVideo", method= {RequestMethod.GET})
	public String pushVideo(@RequestParam("id") int id) {
		videos.pushVideo(id);
		return "backstageControl/selectAllVideos";
		
	}
	@RequestMapping(value="/passVideo", method= {RequestMethod.GET})
	public String passVideo(@RequestParam("id") int id) {
		videos.passVideo(id);
		return "backstageControl/selectAllVideos";
		
	}
	@RequestMapping(value="/prohibitVideo", method= {RequestMethod.POST})
	public ModelAndView prohibitVideo(@RequestParam("id") int id) {
		videos.prohibitVideo(id);
		return null;
		
	}
	@RequestMapping(value="/selectVideoById", method= {RequestMethod.POST})
	public String selectVideoById(@RequestParam("videoId") int videoId,Map<String, Object> map) {
		map.put("videos", videos.selectVideoById(videoId));
		return "views/VideosControl.jsp";
		
	}
	@RequestMapping(value="/selectVideoByName", method= {RequestMethod.POST})
	public String selectVideoByName(@RequestParam("videoName") String videoName,Map<String, Object> map) {
		map.put("videos", videos.selectVideoByName(videoName));
		return "views/VideosControl.jsp";
		
	}
	@RequestMapping(value="/selectVideoByUserId", method= {RequestMethod.POST})
	public String selectVideoByUserId(@RequestParam("userId") int userId,Map<String, Object> map) {
		map.put("videos", videos.selectVideoByUserId(userId));
		return "views/VideosControl.jsp";
		
	}
	@RequestMapping(value="/selectAllVideos", method= {RequestMethod.GET})
	public String selectAllVideos(Map<String, Object> map) {
		map.put("videos",videos.selectAll());
		return "views/VideosControl.jsp";
		
	}
	@RequestMapping(value="/deleteUser", method= {RequestMethod.GET})
	public String deleteUser(@RequestParam("id") int id) {
		users.deleteUser(id);
		return "backstageControl/selectAllUsers";
		
	}
	@RequestMapping(value="/blackUser", method= {RequestMethod.GET})
	public String blackUser(@RequestParam("id") int id) {
		users.blackUser(id);
		return "backstageControl/selectAllUsers";
		
	}
	@RequestMapping(value="/freezeUser", method= {RequestMethod.POST})
	public ModelAndView freezeUser(@RequestParam("id") int id) {
		users.freezeUser(id);
		return null;
		
	}
	@RequestMapping(value="/fireUser", method= {RequestMethod.GET})
	public String fireUser(@RequestParam("id") int id) {
		users.fireUser(id);
		return "backstageControl/selectAllUsers";
		
	}
	@RequestMapping(value="/selectUserById", method= {RequestMethod.POST})
	public String selectUserById(@RequestParam("id") int id,Map<String, Object> map) {
		map.put("users", users.selectUserById(id));
		return "views/UsersControl.jsp";
		
	}

	@RequestMapping("/selectAllUsers")
	public String selectAllUsers(Map<String, Object> map) {
		map.put("users", users.selectAll());
		return "views/UsersControl.jsp";
		
	}
	@RequestMapping(value="/setUservip", method= {RequestMethod.GET})
	public String setUservip(@RequestParam("id") int id) {
		users.setUservip(id);
		return "backstageControl/selectAllUsers";
		
	}
	@RequestMapping(value="/selectUserByTelnum", method= {RequestMethod.POST})
	public String selectUserByTelnum(@RequestParam("Telnum") String Telnum,Map<String, Object> map) {
		map.put("users", users.selectUserByTelnum(Telnum));
		return "views/UsersControl.jsp";
		
	}
	@RequestMapping(value="/selectUserByName", method= {RequestMethod.POST})
	public String selectUserByName(@RequestParam("name") String name, Map<String, Object> map) {
		map.put("users", users.selectUserByName(name));
		return "views/UsersControl.jsp";
		
	}

}
