package com.client;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.student.StudentDetails;
import com.student.Student;

//CXF JAX-WS Client / Consuming Web Services With CXF

public final class StudentClient {

   public static void main(String args[]) throws Exception {

     JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

     factory.setServiceClass(StudentDetails.class);
     factory.setAddress("http://localhost:8080/CXFTutorial/ChangeStudent?wsdl");
     factory.getInInterceptors().add(new LoggingInInterceptor());
     factory.getOutInterceptors().add(new LoggingOutInterceptor());
     StudentDetails client = (StudentDetails) factory.create();
     Student student = new Student();
     student.setName("Deepika");
     Student changeName = client.changeName(student);
     System.out.println("Server said: " + changeName.getName());
     System.exit(0);
   }
} 
