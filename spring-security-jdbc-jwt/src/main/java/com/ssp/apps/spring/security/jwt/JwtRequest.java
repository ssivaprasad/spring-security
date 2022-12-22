package com.ssp.apps.spring.security.jwt;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JwtRequest {

  private String username;
  private String password;

}
