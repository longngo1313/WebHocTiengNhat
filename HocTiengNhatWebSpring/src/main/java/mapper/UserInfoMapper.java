package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import dao.UserInfoDAO;
import model.UserInfo;

public class UserInfoMapper implements RowMapper<UserInfo>{

	@Autowired
	private UserInfoDAO userInfoDAO;

	@Override
	public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		String userId = "" + rs.getInt("ID");
		String useName = rs.getString("USER_NAME");
		String pass = rs.getString("PASSWORD");
		String enable = rs.getString("ENABLED");
		String level = rs.getString("LEARNING_LEVEL");
		String purchased = rs.getString("PURCHASED");
		String email = rs.getString("EMAIL");
		String birthDate = rs.getString("BIRTH_DATE");
		String name = rs.getString("NAME");


		// [USER,ADMIN,..]
		//List<String> roles= userInfoDAO.getUserRoles(useName);
		
		
		String[] roles= {"USER"};
		
		
		System.out.println("ROLE ------------------------- " + useName);

		List<GrantedAuthority> grantList= new ArrayList<GrantedAuthority>();
		if(roles!= null)  {
			for(String role: roles)  {
				// ROLE_USER, ROLE_ADMIN,..
				GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + role);
				grantList.add(authority);
			}
		}        

		return new UserInfo(useName, pass, grantList, userId ,enable, level, purchased, email, birthDate,name);
	}

}
