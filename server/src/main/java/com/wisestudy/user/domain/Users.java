package com.wisestudy.user.domain;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;

@JsonRootName("users")
public class Users extends ArrayList<User> {
}
