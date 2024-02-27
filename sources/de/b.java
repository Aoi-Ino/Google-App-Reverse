package de;

import com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.CheckpostTaxReceiptServices.CheckpostTaxReceiptServices;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class b implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return CheckpostTaxReceiptServices.a.d(str, sSLSession);
    }
}
