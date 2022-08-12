package com.vfi.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LoginServiceImpl implements ILoginService {
//	List<String> usernames= Arrays.asList("Arun","Bharath","Kiran","Arjun","John","James");
	String[] usernames= {"Arun","Bharath","Kiran","Arjun","John","James"};

	@Override
	public boolean validateUsername(String username,String password) {
//		for (String uname : usernames) {
//			if(uname.equals(username))
//				return true;		
//		}
//		
//		return false;
		
		return Stream.of(usernames).filter(name->name.equals(username) && password.equals("admin123")).findAny().isPresent();
	}

}
