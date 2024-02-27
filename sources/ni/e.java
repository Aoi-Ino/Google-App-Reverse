package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.nic.mparivahan.R;
import k1.a;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f26012a;

    /* renamed from: b  reason: collision with root package name */
    public final ProgressBar f26013b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26014c;

    /* renamed from: d  reason: collision with root package name */
    public final EditText f26015d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26016e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26017f;

    /* renamed from: g  reason: collision with root package name */
    public final dc f26018g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageButton f26019h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f26020i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f26021j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f26022k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f26023l;

    private e(LinearLayout linearLayout, ProgressBar progressBar, TextView textView, EditText editText, TextView textView2, TextView textView3, dc dcVar, ImageButton imageButton, LinearLayout linearLayout2, TextView textView4, TextView textView5, TextView textView6) {
        this.f26012a = linearLayout;
        this.f26013b = progressBar;
        this.f26014c = textView;
        this.f26015d = editText;
        this.f26016e = textView2;
        this.f26017f = textView3;
        this.f26018g = dcVar;
        this.f26019h = imageButton;
        this.f26020i = linearLayout2;
        this.f26021j = textView4;
        this.f26022k = textView5;
        this.f26023l = textView6;
    }

    public static e a(View view) {
        int i10 = R.id.acc_feed_progress;
        ProgressBar progressBar = (ProgressBar) a.a(view, R.id.acc_feed_progress);
        if (progressBar != null) {
            i10 = R.id.btn_feedback;
            TextView textView = (TextView) a.a(view, R.id.btn_feedback);
            if (textView != null) {
                i10 = R.id.editTextTextMultiLine;
                EditText editText = (EditText) a.a(view, R.id.editTextTextMultiLine);
                if (editText != null) {
                    i10 = R.id.ev_email_id;
                    TextView textView2 = (TextView) a.a(view, R.id.ev_email_id);
                    if (textView2 != null) {
                        i10 = R.id.ev_name;
                        TextView textView3 = (TextView) a.a(view, R.id.ev_name);
                        if (textView3 != null) {
                            i10 = R.id.header_acc_feed;
                            View a10 = a.a(view, R.id.header_acc_feed);
                            if (a10 != null) {
                                dc a11 = dc.a(a10);
                                i10 = R.id.ib_add_image;
                                ImageButton imageButton = (ImageButton) a.a(view, R.id.ib_add_image);
                                if (imageButton != null) {
                                    i10 = R.id.ll_image;
                                    LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.ll_image);
                                    if (linearLayout != null) {
                                        i10 = R.id.tv_description;
                                        TextView textView4 = (TextView) a.a(view, R.id.tv_description);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_email_id;
                                            TextView textView5 = (TextView) a.a(view, R.id.tv_email_id);
                                            if (textView5 != null) {
                                                i10 = R.id.tv_name;
                                                TextView textView6 = (TextView) a.a(view, R.id.tv_name);
                                                if (textView6 != null) {
                                                    return new e((LinearLayout) view, progressBar, textView, editText, textView2, textView3, a11, imageButton, linearLayout, textView4, textView5, textView6);
                                                }
                                            }
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

    public static e c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static e d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_accident_feedback, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f26012a;
    }
}
