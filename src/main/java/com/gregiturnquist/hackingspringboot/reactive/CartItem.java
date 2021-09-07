package com.gregiturnquist.hackingspringboot.reactive;

import java.util.Objects;

class CartItem {
    private Item item;
    private int quantity;

    private CartItem(){}

    public CartItem(Item item) {
        this.item = item;
        this.quantity = 1;
    }
    // 게터, 세터와 equals() 및 hashcode() 메소드는 편의상 생략

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartItem cartItem = (CartItem) o;
        return quantity == cartItem.quantity && Objects.equals(item, cartItem.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, quantity);
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "item=" + item +
                ", quantity=" + quantity +
                '}';
    }
}
