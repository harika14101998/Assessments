package org.deloitte.telecom.dao;

import org.deloitte.telecom.entities.Customer;

public interface IUserDao {
    boolean credentialsCorrect(int id, String password);

    Customer findUserById(int id);

}
