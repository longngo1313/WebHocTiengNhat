package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mapper.UserInfoMapper;
import model.UserInfo;


@Service
@Transactional
public class UserInfoDAO extends JdbcDaoSupport {
	
	@Autowired
	public UserInfoDAO(DataSource dataSource) {
		this.setDataSource(dataSource);
	}


	public UserInfo findUserInfo(String userName) {
		String sql = "Select * "
				+ " from Users where USER_NAME = ? ";

		Object[] params = new Object[] { userName };
		UserInfoMapper mapper = new UserInfoMapper();
		try {
			UserInfo userInfo = this.getJdbcTemplate().queryForObject(sql, params, mapper);
			return userInfo;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}


	public List<String> getUserRoles(String userName) {
		String sql = "Select r.User_Role "//
				+ " from User_Roles r where r.user_name = ? ";

		Object[] params = new Object[] { userName };

		List<String> roles = this.getJdbcTemplate().queryForList(sql,params, String.class);

		return roles;
	}
}
