package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import k1.a;

public final class va {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f29052a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f29053b;

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f29054c;

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f29055d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f29056e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f29057f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f29058g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f29059h;

    /* renamed from: i  reason: collision with root package name */
    public final dc f29060i;

    /* renamed from: j  reason: collision with root package name */
    public final ProgressBar f29061j;

    /* renamed from: k  reason: collision with root package name */
    public final ProgressBar f29062k;

    private va(LinearLayout linearLayout, TextView textView, RelativeLayout relativeLayout, RecyclerView recyclerView, ImageView imageView, LinearLayout linearLayout2, TextView textView2, TextView textView3, dc dcVar, ProgressBar progressBar, ProgressBar progressBar2) {
        this.f29052a = linearLayout;
        this.f29053b = textView;
        this.f29054c = relativeLayout;
        this.f29055d = recyclerView;
        this.f29056e = imageView;
        this.f29057f = linearLayout2;
        this.f29058g = textView2;
        this.f29059h = textView3;
        this.f29060i = dcVar;
        this.f29061j = progressBar;
        this.f29062k = progressBar2;
    }

    public static va a(View view) {
        int i10 = R.id.my_transations;
        TextView textView = (TextView) a.a(view, R.id.my_transations);
        if (textView != null) {
            i10 = R.id.rl_notransaction;
            RelativeLayout relativeLayout = (RelativeLayout) a.a(view, R.id.rl_notransaction);
            if (relativeLayout != null) {
                i10 = R.id.rv_vahan_trans;
                RecyclerView recyclerView = (RecyclerView) a.a(view, R.id.rv_vahan_trans);
                if (recyclerView != null) {
                    i10 = R.id.status_image;
                    ImageView imageView = (ImageView) a.a(view, R.id.status_image);
                    if (imageView != null) {
                        i10 = R.id.status_linear;
                        LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.status_linear);
                        if (linearLayout != null) {
                            i10 = R.id.status_txt;
                            TextView textView2 = (TextView) a.a(view, R.id.status_txt);
                            if (textView2 != null) {
                                i10 = R.id.status_txt2;
                                TextView textView3 = (TextView) a.a(view, R.id.status_txt2);
                                if (textView3 != null) {
                                    i10 = R.id.topHeader;
                                    View a10 = a.a(view, R.id.topHeader);
                                    if (a10 != null) {
                                        dc a11 = dc.a(a10);
                                        i10 = R.id.tran_progress;
                                        ProgressBar progressBar = (ProgressBar) a.a(view, R.id.tran_progress);
                                        if (progressBar != null) {
                                            i10 = R.id.trans_bar;
                                            ProgressBar progressBar2 = (ProgressBar) a.a(view, R.id.trans_bar);
                                            if (progressBar2 != null) {
                                                return new va((LinearLayout) view, textView, relativeLayout, recyclerView, imageView, linearLayout, textView2, textView3, a11, progressBar, progressBar2);
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

    public static va c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static va d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fetch_vahan_transactions, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f29052a;
    }
}
