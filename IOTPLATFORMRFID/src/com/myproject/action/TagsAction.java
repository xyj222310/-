package com.myproject.action;

import com.myproject.Model.FTPConfig;
import com.myproject.service.LabelManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class TagsAction extends ActionSupport implements ModelDriven<FTPConfig>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private FTPConfig ftpConfig;
	String used="fsdfdsfds";
	String rest="fsdfdsfds";
	public TagsAction() {
		super();
		// TODO Auto-generated constructor stubs
		System.out.println("TAGaction£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡");
	}
	public String execute_upload() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("excute _ upload£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡");
		LabelManager lm = new LabelManager();
		
		if(lm.uploadtoftp() == true)
		{
			return "upload_success";
		}
		else{
			return "fail";
		}
	}
	public String execute_download() throws Exception {
		// TODO Auto-generated method stub

		System.out.println("excute _ download£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡");
		LabelManager lm = new LabelManager();
		
		if(lm.downloadfromftp() == true)
		{
			return "download_success";
		}
		else{
			return "fail";
		}
	}
	public String execute_delete() throws Exception {
		// TODO Auto-generated method stub

		System.out.println("excute _ delete£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡");
		LabelManager lm = new LabelManager();
		if(lm.delete() == true)
		{
			return "delete_success";
		}
		else{
			return "fail";
		}
	}
	public String execute_log() throws Exception {
		// TODO Auto-generated method stub
		long disksize = 4096*1024;
		String result = "fail";
		String username = ftpConfig.getUsername();
		String password = ftpConfig.getPassword();
		if("xyj".equals(username)){
			if("xieyingjie927*".equals(password)){
				result =  "log_success";
			}
		}
		LabelManager lm = new LabelManager();
		long size = lm.getdisk();
		used = size+"B";
		rest = (disksize - size/1024)+"K";
		System.out.println("excute _ log£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡");
		return result;
	}
	@Override
	public FTPConfig getModel() {
		// TODO Auto-generated method stub
	        if (null == ftpConfig) {    
	            return ftpConfig = new FTPConfig();    
	        }    
	        return ftpConfig;    
    }
	public String getUsed() {
		return used;
	}
	public void setUsed(String used) {
		this.used = used;
	}
	public String getRest() {
		return rest;
	}
	public void setRest(String rest) {
		this.rest = rest;
	} 
	
}
