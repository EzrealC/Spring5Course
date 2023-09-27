package tech.ezrealc.entity;

import lombok.Data;

@Data
public class User {
    private String username;
    private String password;
    private Order order;
}
