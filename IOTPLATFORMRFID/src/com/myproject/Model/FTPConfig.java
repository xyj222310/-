package com.myproject.Model;

public class FTPConfig {
	//����ip
	  private String addr = "";
	  //�˿ں�
	  private int port;
	  //ftp�û���
	  private String username = "";
	  //ftp����
	  private String Password = "";
	  //ftp�е�Ŀ¼
	  private String path = "";
	  private double rest ;
	  private double total ;
	public String getAddr() {
		return addr;
	}
	public FTPConfig(String addr, int port, String username, String password,
			String path, double rest, double total) {
		super();
		this.addr = addr;
		this.port = port;
		this.username = username;
		Password = password;
		this.path = path;
		this.rest = rest;
		this.total = total;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public double getRest() {
		return rest;
	}
	public FTPConfig() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setRest(double rest) {
		this.rest = rest;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	  
}