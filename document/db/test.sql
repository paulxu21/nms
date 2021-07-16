DROP TABLE IF EXISTS test;
CREATE TABLE `test`
(
    `id`       bigint NOT NULL COMMENT 'id',
    `name`     varchar(50) DEFAULT NULL COMMENT '姓名',
    `password` varchar(50) DEFAULT NULL COMMENT '密码',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COMMENT ='测试库';

insert into `test` (id, name, password) VALUES (1, 'xuhaipeng', '123456');
insert into `test` (id, name, password) VALUES (2, 'linhaifang', '123456');