package org.example.java8Examples.completableFuture.database;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.java8Examples.completableFuture.dto.Employee;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class EmployeeDatabase {

    public static List<Employee> fetchEmployee() throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        return mapper.readValue(new File("employees.json"),new TypeReference<List<Employee>>(){});
    }
}
