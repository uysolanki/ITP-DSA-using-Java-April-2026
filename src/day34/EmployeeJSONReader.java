package day34;

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

public class EmployeeJSONReader {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		List<Employee> employees=null;
        try {
            employees = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	   //absolute path
                new File("json/employee.json"),									  //relative path
                new TypeReference<List<Employee>>() {}
            );
            
            System.out.println(employees);
       
        } catch (Exception e) {
            e.printStackTrace();
        }
		
        //display the count of Employees
		long countOfEmployees=employees.stream().count();
		System.out.println("Count of Employees "+countOfEmployees);
		
		 //display the department names
		List<String> deptNames=employees.stream()
				.map(emp->emp.getDepartment())
				.distinct()
				.toList();
		
		System.out.println(deptNames);
		
		
		 //display the employee object with max salary solution 1:using Optional
		Optional<Employee> highestEarningEmployee=employees.stream()
				.max(Comparator.comparing(Employee::getSalary));
				
		
		System.out.println(highestEarningEmployee.get());
		
		//display the employee object with max salary solution 2:using or else
				Employee highestEarningEmployee1=employees.stream()
						.max(Comparator.comparing(Employee::getSalary))
						.orElse(null);
						
				
				System.out.println(highestEarningEmployee1);
				
		//display the employee object with max salary solution 3:direct display
				employees.stream()
						.max(Comparator.comparing(Employee::getSalary))
						.ifPresent(System.out::println);
				
		//display the employee object with min salary 
				employees.stream()
						.min(Comparator.comparing(Employee::getSalary))
						.ifPresent(System.out::println);
				
		//display the employee object whose has joined the earliest
				employees.stream()
						.min(Comparator.comparing(Employee::getYearOfJoining))
						.ifPresent(System.out::println);
		
		//display the employee object whose has joined the latest
				employees.stream()
						.max(Comparator.comparing(Employee::getYearOfJoining))
						.ifPresent(System.out::println);
				
		//display how much the company is spending in payrol of salary
			double totalSalaryOfAllEmps=	employees.stream()						   //non primitive stream
						.mapToDouble(Employee::getSalary)  //primitive steam
						.sum();
			System.out.println(totalSalaryOfAllEmps);
			
		//deptwise count of employee
		//{"IT" : 4, "Sales" : 4 , "Marketing" : 4}
			Map<String,Long> deptWiseEmployeeCount=employees.stream()
			.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
			
			System.out.println(deptWiseEmployeeCount);
		//display empname whose sal is > than max salary of Sales Dept
		//inner query - max salary of Sales Dept i.e 2100
			
			double maxSalaryOfSalesDept=employees.stream()
					.filter(emp->"Sales".equalsIgnoreCase(emp.getDepartment()))
					.mapToDouble(Employee::getSalary)
					.max()
					.orElse(0.0);
			
			System.out.println(maxSalaryOfSalesDept);
			
			//outer query -get emp names whose sal is > 2100
			List<String> emps=employees.stream()
			.filter(emp->emp.getSalary()>maxSalaryOfSalesDept)
			.map(emp->emp.getName())
			.toList();
			
			System.out.println(emps);
			
			final List<Employee> newEmployees=employees;
			//combined solution
			List<String> emps1=newEmployees.stream()
					.filter(emp->emp.getSalary()>
					newEmployees.stream()
					.filter(emp1->"Sales".equalsIgnoreCase(emp1.getDepartment()))
					.mapToDouble(Employee::getSalary)
					.max()
					.orElse(0.0))
					.map(Employee::getName)
					.toList();
			System.out.println(emps1);
			
			//Top 3 Highest Paid Employees
			
			List<String> top3Emps=employees.stream()
			.sorted(Comparator.comparing(Employee::getSalary).reversed())
			.limit(3)
			.map(Employee::getName)
			.toList();
			
			System.out.println(top3Emps);
			
			//2nd Highest Paid Employees
			
			String secondHighestPaidEmployeeName= employees.stream()
			.sorted(Comparator.comparing(Employee::getSalary).reversed())
			.skip(1)
			.map(Employee::getName)
			.findFirst()
			.orElse(null);
			
			System.out.println(secondHighestPaidEmployeeName);
			
			//give list of all projects
			//flatMap ->2D convert to 1D
			
			List<String> projectNames=employees.stream()
			.flatMap(emp->emp.getProjects().stream())
			.map(project->project.getProjectName())
			.distinct()
			.toList();
			
			System.out.println(projectNames);
			
			employees.stream()
			.flatMap(emp->emp.getProjects().stream())
			.map(project->project.getProjectName())
			.distinct()
			.toList()
			.forEach(System.out::println);
			
			
			List<String> one=new ArrayList(Arrays.asList("Apple","Mango"));
			List<String> two=new ArrayList(Arrays.asList("Merc","BMW"));
			
			List<List<String>> three=new ArrayList<List<String>>(Arrays.asList(one,two));
			System.out.println(three);
			
			List<String> four=three.stream()
			.flatMap(list->list.stream())
			.toList();
			
			System.out.println(four);
			
			List<String> five=three.stream()
					.flatMap(List::stream)
					.toList();
					
					System.out.println(five);
			
		  // display various house types
					employees.stream()
					.map(emp->emp.getAddress().getHouseType())
					.distinct()
					.toList()
					.forEach(System.out::print);

		//display names of emlpoyees staying flat
					employees.stream()
					.filter(emp->"flat".equalsIgnoreCase(emp.getAddress().getHouseType()))
					.map(emp->emp.getName())
					.toList()
					.forEach(System.out::print);
					
					//display number of emlpoyees staying in flat
					long count=employees.stream()
					.filter(emp->"flat".equalsIgnoreCase(emp.getAddress().getHouseType()))
					.count();
					System.out.println(count);
					
					
	}
	
	
}

/*
[
{
[{},{}]
},

{
[{},{}]
}

{
[{},{}]
}


[{},{},{},{}]  List<Employee>
[]			   List<String>
*/