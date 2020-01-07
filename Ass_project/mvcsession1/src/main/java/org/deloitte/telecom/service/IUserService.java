package org.deloitte.telecom.service;

import org.deloitte.telecom.entities.Customer;

public interface IUserService {
    boolean credentialsCorrect(int id, String password);

    Customer findUserById(int id);

}
