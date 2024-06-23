CREATE TABLE `logs`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `action` VARCHAR(255) NOT NULL,
    `ip_address` VARCHAR(255) NOT NULL,
    `microservice` VARCHAR(255) NOT NULL,
    `request_path` VARCHAR(255) NOT NULL,
    `request_method` VARCHAR(255) NOT NULL,
    `request_origin` VARCHAR(255) NOT NULL,
    `requested_at` TIMESTAMP NOT NULL,
    `status_code` INT UNSIGNED NOT NULL,
    `user_type` VARCHAR(255) NOT NULL,
    `user` VARCHAR(255) NOT NULL,
    `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);