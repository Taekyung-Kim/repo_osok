package avocado.common.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import avocado.common.service.LoginService;
import avocado.common.util.CommandMap;

@Controller
public class LoginController {
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name = "loginService")
	private LoginService loginService;

	@RequestMapping(value = "/common/login.do")
	public ModelAndView login(@RequestParam("user_id") String id, 
            @RequestParam("user_pw") String pw,CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("/common/main");
		
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);
        map.put("pw", pw);
		List<Map<String, Object>> user = loginService.selectOneUser(map);
		System.out.println(user);
		if (user.size() == 0) {
			mv.setViewName("/common/error");
			return mv;
		}
		List<Map<String, Object>> userList = loginService.selectUserList(commandMap.getMap());
		mv.addObject("userList", userList);
		return mv;
	}
}
