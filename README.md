# tinker
a rmi framework.


init - 2015.05.05
----------------------
feature: 最简单的例子，有了注册中心的雏形。     
feature: 客户端现在可以向服务端发起方法调用。但是仅限于无参数的方法调用。    


branch-methodparam_invoke - 2015.05.07
----------------------
bugfix：修复了test工程的register模块依赖不正确的问题。    
bugfix: mysql的表结构中间缺少一个分号。已经补上。     
bugfix: 修复了之前测试注册中心时候mysql的jar包手工导入的问题。现在已经maven依赖调整加上了5.1.26版本。  
bugfix：修复了short类型先序列化再反序列化后类型变为Integer类型的问题。      
bugfix: 修复了向注册中心插入数据时候状态为已删除的情况。      

feature: 远程方法调用现在支持一个，多个参数调用。参数可以为基本类型和装箱类型。现在也支持基本类型和装箱类型的返回值以及对象类型的返回值。    

b_rc_split - 2015.05.08
----------------------- 
feature: 现在注册中心rc和tinker的代码在maven层面上已经分开了。    

b_threadpool - 2015.05.24
----------------------- 
feature: 现在服务提供者在创建时会维护一个线程池。调用请求来的时候也是线程处理。  
feature: 优化了方法调用的执行时间。同时consumer的初始化这部分代码做了重构。  

b_service_config 
-----------------------
feature: 现在tinker和spring做了集成。所有初始化注册的bean都放在xml配置中。同时支持了几种初始化参数。
		 















