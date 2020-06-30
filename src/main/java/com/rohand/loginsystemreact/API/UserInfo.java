package com.rohand.loginsystemreact.API;

import java.util.UUID;

public class UserInfo {
    private String username;
    private String password;
    private UUID uuid;

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

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public UserInfo(String username, String password, UUID uuid) {
        this.username = username;
        this.password = password;
        this.uuid = uuid;
    }
    
    
}