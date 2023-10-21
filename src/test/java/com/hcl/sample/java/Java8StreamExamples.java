package com.hcl.sample.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
   int id;
   String name;
   float price;
   
   Product(int id,String name,float price)
   {
	   this.id=id;
	   this.name=name;
	   this.price=price;
   }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + "]";
}
	
}



public class Java8StreamExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> productsList=new ArrayList<Product>();
		
		productsList.add(new Product(1,"HP Laptop",24500f));
		productsList.add(new Product(2,"Dell Laptop",34500f));
		productsList.add(new Product(3,"Lenovo Laptop",34500f));
		productsList.add(new Product(4,"Sony Laptop",44500f));
		productsList.add(new Product(5,"Apple Laptop",94500f));
		
	   //find which are the products having more than 40k per month	
       productsList.stream().filter(p->p.price>40000).forEach(product->System.out.println(product.name));
       
       //Summing Product Price
       double totalPrice=productsList.stream().collect(Collectors.summingDouble(product->product.price));
       System.out.println(totalPrice);

       //max method to get maxprice
       Product pmax=productsList.stream().max((product1,product2)->product1.price>product2.price?1:-1).get();
       System.out.println("Max Price comprised for this "+pmax.name+" Product is "+pmax.price);
       
       
       
       //min method to get minprice
       Product pmin=productsList.stream().min((product1,product2)->product1.price>product2.price?1:-1).get();
       System.out.println(pmin.price);
       
       
       Collections.sort(productsList,Comparator.comparing(p->p.price));
       productsList.forEach(System.out::println);
       
       productsList.sort((Product prod1,Product prod2)->prod1.getName().compareTo(prod2.getName()));
       productsList.forEach(System.out::println);
	}

}
