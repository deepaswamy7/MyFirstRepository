package com.example.c.lers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dao.OrdersDao;
import com.example.Dao.UsersDao;
import com.example.model.Orders;
import com.example.model.Users;
import com.example.service.CustomerService;

@RestController
public class customerController {

	@Autowired
	UsersDao usersDao;
	
	@Autowired
	OrdersDao ordersDao;
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/users")
	public ResponseEntity<List<Users>> getAll(){
		//return usersDao.findAll();
		List<Users> users = customerService.getAll();
        if (users.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Users>>(users, HttpStatus.OK);
	}
	
	@RequestMapping("/login")
	public ResponseEntity<?> getCustomerInfo(@RequestParam(value="id") int id, @RequestParam(value="password")
	String password){
		Users custid = customerService.getOneUser(id);
		if(custid==null){
			return new ResponseEntity(new CustomError(new Date(), HttpStatus.NOT_FOUND.value(),"User with id not found"),HttpStatus.NOT_FOUND);
		}
		Users custd = customerService.getById(id);
		if(custd.getPassword().equals(password)){
			return new ResponseEntity<Users>(custd,HttpStatus.OK);
		}
		return new ResponseEntity(new CustomError(new Date(), HttpStatus.NOT_FOUND.value(),"Invalid Credentials"),HttpStatus.NOT_FOUND);
	}		
	@RequestMapping("/users/{id}")
	public Users getOneUser(@PathVariable int id){
		return usersDao.findOne(id);
	}
	
}
