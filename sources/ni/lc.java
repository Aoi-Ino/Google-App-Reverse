package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nic.mparivahan.R;
import k1.a;

public final class lc {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f27353a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f27354b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f27355c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f27356d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f27357e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f27358f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f27359g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f27360h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f27361i;

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f27362j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f27363k;

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f27364l;

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f27365m;

    private lc(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, TextView textView2, LinearLayout linearLayout10, LinearLayout linearLayout11) {
        this.f27353a = linearLayout;
        this.f27354b = linearLayout2;
        this.f27355c = linearLayout3;
        this.f27356d = linearLayout4;
        this.f27357e = textView;
        this.f27358f = linearLayout5;
        this.f27359g = linearLayout6;
        this.f27360h = linearLayout7;
        this.f27361i = linearLayout8;
        this.f27362j = linearLayout9;
        this.f27363k = textView2;
        this.f27364l = linearLayout10;
        this.f27365m = linearLayout11;
    }

    public static lc a(View view) {
        View view2 = view;
        int i10 = R.id.checkpostfeereceipt;
        LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.checkpostfeereceipt);
        if (linearLayout != null) {
            i10 = R.id.d_to;
            LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.d_to);
            if (linearLayout2 != null) {
                i10 = R.id.downloadFancyReceipt;
                LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.downloadFancyReceipt);
                if (linearLayout3 != null) {
                    i10 = R.id.enrolled_state_vahan;
                    TextView textView = (TextView) a.a(view2, R.id.enrolled_state_vahan);
                    if (textView != null) {
                        i10 = R.id.fancy_no_allocate_status;
                        LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.fancy_no_allocate_status);
                        if (linearLayout4 != null) {
                            i10 = R.id.fancy_no_avaliable_status;
                            LinearLayout linearLayout5 = (LinearLayout) a.a(view2, R.id.fancy_no_avaliable_status);
                            if (linearLayout5 != null) {
                                i10 = R.id.nexgenarrow;
                                LinearLayout linearLayout6 = (LinearLayout) a.a(view2, R.id.nexgenarrow);
                                if (linearLayout6 != null) {
                                    i10 = R.id.nexgenlogo;
                                    LinearLayout linearLayout7 = (LinearLayout) a.a(view2, R.id.nexgenlogo);
                                    if (linearLayout7 != null) {
                                        i10 = R.id.pucc_download;
                                        LinearLayout linearLayout8 = (LinearLayout) a.a(view2, R.id.pucc_download);
                                        if (linearLayout8 != null) {
                                            i10 = R.id.vahan_service_lable;
                                            TextView textView2 = (TextView) a.a(view2, R.id.vahan_service_lable);
                                            if (textView2 != null) {
                                                i10 = R.id.view_allotment_letter;
                                                LinearLayout linearLayout9 = (LinearLayout) a.a(view2, R.id.view_allotment_letter);
                                                if (linearLayout9 != null) {
                                                    i10 = R.id.viewtaxreceipt;
                                                    LinearLayout linearLayout10 = (LinearLayout) a.a(view2, R.id.viewtaxreceipt);
                                                    if (linearLayout10 != null) {
                                                        return new lc((LinearLayout) view2, linearLayout, linearLayout2, linearLayout3, textView, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, textView2, linearLayout9, linearLayout10);
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

    public static lc c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static lc d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.otherservice_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f27353a;
    }
}
