package com.deloitte.ecommerce;

public interface Dao {
    AppUser getUserByMobileno(String mobileno);

    boolean credentialsCorrect(String mobileno, String password);
}
