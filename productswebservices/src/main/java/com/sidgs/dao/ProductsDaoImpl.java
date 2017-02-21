package com.sidgs.dao;

import com.sidgs.model.Products;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import javax.activation.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Vytlasai on 2/20/2017.
 */
public class ProductsDaoImpl  implements ProductsDao{

    private JdbcTemplate jdbcTemplate;

    public ProductsDaoImpl (DataSource dataSource){
        jdbcTemplate = new JdbcTemplate((javax.sql.DataSource) dataSource);
    }
    public void add(Products product) {

        String sql = "INSERT INTO PRODUCT(" +
                "product_id,product_name,description,product_image,product_brand)"+
                "VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(
                sql, product.getProduct_name(),product.getProduct_id(),product.getDescription(),
                product.getProduct_image(),product.getProduct_brand());

    }

    public List<Products> getProducts() {
        String sql = "SELECT * FROM PRODUCT";
        List<Products> getproducts = jdbcTemplate.query(sql, new RowMapper<Products>() {
            public Products mapRow(ResultSet resultSet, int i) throws SQLException {
               Products products = new Products();
               products.setProduct_id(resultSet.getInt("product_id"));
               products.setProduct_name(resultSet.getString("product_name"));
               products.setDescription(resultSet.getString("description"));
               products.setProduct_image(resultSet.getString("product_image"));
               products.setProduct_brand(resultSet.getString("product_brand"));
                return products;
            }
        });
        return getproducts;
    }

    public Products getProduct(int product_id) {
        String sql = "SELECT * FROM PRODUCT WHERE product_id="+ product_id;
        return jdbcTemplate.query(sql, new ResultSetExtractor<Products>() {
            public Products extractData(ResultSet resultSet) throws SQLException, DataAccessException {

                if (resultSet.next()){
                    Products products = new Products();
                    products.setProduct_id(resultSet.getInt("product_id"));
                    products.setProduct_name(resultSet.getString("product_name"));
                    products.setDescription(resultSet.getString("description"));
                    products.setProduct_image(resultSet.getString("product_image"));
                    products.setProduct_brand(resultSet.getString("product_brand"));
                    return products;
                }
                return null;
            }
        });
    }

    public void remove(int product_id) {
        String sql = "DELETE FROM PRODUCT WHERE product_id=?";
        jdbcTemplate.update(sql, product_id);
    }
}
