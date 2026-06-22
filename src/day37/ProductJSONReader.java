package day37;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProductJSONReader {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		List<Product> products=null;
        try {
            products = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	   //absolute path
                new File("json/products.json"),									  //relative path
                new TypeReference<List<Product>>() {}
            );
            
            System.out.println(products);
       
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //display category wise count of products
        
        Map<String,Long> categoryWiseCountOfProducts= products.stream()
        .collect(Collectors.groupingBy(Product::getCategory,Collectors.counting()));
        
        System.out.println(categoryWiseCountOfProducts);
        
        //select category,count(*)
        //from product
        //group by category;
        
//display category which is having maximum products
//        String categoryHavingMaxProducts= products.stream()
//        .collect(Collectors.groupingBy(Product::getCategory,Collectors.counting()))
//        .entrySet()
//        .stream()
//        .max(Map.Entry.comparingByValue())
//        .map(Map.Entry::getKey)
//        .orElse(null);
//        
//        System.out.println(categoryHavingMaxProducts);
        
        //select category,count(*) as 'categorycount'
        //from product
        //group by category
        //order by categorycount desc
        //limit 1
        
        //select category,count(*) as 'categorycount'
        //from product
        //group by category
        //HAVING COUNT(*) = (
        //SELECT MAX(categoryCount)
        //FROM (
        //    SELECT COUNT(*) AS categoryCount
        //    FROM product
        //    GROUP BY category
        //) 
        //);
        
        //display maximum price per category
        Map<String,Optional<Product>> maxPricesPerCategory= products.stream()
        		.collect(Collectors.groupingBy(Product::getCategory,Collectors.maxBy(Comparator.comparing(Product::getPrice))));
       
        System.out.println(maxPricesPerCategory);
        
        Map<String,Double> maxPricesPerCategory1= products.stream()
        		.collect(Collectors.groupingBy(Product::getCategory,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Product::getPrice)), prod->prod.map(Product::getPrice).orElse(0.0))));
        System.out.println(maxPricesPerCategory1);
        
        
        Map<String,Double> maxPricesPerCategory2=products.stream()
        		.collect(Collectors.groupingBy(Product::getCategory,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Product::getPrice)), prod->prod.map(Product::getPrice).orElse(0.0))));
 
        //select category, max(price)
        //from product
        //group by category;
        
        
        //display the product titles where price > avg price of electronics
        
        //Display the names of products whose price is shared by at least one other product;
        
        
       Map<Double,List<String>> map= products.stream()
        .collect(Collectors.groupingBy(Product::getPrice,Collectors.mapping(Product::getTitle, Collectors.toList())));
       
       System.out.println(map);
       
       Map<Double,List<String>> map1= products.stream()
    	        .collect(Collectors.groupingBy(Product::getPrice, Collectors.mapping(Product::getTitle, Collectors.toList())))
    	        .entrySet()
    	        .stream()
    	        .filter(entry->entry.getValue().size()>1)
    	        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    	       
       System.out.println(map1);
       
       List<String> map2= products.stream()
   	        .collect(Collectors.groupingBy(Product::getPrice, Collectors.mapping(Product::getTitle, Collectors.toList())))
   	        .entrySet()
   	        .stream()
   	        .filter(entry->entry.getValue().size()>1)
   	        .flatMap(entry->entry.getValue().stream())
   	        .toList();
   	       
      System.out.println(map2);
    	         
	}
}

//eno  ename salary
//1    Alice 800
//2    Ben   800
//3    Chris 1000
//4    David 1000
//5    Frank 1100

//Display the names of employees whose salary is shared by at least one other employee
//ename
//Alice
//Ben
//Chris
//David