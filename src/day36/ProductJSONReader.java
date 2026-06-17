package day36;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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
        
        
       //display me 1st 15 chars of all product titles
    	List<String> titles=products.stream()
    	.map(Product::getTitle)
    	.map(str->str.substring(0,14))
    	.toList();
    	
    	System.out.println(titles);
    	
    	//display me total count of raters
    	long sumOfRatings=products.stream()
    	.map(emp->emp.getRating())
    	.mapToInt(Rating::getCount)
    	.sum();
    	
    	System.out.println(sumOfRatings);
    	
    	//display me price of most costliest electronic product
    	double  priceOfMostCostliestElectronicProduct=products.stream()
    	.filter(product->"electronics".equalsIgnoreCase(product.getCategory()))
    	.mapToDouble(Product::getPrice)
    	.max()
    	.orElse(0.0);
    	
    	System.out.println(priceOfMostCostliestElectronicProduct);
    	
    	
    	//display me average price of jewelery products
    	double  avgPriceOfJeweleryProducts=products.stream()
    	.filter(product->"jewelery".equalsIgnoreCase(product.getCategory()))
    	.mapToDouble(Product::getPrice)
    	.average()
    	.orElse(0.0);
    	
    	System.out.println(avgPriceOfJeweleryProducts);
    	
    	//display product title which has been rated by maximum people
    	System.out.println(products.stream()
    	.map(Product::getRating)
    	.mapToInt(Rating::getCount)
    	.max()
    	.orElse(0));
    	
    	final List<Product> products1=products;
    	products.stream()
    	.filter(product->product.getRating().getCount()==products1.stream()
    	.map(Product::getRating)
    	.mapToInt(Rating::getCount)
    	.max()
    	.orElse(0))
    	.forEach(product->System.out.print(product.getTitle()));
    	
    	System.out.println();
    	//group products based on category
    	
    	Map<String, List<Product>> groupByCategory=
    			products.stream()
    			.collect(Collectors.groupingBy(Product::getCategory));
    	
    	System.out.println(groupByCategory);
    	
    	//Get the distinct categories
    	List<String> distinctCategory=
		products.stream()
		.collect(Collectors.groupingBy(Product::getCategory))
		.entrySet()
		.stream()
		.map(entry->entry.getKey())
		.distinct()
		.toList();
    	
    	System.out.println(distinctCategory);
    	
    	List<String> distinctCategory1=
    			products.stream()
    			.map(Product::getCategory)
    			.distinct()
    			.toList();
    	
    	System.out.println(distinctCategory1);
    	
    	//top3 highest rated products
    	products.stream()
    	.sorted(new RateComparator())
    	.limit(3)
    	.map(Product::getTitle)
    	.toList()
    	.forEach(System.out::println);
    	System.out.println("**************");
    	
    	Comparator<Product> rateComp=(o1, o2)->{
    		if(o1.getRating().getRate()>o2.getRating().getRate())
    			return -1;
    		else if(o1.getRating().getRate()<o2.getRating().getRate())
    			return 1;
    		else return 0;
    	};
    	
    	
    	
    	//top3 highest rated products
    	products.stream()
    	.sorted(rateComp)
    	.limit(3)
    	.map(Product::getTitle)
    	.toList()
    	.forEach(System.out::println);
    	
    	//average price of all electronics products
    	double averagePriceOfElectronics=products.stream()
    	.filter(prod->"electronics".equalsIgnoreCase(prod.getCategory()))
    	.mapToDouble(Product::getPrice)
    	.average()
    	.orElse(0.0);
 
    	System.out.println(averagePriceOfElectronics);
    	
    	
    	
    	//average price per category
    	Map<String,Double> averagePricePerCategory= products.stream()
    			.collect(Collectors.groupingBy(Product::getCategory,Collectors.averagingDouble(Product::getPrice)));
    					
    	System.out.println(averagePricePerCategory);
    	
    	//display product titles group by category
    	Map<String,List<String>> productTitlesGroupedByCategory=products.stream()
    			.collect(Collectors.groupingBy(Product::getCategory,Collectors.mapping(Product::getTitle,Collectors.toList())));
    	
    	System.out.println(productTitlesGroupedByCategory);
    	
    	//display product titles(1st 10 chars) group by category
    	Map<String,List<String>> productTitlesGroupedByCategory1=products.stream()
    			.collect(Collectors.groupingBy(Product::getCategory,Collectors.mapping(prod->prod.getTitle().substring(0,9),Collectors.toList())));
    	
    	System.out.println(productTitlesGroupedByCategory1);
    					
   
    	//display category which has highest average price
    	String categoryWithHighestAveragePrice= products.stream()
    			.collect(Collectors.groupingBy(Product::getCategory,Collectors.averagingDouble(Product::getPrice)))
    			.entrySet()
    			.stream()
    			.max(Map.Entry.comparingByValue())
    			.map(Map.Entry::getKey)
    			.orElse(null);
    					
    	System.out.println(categoryWithHighestAveragePrice);
    	
    	
    	
	}
	
	
}
