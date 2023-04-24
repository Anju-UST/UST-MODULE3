
		//productRepository.save(product);//if one fail other also should fail
		
		//userRepository.save(user);//shouldnt add when product is not added
 		
package com.ust.rest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.repository.UserRepository;
import com.ust.rest.resource.Product;
import com.ust.rest.resource.User;


@Service
public class ProductService {

	
	//services is calling the repository 
	//service acts as a link
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	UserRepository userRepository;
	public Product getProduct(long productId) {
	//	return repository.getProduct(productId);
		Optional <Product> optional=productRepository.findById(productId);
		if(optional.isPresent()) {
			return optional.get();
			
		}
		else
		{
			return null;
		}
	}
//	
	public List<Product> getProducts(){
		return productRepository.findAll();
	}
	
	
	
//	@Transactional(propagation=Propagation.REQUIRED)
//	public boolean add(Product product) {
//		Product productT= productRepository.save(product);
//		User user=new User();
//		user.setUserId(5L);
//		user.setDateTime(System.currentTimeMillis()+"");
//		//user.setDateTime(System.currentTimeMillis()+"767676767677777676767");
//		User userT=userRepository.save(user);
//		System.out.println(userT);
//		if(userT!=null && productT!=null ) {
//			return true;
//		}
//		else
//		{
//			throw new RuntimeException("record not inserted....");
//		}
//	}
	//working code 2 REQUIRES_NEW
	@Transactional(propagation=Propagation.REQUIRED)
	  public Product add(Product product) {
	  
	  Product productT=productRepository.save(product);
	  addUser();
	  return productT; 
	  }
	
	@Transactional(propagation=Propagation.REQUIRES_NEW) 
	public boolean addUser() {
		User user=new User();
		  user.setUserId(5L);
		  user.setDateTime(System.currentTimeMillis()+"76766677776867667777776667"); 
		  try {
		  User userT=userRepository.save(user); 
		  }catch(Exception e) {
			  System.out.println(e);
		  }
		  return true;
	}
	
	//update
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}
//	
	//delete
	public void deleteProduct(long productId) {
		 productRepository.deleteById(productId);
	}
}




