package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import k1.a;

public final class ja {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f26991a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f26992b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26993c;

    /* renamed from: d  reason: collision with root package name */
    public final CardView f26994d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26995e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f26996f;

    /* renamed from: g  reason: collision with root package name */
    public final CustomWegetLayout f26997g;

    /* renamed from: h  reason: collision with root package name */
    public final CardView f26998h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f26999i;

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f27000j;

    /* renamed from: k  reason: collision with root package name */
    public final MyTextView f27001k;

    /* renamed from: l  reason: collision with root package name */
    public final MyTextView f27002l;

    /* renamed from: m  reason: collision with root package name */
    public final MyTextView f27003m;

    /* renamed from: n  reason: collision with root package name */
    public final MyTextView f27004n;

    /* renamed from: o  reason: collision with root package name */
    public final MyTextView f27005o;

    /* renamed from: p  reason: collision with root package name */
    public final MyTextView f27006p;

    /* renamed from: q  reason: collision with root package name */
    public final MyTextView f27007q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f27008r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f27009s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f27010t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f27011u;

    /* renamed from: v  reason: collision with root package name */
    public final MyTextView f27012v;

    private ja(LinearLayout linearLayout, TextView textView, TextView textView2, CardView cardView, TextView textView3, ImageView imageView, CustomWegetLayout customWegetLayout, CardView cardView2, MyTextView myTextView, LinearLayout linearLayout2, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, MyTextView myTextView8, TextView textView4, TextView textView5, TextView textView6, TextView textView7, MyTextView myTextView9) {
        this.f26991a = linearLayout;
        this.f26992b = textView;
        this.f26993c = textView2;
        this.f26994d = cardView;
        this.f26995e = textView3;
        this.f26996f = imageView;
        this.f26997g = customWegetLayout;
        this.f26998h = cardView2;
        this.f26999i = myTextView;
        this.f27000j = linearLayout2;
        this.f27001k = myTextView2;
        this.f27002l = myTextView3;
        this.f27003m = myTextView4;
        this.f27004n = myTextView5;
        this.f27005o = myTextView6;
        this.f27006p = myTextView7;
        this.f27007q = myTextView8;
        this.f27008r = textView4;
        this.f27009s = textView5;
        this.f27010t = textView6;
        this.f27011u = textView7;
        this.f27012v = myTextView9;
    }

    public static ja a(View view) {
        View view2 = view;
        int i10 = R.id.dl_holder_name;
        TextView textView = (TextView) a.a(view2, R.id.dl_holder_name);
        if (textView != null) {
            i10 = R.id.expire_date;
            TextView textView2 = (TextView) a.a(view2, R.id.expire_date);
            if (textView2 != null) {
                i10 = R.id.icon_image;
                CardView cardView = (CardView) a.a(view2, R.id.icon_image);
                if (cardView != null) {
                    i10 = R.id.issue_date;
                    TextView textView3 = (TextView) a.a(view2, R.id.issue_date);
                    if (textView3 != null) {
                        i10 = R.id.iv_report_traffic_violation_icon;
                        ImageView imageView = (ImageView) a.a(view2, R.id.iv_report_traffic_violation_icon);
                        if (imageView != null) {
                            i10 = R.id.ll_select_services;
                            CustomWegetLayout customWegetLayout = (CustomWegetLayout) a.a(view2, R.id.ll_select_services);
                            if (customWegetLayout != null) {
                                i10 = R.id.round_card_view;
                                CardView cardView2 = (CardView) a.a(view2, R.id.round_card_view);
                                if (cardView2 != null) {
                                    i10 = R.id.select_service;
                                    MyTextView myTextView = (MyTextView) a.a(view2, R.id.select_service);
                                    if (myTextView != null) {
                                        i10 = R.id.should_be_open;
                                        LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.should_be_open);
                                        if (linearLayout != null) {
                                            i10 = R.id.tv_current_addr_aadhaar;
                                            MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.tv_current_addr_aadhaar);
                                            if (myTextView2 != null) {
                                                i10 = R.id.tv_dl_details;
                                                MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.tv_dl_details);
                                                if (myTextView3 != null) {
                                                    i10 = R.id.tv_dl_holder_name;
                                                    MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.tv_dl_holder_name);
                                                    if (myTextView4 != null) {
                                                        i10 = R.id.tv_ekyc_demogra_details;
                                                        MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.tv_ekyc_demogra_details);
                                                        if (myTextView5 != null) {
                                                            i10 = R.id.tv_expiry_date;
                                                            MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.tv_expiry_date);
                                                            if (myTextView6 != null) {
                                                                i10 = R.id.tv_issue_date;
                                                                MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.tv_issue_date);
                                                                if (myTextView7 != null) {
                                                                    i10 = R.id.tv_owner_name_aadhaar;
                                                                    MyTextView myTextView8 = (MyTextView) a.a(view2, R.id.tv_owner_name_aadhaar);
                                                                    if (myTextView8 != null) {
                                                                        i10 = R.id.txt_current_add;
                                                                        TextView textView4 = (TextView) a.a(view2, R.id.txt_current_add);
                                                                        if (textView4 != null) {
                                                                            i10 = R.id.txt_dl_no;
                                                                            TextView textView5 = (TextView) a.a(view2, R.id.txt_dl_no);
                                                                            if (textView5 != null) {
                                                                                i10 = R.id.txt_kyc_owner_name;
                                                                                TextView textView6 = (TextView) a.a(view2, R.id.txt_kyc_owner_name);
                                                                                if (textView6 != null) {
                                                                                    i10 = R.id.txt_relation;
                                                                                    TextView textView7 = (TextView) a.a(view2, R.id.txt_relation);
                                                                                    if (textView7 != null) {
                                                                                        i10 = R.id.txt_relation_txt;
                                                                                        MyTextView myTextView9 = (MyTextView) a.a(view2, R.id.txt_relation_txt);
                                                                                        if (myTextView9 != null) {
                                                                                            return new ja((LinearLayout) view2, textView, textView2, cardView, textView3, imageView, customWegetLayout, cardView2, myTextView, linearLayout, myTextView2, myTextView3, myTextView4, myTextView5, myTextView6, myTextView7, myTextView8, textView4, textView5, textView6, textView7, myTextView9);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ja c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static ja d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dl_services_10, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f26991a;
    }
}
