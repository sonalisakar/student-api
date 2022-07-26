package com.bksoft.studentapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(generator = "address_id_seq")
    @SequenceGenerator(name = "address_id_seq", sequenceName = "ADDRESS_ID_SEQ", allocationSize = 1)
    @Column(name = "address_id")
    private int addressId;

    @Column(name="line1")
    private String line1;

    @Column(name="line2")
    private String line2;

    @Column(name="city")
    private String city;

    @Column(name="district")
    private String district;

    @Column(name="state")
    private String state;

    @Column(name="postal_code")
    private int postalCode;

    @ManyToOne
    @JsonBackReference(value = "student-ref")
    @PrimaryKeyJoinColumn(name = "roll_no")
    //@JoinColumn(name="roll_no")
    private Student student;




    //@Column(name = "roll_no", insertable = false, updatable = false)
    //private int rollNo;


}
