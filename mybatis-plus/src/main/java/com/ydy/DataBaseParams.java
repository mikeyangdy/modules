package com.ydy;


import lombok.Data;

@Data
public class DataBaseParams {
    private String host = "localhost";
    private String port = "3306";
    private String dbName;
    private String userName = "root";
    private String password = "root";
}
