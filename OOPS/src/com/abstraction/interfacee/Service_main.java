package com.abstraction.interfacee;

public class Service_main {
public static void main(String args[]) {
	ServiceInterface service = new ServiceInterfaceImpl();
	System.out.println(service.fullname()); 	//Anshu Vijay
	System.out.println(service.occupation()); 	//Developer
	
}
}
