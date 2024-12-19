CREATE DATABASE IF NOT EXISTS food_donation_db;

USE food_donation;

CREATE TABLE IF NOT EXISTS food_item (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    description TEXT
);
