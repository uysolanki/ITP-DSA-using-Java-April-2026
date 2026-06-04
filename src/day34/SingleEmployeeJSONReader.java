package day34;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SingleEmployeeJSONReader {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
        try {
            Employee employee = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	   //absolute path
                new File("json/singleemployee.json"),									  //relative path
                new TypeReference<Employee>() {}
            );
            
            System.out.println(employee);
       
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
