package com.myproject.actiontest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.myproject.action.TagsAction;


public class actiontest {
	@Test
//	public void testupload() throws Exception {
//		TagsAction ta= new TagsAction();
//		
//		assertEquals("success", ta.execute_upload());
//	}	
//	public void testdownload() throws Exception {
//		TagsAction ta= new TagsAction();
//		
//		assertEquals("success", ta.execute_download());
//	}	
	public void testdelete() throws Exception {
		TagsAction ta= new TagsAction();
		assertEquals("log_success", ta.execute_log());
	}
}
