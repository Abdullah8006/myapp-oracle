package com.appster.abdullah.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appster.abdullah.entity.User;
import com.appster.abdullah.repository.UserRepository;
import com.appster.abdullah.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @PersistenceContext
    private EntityManager em;

    @Override
    public User getById(long id) {
        return userRepository.findOne(id);
    }

    @Override
    public void testCriteriaQuery() {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();

        CriteriaQuery<User> cq = criteriaBuilder.createQuery(User.class);
        Root<User> rootUser = cq.from(User.class);
        cq.where(criteriaBuilder.like(rootUser.get("name"), "%Za%"));

        List<User> resultList = em.createQuery(cq).getResultList();
    }

    @Override
    public User addUser(User user) {
        // TODO Auto-generated method stub
        return userRepository.save(user);
    }

}
