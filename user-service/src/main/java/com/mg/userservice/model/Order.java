package com.mg.userservice.model;

public class Order {
    private Long orderId;
    private Long userId;
    private String summary;

    public Order() {
    }

    public Order(Long orderId, Long userId, String summary) {
        this.orderId = orderId;
        this.userId = userId;
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}