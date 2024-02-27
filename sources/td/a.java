package td;

import android.content.Context;
import android.util.Log;
import cm.g;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Tax.Model.TaxCalModleItem;
import java.util.ArrayList;
import ld.c;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0353a f31331a = new C0353a((g) null);

    /* renamed from: td.a$a  reason: collision with other inner class name */
    public static final class C0353a {
        private C0353a() {
        }

        public /* synthetic */ C0353a(g gVar) {
            this();
        }

        public final String a(ArrayList arrayList) {
            l.f(arrayList, "taxCalModeItem");
            ArrayList arrayList2 = new ArrayList();
            String str = "";
            if (arrayList.size() <= 0) {
                return str;
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                str = ((TaxCalModleItem) arrayList.get(i10)).getPur_CD();
                arrayList2.add(q.B0(String.valueOf(str)).toString());
            }
            return arrayList2.size() > 1 ? y.d0(arrayList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (bm.l) null, 62, (Object) null) : String.valueOf(str);
        }

        public final String b(ArrayList arrayList) {
            l.f(arrayList, "taxCalModeItem");
            Log.e("TaxMode---> ", arrayList.toString());
            ArrayList arrayList2 = new ArrayList();
            String str = "";
            if (arrayList.size() <= 0) {
                return str;
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                str = ((TaxCalModleItem) arrayList.get(i10)).getTax_MODE();
                String pur_CD = ((TaxCalModleItem) arrayList.get(i10)).getPur_CD();
                arrayList2.add(pur_CD + '-' + q.B0(String.valueOf(str)).toString());
            }
            return arrayList2.size() >= 1 ? y.d0(arrayList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (bm.l) null, 62, (Object) null) : String.valueOf(str);
        }

        public final ArrayList c() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(4);
            arrayList.add(5);
            arrayList.add(6);
            arrayList.add(7);
            arrayList.add(8);
            arrayList.add(9);
            arrayList.add(10);
            arrayList.add(11);
            arrayList.add(12);
            arrayList.add(13);
            arrayList.add(14);
            arrayList.add(15);
            arrayList.add(16);
            arrayList.add(17);
            arrayList.add(18);
            arrayList.add(19);
            arrayList.add(20);
            arrayList.add(21);
            arrayList.add(22);
            arrayList.add(23);
            arrayList.add(24);
            arrayList.add(25);
            arrayList.add(26);
            arrayList.add(27);
            arrayList.add(28);
            arrayList.add(29);
            arrayList.add(30);
            arrayList.add(31);
            arrayList.add(32);
            arrayList.add(33);
            arrayList.add(34);
            arrayList.add(35);
            arrayList.add(36);
            arrayList.add(37);
            arrayList.add(38);
            arrayList.add(39);
            arrayList.add(40);
            arrayList.add(41);
            arrayList.add(42);
            arrayList.add(43);
            arrayList.add(44);
            arrayList.add(45);
            arrayList.add(46);
            arrayList.add(47);
            arrayList.add(48);
            arrayList.add(49);
            arrayList.add(50);
            arrayList.add(51);
            arrayList.add(52);
            arrayList.add(53);
            arrayList.add(54);
            arrayList.add(55);
            arrayList.add(56);
            arrayList.add(57);
            arrayList.add(58);
            arrayList.add(59);
            arrayList.add(60);
            return arrayList;
        }

        public final String d(ArrayList arrayList, Context context) {
            String string;
            String str;
            l.f(arrayList, "taxCalModeItem");
            l.f(context, "context");
            c cVar = new c(context);
            if (arrayList.size() <= 0) {
                return "";
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                String tax_MODE = ((TaxCalModleItem) arrayList.get(i10)).getTax_MODE();
                int timePeriod = ((TaxCalModleItem) arrayList.get(i10)).getTimePeriod();
                if (p.o(tax_MODE, "Y", true) && timePeriod > 5) {
                    string = context.getString(R.string.yearly_Validation);
                    str = "YEARLY_VALIDATION";
                } else if (p.o(tax_MODE, "M", true) && timePeriod > 60) {
                    string = context.getString(R.string.monthly_Validation);
                    str = "MONTHLY_VALIDATION";
                } else if (!p.o(tax_MODE, "Q", true) || timePeriod <= 20) {
                    i10++;
                } else {
                    string = context.getString(R.string.quaterly_Validation);
                    str = "QUATERLY_VALIDATION";
                }
                return String.valueOf(cVar.b(str, string));
            }
            return "";
        }

        public final boolean e(ArrayList arrayList) {
            l.f(arrayList, "taxCalModeItem");
            Log.e("TaxCheck", "1");
            if (arrayList.size() > 0) {
                Log.e("TaxCheck", "2");
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String tax_MODE = ((TaxCalModleItem) arrayList.get(i10)).getTax_MODE();
                    if (p.o(tax_MODE, "0", true) || p.o(tax_MODE, "Select Tax Mode", true)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final boolean f(ArrayList arrayList) {
            l.f(arrayList, "taxCalModeItem");
            if (arrayList.size() > 0) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String tax_MODE = ((TaxCalModleItem) arrayList.get(i10)).getTax_MODE();
                    int timePeriod = ((TaxCalModleItem) arrayList.get(i10)).getTimePeriod();
                    if ((p.o(tax_MODE, "Y", true) && timePeriod > 5) || ((p.o(tax_MODE, "M", true) && timePeriod > 60) || (p.o(tax_MODE, "Q", true) && timePeriod > 20))) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
