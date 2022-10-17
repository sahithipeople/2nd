package com.p2;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Empservice implements EmpDao {

	@Override
	public void displayEmployee() {
		//ArrayList<Emp> al =new ArrayList<>();
		try {
			Connection c=Conne.getConnection();
			Statement st=c.createStatement(); 
			ResultSet rs=st.executeQuery("select * from  employee1");
		       while(rs.next()) {
		    	   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		       }
		} 
		catch (Exception e) {
	          System.out.println(e);
		}

	}

	@Override
	public void addEmployee(Emp employee) {
		// TODO Auto-generated method stub
		try
        {
            Connection con=Conne.getConnection();
            Statement st=con.createStatement();
           st.executeUpdate("Insert into employee1(`id`,`name`,`salary`,`password`)values('"+employee.getId()+"','"+employee.getName()+"','"+employee.getSalary()+"','"+employee.getPassword()+"')");
           
           System.out.println("your data inserted successfully in database");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
		
	}

	@Override
	public void updatePassword(Emp employee) {
		// TODO Auto-generated method stub
		
		   try
{
 Connection con = Conne.getConnection();
    Statement stmt= con.createStatement();  
   String sql="update employee set  password='"+ employee.getPassword()+"' where id='"+employee.getId()+"' ";
   int i=stmt.executeUpdate(sql);
   
   if(i>0)
   {
       System.out.println("data updated");
       
   }
   else
   {
       System.out.println("no record found");
   }       
}
catch(Exception e)
{
 System.out.println(e);
}
	}
	@Override
	public void deleteEmployee(Emp employee) {
		// TODO Auto-generated method stub
		try
        {
            Connection co=Conne.getConnection();
             Statement st=co.createStatement();
            st.executeUpdate("delete from employee where name='"+employee.getName()+"' ") ;
            System.out.println(" your data deleted from db");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
		
	}
}
