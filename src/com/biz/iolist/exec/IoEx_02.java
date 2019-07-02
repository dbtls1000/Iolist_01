package com.biz.iolist.exec;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.biz.iolist.config.DBConnection;
import com.biz.iolist.dao.IolistDao;
import com.biz.iolist.model.IolistVO;

public class IoEx_02 {
	public static void main(String[] args) {
		SqlSession sqlSession = DBConnection.getSqlSessionFactory().openSession(true);
		IolistDao ioDao = (IolistDao) sqlSession.getMapper(IolistDao.class);
		
		List<IolistVO> iolist = ioDao.selectAll();
		for(IolistVO vo : iolist) {
			System.out.println(vo);
		}
		
	}
}
