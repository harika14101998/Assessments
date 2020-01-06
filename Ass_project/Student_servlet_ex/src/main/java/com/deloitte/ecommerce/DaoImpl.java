package com.deloitte.ecommerce;

import java.util.HashMap;
import java.util.Map;

public class DaoImpl implements Dao{

    private Map<String, AppUser> store = new HashMap<>();

    public DaoImpl() {
        AppUser user1 = new AppUser("9666157496", "1234");
        store.put(user1.getMobileno(), user1);
        AppUser user2 = new AppUser("9440551322", "5678");
        store.put(user2.getMobileno(), user2);
    }

    @Override
    public boolean credentialsCorrect(String mobileno, String password) {
        AppUser user = store.get(mobileno);
        if (user == null) {
            return false;
        }
        return user.getPassword().equals(password);
    }

    

	@Override
	public AppUser getUserByMobileno(String mobileno) {
		AppUser mobile = store.get(mobileno);
        return mobile;
	}

}
