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

public final class a7 {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f25199a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatTextView f25200b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatTextView f25201c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatTextView f25202d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatTextView f25203e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f25204f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f25205g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f25206h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f25207i;

    /* renamed from: j  reason: collision with root package name */
    public final AppCompatTextView f25208j;

    /* renamed from: k  reason: collision with root package name */
    public final AppCompatTextView f25209k;

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f25210l;

    /* renamed from: m  reason: collision with root package name */
    public final AppCompatImageView f25211m;

    /* renamed from: n  reason: collision with root package name */
    public final AppCompatTextView f25212n;

    /* renamed from: o  reason: collision with root package name */
    public final AppCompatTextView f25213o;

    /* renamed from: p  reason: collision with root package name */
    public final RelativeLayout f25214p;

    /* renamed from: q  reason: collision with root package name */
    public final AppCompatTextView f25215q;

    /* renamed from: r  reason: collision with root package name */
    public final AppCompatTextView f25216r;

    /* renamed from: s  reason: collision with root package name */
    public final qd f25217s;

    /* renamed from: t  reason: collision with root package name */
    public final AppCompatTextView f25218t;

    /* renamed from: u  reason: collision with root package name */
    public final MyTextView f25219u;

    private a7(ScrollView scrollView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, MyTextView myTextView, MyTextView myTextView2, LinearLayout linearLayout, MyTextView myTextView3, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, LinearLayout linearLayout2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, RelativeLayout relativeLayout, AppCompatTextView appCompatTextView9, AppCompatTextView appCompatTextView10, qd qdVar, AppCompatTextView appCompatTextView11, MyTextView myTextView4) {
        this.f25199a = scrollView;
        this.f25200b = appCompatTextView;
        this.f25201c = appCompatTextView2;
        this.f25202d = appCompatTextView3;
        this.f25203e = appCompatTextView4;
        this.f25204f = myTextView;
        this.f25205g = myTextView2;
        this.f25206h = linearLayout;
        this.f25207i = myTextView3;
        this.f25208j = appCompatTextView5;
        this.f25209k = appCompatTextView6;
        this.f25210l = linearLayout2;
        this.f25211m = appCompatImageView;
        this.f25212n = appCompatTextView7;
        this.f25213o = appCompatTextView8;
        this.f25214p = relativeLayout;
        this.f25215q = appCompatTextView9;
        this.f25216r = appCompatTextView10;
        this.f25217s = qdVar;
        this.f25218t = appCompatTextView11;
        this.f25219u = myTextView4;
    }

    public static a7 a(View view) {
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
                                                                                        return new a7((ScrollView) view2, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, myTextView, myTextView2, linearLayout, myTextView3, appCompatTextView5, appCompatTextView6, linearLayout2, appCompatImageView, appCompatTextView7, appCompatTextView8, relativeLayout, appCompatTextView9, appCompatTextView10, a11, appCompatTextView11, myTextView4);
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

    public static a7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static a7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_pay_tax_status_screen, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f25199a;
    }
}
