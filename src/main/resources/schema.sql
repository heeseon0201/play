-- [root 계정에서 실행] 데이터베이스 생성 및 사용자 계정 설정
CREATE DATABASE `play` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;

CREATE USER 'hspark'@'localhost' IDENTIFIED BY 'hspark';

GRANT ALL PRIVILEGES ON play.* TO 'hspark'@'localhost';

-- [hspark 계정에서 실행] 데이터베이스 사용 및 테이블 생성
USE play;

CREATE TABLE `user` (
    `user_id` VARCHAR(36) NOT NULL COMMENT '사용자 ID',
    `login_id` VARCHAR(35) NOT NULL COMMENT '로그인 ID',
    `password` VARCHAR(60) NOT NULL COMMENT '패스워드',
    `name` VARCHAR(100) NOT NULL COMMENT '이름',
    `email` VARCHAR(255) NULL COMMENT '이메일',
    `phone` VARCHAR(20) NULL COMMENT '전화번호',
    PRIMARY KEY (`user_id`)
) ENGINE=InnoDB;