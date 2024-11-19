-- Insert categories
INSERT INTO category (name)
VALUES ('Electronics'),
       ('Mobile Phones'),
       ('Tablets'),
       ('Wearables');

-- Insert products
INSERT INTO product (name, brand, price, inventory, description, category_id)
VALUES ('iPhone 16', 'Apple', 899.99, 150, 'Apple iPhone 16 with A18 chipset and 48MP camera', 2),
       ('Samsung Galaxy S24', 'Samsung', 849.99, 200, 'Samsung Galaxy S24 with advanced AI capabilities', 2),
       ('iPad Pro (7th Generation)', 'Apple', 1099.99, 100, 'Apple iPad Pro with M4 chip and OLED display', 3),
       ('Samsung Galaxy Tab S9', 'Samsung', 999.99, 120, 'Samsung Galaxy Tab S9 with Dynamic AMOLED 2X display', 3),
       ('Apple Watch Series 10', 'Apple', 499.99, 80, 'Apple Watch Series 10 with enhanced health monitoring', 4),
       ('Samsung Galaxy Watch 7', 'Samsung', 449.99, 90, 'Samsung Galaxy Watch 7 with improved health tracking', 4),
       ('MacBook Pro (2024)', 'Apple', 1999.99, 50, 'Apple MacBook Pro with M4 chip and Nano-Texture Display', 1),
       ('Samsung Notebook 9 Pro', 'Samsung', 1899.99, 60, 'Samsung high-performance notebook with AI features', 1);

INSERT INTO role (name)
VALUES ('ROLE_USER'),
       ('ROLE_ADMIN');

-- INSERT INTO user (email, first_name, last_name, password)
-- VALUES ('lowjungxuan@gmail.com', 'Low', 'Jung Xuan', 'gnn12345')