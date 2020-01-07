package org.deloitte.telecom.service;

import org.deloitte.telecom.dao.IUserDao;
import org.deloitte.telecom.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    private IUserDao userDao;

    public IUserDao getUserDao() {
        return userDao;
    }

    @Autowired
    public void setUserDao(IUserDao dao) {
        this.userDao = dao;
    }

    @Override
    public boolean credentialsCorrect(int id, String password) {
        return userDao.credentialsCorrect(id, password);
    }

    @Override
    public Customer findUserById(int id) {
        return userDao.findUserById(id);
    }
}
