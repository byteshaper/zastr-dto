package com.byteshaper.zastr.dto;

import javax.validation.constraints.NotBlank;

public class UserCreateDto {
  
  public UserCreateDto() {}
  
  public UserCreateDto(String username, String password, String email) {
    this.username = username;
    this.password = password;
    this.email = email;
  }

  @NotBlank
  public String username;
  
  @NotBlank
  public String password;
  
  @NotBlank
  public String email;
}
