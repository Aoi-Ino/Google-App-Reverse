package ni;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class fb {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f26333a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f26334b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f26335c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f26336d;

    /* renamed from: e  reason: collision with root package name */
    public final HorizontalScrollView f26337e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f26338f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f26339g;

    private fb(LinearLayout linearLayout, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, HorizontalScrollView horizontalScrollView, MyTextView myTextView4, MyTextView myTextView5) {
        this.f26333a = linearLayout;
        this.f26334b = myTextView;
        this.f26335c = myTextView2;
        this.f26336d = myTextView3;
        this.f26337e = horizontalScrollView;
        this.f26338f = myTextView4;
        this.f26339g = myTextView5;
    }

    public static fb a(View view) {
        int i10 = R.id.dl_details;
        MyTextView myTextView = (MyTextView) a.a(view, R.id.dl_details);
        if (myTextView != null) {
            i10 = R.id.dms_upload_doc;
            MyTextView myTextView2 = (MyTextView) a.a(view, R.id.dms_upload_doc);
            if (myTextView2 != null) {
                i10 = R.id.fee_details;
                MyTextView myTextView3 = (MyTextView) a.a(view, R.id.fee_details);
                if (myTextView3 != null) {
                    i10 = R.id.horizontalScrollView;
                    HorizontalScrollView horizontalScrollView = (HorizontalScrollView) a.a(view, R.id.horizontalScrollView);
                    if (horizontalScrollView != null) {
                        i10 = R.id.text_app;
                        MyTextView myTextView4 = (MyTextView) a.a(view, R.id.text_app);
                        if (myTextView4 != null) {
                            i10 = R.id.upload_photo_signature;
                            MyTextView myTextView5 = (MyTextView) a.a(view, R.id.upload_photo_signature);
                            if (myTextView5 != null) {
                                return new fb((LinearLayout) view, myTextView, myTextView2, myTextView3, horizontalScrollView, myTextView4, myTextView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
