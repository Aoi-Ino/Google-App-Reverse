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

public final class p8 {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f27986a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f27987b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f27988c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f27989d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f27990e;

    /* renamed from: f  reason: collision with root package name */
    public final dc f27991f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageButton f27992g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f27993h;

    /* renamed from: i  reason: collision with root package name */
    public final ProgressBar f27994i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f27995j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f27996k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f27997l;

    private p8(LinearLayout linearLayout, TextView textView, EditText editText, TextView textView2, TextView textView3, dc dcVar, ImageButton imageButton, LinearLayout linearLayout2, ProgressBar progressBar, TextView textView4, TextView textView5, TextView textView6) {
        this.f27986a = linearLayout;
        this.f27987b = textView;
        this.f27988c = editText;
        this.f27989d = textView2;
        this.f27990e = textView3;
        this.f27991f = dcVar;
        this.f27992g = imageButton;
        this.f27993h = linearLayout2;
        this.f27994i = progressBar;
        this.f27995j = textView4;
        this.f27996k = textView5;
        this.f27997l = textView6;
    }

    public static p8 a(View view) {
        int i10 = R.id.btn_feedback;
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
                                    i10 = R.id.traffic_feedback_progress;
                                    ProgressBar progressBar = (ProgressBar) a.a(view, R.id.traffic_feedback_progress);
                                    if (progressBar != null) {
                                        i10 = R.id.tv_description;
                                        TextView textView4 = (TextView) a.a(view, R.id.tv_description);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_email_id;
                                            TextView textView5 = (TextView) a.a(view, R.id.tv_email_id);
                                            if (textView5 != null) {
                                                i10 = R.id.tv_name;
                                                TextView textView6 = (TextView) a.a(view, R.id.tv_name);
                                                if (textView6 != null) {
                                                    return new p8((LinearLayout) view, textView, editText, textView2, textView3, a11, imageButton, linearLayout, progressBar, textView4, textView5, textView6);
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

    public static p8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static p8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_traffic_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f27986a;
    }
}
