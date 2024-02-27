package yg;

import com.nic.mparivahan.VahanServices.VahanModel.RtoNameModleItem;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanNocActivity;
import java.util.function.Predicate;

public final /* synthetic */ class u1 implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VahanNocActivity f32959a;

    public /* synthetic */ u1(VahanNocActivity vahanNocActivity) {
        this.f32959a = vahanNocActivity;
    }

    public final boolean test(Object obj) {
        return VahanNocActivity.R1(this.f32959a, (RtoNameModleItem) obj);
    }
}
