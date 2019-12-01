# sprint boot

run: Application

# redis
```$xslt
docker run -d --name redis -p 6379:6379 redis
```

# mysql
```$xslt
docker pull mysql:5.7 mkdir -p ~/mysql/{data,logs} docker run -d --name mysql 
-v ~/mysql/data:/var/lib/mysql 
-e MYSQL_ROOT_PASSWORD=123456 
-p 3306:3306 
mysql:5.7
```

# 建表
```$xslt
CREATE DATABASE cityinfo;

DROP TABLE IF EXISTS city; 
CREATE TABLE city ( id int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '城市编号', province_id int(10) unsigned NOT NULL COMMENT '省份编号', city_name varchar(25) DEFAULT NULL COMMENT '城市名称', description varchar(25) DEFAULT NULL COMMENT '描述', PRIMARY KEY (id) ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE INDEX index_name ON city (province_id)
```


# swagger

http://localhost:8090/swagger-ui.html#

![image](swagger.jpg)


