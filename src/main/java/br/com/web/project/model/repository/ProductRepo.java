package br.com.web.project.model.repository;

import br.com.web.project.model.vo.Product;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepo {

    @Autowired
    private SqlSession session;

    public List<Product> listAll() {
        return session.selectList("Product.listAll");
    }

    public List<Product> findByName( String name ) {
        return session.selectList("Product.findByName" , name);
    }

    public List<Product> findByID( Long id ) {
        return session.selectList("Product.findByID" , id);
    }

}
