package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.MapView;
import com.nic.mparivahan.R;
import k1.a;

public final class o9 {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f27812a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f27813b;

    /* renamed from: c  reason: collision with root package name */
    public final dc f27814c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f27815d;

    /* renamed from: e  reason: collision with root package name */
    public final MapView f27816e;

    /* renamed from: f  reason: collision with root package name */
    public final RecyclerView f27817f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f27818g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f27819h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f27820i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f27821j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f27822k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f27823l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f27824m;

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f27825n;

    private o9(LinearLayout linearLayout, TextView textView, dc dcVar, ImageView imageView, MapView mapView, RecyclerView recyclerView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, ImageView imageView2) {
        this.f27812a = linearLayout;
        this.f27813b = textView;
        this.f27814c = dcVar;
        this.f27815d = imageView;
        this.f27816e = mapView;
        this.f27817f = recyclerView;
        this.f27818g = textView2;
        this.f27819h = textView3;
        this.f27820i = textView4;
        this.f27821j = textView5;
        this.f27822k = textView6;
        this.f27823l = textView7;
        this.f27824m = textView8;
        this.f27825n = imageView2;
    }

    public static o9 a(View view) {
        View view2 = view;
        int i10 = R.id.b_ok_button;
        TextView textView = (TextView) a.a(view2, R.id.b_ok_button);
        if (textView != null) {
            i10 = R.id.header_details;
            View a10 = a.a(view2, R.id.header_details);
            if (a10 != null) {
                dc a11 = dc.a(a10);
                i10 = R.id.imageView;
                ImageView imageView = (ImageView) a.a(view2, R.id.imageView);
                if (imageView != null) {
                    i10 = R.id.map_details;
                    MapView mapView = (MapView) a.a(view2, R.id.map_details);
                    if (mapView != null) {
                        i10 = R.id.traffic_feedback;
                        RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.traffic_feedback);
                        if (recyclerView != null) {
                            i10 = R.id.tv_location;
                            TextView textView2 = (TextView) a.a(view2, R.id.tv_location);
                            if (textView2 != null) {
                                i10 = R.id.tv_status;
                                TextView textView3 = (TextView) a.a(view2, R.id.tv_status);
                                if (textView3 != null) {
                                    i10 = R.id.tv_vehicle_no;
                                    TextView textView4 = (TextView) a.a(view2, R.id.tv_vehicle_no);
                                    if (textView4 != null) {
                                        i10 = R.id.txt_id;
                                        TextView textView5 = (TextView) a.a(view2, R.id.txt_id);
                                        if (textView5 != null) {
                                            i10 = R.id.txt_location;
                                            TextView textView6 = (TextView) a.a(view2, R.id.txt_location);
                                            if (textView6 != null) {
                                                i10 = R.id.txt_status;
                                                TextView textView7 = (TextView) a.a(view2, R.id.txt_status);
                                                if (textView7 != null) {
                                                    i10 = R.id.txt_vehicle_number;
                                                    TextView textView8 = (TextView) a.a(view2, R.id.txt_vehicle_number);
                                                    if (textView8 != null) {
                                                        i10 = R.id.videoView;
                                                        ImageView imageView2 = (ImageView) a.a(view2, R.id.videoView);
                                                        if (imageView2 != null) {
                                                            return new o9((LinearLayout) view2, textView, a11, imageView, mapView, recyclerView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, imageView2);
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

    public static o9 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static o9 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_view_complaint_details, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f27812a;
    }
}
