package com.nf511.flower_team.service.impl;

import com.nf511.flower_team.dao.CartDao;
import com.nf511.flower_team.entity.Cart;
import com.nf511.flower_team.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartImpl implements CartService {
    @Autowired
    CartDao cartDao;
    public List<Cart> selectAllCart() {
        return cartDao.selectAllCart();
    }

    public Cart selectAllCartId(String cartId) {
        return cartDao.selectAllCartId(cartId);
    }

    public List<Cart> selectAllCartByPage(int pagelimit, int size) {
        return cartDao.selectAllCartByPage(pagelimit, size);
    }

    public int insertCart(Cart cart) {
        return cartDao.insertCart(cart);
    }

    public int updateCart(Cart cart) {
        return cartDao.updateCart(cart);
    }

    public int deleteCart(int cartId) {
        return cartDao.deleteCart(cartId);
    }

    public int deleteAll(List<Integer> items) {
        return cartDao.deleteAll(items);
    }
}
