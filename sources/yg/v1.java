package yg;

import cm.u;
import com.nic.mparivahan.VahanServices.VahanModel.RtoNameModleItem;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanNocActivity;
import java.util.function.Predicate;

public final /* synthetic */ class v1 implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f32962a;

    public /* synthetic */ v1(u uVar) {
        this.f32962a = uVar;
    }

    public final boolean test(Object obj) {
        return VahanNocActivity.Q1(this.f32962a, (RtoNameModleItem) obj);
    }
}
