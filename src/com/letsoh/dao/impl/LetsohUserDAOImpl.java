package com.letsoh.dao.impl;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.letsoh.dao.LetsohUserDAO;
import com.letsoh.model.LetsohUser;

@Repository
@Transactional
public class LetsohUserDAOImpl implements LetsohUserDAO {

	private SessionFactory sessionFactory;
	
	@Override
	public List<LetsohUser> getAllUsers() {
		
		System.out.println("Start of getAllUsers in DAO");
		List<LetsohUser> userList = new ArrayList<LetsohUser>();
		 
		try {
			userList = getSessionFactory().getCurrentSession()
				.createQuery("from LetsohUser").list();
				//.setParameter(0, username).list();
			for (Iterator iterator = userList.iterator(); iterator.hasNext();) {
				LetsohUser letsohUser = (LetsohUser) iterator.next();
				
				System.out.println("Inside Iterator");
				System.out.println("uername" + letsohUser.getUserName());
			}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			System.out.println("Hibernate Exception :( :( :( :( ");
			e.printStackTrace();
		}
		
		return userList;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	

}
