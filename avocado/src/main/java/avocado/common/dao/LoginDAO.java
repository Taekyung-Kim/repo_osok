package avocado.common.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("loginDAO")
public class LoginDAO extends AbstractDAO{
	@SuppressWarnings("unchecked")
    public List<Map<String, Object>> selectUserList(Map<String, Object> map) throws Exception{
        return (List<Map<String, Object>>)selectList("common.selectUserList", map);
    }
	@SuppressWarnings("unchecked")
    public List<Map<String, Object>> selectOneUser(Map<String, Object> map) throws Exception{
        return (List<Map<String, Object>>)selectList("common.selectOneUser", map);
    }
}
