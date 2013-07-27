#如果数据库demo不存在, 则创建数据库demo
CREATE database If Not Exists demo_development Character Set UTF8;

use demo_development;

# 创建表demos
CREATE TABLE if not exists demos(
	id INTEGER primary key auto_increment,
	name VARCHAR(20) not null unique
);

select * from demos;
