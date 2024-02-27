package ni;

import android.view.View;
import android.widget.LinearLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class kb {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f27158a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f27159b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f27160c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f27161d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f27162e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f27163f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f27164g;

    private kb(LinearLayout linearLayout, LinearLayout linearLayout2, MyTextView myTextView, MyTextView myTextView2, LinearLayout linearLayout3, MyTextView myTextView3, MyTextView myTextView4) {
        this.f27158a = linearLayout;
        this.f27159b = linearLayout2;
        this.f27160c = myTextView;
        this.f27161d = myTextView2;
        this.f27162e = linearLayout3;
        this.f27163f = myTextView3;
        this.f27164g = myTextView4;
    }

    public static kb a(View view) {
        int i10 = R.id.app_ment;
        LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.app_ment);
        if (linearLayout != null) {
            i10 = R.id.dms;
            MyTextView myTextView = (MyTextView) a.a(view, R.id.dms);
            if (myTextView != null) {
                i10 = R.id.feeDetails;
                MyTextView myTextView2 = (MyTextView) a.a(view, R.id.feeDetails);
                if (myTextView2 != null) {
                    i10 = R.id.parent_layout;
                    LinearLayout linearLayout2 = (LinearLayout) a.a(view, R.id.parent_layout);
                    if (linearLayout2 != null) {
                        i10 = R.id.slotbooking;
                        MyTextView myTextView3 = (MyTextView) a.a(view, R.id.slotbooking);
                        if (myTextView3 != null) {
                            i10 = R.id.vehicledetails;
                            MyTextView myTextView4 = (MyTextView) a.a(view, R.id.vehicledetails);
                            if (myTextView4 != null) {
                                return new kb((LinearLayout) view, linearLayout, myTextView, myTextView2, linearLayout2, myTextView3, myTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
