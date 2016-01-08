package com.myproject.service;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
 
public class FTPUtil {
	private static FTPClient ftpClient;
    /* * @param path �ϴ���ftp�������ĸ�·����     
     * @param addr ��ַ  
     * @param port �˿ں�  
     * @param username �û���  
     * @param password ����*/ 
	public  boolean connect(String path,String addr,int port,String username,String password) throws Exception {      
	        boolean result = false;      
	        ftpClient = new FTPClient();      
	        int reply;      
	        ftpClient.connect(addr,port);      
	        ftpClient.login(username,password);      
	        ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);   
	        reply = ftpClient.getReplyCode();      
	        if (!FTPReply.isPositiveCompletion(reply)) {      
	        	ftpClient.disconnect();      
	            return result;      
	        }      
	        ftpClient.changeWorkingDirectory(path);      
	        result = true;      
	        return result;      
	    }      
    /**  
     *   
     * @param file �ϴ����ļ����ļ���  
     * @throws Exception  
     */    
	 public void upload(File file){   
		 try {
			if(file.isDirectory()){           
				ftpClient.makeDirectory(file.getName());
			    ftpClient.changeWorkingDirectory(file.getName());      
			    String[] files = file.list();             
			    for (int i = 0; i < files.length; i++) {      
			        File file1 = new File(file.getPath()+"\\"+files[i] );      
					if(file1.isDirectory()){      //��� file1  ��Ŀ¼����ݹ�
					    upload(file1);      
					    ftpClient.changeToParentDirectory(); //ÿ�εݹ���ɷ�����һ��Ŀ¼      
					}else{                    
					    File file2 = new File(file.getPath()+"\\"+files[i]);      
			            FileInputStream input = new FileInputStream(file2);   
			            ftpClient.storeFile(file2.getName(), input);      
			            input.close();                            
			        }                 
			    }      
			}else{      
			    File file2 = new File(file.getPath());      
			    FileInputStream input = new FileInputStream(file2);      
			    ftpClient.storeFile(file2.getName(), input);      
			    input.close();        
			}      
		 } catch (IOException e) {e.printStackTrace();}      
	 } 
	 /*
	  * �����ļ�������Ŀ¼�������� ����Ŀ¼
	  */
	 public void download(File file) {//file �Ǳ���·��
		 try{
			 if(file.isDirectory()){           
			 	FTPFile[] ftpfiles = ftpClient.listFiles();             
	            for (int i = 0; i < ftpfiles.length; i++) {      
	                File file1 = new File(file.getPath()+"\\"+ftpfiles[i].getName() );      
	                if(file1.isDirectory()){      //��� file1  ��Ŀ¼����ݹ�
	                    download(file1);      
	                    ftpClient.changeToParentDirectory();      
	                }else{                    
	                    File file2 = new File(file.getPath()+"\\"+ftpfiles[i].getName());      
	                    FileOutputStream output = new FileOutputStream(file2);      
	                    ftpClient.retrieveFile(file2.getName(), output);      
	                    output.close();                            
	                }                 
	            }     
			 }
			 else{  
				 System.out.print("·�������ڣ����鱾���Ƿ������ݿ��ڽ��в���");
	        }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
    }
	 public void delete(File file){
		 try {
			 if(file.isDirectory()){           
			 	FTPFile[] ftpfiles = ftpClient.listFiles();             
	            for (int i = 0; i < ftpfiles.length; i++) {      
	                File file1 = new File(file.getPath()+"\\"+ftpfiles[i].getName() );      
	                if(file1.isDirectory()){      //��� file1  ��Ŀ¼����ݹ�
	                    delete(file1);      
	                    ftpClient.changeToParentDirectory();      
	                }else{                    
	                    ftpClient.deleteFile(ftpfiles[i].getName());
	                }                 
	            }     
			 }
			 else{  
				 System.out.print("·�������ڣ����鱾���Ƿ������ݿ��ڽ��в���");
			 }
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 public long getdisk(File file) {
		 long size = 0;
		 try {
			 
			 	FTPFile[] ftpfiles = ftpClient.listFiles();             
	            for (int i = 0; i < ftpfiles.length; i++) {      
	                if(ftpfiles[i].isDirectory()){      //��� file1  ��Ŀ¼����ݹ�
	                	File file1 = new File(file.getPath()+"\\"+ftpfiles[i].getName() );      
	                    getdisk(file1);      
	                    ftpClient.changeToParentDirectory();      
	                }else{                    
	                	size += ftpfiles[i].getSize();
	                }                 
			 }
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
         return size; 	
	 }
}