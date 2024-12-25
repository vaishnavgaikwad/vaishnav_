package com.crm.controller;

import com.crm.entity.Employee;
import com.crm.payload.EmployeeDto;
import com.crm.service.EmployeeService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.prefs.PreferenceChangeEvent;
//
//@RestController
//@RequestMapping("/api/v1/employee")
//public class EmployeeController {
//
//
//    private EmployeeService employeeService;
//
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    //create method to add employee
////    http://localhost:8080/api/v1/employee/add
//
//    @PostMapping("/add")
//    public String addEmployee(
//            @RequestBody Employee employee
//    ) {
////        System.out.println(employee.getName());
////        System.out.println(employee.getEmailId());
////        System.out.println(employee.getMobile());
//
//        employeeService.addEmployee(employee);
//        return "saved";
//    }
//
//    @PutMapping
//    public String updateEmployee(
//            @RequestParam long id,
//            @RequestBody EmployeeDto dto
//    ) {
//        employeeService.updateEmployee(id, dto);
//        return "record is update successfully";
//
//    }
//
//    @GetMapping
//    public List<Employee> getAllEmployee(
//
//
//    ) {
//        List<Employee> employees = employeeService.getAllEmployee();
//        return employees;
//
//    }
//
//}
////
//@RestController
//@RequestMapping("/api/v1/employee")
//public class EmployeeController{
//
//    private EmployeeService employeeService;
//
//    public EmployeeController(EmployeeService employeeService){
//        this.employeeService=employeeService;
//    }
//
//    @PostMapping("/add")
//    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
//       Employee emp= employeeService.addEmployee(employee);
//        return new ResponseEntity(emp,HttpStatus.CREATED);
//
//    }
//    @DeleteMapping
//    public ResponseEntity<String> deleteEmployee(@RequestParam long id){
//        employeeService.deleteEmployee(id);
//        return new ResponseEntity<>("deleted",HttpStatus.OK);
//
//    }
//    @PutMapping
//    public ResponseEntity<String> updateEmployee(@RequestBody EmployeeDto dto, @RequestParam long id){
//       employeeService.updateEmployee(id,dto);
//        return new ResponseEntity<>("updated",HttpStatus.OK);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Employee>> getEmplpoyee(){
//
//        List<Employee>employees=employeeService.getEmployee();
//        return new ResponseEntity<>(employees,HttpStatus.OK);
//    }
//
//}
//
//@RestController
//@RequestMapping("/api/v1/employee")
//public class EmployeeController{
//
//    private EmployeeService employeeService;
//    private ModelMapper modelMapper;
//
//    public EmployeeController(EmployeeService employeeService){
//        this.employeeService=employeeService;
//        this.modelMapper=modelMapper;
//    }
//
//    @PostMapping ("/add")
//    public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto dto){
//        EmployeeDto employeedto=employeeService.addEmployee(dto);
//        return new ResponseEntity<>(employeedto, HttpStatus.CREATED);
//    }
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String>  deleteById(@PathVariable long id ){
//        employeeService.deleteById(id);
//        return new ResponseEntity<>("deleted", HttpStatus.OK);
//
//    }
//    @PutMapping("/{id}")
//    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable long id, @RequestBody EmployeeDto dto){
//        EmployeeDto employeedto=employeeService.updateEmployee(id,dto);
//        return new ResponseEntity<>(employeedto, HttpStatus.OK);
//
//    }
//
//    @GetMapping
//    public ResponseEntity<List<EmployeeDto>>getEmployee(){
//        List<EmployeeDto>employeesdto=employeeService.getEmployee();
//        return new ResponseEntity<>(employeesdto,HttpStatus.OK);
//    }
//}

//@RestController
//@RequestMapping("/api/v1/employee")
//public class EmployeeController{
//
//    private EmployeeService employeeService;
//
//    public EmployeeController(EmployeeService employeeService){
//        this.employeeService=employeeService;
//    }
//    @PostMapping("/add")
//    public ResponseEntity <EmployeeDto> addEmployee(@RequestBody EmployeeDto dto){
//       EmployeeDto employeedto= employeeService.addEmployee(dto);
//       return new ResponseEntity<>(employeedto,HttpStatus.CREATED);
//    }
//    @DeleteMapping
//    public ResponseEntity<String>deleteById(@RequestParam long id){
//        employeeService.deleteById(id);
//        return new ResponseEntity<>("Deleted",HttpStatus.OK);
//    }
//    @PutMapping
//    public ResponseEntity<EmployeeDto>updateEmployee(@RequestParam long id,@RequestBody EmployeeDto dto){
//       EmployeeDto employeeDto= employeeService.updateEmployee(id,dto);
//       return new ResponseEntity<>(employeeDto,HttpStatus.OK);
//    }
//
//@GetMapping
//public ResponseEntity<List<EmployeeDto>>getEmployees(){
//        List<EmployeeDto>employeesDto=employeeService.getEmployee();
//        return new ResponseEntity<>(employeesDto,HttpStatus.OK);
//
//}
//
//    @GetMapping("/employeeId/{empId}")
//    public ResponseEntity<EmployeeDto>getEmployeeById(@PathVariable long empId ){
//        EmployeeDto dto=employeeService.getEmployeeById(empId);
//        return new ResponseEntity<>(dto,HttpStatus.OK);
//    }
//
//}

//@RestController
//@RequestMapping("/api/v1/employee")
//public class EmployeeController{
//
//    private EmployeeService employeeService;
//
//    public EmployeeController(EmployeeService employeeService){
//        this.employeeService=employeeService;
//    }
//    @PostMapping("/add")
//    public ResponseEntity <EmployeeDto> addEmployee(@RequestBody EmployeeDto dto){
//        EmployeeDto employeedto= employeeService.addEmployee(dto);
//        return new ResponseEntity<>(employeedto,HttpStatus.CREATED);
//    }
//    @DeleteMapping
//    public ResponseEntity<String>deleteById(@RequestParam long id){
//        employeeService.deleteById(id);
//        return new ResponseEntity<>("Deleted",HttpStatus.OK);
//    }
//    @PutMapping
//    public ResponseEntity<EmployeeDto>updateEmployee(@RequestParam long id,@RequestBody EmployeeDto dto){
//        EmployeeDto employeeDto= employeeService.updateEmployee(id,dto);
//        return new ResponseEntity<>(employeeDto,HttpStatus.OK);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<EmployeeDto>>getEmployees(){
//        List<EmployeeDto>employeesDto=employeeService.getEmployee();
//        return new ResponseEntity<>(employeesDto,HttpStatus.OK);
//
//    }
//
//    @GetMapping("/employeeId/{empId}")
//    public ResponseEntity<EmployeeDto>getEmployeeById(@PathVariable long empId ){
//        EmployeeDto dto=employeeService.getEmployeeById(empId);
//        return new ResponseEntity<>(dto,HttpStatus.OK);
//    }
//
//}
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }


