INSERT INTO users (username,password,enabled) VALUES
	 ('admin','pass',true),	 ('user','pass',true) ;

INSERT INTO authorities (username,authority) VALUES
	 ('user','ROLE_USER'), ('admin','ROLE_ADMIN');