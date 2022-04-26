DROP TABLE products;
DROP TABLE images;
DROP TABLE user_role;
DROP TABLE users;

SELECT *
FROM products;
SELECT *
FROM images;
SELECT *
FROM users;
SELECT *
FROM user_role;

INSERT INTO products(city, date_of_created, description, preview_image_id, price, title, user_id)
VALUES ('Lip', null, 'dis', null, 2000, 'Phone', 25);