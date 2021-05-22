package br.com.web.project.model.service;

import br.com.web.project.model.repository.ProductRepo;
import br.com.web.project.model.vo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repository;

    public List<Product> list() {
        return repository.listAll();
    }

    public List<Product> search(String name) {
        return repository.findByName( name );
    }


}
