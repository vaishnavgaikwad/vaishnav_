package com.crm.payload;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Data
@Getter@Setter
public class EmployeeDto {

    private Long id;

    @NotBlank
    @Size(min=3,message = "atleast 3 character required")
    private String name;

    @Email
    private String emailId;

    @Size(min=10,max=10,message="shoud be at least 10 characters")
    private String mobile;

//    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    public Date getDate() {
//        return date;
//    }
}
