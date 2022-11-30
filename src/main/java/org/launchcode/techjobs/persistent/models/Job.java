package org.launchcode.techjobs.persistent.models;

import org.aspectj.lang.annotation.RequiredTypes;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills =new ArrayList<>();

//    private final List<Employer> employers = new ArrayList<>(); // I was trying to create a many to many relationship using many to one annotation!

    public Job() {
    }

    public Job(Employer Employer, List<Skill> Skills) {
        super();
        this.employer = Employer;
        this.skills = Skills;
    }

    // Getters and setters.


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
