创建数据库ssmbuild

1.创建学生表student：
~~~
Create table students(
    sid char(12) not null comment"学生学号",
  sname varchar(255) not null comment"学生姓名",
  age int(2) comment"年龄",
  sex varchar(100) comment"性别");

insert into students(sid,sname,age,sex)values
	(20183602139,"曾嘉彬",23,"男"),
	(20183602138,"曾嘉彬2",23,"男");
~~~
