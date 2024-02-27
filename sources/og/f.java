package og;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.ModifiedListOfDisposeApplModel;
import java.util.List;

public final class f extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final List f30037d;

    /* renamed from: e  reason: collision with root package name */
    private final a f30038e;

    public interface a {
        void i(int i10, boolean z10);
    }

    public static final class b extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private final CheckBox f30039y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            l.f(view, "itemView");
            this.f30039y = (CheckBox) view.findViewById(R.id.f19011cb);
        }

        public final CheckBox O() {
            return this.f30039y;
        }
    }

    public f(List list, a aVar) {
        l.f(list, "list");
        l.f(aVar, "onItemListener");
        this.f30037d = list;
        this.f30038e = aVar;
    }

    /* access modifiers changed from: private */
    public static final void C(f fVar, int i10, CompoundButton compoundButton, boolean z10) {
        l.f(fVar, "this$0");
        fVar.f30038e.i(i10, z10);
    }

    /* renamed from: B */
    public void p(b bVar, int i10) {
        l.f(bVar, "holder");
        if (((ModifiedListOfDisposeApplModel) this.f30037d.get(i10)).getDescr().length() > 0) {
            bVar.O().setText(((ModifiedListOfDisposeApplModel) this.f30037d.get(i10)).getDescr());
        }
        bVar.O().setOnCheckedChangeListener(new e(this, i10));
    }

    /* renamed from: D */
    public b r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dispose_appl_item_row, viewGroup, false);
        l.e(inflate, "inflate(...)");
        return new b(inflate);
    }

    public int e() {
        return this.f30037d.size();
    }
}
