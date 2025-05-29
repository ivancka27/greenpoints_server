package com.samsung.greenpoints.domain;

public class UserAction {

    private long userId;
    private long placeId;
    private Object payload;

    public UserAction(long userId, long placeId, Object payload) {
        this.userId = userId;
        this.placeId = placeId;
        this.payload = payload;
    }

    public long getUserId() {
        return userId;
    }

    public long getPlaceId() {
        return placeId;
    }

    public Object getPayload() {
        return payload;
    }
}
