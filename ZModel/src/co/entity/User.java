package co.entity;

public class User {

	int id;
	String log,pass;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", log=" + log + ", pass=" + pass + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String log, String pass) {
		super();
		this.id = id;
		this.log = log;
		this.pass = pass;
	}
	
	
}
