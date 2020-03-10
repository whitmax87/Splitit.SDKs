package com.splitit.sdk.model;

import com.splitit.sdk.model.RequestHeader;
import com.google.gson.annotations.SerializedName;

public abstract class RequestWithHeader {
    @SerializedName("RequestHeader")
    private RequestHeader requestHeader = null;

    public static void setAuthFor(Object instance, String sessionId, String apiKey, String culture){
        if (instance instanceof RequestWithHeader && sessionId != null && !sessionId.isEmpty() && apiKey != null && !apiKey.isEmpty()){
            RequestWithHeader reqWithHeaderInstance = (RequestWithHeader)instance;

            if (reqWithHeaderInstance.requestHeader == null){
                reqWithHeaderInstance.requestHeader = new RequestHeader();
            }

            reqWithHeaderInstance.requestHeader.setSessionId(sessionId);
            reqWithHeaderInstance.requestHeader.setApiKey(apiKey);
            reqWithHeaderInstance.requestHeader.setCultureName(culture);
        }
    }
}

