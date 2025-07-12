package Adapter.secutity;

public interface UserDetailsService {

    UserDetails loadUser(String username);
}
