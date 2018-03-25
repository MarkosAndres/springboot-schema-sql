liquibase.enabled=false


Define @ComponentScan(“com.in28minutes.springboot”) 
This would scan the entire parent tree of com.in28minutes.springboot.
Or define two specific Component Scans by using an array. 
@ComponentScan({“com.in28minutes.springboot.basics.springbootin10steps”,”com.in28minutes.springboot.somethingelse”})