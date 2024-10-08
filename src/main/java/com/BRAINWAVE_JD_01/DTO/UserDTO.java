package com.BRAINWAVE_JD_01.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String name;
    private String password;
    private String address;
    private int age;
}
