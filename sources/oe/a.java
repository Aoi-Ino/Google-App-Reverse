package oe;

import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final /* synthetic */ class a implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return DuplicateFitnessService.a.c(str, sSLSession);
    }
}
