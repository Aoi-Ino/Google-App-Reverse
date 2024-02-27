package ni;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f25266a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f25267b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f25268c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f25269d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f25270e;

    /* renamed from: f  reason: collision with root package name */
    public final HorizontalScrollView f25271f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f25272g;

    private aa(LinearLayout linearLayout, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, HorizontalScrollView horizontalScrollView, MyTextView myTextView5) {
        this.f25266a = linearLayout;
        this.f25267b = myTextView;
        this.f25268c = myTextView2;
        this.f25269d = myTextView3;
        this.f25270e = myTextView4;
        this.f25271f = horizontalScrollView;
        this.f25272g = myTextView5;
    }

    public static aa a(View view) {
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
                                return new aa((LinearLayout) view, myTextView, myTextView2, myTextView3, myTextView4, horizontalScrollView, myTextView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
