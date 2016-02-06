package avocado.common.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import avocado.common.dao.LoginDAO;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Resource(name="loginDAO")
	private LoginDAO loginDAO;

	@Override
	public List<Map<String, Object>> selectUserList(Map<String, Object> map) throws Exception {
		return loginDAO.selectUserList(map);
	}

	@Override
	public List<Map<String, Object>> selectOneUser(Map<String, Object> map) throws Exception {
		return loginDAO.selectOneUser(map);
	}
	
}
