package v9;

import cm.l;
import com.nic.mparivahan.APIController;
import gh.a;
import java.util.HashMap;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private a f17577a;

    public h(a aVar) {
        l.f(aVar, "dataOpertaion");
        this.f17577a = aVar;
    }

    public final HashMap a(String str) {
        l.f(str, "dataString");
        HashMap hashMap = new HashMap();
        try {
            this.f17577a.a(str);
            hashMap.put(APIController.a().getConst(), String.valueOf(this.f17577a.b()));
        } catch (Exception unused) {
        }
        return hashMap;
    }
}
