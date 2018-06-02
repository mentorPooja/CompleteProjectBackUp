package com.niit.Model;

import javax.persistence.*;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="Skills")

public class Skills {

    @Id
    int SkillId; 
    @Column
    String SkillName;
    public int getSkillId() {
        return SkillId;
    }
    public void setSkillId(int skillId) {
        SkillId = skillId;
    }
    public String getSkillName() {
        return SkillName;
    }
    public void setSkillName(String skillName) {
        SkillName = skillName;
    }

}