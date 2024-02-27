package com.nic.mparivahan.DLServicesAuth.Model.RTO;

import androidx.annotation.Keep;

@Keep
public final class RTOMain {
    private DlLastRtoDetailsDto dlLastRtoDetailsDto;
    private String param;
    private String responseBody;

    public final DlLastRtoDetailsDto getDlLastRtoDetailsDto() {
        return this.dlLastRtoDetailsDto;
    }

    public final String getParam() {
        return this.param;
    }

    public final String getResponseBody() {
        return this.responseBody;
    }

    public final void setDlLastRtoDetailsDto(DlLastRtoDetailsDto dlLastRtoDetailsDto2) {
        this.dlLastRtoDetailsDto = dlLastRtoDetailsDto2;
    }

    public final void setParam(String str) {
        this.param = str;
    }

    public final void setResponseBody(String str) {
        this.responseBody = str;
    }
}
