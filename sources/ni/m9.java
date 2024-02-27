package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class m9 {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f27453a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f27454b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f27455c;

    /* renamed from: d  reason: collision with root package name */
    public final dc f27456d;

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f27457e;

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f27458f;

    private m9(RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, dc dcVar, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3) {
        this.f27453a = relativeLayout;
        this.f27454b = linearLayout;
        this.f27455c = linearLayout2;
        this.f27456d = dcVar;
        this.f27457e = relativeLayout2;
        this.f27458f = relativeLayout3;
    }

    public static m9 a(View view) {
        int i10 = R.id.id_dupdl_summit;
        LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.id_dupdl_summit);
        if (linearLayout != null) {
            i10 = R.id.id_search_transaction;
            LinearLayout linearLayout2 = (LinearLayout) a.a(view, R.id.id_search_transaction);
            if (linearLayout2 != null) {
                i10 = R.id.mHeader;
                View a10 = a.a(view, R.id.mHeader);
                if (a10 != null) {
                    dc a11 = dc.a(a10);
                    i10 = R.id.replacementDlCancel;
                    RelativeLayout relativeLayout = (RelativeLayout) a.a(view, R.id.replacementDlCancel);
                    if (relativeLayout != null) {
                        i10 = R.id.replacementDlSubmit;
                        RelativeLayout relativeLayout2 = (RelativeLayout) a.a(view, R.id.replacementDlSubmit);
                        if (relativeLayout2 != null) {
                            return new m9((RelativeLayout) view, linearLayout, linearLayout2, a11, relativeLayout, relativeLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static m9 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static m9 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_verify_pending_transaction_details, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f27453a;
    }
}
