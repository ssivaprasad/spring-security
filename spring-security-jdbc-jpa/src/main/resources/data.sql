INSERT INTO users (username, password, enabled) values('siva','siva', true);
INSERT INTO users (username, password, enabled) values('prasad','prasad', true);

INSERT INTO authorities(username, authority) values('siva','ROLE_USER');
INSERT INTO authorities(username, authority) values('prasad','ROLE_USER');
INSERT INTO authorities(username, authority) values('prasad','ROLE_ADMIN');