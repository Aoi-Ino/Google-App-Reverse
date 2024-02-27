package ni;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class fa {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f26326a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f26327b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f26328c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f26329d;

    /* renamed from: e  reason: collision with root package name */
    public final HorizontalScrollView f26330e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f26331f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f26332g;

    private fa(LinearLayout linearLayout, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, HorizontalScrollView horizontalScrollView, MyTextView myTextView4, MyTextView myTextView5) {
        this.f26326a = linearLayout;
        this.f26327b = myTextView;
        this.f26328c = myTextView2;
        this.f26329d = myTextView3;
        this.f26330e = horizontalScrollView;
        this.f26331f = myTextView4;
        this.f26332g = myTextView5;
    }

    public static fa a(View view) {
        int i10 = R.id.dl_det;
        MyTextView myTextView = (MyTextView) a.a(view, R.id.dl_det);
        if (myTextView != null) {
            i10 = R.id.dms_upload_doc;
            MyTextView myTextView2 = (MyTextView) a.a(view, R.id.dms_upload_doc);
            if (myTextView2 != null) {
                i10 = R.id.feeDetails;
                MyTextView myTextView3 = (MyTextView) a.a(view, R.id.feeDetails);
                if (myTextView3 != null) {
                    i10 = R.id.horizontalScrollView;
                    HorizontalScrollView horizontalScrollView = (HorizontalScrollView) a.a(view, R.id.horizontalScrollView);
                    if (horizontalScrollView != null) {
                        i10 = R.id.textApp;
                        MyTextView myTextView4 = (MyTextView) a.a(view, R.id.textApp);
                        if (myTextView4 != null) {
                            i10 = R.id.upload_photo_signature;
                            MyTextView myTextView5 = (MyTextView) a.a(view, R.id.upload_photo_signature);
                            if (myTextView5 != null) {
                                return new fa((LinearLayout) view, myTextView, myTextView2, myTextView3, horizontalScrollView, myTextView4, myTextView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
