package com.hrms.utils;

public class APIConstants {

 //API REQUEST AND PATHS
    
    public static final String CREATE_USER_URI="http://3.237.189.167/syntaxapi/api/createUser.php";
    
    public static final String CENERATE_TOKEN_URI="http://3.237.189.167/syntaxapi/api/generateToken.php";
    
    public static final String GET_ONE_EMPLOYEE_URI="http://3.237.189.167/syntaxapi/api/getOneEmployee.php";
    
    public static final String GETALL_EMPLOYEE_URI="http://3.237.189.167/syntaxapi/api/getAllEmployees.php";
    
    public static final String GET_EMPLOYEE_STATUS_URI="http://3.237.189.167/syntaxapi/api/employeeStatus.php";
    
    public static final String CREATE_EMPLOYEE_JSON=System.getProperty("user.dir")+"\\src\\test\\resources\\JSONFiles\\createEmployee.json";
    
    public static final String GENERATE_TOKEN_JSON=System.getProperty("user.dir")+"\\src\\test\\resources\\JSONFiles\\generateToken.json";
   
    public static final String DELETE_URI="http://3.237.189.167/syntaxapi/api/deleteEmployee.php";
    
    public static final String CREATE_EMPLOYEE_URI="http://3.237.189.167/syntaxapi/api/createEmployee.php";
    
    public static final String UPDATE_EMPLOYEE_URI = "http://54.167.125.15/syntaxapi/api/updateEmployee.php";
    
    public static final String UPDATE_EMPLOYEE_JSON = System.getProperty("user.dir")
			+ "/src/test/resources/JSONFiles/updateEmployee.json";

    
}
