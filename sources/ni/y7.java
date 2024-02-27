package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class y7 {
    public final RelativeLayout A;
    public final MyTextView B;
    public final LinearLayout C;
    public final AppCompatTextView D;
    public final qd E;
    public final AppCompatImageView F;
    public final MyTextView G;
    public final RelativeLayout H;
    public final TextView I;
    public final TextView J;
    public final MyTextView K;
    public final TextView L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final RadioButton O;
    public final TextView P;
    public final LinearLayout Q;
    public final LinearLayout R;

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f29479a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatTextView f29480b;

    /* renamed from: c  reason: collision with root package name */
    public final CheckedTextView f29481c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f29482d;

    /* renamed from: e  reason: collision with root package name */
    public final RadioButton f29483e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f29484f;

    /* renamed from: g  reason: collision with root package name */
    public final RadioButton f29485g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f29486h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f29487i;

    /* renamed from: j  reason: collision with root package name */
    public final EditText f29488j;

    /* renamed from: k  reason: collision with root package name */
    public final AppCompatTextView f29489k;

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f29490l;

    /* renamed from: m  reason: collision with root package name */
    public final EditText f29491m;

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f29492n;

    /* renamed from: o  reason: collision with root package name */
    public final MyTextView f29493o;

    /* renamed from: p  reason: collision with root package name */
    public final AppCompatImageView f29494p;

    /* renamed from: q  reason: collision with root package name */
    public final RelativeLayout f29495q;

    /* renamed from: r  reason: collision with root package name */
    public final MyTextView f29496r;

    /* renamed from: s  reason: collision with root package name */
    public final CheckedTextView f29497s;

    /* renamed from: t  reason: collision with root package name */
    public final RelativeLayout f29498t;

    /* renamed from: u  reason: collision with root package name */
    public final View f29499u;

    /* renamed from: v  reason: collision with root package name */
    public final TextView f29500v;

    /* renamed from: w  reason: collision with root package name */
    public final RecyclerView f29501w;

    /* renamed from: x  reason: collision with root package name */
    public final CheckedTextView f29502x;

    /* renamed from: y  reason: collision with root package name */
    public final View f29503y;

    /* renamed from: z  reason: collision with root package name */
    public final AppCompatImageView f29504z;

    private y7(LinearLayout linearLayout, AppCompatTextView appCompatTextView, CheckedTextView checkedTextView, LinearLayout linearLayout2, RadioButton radioButton, EditText editText, RadioButton radioButton2, LinearLayout linearLayout3, LinearLayout linearLayout4, EditText editText2, AppCompatTextView appCompatTextView2, LinearLayout linearLayout5, EditText editText3, LinearLayout linearLayout6, MyTextView myTextView, AppCompatImageView appCompatImageView, RelativeLayout relativeLayout, MyTextView myTextView2, CheckedTextView checkedTextView2, RelativeLayout relativeLayout2, View view, TextView textView, RecyclerView recyclerView, CheckedTextView checkedTextView3, View view2, AppCompatImageView appCompatImageView2, RelativeLayout relativeLayout3, MyTextView myTextView3, LinearLayout linearLayout7, AppCompatTextView appCompatTextView3, qd qdVar, AppCompatImageView appCompatImageView3, MyTextView myTextView4, RelativeLayout relativeLayout4, TextView textView2, TextView textView3, MyTextView myTextView5, TextView textView4, LinearLayout linearLayout8, LinearLayout linearLayout9, RadioButton radioButton3, TextView textView5, LinearLayout linearLayout10, LinearLayout linearLayout11) {
        this.f29479a = linearLayout;
        this.f29480b = appCompatTextView;
        this.f29481c = checkedTextView;
        this.f29482d = linearLayout2;
        this.f29483e = radioButton;
        this.f29484f = editText;
        this.f29485g = radioButton2;
        this.f29486h = linearLayout3;
        this.f29487i = linearLayout4;
        this.f29488j = editText2;
        this.f29489k = appCompatTextView2;
        this.f29490l = linearLayout5;
        this.f29491m = editText3;
        this.f29492n = linearLayout6;
        this.f29493o = myTextView;
        this.f29494p = appCompatImageView;
        this.f29495q = relativeLayout;
        this.f29496r = myTextView2;
        this.f29497s = checkedTextView2;
        this.f29498t = relativeLayout2;
        this.f29499u = view;
        this.f29500v = textView;
        this.f29501w = recyclerView;
        this.f29502x = checkedTextView3;
        this.f29503y = view2;
        this.f29504z = appCompatImageView2;
        this.A = relativeLayout3;
        this.B = myTextView3;
        this.C = linearLayout7;
        this.D = appCompatTextView3;
        this.E = qdVar;
        this.F = appCompatImageView3;
        this.G = myTextView4;
        this.H = relativeLayout4;
        this.I = textView2;
        this.J = textView3;
        this.K = myTextView5;
        this.L = textView4;
        this.M = linearLayout8;
        this.N = linearLayout9;
        this.O = radioButton3;
        this.P = textView5;
        this.Q = linearLayout10;
        this.R = linearLayout11;
    }

    public static y7 a(View view) {
        View view2 = view;
        int i10 = R.id.challanDetailTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.challanDetailTv);
        if (appCompatTextView != null) {
            i10 = R.id.challanDetailsCb;
            CheckedTextView checkedTextView = (CheckedTextView) a.a(view2, R.id.challanDetailsCb);
            if (checkedTextView != null) {
                i10 = R.id.challanNoLl;
                LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.challanNoLl);
                if (linearLayout != null) {
                    i10 = R.id.challanNoRb;
                    RadioButton radioButton = (RadioButton) a.a(view2, R.id.challanNoRb);
                    if (radioButton != null) {
                        i10 = R.id.chasisEt;
                        EditText editText = (EditText) a.a(view2, R.id.chasisEt);
                        if (editText != null) {
                            i10 = R.id.dLNoRb;
                            RadioButton radioButton2 = (RadioButton) a.a(view2, R.id.dLNoRb);
                            if (radioButton2 != null) {
                                i10 = R.id.delet_icon;
                                LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.delet_icon);
                                if (linearLayout2 != null) {
                                    i10 = R.id.drivingLicenseLl;
                                    LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.drivingLicenseLl);
                                    if (linearLayout3 != null) {
                                        i10 = R.id.engineEt;
                                        EditText editText2 = (EditText) a.a(view2, R.id.engineEt);
                                        if (editText2 != null) {
                                            i10 = R.id.getDetailsTv;
                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view2, R.id.getDetailsTv);
                                            if (appCompatTextView2 != null) {
                                                i10 = R.id.inner_parent;
                                                LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.inner_parent);
                                                if (linearLayout4 != null) {
                                                    i10 = R.id.inputEt;
                                                    EditText editText3 = (EditText) a.a(view2, R.id.inputEt);
                                                    if (editText3 != null) {
                                                        i10 = R.id.linear_parent;
                                                        LinearLayout linearLayout5 = (LinearLayout) a.a(view2, R.id.linear_parent);
                                                        if (linearLayout5 != null) {
                                                            i10 = R.id.myDlLicence;
                                                            MyTextView myTextView = (MyTextView) a.a(view2, R.id.myDlLicence);
                                                            if (myTextView != null) {
                                                                i10 = R.id.payChallanIv;
                                                                AppCompatImageView appCompatImageView = (AppCompatImageView) a.a(view2, R.id.payChallanIv);
                                                                if (appCompatImageView != null) {
                                                                    i10 = R.id.payChallanRl;
                                                                    RelativeLayout relativeLayout = (RelativeLayout) a.a(view2, R.id.payChallanRl);
                                                                    if (relativeLayout != null) {
                                                                        i10 = R.id.payChallanTv;
                                                                        MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.payChallanTv);
                                                                        if (myTextView2 != null) {
                                                                            i10 = R.id.paymentCb;
                                                                            CheckedTextView checkedTextView2 = (CheckedTextView) a.a(view2, R.id.paymentCb);
                                                                            if (checkedTextView2 != null) {
                                                                                i10 = R.id.paymentStatusRl;
                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) a.a(view2, R.id.paymentStatusRl);
                                                                                if (relativeLayout2 != null) {
                                                                                    i10 = R.id.paymentView;
                                                                                    View a10 = a.a(view2, R.id.paymentView);
                                                                                    if (a10 != null) {
                                                                                        i10 = R.id.rc_number;
                                                                                        TextView textView = (TextView) a.a(view2, R.id.rc_number);
                                                                                        if (textView != null) {
                                                                                            i10 = R.id.rec_rc_recycler;
                                                                                            RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.rec_rc_recycler);
                                                                                            if (recyclerView != null) {
                                                                                                i10 = R.id.receiptCb;
                                                                                                CheckedTextView checkedTextView3 = (CheckedTextView) a.a(view2, R.id.receiptCb);
                                                                                                if (checkedTextView3 != null) {
                                                                                                    i10 = R.id.receiptView;
                                                                                                    View a11 = a.a(view2, R.id.receiptView);
                                                                                                    if (a11 != null) {
                                                                                                        i10 = R.id.reprintReceiptIv;
                                                                                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) a.a(view2, R.id.reprintReceiptIv);
                                                                                                        if (appCompatImageView2 != null) {
                                                                                                            i10 = R.id.reprintReceiptRl;
                                                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) a.a(view2, R.id.reprintReceiptRl);
                                                                                                            if (relativeLayout3 != null) {
                                                                                                                i10 = R.id.reprintReceiptTv;
                                                                                                                MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.reprintReceiptTv);
                                                                                                                if (myTextView3 != null) {
                                                                                                                    i10 = R.id.topBtnHolderLl;
                                                                                                                    LinearLayout linearLayout6 = (LinearLayout) a.a(view2, R.id.topBtnHolderLl);
                                                                                                                    if (linearLayout6 != null) {
                                                                                                                        i10 = R.id.topTitleTv;
                                                                                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) a.a(view2, R.id.topTitleTv);
                                                                                                                        if (appCompatTextView3 != null) {
                                                                                                                            i10 = R.id.topheader;
                                                                                                                            View a12 = a.a(view2, R.id.topheader);
                                                                                                                            if (a12 != null) {
                                                                                                                                qd a13 = qd.a(a12);
                                                                                                                                i10 = R.id.transStatusIv;
                                                                                                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) a.a(view2, R.id.transStatusIv);
                                                                                                                                if (appCompatImageView3 != null) {
                                                                                                                                    i10 = R.id.transactionTv;
                                                                                                                                    MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.transactionTv);
                                                                                                                                    if (myTextView4 != null) {
                                                                                                                                        i10 = R.id.transcationStatusRl;
                                                                                                                                        RelativeLayout relativeLayout4 = (RelativeLayout) a.a(view2, R.id.transcationStatusRl);
                                                                                                                                        if (relativeLayout4 != null) {
                                                                                                                                            i10 = R.id.tv_chassi_no;
                                                                                                                                            TextView textView2 = (TextView) a.a(view2, R.id.tv_chassi_no);
                                                                                                                                            if (textView2 != null) {
                                                                                                                                                i10 = R.id.tv_engine_no;
                                                                                                                                                TextView textView3 = (TextView) a.a(view2, R.id.tv_engine_no);
                                                                                                                                                if (textView3 != null) {
                                                                                                                                                    i10 = R.id.tv_my_vehicle_list;
                                                                                                                                                    MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.tv_my_vehicle_list);
                                                                                                                                                    if (myTextView5 != null) {
                                                                                                                                                        i10 = R.id.tv_vehicle_no;
                                                                                                                                                        TextView textView4 = (TextView) a.a(view2, R.id.tv_vehicle_no);
                                                                                                                                                        if (textView4 != null) {
                                                                                                                                                            i10 = R.id.vehicleDetailsLl;
                                                                                                                                                            LinearLayout linearLayout7 = (LinearLayout) a.a(view2, R.id.vehicleDetailsLl);
                                                                                                                                                            if (linearLayout7 != null) {
                                                                                                                                                                i10 = R.id.vehicleNoLl;
                                                                                                                                                                LinearLayout linearLayout8 = (LinearLayout) a.a(view2, R.id.vehicleNoLl);
                                                                                                                                                                if (linearLayout8 != null) {
                                                                                                                                                                    i10 = R.id.vehicleNoRb;
                                                                                                                                                                    RadioButton radioButton3 = (RadioButton) a.a(view2, R.id.vehicleNoRb);
                                                                                                                                                                    if (radioButton3 != null) {
                                                                                                                                                                        i10 = R.id.viewdetails;
                                                                                                                                                                        TextView textView5 = (TextView) a.a(view2, R.id.viewdetails);
                                                                                                                                                                        if (textView5 != null) {
                                                                                                                                                                            i10 = R.id.virtual_dl_view;
                                                                                                                                                                            LinearLayout linearLayout9 = (LinearLayout) a.a(view2, R.id.virtual_dl_view);
                                                                                                                                                                            if (linearLayout9 != null) {
                                                                                                                                                                                i10 = R.id.virtualrc_layout;
                                                                                                                                                                                LinearLayout linearLayout10 = (LinearLayout) a.a(view2, R.id.virtualrc_layout);
                                                                                                                                                                                if (linearLayout10 != null) {
                                                                                                                                                                                    return new y7((LinearLayout) view2, appCompatTextView, checkedTextView, linearLayout, radioButton, editText, radioButton2, linearLayout2, linearLayout3, editText2, appCompatTextView2, linearLayout4, editText3, linearLayout5, myTextView, appCompatImageView, relativeLayout, myTextView2, checkedTextView2, relativeLayout2, a10, textView, recyclerView, checkedTextView3, a11, appCompatImageView2, relativeLayout3, myTextView3, linearLayout6, appCompatTextView3, a13, appCompatImageView3, myTextView4, relativeLayout4, textView2, textView3, myTextView5, textView4, linearLayout7, linearLayout8, radioButton3, textView5, linearLayout9, linearLayout10);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static y7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static y7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_search_challan, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f29479a;
    }
}
