package hk;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import cm.g;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.ui.slots.calendar.ExpandableHeightGridView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class c extends LinearLayout {

    /* renamed from: o  reason: collision with root package name */
    public static final a f24121o = new a((g) null);

    /* renamed from: e  reason: collision with root package name */
    private ImageView f24122e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f24123f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f24124g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f24125h;

    /* renamed from: i  reason: collision with root package name */
    private ExpandableHeightGridView f24126i;

    /* renamed from: j  reason: collision with root package name */
    private final SimpleDateFormat f24127j;

    /* renamed from: k  reason: collision with root package name */
    private final Calendar f24128k;

    /* renamed from: l  reason: collision with root package name */
    private Context f24129l;

    /* renamed from: m  reason: collision with root package name */
    private d f24130m;

    /* renamed from: n  reason: collision with root package name */
    private ArrayList f24131n;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, ArrayList arrayList) {
        super(context);
        l.f(arrayList, "eventObjectses");
        Locale locale = Locale.ENGLISH;
        this.f24127j = new SimpleDateFormat("MMMM, yyyy", locale);
        this.f24128k = Calendar.getInstance(locale);
        new ArrayList();
        this.f24131n = arrayList;
        this.f24129l = context;
        c();
        k();
        i();
        g();
        f();
    }

    private final void c() {
        Context context = getContext();
        Object systemService = context != null ? context.getSystemService("layout_inflater") : null;
        l.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.calender_layout, this);
        View findViewById = inflate.findViewById(R.id.previous_month);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f24122e = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.next_month);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        this.f24123f = (ImageView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.display_current_year);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        this.f24124g = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.display_current_date);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        this.f24125h = (TextView) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.calendar_grid);
        l.d(findViewById5, "null cannot be cast to non-null type com.nic.mparivahan.dlservices.ui.slots.calendar.ExpandableHeightGridView");
        ExpandableHeightGridView expandableHeightGridView = (ExpandableHeightGridView) findViewById5;
        this.f24126i = expandableHeightGridView;
        if (expandableHeightGridView != null) {
            expandableHeightGridView.setExpanded(true);
        }
    }

    private final void g() {
        ImageView imageView = this.f24123f;
        if (imageView != null) {
            imageView.setOnClickListener(new b(this));
        }
    }

    /* access modifiers changed from: private */
    public static final void h(c cVar, View view) {
        l.f(cVar, "this$0");
        cVar.d();
    }

    private final void i() {
        ImageView imageView = this.f24122e;
        if (imageView != null) {
            imageView.setOnClickListener(new a(this));
        }
    }

    /* access modifiers changed from: private */
    public static final void j(c cVar, View view) {
        l.f(cVar, "this$0");
        cVar.e();
    }

    public void d() {
        this.f24128k.add(2, 1);
        k();
    }

    public void e() {
        this.f24128k.add(2, -1);
        k();
    }

    public final String f() {
        return new String[1][0];
    }

    public final ExpandableHeightGridView getCalendarGridView() {
        return this.f24126i;
    }

    public final ArrayList<e> getEventObjectses() {
        return this.f24131n;
    }

    public final void k() {
        ArrayList arrayList = new ArrayList();
        Object clone = this.f24128k.clone();
        l.d(clone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar = (Calendar) clone;
        calendar.set(5, 1);
        calendar.add(5, -(calendar.get(7) - 2));
        while (arrayList.size() < 42) {
            Date time = calendar.getTime();
            l.e(time, "getTime(...)");
            arrayList.add(time);
            calendar.add(5, 1);
        }
        Log.d("tag", "Year: " + this.f24128k.get(1) + " Month: " + this.f24128k.get(2));
        CharSequence format = DateFormat.format("yyyy", this.f24128k.getTime());
        CharSequence format2 = DateFormat.format("MMMM", this.f24128k.getTime());
        TextView textView = this.f24124g;
        if (textView != null) {
            textView.setText(format);
        }
        TextView textView2 = this.f24125h;
        if (textView2 != null) {
            textView2.setText(format2);
        }
        Context context = getContext();
        Calendar calendar2 = this.f24128k;
        l.e(calendar2, "cal");
        d dVar = new d(context, arrayList, calendar2, this.f24131n);
        this.f24130m = dVar;
        ExpandableHeightGridView expandableHeightGridView = this.f24126i;
        if (expandableHeightGridView != null) {
            expandableHeightGridView.setAdapter(dVar);
        }
    }

    public final void setCalendarGridView(ExpandableHeightGridView expandableHeightGridView) {
        this.f24126i = expandableHeightGridView;
    }

    public final void setEventObjectses(ArrayList<e> arrayList) {
        l.f(arrayList, "<set-?>");
        this.f24131n = arrayList;
    }

    public final void setSelectedDates(e eVar) {
        l.f(eVar, "eventObjectses");
        this.f24131n.add(eVar);
        d dVar = this.f24130m;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }
}
