package og;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.core.content.a;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem;
import java.util.ArrayList;

public final class g extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    private Context f30045e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList f30046f;

    public g(Context context, ArrayList arrayList) {
        l.f(arrayList, "state");
        this.f30045e = context;
        this.f30046f = arrayList;
    }

    public int getCount() {
        ArrayList arrayList = this.f30046f;
        l.c(arrayList);
        return arrayList.size();
    }

    public Object getItem(int i10) {
        ArrayList arrayList = this.f30046f;
        l.c(arrayList);
        Object obj = arrayList.get(i10);
        l.c(obj);
        return obj;
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        l.f(viewGroup, "parent");
        if (view == null) {
            view = LayoutInflater.from(this.f30045e).inflate(R.layout.coustome_spinner1, viewGroup, false);
        }
        l.c(view);
        View findViewById = view.findViewById(R.id.text_blood);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        Context context = this.f30045e;
        l.c(context);
        textView.setBackgroundColor(a.c(context, 17170445));
        textView.setText(((DistictModleItem) this.f30046f.get(i10)).getDescr());
        return view;
    }
}
