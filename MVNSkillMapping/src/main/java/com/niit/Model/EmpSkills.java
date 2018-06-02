package com.niit.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="EmployeeSkills")
public class EmpSkills {
    @Id
    int SkillId;
    @Column
    int EmpId;
    @Column
    String ApprovedStatus;
    public int getSkillId() {
        return SkillId;
    }
    public void setSkillId(int skillId) {
        SkillId = skillId;
    }
    public int getEmpId() {
        return EmpId;
    }
    public void setEmpId(int empId) {
        EmpId = empId;
    }
    public String getApprovedStatus() {
        return ApprovedStatus;
    }
    public void setApprovedStatus(String approvedStatus) {
        ApprovedStatus = approvedStatus;
    }

}