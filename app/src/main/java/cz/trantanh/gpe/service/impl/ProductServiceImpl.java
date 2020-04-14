package cz.trantanh.gpe.service.impl;

import android.content.Context;

import cz.trantanh.gpe.dao.ProductDao;
import cz.trantanh.gpe.dao.impl.ProductDaoImpl;
import cz.trantanh.gpe.model.Product;
import cz.trantanh.gpe.service.ProductService;

/**
 * Service layer for {@link Product}
 * Created by tran.t.anh(@)email.cz on 13.04.2020.
 */
public class ProductServiceImpl implements ProductService {

    private ProductDao productDao;

    public ProductServiceImpl(Context context) {
        this.productDao = new ProductDaoImpl(context);
    }

    @Override
    public boolean save(Product product) {
        return productDao.save(product);
    }

    @Override
    public Product findBytId(int id) {
        return productDao.findBytId(id);
    }

    @Override
    public boolean deleteBytId(int id) {
        return productDao.deleteBytId(id);
    }
}
