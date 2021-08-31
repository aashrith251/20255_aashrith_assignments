package com.sonata.DAOimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sonata.DAOIntf.EmployeeIntf;
import com.sonata.Model.Employee;
import com.sonata.emp.DBConnection.DbConnection;
@Service
public class EmployeeImpl implements EmployeeIntf{
	@Override
	public List<Employee>getAllEmployee()
	{
		List<Employee>emp=new ArrayList<>();
		try
		{
			DbConnection db=new DbConnection();
			PreparedStatement ps=db.getConnection().prepareStatement("select * from employee");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				int eid=rs.getInt(1);
				String eName=rs.getString(2);
				double eSal=rs.getDouble(3);
				Employee e1=new Employee();
				e1.setEmpId(eid);
				e1.setEmpName(eName);
				e1.setEmpSal(eSal);
				emp.add(e1);
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return emp;
	}
	
}
