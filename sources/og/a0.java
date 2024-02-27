package og;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponse;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem;

public final class a0 extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    private Context f30009e;

    /* renamed from: f  reason: collision with root package name */
    private DReasonResponse f30010f;

    public a0(Context context, DReasonResponse dReasonResponse) {
        l.f(dReasonResponse, "state");
        this.f30009e = context;
        this.f30010f = dReasonResponse;
    }

    public int getCount() {
        DReasonResponse dReasonResponse = this.f30010f;
        l.c(dReasonResponse);
        return dReasonResponse.size();
    }

    public Object getItem(int i10) {
        DReasonResponse dReasonResponse = this.f30010f;
        l.c(dReasonResponse);
        Object obj = dReasonResponse.get(i10);
        l.c(obj);
        return obj;
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        l.f(viewGroup, "parent");
        if (view == null) {
            view = LayoutInflater.from(this.f30009e).inflate(R.layout.coustome_spinner1, viewGroup, false);
        }
        l.c(view);
        View findViewById = view.findViewById(R.id.text_blood);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(String.valueOf(((DReasonResponseItem) this.f30010f.get(i10)).getReason_desc()));
        return view;
    }
}
