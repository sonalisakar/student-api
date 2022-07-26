package com.bksoft.studentapi.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(generator="my_seq")
    @SequenceGenerator(name="my_seq",sequenceName="MY_SEQ", allocationSize=1)
    @Column(name = "roll_no")
    private int rollNo;


    @Column(name = "name")
    private String name;

    @JsonManagedReference("student-ref")
    @OneToMany(cascade = CascadeType.ALL,mappedBy ="student", fetch = FetchType.EAGER)
    //@JoinColumn(name = "roll_no",referencedColumnName = "roll_no")

    private Set<Address> addressSet;

}
