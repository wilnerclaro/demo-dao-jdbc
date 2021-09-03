package application;

import java.text.SimpleDateFormat;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
	SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	SellerDao sellerDao = DaoFactory.createSellerDao();
	
	System.out.println("=== TEST 1: seller findById ===");
	Seller seller = sellerDao.findById(3);
	System.out.println(seller);
	
	System.out.println("\n=== TEST 2: seller findByDepartment===");
	Department department = new Department(2, null);
	List<Seller> list = sellerDao.findByDepartment(department);
	for (Seller seller2 : list) {
		System.out.println(seller2);
	}
	
	System.out.println("\n=== TEST 3: seller findAll===");
	
	list = sellerDao.findAll();
	for (Seller seller2 : list) {
		System.out.println(seller2);
	}
	
	}

}
