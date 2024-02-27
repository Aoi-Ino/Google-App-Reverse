package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class CustomStateResponse {
    @c("responseMsg")
    private final CustomStateResponseMsg responseMsg;
    @c("stateCustomDetailsDto")
    private final StateCustomDetailsDto stateCustomDetailsDto;

    public CustomStateResponse() {
        this((StateCustomDetailsDto) null, (CustomStateResponseMsg) null, 3, (g) null);
    }

    public static /* synthetic */ CustomStateResponse copy$default(CustomStateResponse customStateResponse, StateCustomDetailsDto stateCustomDetailsDto2, CustomStateResponseMsg customStateResponseMsg, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            stateCustomDetailsDto2 = customStateResponse.stateCustomDetailsDto;
        }
        if ((i10 & 2) != 0) {
            customStateResponseMsg = customStateResponse.responseMsg;
        }
        return customStateResponse.copy(stateCustomDetailsDto2, customStateResponseMsg);
    }

    public final StateCustomDetailsDto component1() {
        return this.stateCustomDetailsDto;
    }

    public final CustomStateResponseMsg component2() {
        return this.responseMsg;
    }

    public final CustomStateResponse copy(StateCustomDetailsDto stateCustomDetailsDto2, CustomStateResponseMsg customStateResponseMsg) {
        return new CustomStateResponse(stateCustomDetailsDto2, customStateResponseMsg);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomStateResponse)) {
            return false;
        }
        CustomStateResponse customStateResponse = (CustomStateResponse) obj;
        return l.a(this.stateCustomDetailsDto, customStateResponse.stateCustomDetailsDto) && l.a(this.responseMsg, customStateResponse.responseMsg);
    }

    public final CustomStateResponseMsg getResponseMsg() {
        return this.responseMsg;
    }

    public final StateCustomDetailsDto getStateCustomDetailsDto() {
        return this.stateCustomDetailsDto;
    }

    public int hashCode() {
        StateCustomDetailsDto stateCustomDetailsDto2 = this.stateCustomDetailsDto;
        int i10 = 0;
        int hashCode = (stateCustomDetailsDto2 == null ? 0 : stateCustomDetailsDto2.hashCode()) * 31;
        CustomStateResponseMsg customStateResponseMsg = this.responseMsg;
        if (customStateResponseMsg != null) {
            i10 = customStateResponseMsg.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "CustomStateResponse(stateCustomDetailsDto=" + this.stateCustomDetailsDto + ", responseMsg=" + this.responseMsg + ')';
    }

    public CustomStateResponse(StateCustomDetailsDto stateCustomDetailsDto2, CustomStateResponseMsg customStateResponseMsg) {
        this.stateCustomDetailsDto = stateCustomDetailsDto2;
        this.responseMsg = customStateResponseMsg;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomStateResponse(StateCustomDetailsDto stateCustomDetailsDto2, CustomStateResponseMsg customStateResponseMsg, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : stateCustomDetailsDto2, (i10 & 2) != 0 ? null : customStateResponseMsg);
    }
}
