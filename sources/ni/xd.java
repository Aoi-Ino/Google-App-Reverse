package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.kizitonwose.calendarview.CalendarView;
import com.nic.mparivahan.R;
import k1.a;

public final class xd {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f29413a;

    /* renamed from: b  reason: collision with root package name */
    public final CalendarView f29414b;

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f29415c;

    /* renamed from: d  reason: collision with root package name */
    public final View f29416d;

    /* renamed from: e  reason: collision with root package name */
    public final jb f29417e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f29418f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f29419g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f29420h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f29421i;

    /* renamed from: j  reason: collision with root package name */
    public final RecyclerView f29422j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f29423k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f29424l;

    /* renamed from: m  reason: collision with root package name */
    public final qd f29425m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f29426n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f29427o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f29428p;

    private xd(LinearLayout linearLayout, CalendarView calendarView, ConstraintLayout constraintLayout, View view, jb jbVar, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2, RecyclerView recyclerView, TextView textView3, TextView textView4, qd qdVar, TextView textView5, TextView textView6, TextView textView7) {
        this.f29413a = linearLayout;
        this.f29414b = calendarView;
        this.f29415c = constraintLayout;
        this.f29416d = view;
        this.f29417e = jbVar;
        this.f29418f = linearLayout2;
        this.f29419g = linearLayout3;
        this.f29420h = textView;
        this.f29421i = textView2;
        this.f29422j = recyclerView;
        this.f29423k = textView3;
        this.f29424l = textView4;
        this.f29425m = qdVar;
        this.f29426n = textView5;
        this.f29427o = textView6;
        this.f29428p = textView7;
    }

    public static xd a(View view) {
        View view2 = view;
        int i10 = R.id.calendarView;
        CalendarView calendarView = (CalendarView) a.a(view2, R.id.calendarView);
        if (calendarView != null) {
            i10 = R.id.cl_day_info;
            ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view2, R.id.cl_day_info);
            if (constraintLayout != null) {
                i10 = R.id.custom_view;
                View a10 = a.a(view2, R.id.custom_view);
                if (a10 != null) {
                    i10 = R.id.include2;
                    View a11 = a.a(view2, R.id.include2);
                    if (a11 != null) {
                        jb a12 = jb.a(a11);
                        i10 = R.id.layoutCalender;
                        LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.layoutCalender);
                        if (linearLayout != null) {
                            i10 = R.id.linearLayout3;
                            LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.linearLayout3);
                            if (linearLayout2 != null) {
                                i10 = R.id.noSlotFoundTv;
                                TextView textView = (TextView) a.a(view2, R.id.noSlotFoundTv);
                                if (textView != null) {
                                    i10 = R.id.service_name;
                                    TextView textView2 = (TextView) a.a(view2, R.id.service_name);
                                    if (textView2 != null) {
                                        i10 = R.id.slot_list;
                                        RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.slot_list);
                                        if (recyclerView != null) {
                                            i10 = R.id.textView5;
                                            TextView textView3 = (TextView) a.a(view2, R.id.textView5);
                                            if (textView3 != null) {
                                                i10 = R.id.textView6;
                                                TextView textView4 = (TextView) a.a(view2, R.id.textView6);
                                                if (textView4 != null) {
                                                    i10 = R.id.topHolder;
                                                    View a13 = a.a(view2, R.id.topHolder);
                                                    if (a13 != null) {
                                                        qd a14 = qd.a(a13);
                                                        i10 = R.id.tv_current_date;
                                                        TextView textView5 = (TextView) a.a(view2, R.id.tv_current_date);
                                                        if (textView5 != null) {
                                                            i10 = R.id.vehicle_number;
                                                            TextView textView6 = (TextView) a.a(view2, R.id.vehicle_number);
                                                            if (textView6 != null) {
                                                                i10 = R.id.vehicle_view;
                                                                TextView textView7 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                if (textView7 != null) {
                                                                    return new xd((LinearLayout) view2, calendarView, constraintLayout, a10, a12, linearLayout, linearLayout2, textView, textView2, recyclerView, textView3, textView4, a14, textView5, textView6, textView7);
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

    public static xd c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static xd d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.vahan_slot_booking, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f29413a;
    }
}
