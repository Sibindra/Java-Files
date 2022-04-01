import java.sql.*;

class InsertData{
	public InsertData() throws SQLEXception,ClassNotFoundException{
	String url="jdbc:mysql://localhost:3306/college";
		String uname="root";
		String pwd="pwd@123";

		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection(url,uname,pwd);
		Statement s=c.createStatement();
		String q="INSERT INTO Student(Name,Age,Sem) VALUES('Anil','12','15')";
		int rs=s.executeUpdate(q);

		System.out.println("No of recors changed: "+rs);
	}

	public static void main(String[] args) {
		new InsertData();
	}
}