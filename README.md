# spring-restful
1. 添加RESTFUL接口输出
2. Mapper以类的形式进行存在，替换xml配置文件
3. 自动生成mybatis引入等待接入
4. 数据库文件
5. 引入LOG4J，去除原来的logging包，也就是logback
### 添加@Data注解，pom文件
```xml
<!--提供类所有属性的 getting 和 setting 方法，此外还提供了equals、canEqual、hashCode、toString 方法-->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
</dependency>
```
### 数据库创建
```mysql
CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `age` int(11) NOT NULL COMMENT '年龄',
  `ctm` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
```
```mysql
CREATE TABLE `area` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(50) NOT NULL COMMENT '用户名',
  `sort` int(11) NOT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
```
```mysql
INSERT INTO `db_test`.`tb_user` (`username`, `age`, `ctm`) VALUES('张三', '18', NOW()) ;
INSERT INTO `db_test`.`tb_user` (`username`, `age`, `ctm`) VALUES('李四', '20', NOW()) ;
INSERT INTO `db_test`.`tb_user` (`username`, `age`, `ctm`) VALUES('王五', '19', NOW()) ;
```
### 项目访问，idea里头自动构建
1. 直接启动
2. 打包JAR包
>mvn clean package -Dmaven.test.skip=true

在target目录下生成一个`resetful-0.0.1-SNAPSHOT.jar`包,执行
>java -jar resetful-0.0.1-SNAPSHOT.jar

访问http://localhost:8080/users，http://localhost:8080/user/1
可看到效果