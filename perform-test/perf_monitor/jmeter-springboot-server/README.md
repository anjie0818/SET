# jmeter-springboot-server
jmeter-springboot-server

## Setup Mysql

docker pull mysql:5.7
mkdir -p ~/mysql/{data,logs}
docker run -d --name mysql \
           -v ~/mysql/data:/var/lib/mysql \
           -e MYSQL_ROOT_PASSWORD=123456 \
           -p 3306:3306 \
           mysql:5.7

CREATE DATABASE cityinfo;

DROP TABLE IF EXISTS  `city`;
CREATE TABLE `city` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '城市编号',
  `province_id` int(10) unsigned  NOT NULL COMMENT '省份编号',
  `city_name` varchar(25) DEFAULT NULL COMMENT '城市名称',
  `description` varchar(25) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE INDEX index_name ON city (province_id)

## Setup Redis

docker run -d --name myredis -p 6379:6379 redis:5.0.14


