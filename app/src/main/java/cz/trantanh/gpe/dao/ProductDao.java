package cz.trantanh.gpe.dao;

import cz.trantanh.gpe.model.Product;

/**
 * Dao layer for {@link Product}
 * Created by tran.t.anh(@)email.cz on 13.04.2020.
 */
public interface ProductDao {
    boolean save(Product product);

    Product findBytId(int id);

    boolean deleteBytId(int id);
}
