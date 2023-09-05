package demoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcHw {
	
    public static void main(String[] args) throws Exception {
        

        //1. Load Driver class
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("load");

        // 2. Establish the connection
        Connection con = DriverManager.getConnection("jdbc:mySQL://localhost:3306/test", "root", "root");
        System.out.println("connected");

        // Create a Statement 
        Statement st = con.createStatement();

        // Create a PreparedStatement for parameterized queries
        PreparedStatement pt =con.prepareStatement("INSERT INTO student (id, name, age) VALUES (?, ?, ?)");

        Scanner sc = new Scanner(System.in);

        while (true) {
            
            
            System.out.println("CRUD Operations:");
            System.out.println("1. Create (Insert) using Statement");
            System.out.println("2. Create (Insert) using PreparedStatement");
            System.out.println("3. Read (Select)");
            System.out.println("4. Update using Statement");
            System.out.println("5. Update using PreparedStatement");
            System.out.println("6. Delete using Statement");
            System.out.println("7. Delete using PreparedStatement");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
           
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:{

                    System.out.print("Enter student ID: ");
                    int id = sc.nextInt();
                        
                    sc.nextLine(); 
                      
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                        
                    System.out.print("Enter student age: ");
                    int age = sc.nextInt();

                    String query = "INSERT INTO student (id,name,age) VALUES(" +id+",'"+name+"',"+age+")";
                    int result = st.executeUpdate(query);
                    
                    if(result>0)
                	    {
                	    	System.out.println("Data inserted successfully using Statement");
                	    }
                	    else
                	    {
                	    	System.out.println("Data is not inserted");
                	    }

                }
                    break;

                case 2:{

                    System.out.print("Enter student ID: ");
                    int id = sc.nextInt();
                        
                    sc.nextLine(); 

                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                        
                    System.out.print("Enter student age: ");
                    int age = sc.nextInt();

                    pt = con.prepareStatement(  "INSERT INTO student (id, name, age) VALUES (?, ?, ?)");

                    pt.setInt(1, id);
                    pt.setString(2, name);
                    pt.setInt(3, age);

                    int result = pt.executeUpdate();

                    if(result>0)
            	    {
            	    	System.out.println("Data inserted successfully using PreparedStatement");
            	    }
            	    else
            	    {
            	    	System.out.println("Data is not inserted");
            	    }
                    break;
                }

                case 3:{

                    ResultSet rs = st.executeQuery("SELECT * FROM student");

                    while(rs.next()){

                        System.out.println("ID: "+rs.getInt("id")+", Name: "+rs.getString("name")+
                        ", Age: "+rs.getInt(3));
                    }


                }
                    break;

                case 4:{

                    System.out.print("Enter student ID to update: ");
                    int id = sc.nextInt();
                    
                    sc.nextLine(); // Consume newline
                    
                    System.out.print("Enter new student age: ");
                    int newStudentAge = sc.nextInt();

                    String query = "UPDATE student SET age=" + newStudentAge +" WHERE id= "+id;

                    int result = st.executeUpdate(query);

                    if(result>0)
            	    {
            	    	System.out.println("Data updated successfully using Statement");
            	    }
            	    else
            	    {
            	    	System.out.println("Data is not updated");
            	    }
                
                }
                    break;

                case 5:{

                    System.out.print("Enter student ID to update: ");
                    int id = sc.nextInt();
                    
                    sc.nextLine(); 
                    
                    System.out.print("Enter new student age: ");
                    int newStudentAge = sc.nextInt();

                    
                    pt = con.prepareStatement("UPDATE student SET age = ? WHERE id = ?");

                                       
                    pt.setInt(1,newStudentAge );
                    pt.setInt(2, id);

                    int result = pt.executeUpdate();

                    if(result>0)
            	    {
            	    	System.out.println("Data updated successfully using PreparedStatement");
            	    }
            	    else
            	    {
            	    	System.out.println("Data is not updated");
            	    }
                }
                   break;

                case 6:{

                    System.out.print("Enter student ID to delete: ");
                    int deleteId = sc.nextInt();
                    
                    String query = "DELETE FROM student WHERE id = " + deleteId;
                    int result = st.executeUpdate(query);
                    
                    if(result>0)
            	    {
            	    	System.out.println("Data deleted successfully using Statement");
            	    }
            	    else
            	    {
            	    	System.out.println("Data is not deleted");
            	    }
                   
                }
                     break;
                
                case 7:{

                    System.out.print("Enter student ID to delete: ");
                    int deleteId = sc.nextInt();
                    
            
                    pt = con.prepareStatement( "DELETE FROM student WHERE id= ?");
                    pt.setInt(1, deleteId);

                    int result = pt.executeUpdate();

                    if(result>0)
            	    {
            	    	System.out.println("Data deleted successfully using PreparedStatement");
            	    }
            	    else
            	    {
            	    	System.out.println("Data is not deleted");
            	    }

                }
                    break;
                

                case 8:{

                    sc.close();
                    st.close();
                    pt.close();
                    con.close();
                    System.out.println("Exiting...");
                    System.exit(0);

                }
                    break;
            
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        
    }
}
