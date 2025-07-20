package Adapter;

import Adapter.secutity.UserDetails;
import Adapter.secutity.UserDetailsService;

public class AccountService implements UserDetailsService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

    @Override //인터페이스 구현 내용
    public UserDetails loadUser(String username) {
        return findAccountByUsername(username);
    }
}
