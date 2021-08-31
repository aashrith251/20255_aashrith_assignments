package com.sonata.Model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Login {
		@Id
		long userId;
		String password;
		Login()
		{
			
		}
		public Login(long taskId, String password) {
			super();
			this.userId = taskId;
			this.password = password;
		}
		public long getTaskId() {
			return userId;
		}
		public void setTaskId(long taskId) {
			this.userId = taskId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "Login [taskId=" + userId + ", password=" + password + "]";
		}
		
		
}
