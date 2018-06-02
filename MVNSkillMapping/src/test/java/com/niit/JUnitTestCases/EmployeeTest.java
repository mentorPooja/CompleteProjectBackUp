package com.niit.JUnitTestCases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.Config.ApplicationContext;
import com.niit.Model.EmployeeRegistration;
import com.niit.service.EmployeeService;



@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = ApplicationContext.class)


public class EmployeeTest {

	@Autowired
	private EmployeeService employeeService;
	EmployeeRegistration emp;

	@Before
	public void setup() {

		/*
		 * if(employeeService.getEmpByName("john")!=null) {
		 * employeeService.deleteEmp(employeeService.getEmpByName("Ryan").getEmpId()); }
		 * 
		 * if(employeeService.getEmpByName("sam")!=null) {
		 * employeeService.deleteEmp(employeeService.getEmpByName("John").getEmpId()); }
		 * 
		 * if(employeeService.getEmpByName("Chris")!=null) {
		 * employeeService.deleteEmp(employeeService.getEmpByName("Chris").getEmpId());
		 * }
		 */

		EmployeeRegistration emp1 = new EmployeeRegistration();
		emp1.setEmpName("Poorva");
		emp1.setEmpEmail("poorva@gmail.com");
		emp1.setEmpId(11);
		emp1.setEmpPassword("Poorva@123");
		emp1.setEmpRole("Technical Leader");
		emp1.setEmpAddress("Kothrud");
		emp1.setEmpCity("Pune");
		emp1.setEmpDob("08/05/1987");
		emp1.setEmpGender("F");
		emp1.setEmpMobile("9156198533");
		emp1.setEmpNationality("Indian");
		emp1.setEmpStatus("Active");
		emp1.setIBUName("ILS");
		emp1.setSupervisorName("Suzan");
		emp1.setSupervisorId(5);
		emp1.setSupervisorContact("8976432785");
		
		EmployeeRegistration emp2 = new EmployeeRegistration();
		emp2.setEmpName("suzan");
		emp2.setEmpEmail("suzan@gmail.com");
		emp2.setEmpId(5);
		emp2.setEmpPassword("suzan@04");
		emp2.setEmpRole("Manager");
		emp2.setEmpAddress("Gudgaon");
		emp2.setEmpCity("Delhi");
		emp2.setEmpDob("19/03/1980");
		emp2.setEmpGender("F");
		emp2.setEmpMobile("8976432785");
		emp2.setEmpNationality("Indian");
		emp2.setEmpStatus("Active");
		emp2.setIBUName("IFBI");
		emp2.setSupervisorContact("Shrinivas");
		emp2.setSupervisorId(3);
		emp2.setSupervisorContact("8976432785");
		
		employeeService.addEmp(emp1);
		employeeService.addEmp(emp2);
	
	}
	
	/*
	 * @After public void teardown() {
	 * 
	 * employeeService.deleteEmp(employeeService.getEmpByName("John").getEmpId());
	 * employeeService.deleteEmp(employeeService.getEmpByName("Chris").getEmpId());
	 * if(employeeService.getEmpByName("Ryan")!=null) {
	 * employeeService.deleteEmp(employeeService.getEmpByName("Ryan").getEmpId()); }
	 * }
	 */

	// +ve test case

	
	/*  @Test public void testAddEmp() {
	  
	  EmployeeRegistration emp=new EmployeeRegistration(); emp.setEmpId(109);
	  emp.setEmpName("Ryan"); emp.setEmpEmailId("ryan@gmail.com");
	  emp.setEmpPassword("ryan@123"); emp.setRole("Project Manager");
	  assertEquals(true, employeeService.addEmp(emp));
	  }*/
	
	// -ve test
	/*
	 * @Test public void testAddEmp() {
	 * 
	 * EmployeeRegistration emp=new EmployeeRegistration();
	 * emp.setEmpId(103);//error as trying to insert same id emp.setEmpName("Ryan");
	 * emp.setEmpEmailId("ryan@gmail.com"); emp.setEmpPassword("ryan@123");
	 * emp.setRole("Project Manager"); assertEquals(true,
	 * employeeService.addEmp(emp));
	 * 
	 * }
	 */

	/*
	 * @Test public void testdeleteEmp() {
	 * 
	 * int id=1; assertEquals(true, employeeService.deleteEmp(id));
	 * 
	 * }
	 */
	/*
	 * @Test public void testdeleteEmp() {
	 * 
	 * int id=102; assertEquals(true, employeeService.deleteEmp(id));
	 * 
	 * }
	 */

	/*
	 * //-VE TEST CASE
	 * 
	 * @Test public void testGetEmpByName() {
	 * 
	 * EmployeeRegistration emp=new EmployeeRegistration();
	 * 
	 * 
	 * assertEquals(1,employeeService.getEmpByName("John").getEmpId());
	 * 
	 * }
	 */

	/*
	 * @Test public void testGetEmpByName() {
	 * 
	 * EmployeeRegistration emp=new EmployeeRegistration();
	 * 
	 * 
	 * assertEquals(101,employeeService.getEmpByName("John").getEmpId()); }
	 */

	
	/*  @Test 
	  public void testGetEmpById() {
	 
	 EmployeeRegistration emp=new EmployeeRegistration();
	
	 
	  assertEquals("John",employeeService.getEmpById(101).getEmpName());
	  
	  }*/
	 
	// +ve test case
	
	@Test 
	public void testGetEmpDetails() 
	{
	 

	 int count = employeeService.getEmpDetails().size();

	assertEquals("success",4, count); 
	
	}
	
	// -ve test case

	/*
	 * @Test public void testGetEmpDetails() {
	 * 
	 * 
	 * int count = employeeService.getEmpDetails().size();
	 * 
	 * assertEquals("success", 3, count); }
	 */

/*@Test
	public void testUpdateEmp() {
	
		// emp = new EmployeeRegistration();
		
		emp = employeeService.getEmpById(108);
		
		emp.setEmpEmailId("test@gmail.com");
		
		
		System.out.println(emp);
		
		boolean flag = employeeService.updateEmp(emp);

		assertEquals("success", true, flag);
	}*/

}