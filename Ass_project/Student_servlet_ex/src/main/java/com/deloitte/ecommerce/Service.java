package com.deloitte.ecommerce;

public interface Service {
    
    AppUser getUserByMobileno(String mobileno);
    boolean credentialsCorrect(String mobileno, String password);

}
