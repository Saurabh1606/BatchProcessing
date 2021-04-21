package com.nareshit.saurabh.processor;

import org.springframework.batch.item.ItemProcessor;

import com.nareshit.saurabh.model.User;

public class UserProcessor implements ItemProcessor<User, User> {
	public User process(User item) throws Exception
	{
		return item;
	}
}
