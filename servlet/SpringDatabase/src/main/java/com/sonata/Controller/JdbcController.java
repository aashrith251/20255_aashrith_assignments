package com.sonata.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.DAOimpl.LoginImpl;
import com.sonata.Model.Login;
import com.sonata.Model.Task;
import com.sonata.Model.User;
@RestController
public class JdbcController {
	
		@Autowired
		private LoginImpl taskService;
		@GetMapping(value="/login")
		public List<Login>getEmp()
		{
			return taskService.getAllUsers();
		}	
		@GetMapping(value="/task")
		public List<Task> getTask(){
			return taskService.getAllTask();
		}
		@GetMapping(value="/task/{id}")
		public Task getTask(@PathVariable int id){
			return taskService.getAllTask().stream().filter(t->t.getTaskId()==id).findFirst().get();
		}
		@GetMapping(value="/test")
		public String test() {
			return "testing done!!!";
		}
		
		@GetMapping(value="/user")
		public List<User> getUser(){
			return taskService.getAllUser();
		}
}
