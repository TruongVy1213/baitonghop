CREATE DATABASE IF NOT EXISTS employees;
USE employees;

-- 2. Tạo bảng users (thêm IF NOT EXISTS để tránh lỗi khi khởi động lại server)
CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE, -- Thêm UNIQUE để tránh trùng lặp username
    password VARCHAR(100),
    role VARCHAR(20),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
USE employees;
-- 3. Tạo bảng posts
CREATE TABLE IF NOT EXISTS posts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    body TEXT,
    user_id INT,
    status VARCHAR(20),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);
USE employees;
-- 4. Tạo bảng follows
CREATE TABLE IF NOT EXISTS follows (
    following_user_id INT,
    followed_user_id INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (following_user_id, followed_user_id), -- Khóa chính tổ hợp
    FOREIGN KEY (following_user_id) REFERENCES users(id) ON DELETE CASCADE,
    FOREIGN KEY (followed_user_id) REFERENCES users(id) ON DELETE CASCADE
);

-- 5. Tạo bảng likes
CREATE TABLE IF NOT EXISTS likes (
    user_id INT,
    post_id INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (user_id, post_id),
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
    FOREIGN KEY (post_id) REFERENCES posts(id) ON DELETE CASCADE
);

USE employees;
-- 6. Chèn dữ liệu mẫu
INSERT IGNORE INTO users(id, username, password, role) VALUES
(1, 'admin', '123', 'admin'),
(2, 'user1', '123', 'user'),
(3, 'user2', '123', 'user');

USE employees;
INSERT IGNORE INTO posts(id, title, body, user_id, status) VALUES
(1, 'Bài viết Admin 1', 'Nội dung demo từ admin', 1, 'published'),
(2, 'Bài viết User1 1', 'Hello từ user1', 2, 'published'),
(3, 'Bài viết User2 1', 'Chào buổi sáng từ user2', 3, 'published');

USE employees;
INSERT IGNORE INTO follows(following_user_id, followed_user_id) VALUES
(1, 2), -- admin follow user1
(1, 3); -- admin follow user2

USE employees;
INSERT IGNORE INTO likes(user_id, post_id) VALUES
(1, 2), (3, 2); -- Bài 2 có 2 like (tương tác cao hơn)