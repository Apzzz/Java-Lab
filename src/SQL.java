import java.sql.*;
import java.util.*;

public class SQL {
	public static void main(String args[]) {
		int rno, n;
		String name;
		double cgpa;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javasql", "admin",
					"Abhiram@2009");
			Statement st = conn.createStatement();
			System.out.print("Enter the number of students ");
			n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				System.out.print("Enter the roll no ");
				rno = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter the name ");
				name = sc.nextLine();
				System.out.print("Enter the cgpa ");
				cgpa = sc.nextDouble();
				String sql = "insert into student values(" + rno + ",'" + name + "'," + cgpa + ");";
				st.executeUpdate(sql);
			}
			System.out.println("\nStudents with cgpa greater than 7 \n");
			System.out.println("Rollno\tName\t\tCGPA");
			ResultSet rs = st.executeQuery("select * from student where cgpa>7;");
			while (rs.next())
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t\t" + rs.getDouble(3));
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}
}
