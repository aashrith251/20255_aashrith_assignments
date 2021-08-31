package com.sonata.DAOimpl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.sonata.DAOIntf.LoginIntf;
import com.sonata.Model.Login;
import com.sonata.Model.Task;
import com.sonata.Model.User;
import com.sonata.emp.DBConnection.DbConnection;
@Service
public class LoginImpl implements LoginIntf{
	public List<Task> getAllTask(){
		List<Task> tasklist=new ArrayList<>();
		try {
		DbConnection db=new DbConnection();
		PreparedStatement ps=db.getConnection().prepareStatement("Select * from Task");
		ResultSet res=ps.executeQuery();
		while(res.next()) {
			Task task=new Task();
			task.setTaskId(res.getInt("taskId"));
			task.setName(res.getString("name"));
			task.setOwnerId(res.getInt("ownerId"));
			task.setIsBookmarked(res.getInt("isbookmarked"));
			task.setStatus(res.getString("status"));
			task.setNotes(res.getString("notes"));
			task.setCreatedOn(res.getDate("createdon"));
			task.setPriority(res.getString("priority"));
			task.setDescription(res.getString("description"));
			task.setStatusChangedOn(res.getDate("statuschangedon"));
			tasklist.add(task);			
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return tasklist;
	}
	public List<Task> gettask(int taskid){
		List<Task> tasklist=new ArrayList<>();
		try {
		DbConnection db=new DbConnection();
		PreparedStatement ps=db.getConnection().prepareStatement("Select * from Task where taskid= \" +taskid;");
		ResultSet res=ps.executeQuery();
		while(res.next()) {
			Task task=new Task();
			task.setTaskId(res.getInt("taskId"));
			task.setName(res.getString("name"));
			task.setOwnerId(res.getInt("ownerId"));
			task.setIsBookmarked(res.getInt("isbookmarked"));
			task.setStatus(res.getString("status"));
			task.setNotes(res.getString("notes"));
			task.setCreatedOn(res.getDate("createdon"));
			task.setPriority(res.getString("priority"));
			task.setDescription(res.getString("description"));
			task.setStatusChangedOn(res.getDate("statuschangedon"));
			tasklist.add(task);			
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return tasklist;
	}
	public List<User> getAllUser(){
		List<User> userlist=new ArrayList<>();
		try {
		DbConnection db=new DbConnection();
		PreparedStatement ps=db.getConnection().prepareStatement("Select * from user");
		ResultSet res=ps.executeQuery();
		while(res.next()) {
			User task=new User();
			task.setUserId(res.getInt("userid"));
			task.setUserName(res.getString("username"));
			task.setEmail(res.getString("email"));
			task.setContactNumber(res.getLong("contactNo"));
			task.setRole(res.getString("role"));
			task.setIsAlive(res.getBoolean("isActive"));
			task.setDob(res.getDate("dob"));
			task.setCreatedOn(res.getDate("createdon"));
			userlist.add(task);
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return userlist;
	}
	
	@Override
	public List<Login>getAllUsers()
	{
		List<Login>emp=new ArrayList<>();
		try
		{
			DbConnection db=new DbConnection();
			PreparedStatement ps=db.getConnection().prepareStatement("select * from login");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				int eid=rs.getInt(1);
				String eName=rs.getString(2);
				Login e1=new Login();
				e1.setUserid(eid);
				e1.setPassword(eName);
				emp.add(e1);
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return emp;
	}
	public int updateuser(int userid, String password) throws SQLException{
		DbConnection db=new DbConnection();
		String query = "select  task SET priority = ? WHERE taskId = ?";
		PreparedStatement ps=db.getConnection().prepareStatement(query);
		ps.setInt(1, userid);
		ps.setString(2, password);
		ps.executeUpdate();
		return userid;
	}
}
