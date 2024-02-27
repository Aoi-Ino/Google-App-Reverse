package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class b9 {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f25491a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatTextView f25492b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatTextView f25493c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatTextView f25494d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatTextView f25495e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f25496f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f25497g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f25498h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f25499i;

    /* renamed from: j  reason: collision with root package name */
    public final AppCompatTextView f25500j;

    /* renamed from: k  reason: collision with root package name */
    public final AppCompatTextView f25501k;

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f25502l;

    /* renamed from: m  reason: collision with root package name */
    public final AppCompatImageView f25503m;

    /* renamed from: n  reason: collision with root package name */
    public final AppCompatTextView f25504n;

    /* renamed from: o  reason: collision with root package name */
    public final AppCompatTextView f25505o;

    /* renamed from: p  reason: collision with root package name */
    public final RelativeLayout f25506p;

    /* renamed from: q  reason: collision with root package name */
    public final AppCompatTextView f25507q;

    /* renamed from: r  reason: collision with root package name */
    public final AppCompatTextView f25508r;

    /* renamed from: s  reason: collision with root package name */
    public final qd f25509s;

    /* renamed from: t  reason: collision with root package name */
    public final AppCompatTextView f25510t;

    /* renamed from: u  reason: collision with root package name */
    public final MyTextView f25511u;

    private b9(ScrollView scrollView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, MyTextView myTextView, MyTextView myTextView2, LinearLayout linearLayout, MyTextView myTextView3, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, LinearLayout linearLayout2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, RelativeLayout relativeLayout, AppCompatTextView appCompatTextView9, AppCompatTextView appCompatTextView10, qd qdVar, AppCompatTextView appCompatTextView11, MyTextView myTextView4) {
        this.f25491a = scrollView;
        this.f25492b = appCompatTextView;
        this.f25493c = appCompatTextView2;
        this.f25494d = appCompatTextView3;
        this.f25495e = appCompatTextView4;
        this.f25496f = myTextView;
        this.f25497g = myTextView2;
        this.f25498h = linearLayout;
        this.f25499i = myTextView3;
        this.f25500j = appCompatTextView5;
        this.f25501k = appCompatTextView6;
        this.f25502l = linearLayout2;
        this.f25503m = appCompatImageView;
        this.f25504n = appCompatTextView7;
        this.f25505o = appCompatTextView8;
        this.f25506p = relativeLayout;
        this.f25507q = appCompatTextView9;
        this.f25508r = appCompatTextView10;
        this.f25509s = qdVar;
        this.f25510t = appCompatTextView11;
        this.f25511u = myTextView4;
    }

    public static b9 a(View view) {
        View view2 = view;
        int i10 = R.id.amountTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.amountTv);
        if (appCompatTextView != null) {
            i10 = R.id.amountValueTv;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view2, R.id.amountValueTv);
            if (appCompatTextView2 != null) {
                i10 = R.id.applicationNoTv;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) a.a(view2, R.id.applicationNoTv);
                if (appCompatTextView3 != null) {
                    i10 = R.id.applicationNoValueTv;
                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) a.a(view2, R.id.applicationNoValueTv);
                    if (appCompatTextView4 != null) {
                        i10 = R.id.buttonTv;
                        MyTextView myTextView = (MyTextView) a.a(view2, R.id.buttonTv);
                        if (myTextView != null) {
                            i10 = R.id.downloadFormsTv;
                            MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.downloadFormsTv);
                            if (myTextView2 != null) {
                                i10 = R.id.liner_rec;
                                LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.liner_rec);
                                if (linearLayout != null) {
                                    i10 = R.id.next_button;
                                    MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.next_button);
                                    if (myTextView3 != null) {
                                        i10 = R.id.ownerNameTv;
                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) a.a(view2, R.id.ownerNameTv);
                                        if (appCompatTextView5 != null) {
                                            i10 = R.id.ownerNameValueTv;
                                            AppCompatTextView appCompatTextView6 = (AppCompatTextView) a.a(view2, R.id.ownerNameValueTv);
                                            if (appCompatTextView6 != null) {
                                                i10 = R.id.parent_payment;
                                                LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.parent_payment);
                                                if (linearLayout2 != null) {
                                                    i10 = R.id.paymentResponseIv;
                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) a.a(view2, R.id.paymentResponseIv);
                                                    if (appCompatImageView != null) {
                                                        i10 = R.id.receiptNoTv;
                                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) a.a(view2, R.id.receiptNoTv);
                                                        if (appCompatTextView7 != null) {
                                                            i10 = R.id.receiptNoValueTv;
                                                            AppCompatTextView appCompatTextView8 = (AppCompatTextView) a.a(view2, R.id.receiptNoValueTv);
                                                            if (appCompatTextView8 != null) {
                                                                i10 = R.id.receipt_relative;
                                                                RelativeLayout relativeLayout = (RelativeLayout) a.a(view2, R.id.receipt_relative);
                                                                if (relativeLayout != null) {
                                                                    i10 = R.id.registrationNo;
                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) a.a(view2, R.id.registrationNo);
                                                                    if (appCompatTextView9 != null) {
                                                                        i10 = R.id.registrationNoTv;
                                                                        AppCompatTextView appCompatTextView10 = (AppCompatTextView) a.a(view2, R.id.registrationNoTv);
                                                                        if (appCompatTextView10 != null) {
                                                                            i10 = R.id.topHolder;
                                                                            View a10 = a.a(view2, R.id.topHolder);
                                                                            if (a10 != null) {
                                                                                qd a11 = qd.a(a10);
                                                                                i10 = R.id.transactionStatusTv;
                                                                                AppCompatTextView appCompatTextView11 = (AppCompatTextView) a.a(view2, R.id.transactionStatusTv);
                                                                                if (appCompatTextView11 != null) {
                                                                                    i10 = R.id.try_again;
                                                                                    MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.try_again);
                                                                                    if (myTextView4 != null) {
                                                                                        return new b9((ScrollView) view2, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, myTextView, myTextView2, linearLayout, myTextView3, appCompatTextView5, appCompatTextView6, linearLayout2, appCompatImageView, appCompatTextView7, appCompatTextView8, relativeLayout, appCompatTextView9, appCompatTextView10, a11, appCompatTextView11, myTextView4);
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

    public static b9 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static b9 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_vahan_payment_status_screen, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f25491a;
    }
}
