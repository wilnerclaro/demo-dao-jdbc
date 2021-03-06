package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	SellerDao sellerDao = DaoFactory.createSellerDao();
	
	System.out.println("=== TEST 1: seller findById ===");
	Seller seller = sellerDao.findById(3);
	System.out.println(seller);
	
	System.out.println("\n=== TEST 2: seller findByDepartment ===");
	Department department = new Department(2, null);
	List<Seller> list = sellerDao.findByDepartment(department);
	for (Seller seller2 : list) {
		System.out.println(seller2);
	}
	
	System.out.println("\n=== TEST 3: seller findAll ===");
	list = sellerDao.findAll();
	for (Seller seller2 : list) {
		System.out.println(seller2);
	}
	
	System.out.println("\n=== TEST 4: seller insert ===");
	Seller newSeller =  new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
	sellerDao.insert(newSeller);
	System.out.println("Inserted! New id = " + newSeller.getId());
	
	System.out.println("\n=== TEST 6: seller update ===");
	seller = sellerDao.findById(1);
	seller.setName("Martha Waine");
	sellerDao.update(seller);
	System.out.println("Updated Completed!");
	
	System.out.println("\n=== TEST 7: seller delete ===");
	System.out.println("Entre id for delete test: ");
	int id = sc.nextInt();
	sellerDao.deleteById(id);
	System.out.println("Deleted completed!");
	}
	
	
	
	

}
