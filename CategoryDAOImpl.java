package com.niit.shoppingcartbackend.daoImpl;

import java.util.List;



import org.hibernate.HibernateException;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcartbackend.dao.CategoryDAO;
import com.niit.shoppingcartbackend.model.Category;

public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public CategoryDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
@Transactional
	public boolean save(Category category) {
		try{
			
			sessionFactory.getCurrentSession().save(category);
			return true;
			}
		catch(HibernateException e){
			e.printStackTrace();
		
		return false;
		}
	}

	public boolean update(Category category) {
try{
			
			sessionFactory.getCurrentSession().save(category);
			return true;
			}
		catch(HibernateException e){
			e.printStackTrace();
		return false;
		}
	}

	public boolean delete(Category category) {
try{
			
			sessionFactory.getCurrentSession().save(category);
			return true;
			}
		catch(HibernateException e){
			e.printStackTrace();
		return false;
		}
	}

	public Category get(String id) {
		
		return (Category) sessionFactory.getCurrentSession().get(Category.class,id);
	}

	public List<Category> list() {
		String hql="from Category";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	
	
	}
	
	