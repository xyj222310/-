package com.myproject.service;

import java.io.File;
public class LabelManager {
	private String addr= "192.168.139.139";
	private String path = "";
	private int port = 21;
	private String username = "xyj";
	private String password = "xieyingjie927*";
	private File file = new File("D:\\MySql\\mysql-5.6.26-winx64\\data\\rfid");
	FTPUtil ftpclient;
	public LabelManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean uploadtoftp(){
		ftpclient  = new FTPUtil();
		try {
			boolean result=ftpclient.connect(path, addr, port, username, password);
			if(result==true){
				System.out.print(result+"fsdfgdsfdsf");
				ftpclient.upload(file);
			}
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	public boolean downloadfromftp(){
		ftpclient  = new FTPUtil();
		path = "rfid";
		try {
			boolean result = ftpclient.connect(path, addr, port, username, password);
			if(result==true){
				System.out.print(result+"fsdfgdsfdsf");
				ftpclient.download(file);
			}
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	public boolean delete(){
		ftpclient  = new FTPUtil();
		path = "rfid";
		try {
			boolean result = ftpclient.connect(path, addr, port, username, password);
			if(result==true){
				System.out.print(result+"fsdfgdsfdsf");
				
				ftpclient.delete(file);
			}
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	public long getdisk(){
		ftpclient  = new FTPUtil();
		file = new File("");
		long used = 0;
		path = "";
		try {
			boolean result = ftpclient.connect(path, addr, port, username, password);
			if(result==true){
				System.out.print(result+"fsdfgdsfdsf");
				used =ftpclient.getdisk(file);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return used;
	}
}
