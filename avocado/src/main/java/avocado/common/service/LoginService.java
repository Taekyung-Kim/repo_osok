package avocado.common.service;

import java.util.List;
import java.util.Map;

public interface LoginService {
	List<Map<String, Object>> selectUserList(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectOneUser(Map<String, Object> map) throws Exception;
}
