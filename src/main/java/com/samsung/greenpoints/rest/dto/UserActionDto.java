package com.samsung.greenpoints.rest.dto;

import com.samsung.greenpoints.domain.UserAction;

public class UserActionDto {
    private long userId;
    private long placeId;
    private Object payload;

    public UserActionDto(long userId, long placeId, Object payload) {
        this.userId = userId;
        this.placeId = placeId;
        this.payload = payload;
    }

    public static UserActionDto userActionToDto(UserAction userAction){
        return new UserActionDto(userAction.getUserId(), userAction.getPlaceId(), userAction.getPayload());
    }

    public static UserAction userActionFromDto(UserActionDto userActionDto){
        return new UserAction(userActionDto.getUserId(), userActionDto.getPlaceId(), userActionDto.getPayload());
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
