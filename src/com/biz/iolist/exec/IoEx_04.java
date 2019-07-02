package com.biz.iolist.exec;

import com.biz.iolist.service.IolistService;

public class IoEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IolistService is = new IolistService();
		
		while(true) {
			is.viewIolist();
			if(is.insertIO())System.out.println("데이터추가성공");
			else System.out.println("데이터 추가 실패");
		}
	}

}
