package com.niit.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//import com.niit.Model.Profile;
/*
@Repository("proDao")
public class ProfileDAO implements ProInterface
{
	@Autowired
	private SessionFactory sessionFactory;

	public boolean deleteProfile(int Id) {
		sessionFactory.getCurrentSession().delete(getProfileById(Id));
		return true;

	}

	public List<Profile> getProDetails() {
		return sessionFactory.getCurrentSession().createQuery("from Profile").list();
	}

	public Profile getProfileById(int Id) {
		return (Profile) sessionFactory.getCurrentSession()
				.createQuery("from Profile where profileId=" + Id).uniqueResult();

	}

	

	public boolean addProfile(Profile pro) {
		sessionFactory.getCurrentSession().save(pro);
		return true;

	}

	public boolean updateProfile(Profile pro) {
		sessionFactory.getCurrentSession().update(pro);
		return true;

	}
}
*/