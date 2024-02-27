package ni;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class mc {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f27473a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f27474b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f27475c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f27476d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f27477e;

    /* renamed from: f  reason: collision with root package name */
    public final HorizontalScrollView f27478f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f27479g;

    private mc(LinearLayout linearLayout, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, HorizontalScrollView horizontalScrollView, MyTextView myTextView5) {
        this.f27473a = linearLayout;
        this.f27474b = myTextView;
        this.f27475c = myTextView2;
        this.f27476d = myTextView3;
        this.f27477e = myTextView4;
        this.f27478f = horizontalScrollView;
        this.f27479g = myTextView5;
    }

    public static mc a(View view) {
        int i10 = R.id.app_booking;
        MyTextView myTextView = (MyTextView) a.a(view, R.id.app_booking);
        if (myTextView != null) {
            i10 = R.id.dl_det;
            MyTextView myTextView2 = (MyTextView) a.a(view, R.id.dl_det);
            if (myTextView2 != null) {
                i10 = R.id.dms_upload_doc;
                MyTextView myTextView3 = (MyTextView) a.a(view, R.id.dms_upload_doc);
                if (myTextView3 != null) {
                    i10 = R.id.fee_details;
                    MyTextView myTextView4 = (MyTextView) a.a(view, R.id.fee_details);
                    if (myTextView4 != null) {
                        i10 = R.id.horizontalScrollView;
                        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) a.a(view, R.id.horizontalScrollView);
                        if (horizontalScrollView != null) {
                            i10 = R.id.uploadPhotoSignature;
                            MyTextView myTextView5 = (MyTextView) a.a(view, R.id.uploadPhotoSignature);
                            if (myTextView5 != null) {
                                return new mc((LinearLayout) view, myTextView, myTextView2, myTextView3, myTextView4, horizontalScrollView, myTextView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
