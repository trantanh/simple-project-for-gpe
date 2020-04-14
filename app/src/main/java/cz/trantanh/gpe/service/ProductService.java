package cz.trantanh.gpe.service;

import cz.trantanh.gpe.model.Product;

/**
 * Service layer for {@link Product}
 * Created by tran.t.anh(@)email.cz on 13.04.2020.
 */
public interface ProductService {

    boolean save(Product product);

    Product findBytId(int id);

    boolean deleteBytId(int id);
}
