#解决idea连接数据库出现的时区问题

cmd 进入登录mysql
查看时区：show variables like '%time_zone';
默认system
set global time_zone = '+8:00';