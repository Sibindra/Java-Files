import java.sql.*;
import java.util.Scanner;

class Test{
	public void getData(){
		System.out.println("Enter name");
		String name=s.next();
		System.out.println("Enter roll");
		int roll=s.nextInt();

	}

	public void insertData(){
		String url="jdbc:mysql://localhost:3306/college";
		String uname="root";
		String pwd="pwd@123";

		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection(url,uname,pwd);

		PreparedStatement s=c.prepareStatement("INSERT INTO Student VALUES(?,?)");
		s.setString(1,name);
		s.setInt(2,roll);

		int r=s.executeUpdate();

		System.out.println("No of records are: "+r);
	}

	public static void main(String[] args) {
		this.getData();
		this.insertData();
	}
}

