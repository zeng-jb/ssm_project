#常用依赖
~~~xml
    <dependencies>
        <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.3.9</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

~~~

#注解说明
Autowired和Resource的区别
都是用来自动装配的，都可以放在属性字段上
 - @Autowired默认通过ByType的方式实现
    如果Autowired不能唯一装配上属性，则需要通过@Qualifier(value = "") //指定装配一个beanid
 - @Nullable 字段标记了这个注解，说明这个字段可以为null
 - @Resource默认通过Byname的方式实现，找不到则通过ByType实现
 - - @Component:主键，放在类上，表示这个类已经被Spring管理，就是bean。
    - dao层， @Repository
     - service层 ，@Service
     - Controller层， @Controller
     - 这四个注解功能都是一样，都代表将某个类注册到Spring上，装配Bean、
 
 #整合Mybatis
 ~~~xml
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.47</version>
        </dependency>
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>3.5.2</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.3.9</version>
        </dependency>
<!--        操作数据库 spring-jdbc-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-jdbc</artifactId>
            <version>5.1.9.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjweaver</artifactId>
            <version>1.8.13</version>
        </dependency>
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis-spring</artifactId>
            <version>2.0.2</version>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.8</version>
        </dependency>
    </dependencies>
~~~

*xml配置文件中中文乱码解决，在pom.xml插入以下代码
```xml
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
```