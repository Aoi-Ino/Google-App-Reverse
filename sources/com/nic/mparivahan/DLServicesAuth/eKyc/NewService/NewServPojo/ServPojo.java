package com.nic.mparivahan.DLServicesAuth.eKyc.NewService.NewServPojo;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class ServPojo {
    private final String authRequired;
    private final Object ekycCustOptions;
    private final ArrayList<EkycImplState> ekycImplStates;
    private final String ekycRequired;
    private final ResponseMsg responseMsg;

    public ServPojo(String str, Object obj, ArrayList<EkycImplState> arrayList, String str2, ResponseMsg responseMsg2) {
        l.f(str, "authRequired");
        l.f(obj, "ekycCustOptions");
        l.f(arrayList, "ekycImplStates");
        l.f(str2, "ekycRequired");
        l.f(responseMsg2, "responseMsg");
        this.authRequired = str;
        this.ekycCustOptions = obj;
        this.ekycImplStates = arrayList;
        this.ekycRequired = str2;
        this.responseMsg = responseMsg2;
    }

    public static /* synthetic */ ServPojo copy$default(ServPojo servPojo, String str, Object obj, ArrayList<EkycImplState> arrayList, String str2, ResponseMsg responseMsg2, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = servPojo.authRequired;
        }
        if ((i10 & 2) != 0) {
            obj = servPojo.ekycCustOptions;
        }
        Object obj3 = obj;
        if ((i10 & 4) != 0) {
            arrayList = servPojo.ekycImplStates;
        }
        ArrayList<EkycImplState> arrayList2 = arrayList;
        if ((i10 & 8) != 0) {
            str2 = servPojo.ekycRequired;
        }
        String str3 = str2;
        if ((i10 & 16) != 0) {
            responseMsg2 = servPojo.responseMsg;
        }
        return servPojo.copy(str, obj3, arrayList2, str3, responseMsg2);
    }

    public final String component1() {
        return this.authRequired;
    }

    public final Object component2() {
        return this.ekycCustOptions;
    }

    public final ArrayList<EkycImplState> component3() {
        return this.ekycImplStates;
    }

    public final String component4() {
        return this.ekycRequired;
    }

    public final ResponseMsg component5() {
        return this.responseMsg;
    }

    public final ServPojo copy(String str, Object obj, ArrayList<EkycImplState> arrayList, String str2, ResponseMsg responseMsg2) {
        l.f(str, "authRequired");
        l.f(obj, "ekycCustOptions");
        l.f(arrayList, "ekycImplStates");
        l.f(str2, "ekycRequired");
        l.f(responseMsg2, "responseMsg");
        return new ServPojo(str, obj, arrayList, str2, responseMsg2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServPojo)) {
            return false;
        }
        ServPojo servPojo = (ServPojo) obj;
        return l.a(this.authRequired, servPojo.authRequired) && l.a(this.ekycCustOptions, servPojo.ekycCustOptions) && l.a(this.ekycImplStates, servPojo.ekycImplStates) && l.a(this.ekycRequired, servPojo.ekycRequired) && l.a(this.responseMsg, servPojo.responseMsg);
    }

    public final String getAuthRequired() {
        return this.authRequired;
    }

    public final Object getEkycCustOptions() {
        return this.ekycCustOptions;
    }

    public final ArrayList<EkycImplState> getEkycImplStates() {
        return this.ekycImplStates;
    }

    public final String getEkycRequired() {
        return this.ekycRequired;
    }

    public final ResponseMsg getResponseMsg() {
        return this.responseMsg;
    }

    public int hashCode() {
        return (((((((this.authRequired.hashCode() * 31) + this.ekycCustOptions.hashCode()) * 31) + this.ekycImplStates.hashCode()) * 31) + this.ekycRequired.hashCode()) * 31) + this.responseMsg.hashCode();
    }

    public String toString() {
        return "ServPojo(authRequired=" + this.authRequired + ", ekycCustOptions=" + this.ekycCustOptions + ", ekycImplStates=" + this.ekycImplStates + ", ekycRequired=" + this.ekycRequired + ", responseMsg=" + this.responseMsg + ')';
    }
}
