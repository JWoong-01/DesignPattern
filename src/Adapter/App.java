package Adapter;

import Adapter.secutity.LoginHandler;
import Adapter.secutity.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("jw", "jw");
        System.out.println(login);
    }
}
