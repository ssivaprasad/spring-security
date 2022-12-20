INSERT INTO users (username, password, enabled) values('test','test', true);
INSERT INTO users (username, password, enabled) values('admin','admin', true);

INSERT INTO authorities(username, authority) values('test','ROLE_USER');
INSERT INTO authorities(username, authority) values('admin','ROLE_USER');
INSERT INTO authorities(username, authority) values('admin','ROLE_ADMIN');