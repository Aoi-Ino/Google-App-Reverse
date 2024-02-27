package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class x9 {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f29385a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatTextView f29386b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f29387c;

    /* renamed from: d  reason: collision with root package name */
    public final EditText f29388d;

    /* renamed from: e  reason: collision with root package name */
    public final EditText f29389e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f29390f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f29391g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f29392h;

    /* renamed from: i  reason: collision with root package name */
    public final qd f29393i;

    /* renamed from: j  reason: collision with root package name */
    public final AppCompatTextView f29394j;

    private x9(LinearLayout linearLayout, AppCompatTextView appCompatTextView, EditText editText, EditText editText2, EditText editText3, ImageView imageView, ImageView imageView2, ImageView imageView3, qd qdVar, AppCompatTextView appCompatTextView2) {
        this.f29385a = linearLayout;
        this.f29386b = appCompatTextView;
        this.f29387c = editText;
        this.f29388d = editText2;
        this.f29389e = editText3;
        this.f29390f = imageView;
        this.f29391g = imageView2;
        this.f29392h = imageView3;
        this.f29393i = qdVar;
        this.f29394j = appCompatTextView2;
    }

    public static x9 a(View view) {
        int i10 = R.id.changeMpinTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view, R.id.changeMpinTv);
        if (appCompatTextView != null) {
            i10 = R.id.confirmMpinEt;
            EditText editText = (EditText) a.a(view, R.id.confirmMpinEt);
            if (editText != null) {
                i10 = R.id.newMpinEt;
                EditText editText2 = (EditText) a.a(view, R.id.newMpinEt);
                if (editText2 != null) {
                    i10 = R.id.oldMpinEt;
                    EditText editText3 = (EditText) a.a(view, R.id.oldMpinEt);
                    if (editText3 != null) {
                        i10 = R.id.showConfirmMpin;
                        ImageView imageView = (ImageView) a.a(view, R.id.showConfirmMpin);
                        if (imageView != null) {
                            i10 = R.id.showNewMpin;
                            ImageView imageView2 = (ImageView) a.a(view, R.id.showNewMpin);
                            if (imageView2 != null) {
                                i10 = R.id.showOldMpin;
                                ImageView imageView3 = (ImageView) a.a(view, R.id.showOldMpin);
                                if (imageView3 != null) {
                                    i10 = R.id.toolbar;
                                    View a10 = a.a(view, R.id.toolbar);
                                    if (a10 != null) {
                                        qd a11 = qd.a(a10);
                                        i10 = R.id.topTitleTv;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view, R.id.topTitleTv);
                                        if (appCompatTextView2 != null) {
                                            return new x9((LinearLayout) view, appCompatTextView, editText, editText2, editText3, imageView, imageView2, imageView3, a11, appCompatTextView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static x9 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static x9 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.change_mpin, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f29385a;
    }
}
