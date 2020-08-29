package com.app.role.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Role{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String roleName;
    private String role_additional_information;

    public Role (String _name, String a, String b, String c){

        roleName=_name;
        role_additional_information= a + ',' +b + ',' + c;

    }
}
