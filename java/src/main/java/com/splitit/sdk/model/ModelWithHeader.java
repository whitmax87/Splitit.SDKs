package com.splitit.sdk.model;

import com.splitit.sdk.model.RequestHeader;
import com.google.gson.annotations.SerializedName;

public abstract class ModelWithHeader {
    @SerializedName("RequestHeader")
    protected RequestHeader requestHeader = null;

    public void setRequestHeader(RequestHeader requestHeader){
        this.requestHeader = requestHeader;
    }
    public boolean isRequestHeaderSet(){
        return requestHeader != null;
    }
}

