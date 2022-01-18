package com.bezkoder.springjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSecurityJwtApplication {

	public static void main(String[] args) {
    SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
	}

}



/*
 {
   "username":"mod",
   "email":"mod@gmail.com",
   "password":"password",
   "role":["mod","user"]
 }
 */

/*
 * drop SEQUENCE role_seq; 
 * 
 * CREATE SEQUENCE role_seq 
 * MINVALUE 1 
 * START WITH 1
 * INCREMENT BY 1 
 * CACHE 20;
 * 
 * INSERT INTO roles(id,name) VALUES(role_seq.NEXTVAL,'ROLE_USER'); INSERT INTO
 * roles(id,name) VALUES(role_seq.NEXTVAL,'ROLE_MODERATOR'); INSERT INTO
 * roles(id,name) VALUES(role_seq.NEXTVAL,'ROLE_ADMIN');
 * 
 * commit;
 */