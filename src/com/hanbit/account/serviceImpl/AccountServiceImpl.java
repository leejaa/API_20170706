package com.hanbit.account.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import com.hanbit.account.domain.AccountBean;
import com.hanbit.account.service.AccountService;

public class AccountServiceImpl implements AccountService{
	List allAccount;
	List someAccount;
	AccountBean account;
	public AccountServiceImpl() {
		allAccount=new ArrayList<>();
		someAccount=new ArrayList<>();
		account=new AccountBean();
	}
	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AccountBean> AccountList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByAccount(String account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountBean> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePw(AccountBean account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(String account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(String account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(String account) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getTodayTime() {
		GregorianCalendar gc=new GregorianCalendar();
		SimpleDateFormat format=new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String todayTime=format.format(gc.getTime());
		return todayTime;
	}

}
