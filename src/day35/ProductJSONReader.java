package day35;

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
    	
	}
	
	
}
