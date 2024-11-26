INSERT INTO role (name)
VALUES ('ROLE_USER'),
       ('ROLE_ADMIN'),
       ('ROLE_VENDOR');

INSERT INTO user (email, first_name, last_name, password)
VALUES ('user@user.com', 'user', 'user', '123456'),
       ('admin@admin.com', 'admin', 'admin', '123456'),
       ('vendor1@vendor.com', 'vendor', '1', '123456'),
       ('vendor2@vendor.com', 'vendor', '2', '123456');

INSERT INTO user_roles (user_id, role_id)
VALUES (1, 1),
       (2, 2),
       (3, 3),
       (4, 3);

INSERT INTO vendor_profile (user_id, store_name, business_license, address, phone)
VALUES (3, 'Tech Gadgets', 'BL-123456789', '123 Tech Street, Silicon Valley, CA', '555-1234'),
       (4, 'Smart Devices', 'BL-987654321', '456 Innovation Drive, Austin, TX', '555-5678');

INSERT INTO category (name)
VALUES ('Electronics'),
       ('Mobile Phones'),
       ('Tablets'),
       ('Wearables');

INSERT INTO product (name, price, inventory, description, category_id, vendor_user_id)
VALUES ('iPhone 16', 899.99, 150, 'Apple iPhone 16 with A18 chipset and 48MP camera', 2, 3),
       ('Samsung Galaxy S24', 849.99, 200, 'Samsung Galaxy S24 with advanced AI capabilities', 2, 4),
       ('iPad Pro (7th Generation)', 1099.99, 100, 'Apple iPad Pro with M4 chip and OLED display', 3, 3),
       ('Samsung Galaxy Tab S9', 999.99, 120, 'Samsung Galaxy Tab S9 with Dynamic AMOLED 2X display', 3, 4),
       ('Apple Watch Series 10', 499.99, 80, 'Apple Watch Series 10 with enhanced health monitoring', 4, 3),
       ('Samsung Galaxy Watch 7', 449.99, 90, 'Samsung Galaxy Watch 7 with improved health tracking', 4, 4),
       ('MacBook Pro (2024)', 1999.99, 50, 'Apple MacBook Pro with M4 chip and Nano-Texture Display', 1, 3),
       ('Samsung Notebook 9 Pro', 1899.99, 60, 'Samsung high-performance notebook with AI features', 1, 4);