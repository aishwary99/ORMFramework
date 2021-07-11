import com.thinking.machines.orm.*;
import com.thinking.machines.orm.wrapper.*;
import com.thinking.machines.orm.generator.*;
import com.thinking.machines.orm.annotations.*;
import dto.*;
public class ORMTester
{
public static void main(String gg[]) 
{
try
{
Course course=new Course();
course.setCode(1221);
course.setTitle("Angular JS");
/*
Student student=new Student();
student.setRollNumber(101);
student.setFirstName("Aishwary");
student.setLastName("Adwani");
student.setCourseCode(105);
student.setAadharCardNumber(1000111);
java.util.Date utilDate=new java.util.Date();
student.setDateOfBirth(new java.sql.Date(utilDate.getYear(),utilDate.getMonth(),utilDate.getDate()));
student.setGender("m");
*/
DataManager dataManager=new DataManager();
dataManager.begin();
int code=dataManager.save(course);
dataManager.end();
}catch(Exception exception)
{
exception.printStackTrace();
}
}
}