// read and display all data from a table Student of database college
import java.sql.*;

class ReadData{
	public ReadData() throws SQLEXception,ClassNotFoundException{
		String url="jdbc:mysql://localhost:3306/college";
		String uname="root";
		String pwd="pwd@123";

		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection(url,uname,pwd);
		Statement s=c.createStatement();
		Strinq q="SELECT * FROM Student";
		Resultset rs=s.executeQuery(q);

		while(rs.next()){
			System.out.println("Rollno: "+rs.getInt());
		}

	}
}

class Test{
	public static void main(String[] args) {
		new ReadData();
	}
}