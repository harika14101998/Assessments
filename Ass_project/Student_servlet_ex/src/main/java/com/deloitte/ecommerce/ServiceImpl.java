package com.deloitte.ecommerce;

public class ServiceImpl implements Service {
    private Dao dao;

    public ServiceImpl(Dao dao) {
        this.dao = dao;
    }

    

    @Override
    public boolean credentialsCorrect(String mobileno, String password) {
        boolean correct = dao.credentialsCorrect(mobileno, password);
        return correct;
    }

	@Override
	public AppUser getUserByMobileno(String mobileno) {
		AppUser mobile=dao.getUserByMobileno(mobileno);
		return mobile;
		
	}
}
