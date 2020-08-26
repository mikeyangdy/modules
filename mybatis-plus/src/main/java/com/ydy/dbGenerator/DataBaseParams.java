package com.ydy.dbGenerator;


import lombok.Data;

@Data
public class DataBaseParams {
    private String dbName;
    private String host = "localhost";
    private String port = "3306";
    private String userName = "root";
    private String password = "root";
}