@PostMapping("/add")
public ResponseEntity<?>addEmployee(@Valid @RequestBody EmployeeDto dto,BindingResult request){
        if(request.hasErrors()){
            return  new ResponseEntity<>(request.getFieldError().getDefaultMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
        EmployeeDto employeeDto=employeeService.addEmployee(dto);
        return new ResponseEntity<>(employeeDto,HttpStatus.CREATED);
}

@DeleteMapping
    public ResponseEntity<String> deleteEmployee(@RequestParam long id){
        employeeService.deleteById(id);
        
        return new ResponseEntity<>("deleted",HttpStatus.OK);
}
@PutMapping
  public ResponseEntity<EmployeeDto>updateEmployee(@RequestParam long id,@RequestBody EmployeeDto dto){
    EmployeeDto dto1=employeeService.updateEmployee(id, dto);
    return new ResponseEntity<>(dto1,HttpStatus.OK);
}

//http:8080/api/v1/employee?pageSize=3&pageNo=1&sort=By=email
//    http://localhost:8080/api/v1/employee?pageNo=0&pageSize=3&sortBy=emailId&sortDir=asc
@GetMapping
 public ResponseEntity<List<EmployeeDto>>getEmployee(@RequestParam(name="pageSize",required=false,defaultValue = "5")int pageSize,
                                                       @RequestParam(name="pageNo",required=false,defaultValue = "0")int pageNo,
                                                     @RequestParam(name="sortBy",required=false,defaultValue = "name")String sortBy,
                                                     @RequestParam(name="sortDir",required=false,defaultValue = "asc")String sortDir

){

        List<EmployeeDto>employeesDtos=employeeService.getEmployee(pageNo,pageSize,sortBy,sortDir);
        return new ResponseEntity<>(employeesDtos,HttpStatus.OK);
}



    @GetMapping("/employeeId/{empId}")
    public ResponseEntity<EmployeeDto>getEmployeeById(@PathVariable long empId ){
        EmployeeDto dto=employeeService.getEmployeeById(empId);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }
}
