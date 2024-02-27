package gi;

import android.content.Context;
import android.text.format.DateFormat;
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
    public static final a f23711o = new a((g) null);

    /* renamed from: e  reason: collision with root package name */
    private ImageView f23712e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f23713f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f23714g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f23715h;

    /* renamed from: i  reason: collision with root package name */
    private ExpandableHeightGridView f23716i;

    /* renamed from: j  reason: collision with root package name */
    private final SimpleDateFormat f23717j;

    /* renamed from: k  reason: collision with root package name */
    private final Calendar f23718k;

    /* renamed from: l  reason: collision with root package name */
    private Context f23719l;

    /* renamed from: m  reason: collision with root package name */
    private d f23720m;

    /* renamed from: n  reason: collision with root package name */
    private ArrayList f23721n;

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
        this.f23717j = new SimpleDateFormat("MMMM, yyyy", locale);
        this.f23718k = Calendar.getInstance(locale);
        new ArrayList();
        this.f23721n = arrayList;
        this.f23719l = context;
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
        this.f23712e = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.next_month);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        this.f23713f = (ImageView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.display_current_year);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        this.f23714g = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.display_current_date);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        this.f23715h = (TextView) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.calendar_grid);
        l.d(findViewById5, "null cannot be cast to non-null type com.nic.mparivahan.dlservices.ui.slots.calendar.ExpandableHeightGridView");
        ExpandableHeightGridView expandableHeightGridView = (ExpandableHeightGridView) findViewById5;
        this.f23716i = expandableHeightGridView;
        if (expandableHeightGridView != null) {
            expandableHeightGridView.setExpanded(true);
        }
    }

    private final void g() {
        ImageView imageView = this.f23713f;
        if (imageView != null) {
            imageView.setOnClickListener(new a(this));
        }
    }

    /* access modifiers changed from: private */
    public static final void h(c cVar, View view) {
        l.f(cVar, "this$0");
        cVar.d();
    }

    private final void i() {
        ImageView imageView = this.f23712e;
        if (imageView != null) {
            imageView.setOnClickListener(new b(this));
        }
    }

    /* access modifiers changed from: private */
    public static final void j(c cVar, View view) {
        l.f(cVar, "this$0");
        cVar.e();
    }

    public void d() {
        this.f23718k.add(2, 1);
        k();
    }

    public void e() {
        this.f23718k.add(2, -1);
        k();
    }

    public final String f() {
        return new String[1][0];
    }

    public final ExpandableHeightGridView getCalendarGridView() {
        return this.f23716i;
    }

    public final ArrayList<wd.a> getEventObjectses() {
        return this.f23721n;
    }

    public final void k() {
        ArrayList arrayList = new ArrayList();
        Object clone = this.f23718k.clone();
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
        CharSequence format = DateFormat.format("yyyy", this.f23718k.getTime());
        CharSequence format2 = DateFormat.format("MMMM", this.f23718k.getTime());
        TextView textView = this.f23714g;
        if (textView != null) {
            textView.setText(format);
        }
        TextView textView2 = this.f23715h;
        if (textView2 != null) {
            textView2.setText(format2);
        }
        Context context = getContext();
        Calendar calendar2 = this.f23718k;
        l.e(calendar2, "cal");
        d dVar = new d(context, arrayList, calendar2, this.f23721n);
        this.f23720m = dVar;
        ExpandableHeightGridView expandableHeightGridView = this.f23716i;
        if (expandableHeightGridView != null) {
            expandableHeightGridView.setAdapter(dVar);
        }
    }

    public final void setCalendarGridView(ExpandableHeightGridView expandableHeightGridView) {
        this.f23716i = expandableHeightGridView;
    }

    public final void setEventObjectses(ArrayList<wd.a> arrayList) {
        l.f(arrayList, "<set-?>");
        this.f23721n = arrayList;
    }
}
