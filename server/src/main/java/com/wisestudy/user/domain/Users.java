package com.wisestudy.user.domain;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;

import java.util.ArrayList;

@JsonRootName("users")
public class Users extends ArrayList<User> {
}
