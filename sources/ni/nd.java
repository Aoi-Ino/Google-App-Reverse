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

public final class nd {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f27685a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f27686b;

    /* renamed from: c  reason: collision with root package name */
    public final od f27687c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f27688d;

    /* renamed from: e  reason: collision with root package name */
    public final dc f27689e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatTextView f27690f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f27691g;

    /* renamed from: h  reason: collision with root package name */
    public final FrameLayout f27692h;

    /* renamed from: i  reason: collision with root package name */
    public final FrameLayout f27693i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f27694j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f27695k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f27696l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f27697m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f27698n;

    /* renamed from: o  reason: collision with root package name */
    public final CustomWegetLayout f27699o;

    /* renamed from: p  reason: collision with root package name */
    public final RecyclerView f27700p;

    /* renamed from: q  reason: collision with root package name */
    public final CardView f27701q;

    /* renamed from: r  reason: collision with root package name */
    public final RecyclerView f27702r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f27703s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f27704t;

    /* renamed from: u  reason: collision with root package name */
    public final View f27705u;

    /* renamed from: v  reason: collision with root package name */
    public final View f27706v;

    private nd(CoordinatorLayout coordinatorLayout, TextView textView, od odVar, ImageView imageView, dc dcVar, AppCompatTextView appCompatTextView, LinearLayout linearLayout, FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, CustomWegetLayout customWegetLayout, RecyclerView recyclerView, CardView cardView, RecyclerView recyclerView2, TextView textView7, TextView textView8, View view, View view2) {
        this.f27685a = coordinatorLayout;
        this.f27686b = textView;
        this.f27687c = odVar;
        this.f27688d = imageView;
        this.f27689e = dcVar;
        this.f27690f = appCompatTextView;
        this.f27691g = linearLayout;
        this.f27692h = frameLayout;
        this.f27693i = frameLayout2;
        this.f27694j = textView2;
        this.f27695k = textView3;
        this.f27696l = textView4;
        this.f27697m = textView5;
        this.f27698n = textView6;
        this.f27699o = customWegetLayout;
        this.f27700p = recyclerView;
        this.f27701q = cardView;
        this.f27702r = recyclerView2;
        this.f27703s = textView7;
        this.f27704t = textView8;
        this.f27705u = view;
        this.f27706v = view2;
    }

    public static nd a(View view) {
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
                    i10 = R.id.header_layout;
                    View a12 = a.a(view2, R.id.header_layout);
                    if (a12 != null) {
                        dc a13 = dc.a(a12);
                        i10 = R.id.header_title_vehicle_details;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.header_title_vehicle_details);
                        if (appCompatTextView != null) {
                            i10 = R.id.linearLayout2;
                            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.linearLayout2);
                            if (linearLayout != null) {
                                i10 = R.id.linear_parent;
                                FrameLayout frameLayout = (FrameLayout) a.a(view2, R.id.linear_parent);
                                if (frameLayout != null) {
                                    i10 = R.id.nextBtnFl;
                                    FrameLayout frameLayout2 = (FrameLayout) a.a(view2, R.id.nextBtnFl);
                                    if (frameLayout2 != null) {
                                        i10 = R.id.service_name;
                                        TextView textView2 = (TextView) a.a(view2, R.id.service_name);
                                        if (textView2 != null) {
                                            i10 = R.id.skipped_upload_doc;
                                            TextView textView3 = (TextView) a.a(view2, R.id.skipped_upload_doc);
                                            if (textView3 != null) {
                                                i10 = R.id.submit;
                                                TextView textView4 = (TextView) a.a(view2, R.id.submit);
                                                if (textView4 != null) {
                                                    i10 = R.id.textView;
                                                    TextView textView5 = (TextView) a.a(view2, R.id.textView);
                                                    if (textView5 != null) {
                                                        i10 = R.id.textView2;
                                                        TextView textView6 = (TextView) a.a(view2, R.id.textView2);
                                                        if (textView6 != null) {
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
                                                                            TextView textView7 = (TextView) a.a(view2, R.id.vehicle_number);
                                                                            if (textView7 != null) {
                                                                                i10 = R.id.vehicle_view;
                                                                                TextView textView8 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                                if (textView8 != null) {
                                                                                    i10 = R.id.view8;
                                                                                    View a14 = a.a(view2, R.id.view8);
                                                                                    if (a14 != null) {
                                                                                        i10 = R.id.view9;
                                                                                        View a15 = a.a(view2, R.id.view9);
                                                                                        if (a15 != null) {
                                                                                            return new nd((CoordinatorLayout) view2, textView, a11, imageView, a13, appCompatTextView, linearLayout, frameLayout, frameLayout2, textView2, textView3, textView4, textView5, textView6, customWegetLayout, recyclerView, cardView, recyclerView2, textView7, textView8, a14, a15);
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

    public static nd c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static nd d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.vahan_dms_activity_reupload, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f27685a;
    }
}
