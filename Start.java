import Entity.*;
import EntityList.*;
import Interface.*;

import GUI.*;

import java.lang.*;
          

public class Start{
    public static void main(String[] args) {
		
		Employee empObj1 = new Employee("SAKIB", 21,"01310455666","45000",10000);
		Employee empObj2 = new Employee("RAKIB", 21,"01696321788","25148", 100000);
		Employee empObj3 = new Employee("SANZIDA", 23,"01489666414","14689", 80000);
		Employee empObj4 = new Employee("USHA", 27,"01587456789","75352", 10000);
		
		
		Customer cusObj1 = new Customer("RAHAT", 35,"01564555147",
										"25478",10);
		Customer cusObj2 = new Customer("AMZAD", 25,"01718456123",
										"36987",9);
		Customer cusObj3 = new Customer("ALAMIN", 35,"01714899914",
										"12456",8);
		Customer cusObj4 = new Customer("RIZWAN", 31,"01714568914",
										"78956",7);


        Room roomObj1 = new Room("1234","President","Room is Booked",20000);
        Room roomObj2 = new Room("3698","VVIP","Available",15000);
        Room roomObj3 = new Room("4321","VIP","Room is Booked",7000);
        Room roomObj4 = new Room("8521","Normal","Available",2000);
		Room roomObj5 = new Room("8525","Deluxe","Available",20000);
		
		
		EmployeeList emplist = new EmployeeList();
		CustomerList cuslist = new CustomerList();
		RoomList roomlist = new RoomList();
		
		
		emplist.insert(empObj1);
		emplist.insert(empObj2);
		emplist.insert(empObj3);
		emplist.insert(empObj4);
		
		cuslist.insert(cusObj1);
		cuslist.insert(cusObj2);
		cuslist.insert(cusObj3);
		cuslist.insert(cusObj4);
		
		roomlist.insert(roomObj1);
		roomlist.insert(roomObj2);
		roomlist.insert(roomObj3);
		roomlist.insert(roomObj4);
		roomlist.insert(roomObj5);
		
		
		
		
		emplist.showAll();
        cuslist.showAll();
        roomlist.showAll();
		
		
		Login login = new Login(emplist, cuslist, roomlist);
		/*Dashboard d = new Dashboard(emplist, cuslist, roomlist);
		EmployeeManagerFrame e = new EmployeeManagerFrame(emplist, cuslist, roomlist);
		RoomManagerFrame r = new RoomManagerFrame(emplist, cuslist, roomlist);
		CustomerManagerFrame c = new CustomerManagerFrame(emplist, cuslist, roomlist);*/
		
		
    }
}
