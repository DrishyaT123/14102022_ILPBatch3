package com.experion.utility;

import com.experion.entity.Product;
import com.experion.service.Service;

import java.util.Scanner;

public class ProductUtility {

	public static void main(String[] args) {
		
		
		Service service = new Service();
		service.inputProductDetails();
		service.displayProductDetails();



	}

}
