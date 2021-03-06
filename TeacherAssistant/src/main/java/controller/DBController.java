package controller;

import java.sql.SQLException;

import model.Database;

public class DBController // This class should contain all of the methods of the Database class.
{	
	// Helper functions start here
	
	public static void openDB()
	{
		try 
		{
			Database.openDB();
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static boolean checkIfUsernameAvailable(String username)
	{
		try 
		{
			return Database.checkIfUsernameAvailable(username);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Something went wrong.");
		return false;
	}
	
	public static boolean checkIfCourseCodeAvailable(String code, String teacher)
	{
		try 
		{
			return Database.checkIfCourseCodeAvailable(code, teacher);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Something went wrong.");
		return false;
	}
	
	public static boolean checkIfStudentAlreadyAdded(String code, String studentID, String teacher)
	{
		try 
		{
			return Database.checkIfStudentAlreadyAdded(code, studentID, teacher);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Something went wrong.");
		return false;
	}
	
	public static boolean checkIfCourseHasStudents(String code, String teacher)
	{
		try 
		{
			return Database.checkIfCourseHasStudents(code, teacher);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Something went wrong.");
		return false;
	}
	
	public static boolean validateLogin(String username, String password)
	{
		try 
		{
			return Database.validateLogin(username, password);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Something went wrong.");
		return false;
	}
	
	public static boolean checkIfAttendanceDateAlreadyAdded(String classCode, String teacher, java.sql.Date Date)
	{
		try 
		{
			return Database.checkIfAttendanceDateAlreadyAdded(classCode, teacher, Date);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Something went wrong.");
		return false;
	}
	
	public static boolean checkIfStudentWasAbsent(String classCode, String teacher, java.sql.Date attDate, String studentID)
	{
		try 
		{
			return Database.checkIfStudentWasAbsent(classCode, teacher, attDate, studentID);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Something went wrong.");
		return false;
	}
	
	public static int getNumberOfMinorInfractions(String studentID, String classCode, String teacher)
	{
		try 
		{
			return Database.getNumberOfMinorInfractions(studentID, classCode, teacher);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Something went wrong.");
		return -1;
	}
	
	public static int getNumberOfModerateInfractions(String studentID, String classCode, String teacher)
	{
		try 
		{
			return Database.getNumberOfModerateInfractions(studentID, classCode, teacher);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Something went wrong.");
		return -1;
	}
	
	public static int getNumberOfMajorInfractions(String studentID, String classCode, String teacher)
	{
		try 
		{
			return Database.getNumberOfMajorInfractions(studentID, classCode, teacher);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Something went wrong.");
		return -1;
	}
	
	public static boolean checkIfSeatingChartExists(String classCode, String teacher)
	{
		try 
		{
			return Database.checkIfSeatingChartExists(classCode, teacher);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Something went wrong.");
		return false;
	}
	
	public static int getNumberOfRows(String classCode, String teacher)
	{
		try 
		{
			return Database.getNumberOfRows(classCode, teacher);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Something went wrong.");
		return -1;
	}
	
	public static int getNumberOfColumns(String classCode, String teacher)
	{
		try 
		{
			return Database.getNumberOfColumns(classCode, teacher);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Something went wrong.");
		return -1;
	}
	
	public static boolean checkIfSeatTaken(String classCode, String teacher, int rowPos, int colPos)
	{
		try 
		{
			return Database.checkIfSeatTaken(classCode, teacher, rowPos, colPos);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Something went wrong.");
		return false;
	}
	
	// Helper functions end here
	
	public static void addTeacherUser(String lastName, String firstName, String username, String password)
	{
		try 
		{
			Database.addTeacherUser(lastName, firstName, username, password);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void removeTeacherUser(String username)
	{
		try 
		{
			Database.removeTeacherUser(username);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addCourse(String title, String code, String teacher)
	{
		try 
		{
			Database.addCourse(title, code, teacher);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void removeCourse(String code, String teacher)
	{
		try 
		{
			Database.removeCourse(code, teacher);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static String[] getCourses(String teacher)
	{
		try 
		{
			return Database.getCourses(teacher);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Something went wrong.");
		return null;
	}
	
	public static void addStudent(String lastName, String firstName, String studentID, String classCode, String teacher)
	{
		try 
		{
			Database.addStudent(lastName, firstName, studentID, classCode, teacher);
			Database.addInfractionsEntry(classCode, teacher, studentID);
			// This will be the only foreign key record created with the student
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*Every time new features are added that are associated with students, these methods will need to be updated to
	 delete all child records first. The alternative is to go back into the database and drop and re-add all foreign key constraints
	 with a newly added 'on delete cascade'. I have decided not forego this option as I expect it would be a massive headache to accomplish.
	 Currently missing: Grades
	 */
	public static void removeStudent(String studentID, String classCode, String teacher)
	{
		try 
		{
			Database.removeSeatingEntry(classCode, teacher, studentID);
			Database.removeAllAbsencesOfAStudent(classCode, teacher, studentID);
			Database.removeInfractionsEntry(classCode, teacher, studentID);
			Database.removeStudent(studentID, classCode, teacher);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void removeAllStudentsFromACourse(String classCode, String teacher)
	{
		try 
		{
			Database.removeAllSeatingEntriesFromACourse(classCode, teacher);
			Database.removeAllInfractionEntriesFromACourse(classCode, teacher);
			Database.removeAllAbsencesFromACourse(classCode, teacher);
			Database.removeAllStudentsFromACourse(classCode, teacher);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getStudent(String classCode, String teacher, String studentID)
	{
		try 
		{
			return Database.getStudent(classCode, teacher, studentID);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Something went wrong.");
		return "Something went wrong.";
	}
	
	public static String[] getStudents(String classCode, String teacher)
	{
		try 
		{
			return Database.getStudents(classCode, teacher);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Something went wrong.");
		return null;
	}
	
	public static void addAttendanceDate(String classCode, String teacher, java.sql.Date Date)
	{
		try 
		{
			Database.addAttendanceDate(classCode, teacher, Date);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void removeAttendanceDate(String classCode, String teacher, java.sql.Date Date)
	{
		try 
		{
			Database.removeAttendanceDate(classCode, teacher, Date);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void removeAllAttendanceDatesFromACourse(String classCode, String teacher)
	{
		try 
		{
			Database.removeAllAttendanceDatesFromACourse(classCode, teacher);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addAbsent(String classCode, String teacher, java.sql.Date Date, String studentID)
	{
		try 
		{
			Database.addAbsent(classCode, teacher, Date, studentID);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void removeAbsent(String classCode, String teacher, java.sql.Date Date, String studentID)
	{
		try 
		{
			Database.removeAbsent(classCode, teacher, Date, studentID);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void removeAllAbsencesOfAStudent(String classCode, String teacher, String studentID)
	{
		try 
		{
			Database.removeAllAbsencesOfAStudent(classCode, teacher, studentID);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void removeAllAbsencesFromACourse(String classCode, String teacher)
	{
		try 
		{
			Database.removeAllAbsencesFromACourse(classCode, teacher);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addGradeType(String classCode, String teacher, String typeName, double typeWeight)
	{
		try 
		{
			Database.addGradeType(classCode, teacher, typeName, typeWeight);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void removeGradeType(String classCode, String teacher, String typeName)
	{
		try 
		{
			Database.removeGradeType(classCode, teacher, typeName);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addAssignment(String classCode, String teacher, String assignName, String assignType)
	{
		try 
		{
			
			Database.addAssignment(classCode, teacher, assignName, assignType);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void removeAssignment(String classCode, String teacher, String assignName)
	{
		try 
		{
			Database.removeAssignment(classCode, teacher, assignName);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addGrade(String classCode, String teacher, String assignName, String studentID, int grade)
	{
		try 
		{
			Database.addGrade(classCode, teacher, assignName, studentID, grade);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void removeGrade(String classCode, String teacher, String assignName, String studentID)
	{
		try 
		{
			Database.removeGrade(classCode, teacher, assignName, studentID);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addInfractionsEntry(String classCode, String teacher, String studentID)
	{
		try 
		{
			Database.addInfractionsEntry(classCode, teacher, studentID);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void removeInfractionsEntry(String classCode, String teacher, String studentID)
	{
		try 
		{
			Database.removeInfractionsEntry(classCode, teacher, studentID);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void removeAllInfractionEntriesFromACourse(String classCode, String teacher)
	{
		try 
		{
			Database.removeAllInfractionEntriesFromACourse(classCode, teacher);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void updateInfractions(String classCode, String teacher, String studentID, int minor, int moderate, int major)
	{
		try 
		{
			Database.updateInfractions(classCode, teacher, studentID, minor, moderate, major);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addSeatingChart(String classCode, String teacher, int numRows, int numCols)
	{
		try 
		{
			Database.addSeatingChart(classCode, teacher, numRows, numCols);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void removeSeatingChart(String classCode, String teacher)
	{
		try 
		{
			Database.removeSeatingChart(classCode, teacher);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addSeatingEntry(String classCode, String teacher, String studentID, int rowPos, int colPos)
	{
		try 
		{
			Database.addSeatingEntry(classCode, teacher, studentID, rowPos, colPos);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void removeSeatingEntry(String classCode, String teacher, String studentID)
	{
		try 
		{
			Database.removeSeatingEntry(classCode, teacher, studentID);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void removeAllSeatingEntriesFromACourse(String classCode, String teacher)
	{
		try 
		{
			Database.removeAllSeatingEntriesFromACourse(classCode, teacher);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getStudentIDInSeat(String classCode, String teacher, int rowPos, int colPos)
	{
		try 
		{
			return Database.getStudentIDInSeat(classCode, teacher, rowPos, colPos);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Something went wrong.");
		return "Something went wrong.";
	}
} // Class end
