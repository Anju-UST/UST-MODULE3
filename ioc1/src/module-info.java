module ioc1 {
	requires spring.beans;
	requires spring.core;
	requires java.sql;
	requires spring.context;
	requires java.annotation;
	exports com.ust.ioc;
	exports com.ust.ioc2;
	exports com.ust.iocautowiring;
	exports com.spring.java.config;
	opens com.spring.java.config to spring.core;
}