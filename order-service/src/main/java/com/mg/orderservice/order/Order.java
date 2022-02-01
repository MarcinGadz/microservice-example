package com.mg.orderservice.order;

public class Order {
    private String orderId;
    private String userId;
    private String summary;

    public Order() {
    }

    public Order(String orderId, String userId, String summary) {
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
