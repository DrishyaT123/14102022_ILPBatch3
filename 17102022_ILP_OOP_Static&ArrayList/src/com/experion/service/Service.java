package com.experion.service;



import java.util.ArrayList;
import java.util.Scanner;



import com.experion.entity.Product;



public class Service {



   Product product = null;



   public static Product createProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product Code - ");
        String productCode = scanner.nextLine();



       System.out.println("Enter Product Name - ");
        String productName = scanner.nextLine();



       System.out.println("Enter Product Description - ");
        String productDescription = scanner.nextLine();



       System.out.println("Enter Product Price - ");
        double productPrice = scanner.nextDouble();



       System.out.println("Enter Open Date - ");
        String openDate = scanner.nextLine();



       scanner.nextLine();
        System.out.println("Enter Validity Date - ");
        String validityDate = scanner.nextLine();



       System.out.println("Enter Expiry Date - ");
        String expiryDate = scanner.nextLine();



       System.out.println("Enter whether product is active - ");
        boolean active = scanner.nextBoolean();



       Product product = new Product(productCode, productName, productDescription, productPrice, openDate,
                validityDate, expiryDate, active);
       
        product.setSerialNo(product.getSerialNo() + 1);
        product.setSerialNoOriginal(product.getSerialNo());
        return product; // returns created product



        
   }



   public static void displayProductDetails(ArrayList<Product> productList) {



       for (Product product : productList) {
            System.out.println("Seial No" + "   " + "Product Name " + "        " + "Product Description" + "        "
                    + "Product Price" + "            " + "Open Date" + "        " + "Expiry Date" + "  ");
            System.out.println(product.getSerialNoOriginal() + "   " + product.getProductName() + "                "
                    + product.getProductDescription() + "                " + product.getProductPrice() + "        "
                    + product.getOpenDate() + "        " + product.getExpiryDate());
        }



   }
}