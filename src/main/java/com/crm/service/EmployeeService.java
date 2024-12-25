package com.crm.service;

import com.crm.entity.Employee;
import com.crm.exception.ResourceNotFound;
import com.crm.payload.EmployeeDto;
import com.crm.repository.EmployeeRepository;
//import org.modelmapper.ModelMapper;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
//import java.util.Optional;
import java.util.stream.Collectors;

//@Service
//public class EmployeeService {
//
//
//    private EmployeeRepository employeeRepository;
//
//
//    public EmployeeService(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
//
//    public void addEmployee(Employee employee) {
//        employeeRepository.save(employee);
//    }
//
//    public void deleteEmployeeById(long id) {
//        employeeRepository.deleteById(id);
//
//    }
//
//    public void updateEmployee(long id, EmployeeDto dto) {
//
//
//        Optional<Employee> opEmp = employeeRepository.findById(id);
//        Employee employee = opEmp.get();
//        employee.setName(dto.getName());
//        employee.setEmailId(dto.getEmailId());
//        employee.setMobile(dto.getMobile());
//        employeeRepository.save(employee);
//    }
//
//    public List<Employee> getAllEmployee() {
//           return employeeRepository.findAll();
//
//    }
//
//
//    }
//
//@Service
//public class EmployeeService{
//
//    private EmployeeRepository employeeRepository;
//
//    public EmployeeService(EmployeeRepository employeeRepository){
//        this.employeeRepository=employeeRepository;
//    }
//
//    public Employee addEmployee(Employee employee){
//      Employee emp= employeeRepository.save(employee);
//       return emp;
//    }
//    public void deleteEmployee( long id){
//        employeeRepository.deleteById(id);
//
//    }
//    public void updateEmployee(long id,EmployeeDto dto){
//        Optional<Employee> opEmp = employeeRepository.findById(id);
//        Employee employee = opEmp.get();
//        employee.setName(dto.getName());
//        employee.setEmailId(dto.getEmailId());
//        employee.setMobile(dto.getMobile());
//        employeeRepository.save(employee);
//
//
//    }
//
//    public List<Employee> getEmployee() {
//        return employeeRepository.findAll();
//
//    }
//}

//@Service
//public class EmployeeService {
//
//    private EmployeeRepository employeeRepository;
//
//    public  EmployeeService(EmployeeRepository employeeRepository){
//        this.employeeRepository=employeeRepository;
//    }
//    public EmployeeDto addEmployee(EmployeeDto dto){
//        Employee employee =mapToEntity(dto);
//               Employee emp= employeeRepository.save(employee);
//               EmployeeDto employeedto=mapToDto(emp);
////               employeedto.setDate(new Date());
//        return employeedto;
//    }
//
//
//    public void deleteById(long id){
//        employeeRepository.deleteById(id);
//    }
//    public EmployeeDto updateEmployee(long id,EmployeeDto dto){
//     Employee employee= mapToEntity(dto);
//     employee.setId(id);
//        Employee updateEmployee=employeeRepository.save(employee);
//        EmployeeDto employeedto=mapToDto(updateEmployee);
//        return employeedto;
//    }
//    public List<EmployeeDto>getEmployee(){
//      List<Employee> employees=employeeRepository.findAll();
//      List<EmployeeDto>dto =employees.stream().map(e->mapToDto(e)).collect(Collectors.toList());
//      return dto;
//    }
//
//
//
//    EmployeeDto mapToDto(Employee employee){
//        EmployeeDto dto=new EmployeeDto();
//        dto.setId(employee.getId());
//        dto.setName(employee.getName());
//        dto.setEmailId(employee.getEmailId());
//        dto.setMobile(employee.getMobile());
//        return dto;
//    }
//
//    Employee mapToEntity(EmployeeDto dto){
//        Employee employee=new Employee();
//        employee.setId(dto.getId());
//        employee.setName(dto.getName());
//        employee.setEmailId(dto.getEmailId());
//        employee.setMobile(dto.getMobile());
//        return employee;
//
//}
//
//    }

