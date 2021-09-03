package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
	
	System.out.println("=== TEST 1: department findById ===");
	Department department = departmentDao.findById(2);
	System.out.println(department);
	
	
	System.out.println("\n=== TEST 2: department findAll ===");
	List<Department> list = departmentDao.findAll();
	for (Department department2 : list) {
		System.out.println(department2);
	}
	
	System.out.println("\n=== TEST 3: department insert ===");
	Department newDepartment =  new Department(null, "Store");
	departmentDao.insert(newDepartment);
	System.out.println("Inserted! New id = " + newDepartment.getId());
	
	System.out.println("\n=== TEST 4: department update ===");
	department = departmentDao.findById(1);
	department.setName("Shoes");
	departmentDao.update(department);
	System.out.println("Updated Completed!");
	
	System.out.println("\n=== TEST 5: department delete ===");
	System.out.println("Entre id for delete test: ");
	int id = sc.nextInt();
	departmentDao.deleteById(id);
	System.out.println("Deleted completed!");
	
	}
	
	
	
	

}
