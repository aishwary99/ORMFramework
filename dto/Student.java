package dto;
import com.thinking.machines.orm.annotations.*;
@Table(name="student")
public class Student
{
@PrimaryKey(name="roll_number")
@Column(name="roll_number")
private Integer rollNumber;
@Column(name="first_name")
private String firstName;
@Column(name="last_name")
private String lastName;
@Column(name="aadhar_card_number")
private Integer aadharCardNumber;
@ForeignKey(parent="course",column="code")
@Column(name="course_code")
private Integer courseCode;
@Column(name="gender")
private String gender;
@Column(name="date_of_birth")
private java.sql.Date dateOfBirth;
public Student()
{
}
public void  setRollNumber(Integer rollNumber)
{
this.rollNumber=rollNumber;
}
public Integer getRollNumber()
{
return this.rollNumber;
}
public void  setFirstName(String firstName)
{
this.firstName=firstName;
}
public String getFirstName()
{
return this.firstName;
}
public void  setLastName(String lastName)
{
this.lastName=lastName;
}
public String getLastName()
{
return this.lastName;
}
public void  setAadharCardNumber(Integer aadharCardNumber)
{
this.aadharCardNumber=aadharCardNumber;
}
public Integer getAadharCardNumber()
{
return this.aadharCardNumber;
}
public void  setCourseCode(Integer courseCode)
{
this.courseCode=courseCode;
}
public Integer getCourseCode()
{
return this.courseCode;
}
public void  setGender(String gender)
{
this.gender=gender;
}
public String getGender()
{
return this.gender;
}
public void  setDateOfBirth(java.sql.Date dateOfBirth)
{
this.dateOfBirth=dateOfBirth;
}
public java.sql.Date getDateOfBirth()
{
return this.dateOfBirth;
}
}