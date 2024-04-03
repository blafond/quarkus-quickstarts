CREATE SEQUENCE fruit_basket_seq start with 1 increment by 50;
CREATE SEQUENCE fruit_seq start with 1 increment by 50;
INSERT INTO fruit_basket(id, name) VALUES (1, 'MyBasket');
ALTER SEQUENCE fruit_basket_seq RESTART WITH 2;

INSERT INTO fruit(name, basket_id, id) VALUES ('Cherry', 1, 1);
INSERT INTO fruit(name, basket_id, id) VALUES ('Apple', 1, 2);
INSERT INTO fruit(name, basket_id, id) VALUES ('Banana', 1, 3);
ALTER SEQUENCE fruit_seq RESTART WITH 4;