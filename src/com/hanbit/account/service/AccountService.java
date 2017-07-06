package com.hanbit.account.service;

import java.util.List;

import com.hanbit.account.domain.AccountBean;

public interface AccountService {
	public void createAccount();
	public List<AccountBean> AccountList();
	public AccountBean findByAccount(String accunt);
	public List<AccountBean> findByName(String name);
	public void updatePw(AccountBean account);
	public void deposit(String account);
	public void withdraw(String account);
	public void deleteAccount(String account);
	public String getTodayTime();
}
