
# CrudApplication
A basic CRUD Web Application created in Spring Tool Suite.    
Spring Boot along with Rest Api,JPA and MySql database.
 
Creator : Ravi Ranjan


# Requirements
1.Spring Tool Suite 4     
2.Java-11   
3.MySQL Database  
4.PostMan App   
# Steps to Setup
1. Clone the application  
   https://github.com/celestial-101/CrudApplication.git  
2. Create Mysql database   
   create database sharedpro   
3. Change mysql username and password as per your installation
 * Open CrudApplication/src/main/resources/application.properties
4. Change    
  spring.datasource.username and spring.datasource.password      
  as per your mysql installation     


          
# Explore Rest APIs
1.Get ("/products"),("/productById/{id}")         

2.Post ("/addProduct"),("/addProducts")        

3.Put ("/update")     

4.Delete ("/delete/{id}")
