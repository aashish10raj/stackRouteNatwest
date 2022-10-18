Spring Annotation
------------------
- Annotation : Predefined XML
- Prior to annotation, The behavior of the Spring Framework was largely controlled through XML configuration.
- Annotation provide us tremendous capabilities in how we configure the the behavior of the Spring Framework.

1. XML Based Config:
   <bean> </bean>
   
2. Java Based Config:
   @Bean
   public Student createStudent(){
       return new Student()
   }
   
@Configuration
--------------- 
- Annotation is used on classes which defines beans.
- @Confoguration is an analog for XML Configuration file.

@Bean
------
- Annotation is used on method level.
- @Bean annotation works with @Configuration to create Spring beans.

@Autowired
----------
- Applied on fields,setter methods and constructor.
- Inject object dependency implicitly.


Bean Scope
----------
- While defining bean element you have option to define Bean Scope.
- Scope of bean define lifecycle and visibility of that bean in the context which is used.

1. Singleton : Only one instance Spring Bean will be created for the Spring Container.
2. Prototype : Opposite to singleton, It produces a new instances each time bean requested.