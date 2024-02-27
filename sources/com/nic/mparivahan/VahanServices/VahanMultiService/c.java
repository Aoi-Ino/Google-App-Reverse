package com.nic.mparivahan.VahanServices.VahanMultiService;

import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class c implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return MultiService.a.c(str, sSLSession);
    }
}
