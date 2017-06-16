package com.jvv.p2p.facade.request;

import com.jvv.p2p.facade.vo.Title;

/**
 * Created by cx on 2015/5/25.
 */
public class LoginRequest {
	
	@Title("username")
    private String username;
	
	@Title("password")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
