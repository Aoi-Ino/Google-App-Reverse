package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import k1.a;

public final class ud {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f28891a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f28892b;

    /* renamed from: c  reason: collision with root package name */
    public final od f28893c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f28894d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatTextView f28895e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f28896f;

    /* renamed from: g  reason: collision with root package name */
    public final FrameLayout f28897g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f28898h;

    /* renamed from: i  reason: collision with root package name */
    public final FrameLayout f28899i;

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f28900j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f28901k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f28902l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f28903m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f28904n;

    /* renamed from: o  reason: collision with root package name */
    public final qd f28905o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f28906p;

    /* renamed from: q  reason: collision with root package name */
    public final CustomWegetLayout f28907q;

    /* renamed from: r  reason: collision with root package name */
    public final RecyclerView f28908r;

    /* renamed from: s  reason: collision with root package name */
    public final CardView f28909s;

    /* renamed from: t  reason: collision with root package name */
    public final RecyclerView f28910t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f28911u;

    /* renamed from: v  reason: collision with root package name */
    public final TextView f28912v;

    /* renamed from: w  reason: collision with root package name */
    public final View f28913w;

    /* renamed from: x  reason: collision with root package name */
    public final View f28914x;

    private ud(CoordinatorLayout coordinatorLayout, TextView textView, od odVar, ImageView imageView, AppCompatTextView appCompatTextView, LinearLayout linearLayout, FrameLayout frameLayout, TextView textView2, FrameLayout frameLayout2, LinearLayout linearLayout2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, qd qdVar, TextView textView7, CustomWegetLayout customWegetLayout, RecyclerView recyclerView, CardView cardView, RecyclerView recyclerView2, TextView textView8, TextView textView9, View view, View view2) {
        this.f28891a = coordinatorLayout;
        this.f28892b = textView;
        this.f28893c = odVar;
        this.f28894d = imageView;
        this.f28895e = appCompatTextView;
        this.f28896f = linearLayout;
        this.f28897g = frameLayout;
        this.f28898h = textView2;
        this.f28899i = frameLayout2;
        this.f28900j = linearLayout2;
        this.f28901k = textView3;
        this.f28902l = textView4;
        this.f28903m = textView5;
        this.f28904n = textView6;
        this.f28905o = qdVar;
        this.f28906p = textView7;
        this.f28907q = customWegetLayout;
        this.f28908r = recyclerView;
        this.f28909s = cardView;
        this.f28910t = recyclerView2;
        this.f28911u = textView8;
        this.f28912v = textView9;
        this.f28913w = view;
        this.f28914x = view2;
    }

    public static ud a(View view) {
        View view2 = view;
        int i10 = R.id.application_no;
        TextView textView = (TextView) a.a(view2, R.id.application_no);
        if (textView != null) {
            i10 = R.id.dms_layout;
            View a10 = a.a(view2, R.id.dms_layout);
            if (a10 != null) {
                od a11 = od.a(a10);
                i10 = R.id.downArrowVehicleDetails;
                ImageView imageView = (ImageView) a.a(view2, R.id.downArrowVehicleDetails);
                if (imageView != null) {
                    i10 = R.id.header_title_vehicle_details;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.header_title_vehicle_details);
                    if (appCompatTextView != null) {
                        i10 = R.id.linearLayout2;
                        LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.linearLayout2);
                        if (linearLayout != null) {
                            i10 = R.id.linear_parent;
                            FrameLayout frameLayout = (FrameLayout) a.a(view2, R.id.linear_parent);
                            if (frameLayout != null) {
                                i10 = R.id.next;
                                TextView textView2 = (TextView) a.a(view2, R.id.next);
                                if (textView2 != null) {
                                    i10 = R.id.nextBtnFl;
                                    FrameLayout frameLayout2 = (FrameLayout) a.a(view2, R.id.nextBtnFl);
                                    if (frameLayout2 != null) {
                                        i10 = R.id.parent_bottom;
                                        LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.parent_bottom);
                                        if (linearLayout2 != null) {
                                            i10 = R.id.service_name;
                                            TextView textView3 = (TextView) a.a(view2, R.id.service_name);
                                            if (textView3 != null) {
                                                i10 = R.id.skipped_upload_doc;
                                                TextView textView4 = (TextView) a.a(view2, R.id.skipped_upload_doc);
                                                if (textView4 != null) {
                                                    i10 = R.id.textView;
                                                    TextView textView5 = (TextView) a.a(view2, R.id.textView);
                                                    if (textView5 != null) {
                                                        i10 = R.id.textView2;
                                                        TextView textView6 = (TextView) a.a(view2, R.id.textView2);
                                                        if (textView6 != null) {
                                                            i10 = R.id.topHolder;
                                                            View a12 = a.a(view2, R.id.topHolder);
                                                            if (a12 != null) {
                                                                qd a13 = qd.a(a12);
                                                                i10 = R.id.upload_bt;
                                                                TextView textView7 = (TextView) a.a(view2, R.id.upload_bt);
                                                                if (textView7 != null) {
                                                                    i10 = R.id.upload_documents;
                                                                    CustomWegetLayout customWegetLayout = (CustomWegetLayout) a.a(view2, R.id.upload_documents);
                                                                    if (customWegetLayout != null) {
                                                                        i10 = R.id.upload_list_rv;
                                                                        RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.upload_list_rv);
                                                                        if (recyclerView != null) {
                                                                            i10 = R.id.uploaded_doc_list;
                                                                            CardView cardView = (CardView) a.a(view2, R.id.uploaded_doc_list);
                                                                            if (cardView != null) {
                                                                                i10 = R.id.uploaded_list;
                                                                                RecyclerView recyclerView2 = (RecyclerView) a.a(view2, R.id.uploaded_list);
                                                                                if (recyclerView2 != null) {
                                                                                    i10 = R.id.vehicle_number;
                                                                                    TextView textView8 = (TextView) a.a(view2, R.id.vehicle_number);
                                                                                    if (textView8 != null) {
                                                                                        i10 = R.id.vehicle_view;
                                                                                        TextView textView9 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                                        if (textView9 != null) {
                                                                                            i10 = R.id.view8;
                                                                                            View a14 = a.a(view2, R.id.view8);
                                                                                            if (a14 != null) {
                                                                                                i10 = R.id.view9;
                                                                                                View a15 = a.a(view2, R.id.view9);
                                                                                                if (a15 != null) {
                                                                                                    return new ud((CoordinatorLayout) view2, textView, a11, imageView, appCompatTextView, linearLayout, frameLayout, textView2, frameLayout2, linearLayout2, textView3, textView4, textView5, textView6, a13, textView7, customWegetLayout, recyclerView, cardView, recyclerView2, textView8, textView9, a14, a15);
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

    public static ud c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static ud d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.vahan_multi_service_dms, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f28891a;
    }
}
