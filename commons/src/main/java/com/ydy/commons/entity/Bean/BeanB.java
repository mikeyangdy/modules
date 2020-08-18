package com.ydy.commons.entity.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BeanB implements Serializable {
    private String id;
    private String username;
    private String password;
    private String type;
}
