package gi;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import cm.l;
import com.nic.mparivahan.R;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import wd.a;

public final class d extends ArrayAdapter {

    /* renamed from: e  reason: collision with root package name */
    private final List f23722e;

    /* renamed from: f  reason: collision with root package name */
    private final Calendar f23723f;

    /* renamed from: g  reason: collision with root package name */
    private final List f23724g;

    /* renamed from: h  reason: collision with root package name */
    private final LayoutInflater f23725h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, List list, Calendar calendar, List list2) {
        super(context, R.layout.single_cell_layout);
        l.f(list, "monthlyDates");
        l.f(calendar, "currentDate");
        l.f(list2, "allSlots");
        l.c(context);
        this.f23722e = list;
        this.f23723f = calendar;
        this.f23724g = list2;
        LayoutInflater from = LayoutInflater.from(context);
        l.e(from, "from(...)");
        this.f23725h = from;
    }

    public int getCount() {
        return this.f23722e.size();
    }

    public Object getItem(int i10) {
        return this.f23722e.get(i10);
    }

    public int getPosition(Object obj) {
        return y.Y(this.f23722e, obj);
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        l.f(viewGroup, "parent");
        Calendar instance = Calendar.getInstance();
        instance.setTime((Date) this.f23722e.get(i10));
        int i11 = instance.get(5);
        int i12 = instance.get(2) + 1;
        int i13 = instance.get(1);
        int i14 = this.f23723f.get(2) + 1;
        int i15 = this.f23723f.get(1);
        if (view == null) {
            view = this.f23725h.inflate(R.layout.single_cell_layout, viewGroup, false);
        }
        l.c(view);
        View findViewById = view.findViewById(R.id.calendar_date_id);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        textView.setText(String.valueOf(i11));
        if (i12 == i14 && i13 == i15) {
            textView.setTextColor(Color.parseColor("#000000"));
        } else {
            textView.setAlpha(0.4f);
        }
        Calendar instance2 = Calendar.getInstance();
        int size = this.f23724g.size();
        for (int i16 = 0; i16 < size; i16++) {
            instance2.setTime(((a) this.f23724g.get(i16)).b());
            if (i11 == instance2.get(5) && i12 == instance2.get(2) + 1) {
                textView.setTextColor(getContext().getResources().getColor(R.color.white));
                textView.setBackground(((a) this.f23724g.get(i16)).a());
            }
        }
        return view;
    }
}