//@Service
//public class EmployeeService{
//
//    private EmployeeRepository employeeRepository;
//
//    private ModelMapper modelMapper;
//
//    public EmployeeService(EmployeeRepository employeeRepository,ModelMapper modelMapper){
//        this.employeeRepository=employeeRepository;
//        this.modelMapper= modelMapper;
//    }
//
//
//    public EmployeeDto addEmployee(EmployeeDto dto){
//        Employee employee =mapToEntity(dto);
//               Employee emp= employeeRepository.save(employee);
//               EmployeeDto employeedto=mapToDto(emp);
//               return employeedto;
//    }
//    public void deleteById(long id){
//        employeeRepository.deleteById(id);
//    }
//    public EmployeeDto updateEmployee(long id, EmployeeDto dto){
//        Employee employee=mapToEntity(dto);
//        Employee updateemployee=employeeRepository.save(employee);
//        EmployeeDto employeeDto=mapToDto(updateemployee);
//        return employeeDto;
//
//    }
//        public List<EmployeeDto>getEmployee(){
//      List<Employee> employees=employeeRepository.findAll();
//      List<EmployeeDto>dto =employees.stream().map(e->mapToDto(e)).collect(Collectors.toList());
//      return dto;
//    }
//    EmployeeDto mapToDto(Employee employee){
//       EmployeeDto dto= modelMapper.map(employee,EmployeeDto.class);
//        return dto;
//    }
//
//    Employee mapToEntity(EmployeeDto dto){
//        Employee emp =modelMapper.map(dto,Employee.class);
//        return emp;
//
//}
//
//    public EmployeeDto getEmployeeById(long empId) {
//        Employee employee = employeeRepository.findById(empId)
//                .orElseThrow(() -> new ResourceNotFound("Record not found for ID: " + empId));
//        return mapToDto(employee);
//    }
//}

@Service
public class EmployeeService{

    private EmployeeRepository employeeRepository;
    private ModelMapper modelMapper;


    public EmployeeService (EmployeeRepository employeeRepository,ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper=modelMapper;
    }
    public EmployeeDto addEmployee(EmployeeDto dto){
        Employee employee=mapToEntity(dto);
        Employee emp =employeeRepository.save(employee);
        EmployeeDto employeeDto=mapToDto(emp);
        return employeeDto;
    }
    public void deleteById(long id) {
        employeeRepository.deleteById(id);
    }








    public EmployeeDto updateEmployee(long id, EmployeeDto dto) {
        Employee employee=mapToEntity(dto);
        employee.setId(id);
        Employee updateEmployee=employeeRepository.save(employee);
        EmployeeDto dto1=mapToDto(updateEmployee);
        return dto1;
    }

    public List<EmployeeDto> getEmployee(int pageNo, int pageSize, String sortBy,String sortDir) {
      Sort sort=sortDir.equalsIgnoreCase("asc") ?Sort.by(sortBy).ascending():Sort.by(sortBy).descending();
       Pageable page = PageRequest.of(pageNo, pageSize, sort);
        Page<Employee>all =employeeRepository.findAll(page);
        List<Employee> employees=all.getContent();
       List<EmployeeDto> employeeDtos= employees.stream().map(e->mapToDto(e)).collect(Collectors.toList());
       return employeeDtos;

    }

    EmployeeDto mapToDto(Employee employee){
        EmployeeDto dto= modelMapper.map(employee,EmployeeDto.class);
        return dto;
    }

    Employee mapToEntity(EmployeeDto dto) {
        Employee emp = modelMapper.map(dto, Employee.class);
        return emp;
    }


    public EmployeeDto getEmployeeById(long empId) {
        Employee employee = employeeRepository.findById(empId)
                .orElseThrow(() -> new ResourceNotFound("Record not found for ID: " + empId));
        return mapToDto(employee);
    }
}





