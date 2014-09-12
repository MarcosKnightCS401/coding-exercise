package com.s5a.interview;

//need to import ServiceProduct
//need to import Product

public class ProductController {

    Product product = ServiceProduct.add("Saks-brand-name");

    private String showProduct() {
        product.getBrandName() //need to add ;
    }

    public boolean addProduct(String brandName) {
        product = serviceProduct.add(brandName);  

        return true; 
        //remove this entire implementation and add return serviceProduct.add(brandName);
    }

    public static void formatedBrandName() {
        System.out.println("Current product: " + product.getBrandName) //need to add () after getBrandName method and need to add ; after println statement
    }

}
