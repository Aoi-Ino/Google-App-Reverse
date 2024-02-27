package ni;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class sb {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f28561a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f28562b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f28563c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f28564d;

    /* renamed from: e  reason: collision with root package name */
    public final HorizontalScrollView f28565e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f28566f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f28567g;

    private sb(LinearLayout linearLayout, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, HorizontalScrollView horizontalScrollView, MyTextView myTextView4, MyTextView myTextView5) {
        this.f28561a = linearLayout;
        this.f28562b = myTextView;
        this.f28563c = myTextView2;
        this.f28564d = myTextView3;
        this.f28565e = horizontalScrollView;
        this.f28566f = myTextView4;
        this.f28567g = myTextView5;
    }

    public static sb a(View view) {
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
                                return new sb((LinearLayout) view, myTextView, myTextView2, myTextView3, horizontalScrollView, myTextView4, myTextView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
