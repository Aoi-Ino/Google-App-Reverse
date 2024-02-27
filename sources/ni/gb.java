package ni;

import android.view.View;
import android.widget.LinearLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class gb {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f26528a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f26529b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f26530c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f26531d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f26532e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f26533f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f26534g;

    private gb(LinearLayout linearLayout, LinearLayout linearLayout2, MyTextView myTextView, MyTextView myTextView2, LinearLayout linearLayout3, MyTextView myTextView3, MyTextView myTextView4) {
        this.f26528a = linearLayout;
        this.f26529b = linearLayout2;
        this.f26530c = myTextView;
        this.f26531d = myTextView2;
        this.f26532e = linearLayout3;
        this.f26533f = myTextView3;
        this.f26534g = myTextView4;
    }

    public static gb a(View view) {
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
                                return new gb((LinearLayout) view, linearLayout, myTextView, myTextView2, linearLayout2, myTextView3, myTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
