package E02.CompanyRooster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());

        HashMap<String, Department> departments = new HashMap<>();

        while (count-- > 0) {
            String line = reader.readLine();
            String[] tokens = line.split("\\s+");
            String departmentName = tokens[3];

            Employee emp = new Employee(
                    tokens[0],
                    Double.parseDouble(tokens[1]),
                    tokens[2]);

            if (tokens.length==5){
                if (Character.isDigit(tokens[4].charAt(0))){
                    emp.setAge(Integer.parseInt(tokens[4]));
                }
                else {
                    emp.setEmail(tokens[4]);
                }
            }
            else if (tokens.length == 6){
                emp.setEmail(tokens[4]);
                emp.setAge(Integer.parseInt(tokens[5]));
            }
            if (!departments.containsKey(departmentName)){
                departments.put(departmentName,new Department());
            }
            departments.get(departmentName).addEmployee(emp);
        }
        Map.Entry<String, Department> highestAverageSalary = departments.entrySet().stream()
                    .sorted((f,s )-> {
                        int result = 0;
                        if (s.getValue().getAvarageSalary() > f.getValue().getAvarageSalary()) {
                            result = 1;
                        } else if (s.getValue().getAvarageSalary() < f.getValue().getAvarageSalary()) {
                            result = -1;

                        }
                        return result;

                    }).findFirst()
                    .get();
        System.out.println(String.format("Highest Average Salary: %s", highestAverageSalary.getKey()));
        highestAverageSalary.getValue().getEmployees()
                .stream()
                .sorted((f,s ) -> Double.compare(s.getSalary(), f.getSalary()))
                .forEach(employee -> {
            System.out.println(String.format("%s %.2f %s %d",
                    employee.getName(),
                    employee.getSalary(),
                    employee.getEmail(),
                    employee.getAge()));
        });
    }
}