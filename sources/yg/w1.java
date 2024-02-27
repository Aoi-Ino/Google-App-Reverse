package yg;

import cm.u;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanNocActivity;
import java.util.function.Predicate;

public final /* synthetic */ class w1 implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f32967a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f32968b;

    public /* synthetic */ w1(u uVar, String str) {
        this.f32967a = uVar;
        this.f32968b = str;
    }

    public final boolean test(Object obj) {
        return VahanNocActivity.A1(this.f32967a, this.f32968b, (String) obj);
    }
}
