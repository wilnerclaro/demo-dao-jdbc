package application;

import java.text.SimpleDateFormat;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
	SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		
	
	SellerDao sellerDao = DaoFactory.createSellerDao();
	Seller seller = sellerDao.findById(3);
	
	System.out.println(seller);
	}

}
