package ka;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.j;
import cm.g;
import cm.l;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.IntStream;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13158a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public static final boolean h(String str, Enabledservice enabledservice) {
            l.f(enabledservice, "o");
            return enabledservice.getServCode().equals(str);
        }

        /* access modifiers changed from: private */
        public static final boolean j(ArrayList arrayList, String str, int i10) {
            l.f(arrayList, "$list");
            return p.o(((Enabledservice) arrayList.get(i10)).getServCode(), str, true);
        }

        public final String[] c(j jVar) {
            String d10 = new ld.c(jVar).d();
            if (p.o(d10, "english", true)) {
                return new String[]{"Vehicle", "Driving Licence", "Insurance", "PUCC"};
            }
            if (p.o(d10, "gujarati", true)) {
                return new String[]{"વાહન", "ડ્રાઇવિંગ લાયસન્સ", "વીમા", "પીયુસીસી"};
            }
            if (p.o(d10, "asamiya", true)) {
                return new String[]{"বাহন", "ড্ৰাইভিং লাইচেন্স", "বীমা", "পিইউচিচি"};
            }
            if (p.o(d10, "bengali", true)) {
                return new String[]{"যানবাহন", "চালনার অনুমতিপত্র", "বীমা", "পুক"};
            }
            if (p.o(d10, "hindi", true)) {
                return new String[]{"वाहन", "ड्राइविंग लाइसेंस", "बीमा", "पीयूसीसी"};
            }
            if (p.o(d10, "tamil", true)) {
                return new String[]{"வாகனம்", "ஓட்டுனர் உரிமம்", "காப்பீடு", "பியுசிசி"};
            }
            return p.o(d10, "malayalam", true) ? new String[]{"വാഹനം", "ഡ്രൈവിംഗ് ലൈസൻസ്", "ഇൻഷുറൻസ്", "പി.യു.സി.സി"} : new String[]{"Vehicle", "Driving Licence", "Insurance", "PUCC"};
        }

        public final String d(Context context, String str, String str2) {
            StringBuilder sb2;
            l.f(context, "context");
            ld.c cVar = new ld.c(context);
            try {
                Date date = new Date();
                Date parse = new SimpleDateFormat("dd-MMM-yyyy").parse(str);
                l.e(parse, "parse(...)");
                if (parse.before(date)) {
                    return str2 + cVar.b("expired_on", "Expired on ") + ' ' + str;
                } else if (!parse.after(date)) {
                    return str2 + cVar.b("expired_on", " Expired on ") + ' ' + str;
                } else if (k(str) > 30) {
                    return "";
                } else {
                    return str2 + cVar.b("expiring_on_lbl", " Expiring on ") + ' ' + str;
                }
            } catch (ParseException e10) {
                e10.printStackTrace();
                sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(cVar.b("expired_on", " Expired on "));
                sb2.append(' ');
                sb2.append(str);
                return sb2.toString();
            } catch (Exception e11) {
                e11.printStackTrace();
                sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(cVar.b("expired_on", " Expired on "));
                sb2.append(' ');
                sb2.append(str);
                return sb2.toString();
            }
        }

        public final boolean e(Context context) {
            l.f(context, "context");
            try {
                return Double.parseDouble(new ld.g(context).c()) > 176.0d;
            } catch (NumberFormatException unused) {
                return false;
            }
        }

        public final boolean f(String str) {
            try {
                Date date = new Date();
                Date parse = new SimpleDateFormat("dd-MMM-yyyy").parse(str);
                l.e(parse, "parse(...)");
                return parse.before(date) || !parse.after(date) || k(str) <= 30;
            } catch (ParseException e10) {
                e10.printStackTrace();
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }

        public final boolean g(ArrayList arrayList, String str) {
            l.f(arrayList, "list");
            return arrayList.stream().filter(new b(str)).findFirst().isPresent();
        }

        public final int i(ArrayList arrayList, String str) {
            l.f(arrayList, "list");
            return IntStream.range(0, arrayList.size()).filter(new a(arrayList, str)).findFirst().orElse(-1);
        }

        public final int k(String str) {
            try {
                Date date = new Date();
                long time = new SimpleDateFormat("dd-MMM-yyyy").parse(str).getTime();
                long time2 = date.getTime();
                return (int) ((time > time2 ? time - time2 : time2 - time) / ((long) 86400000));
            } catch (ParseException e10) {
                e10.printStackTrace();
                return 0;
            } catch (Exception e11) {
                e11.printStackTrace();
                return 0;
            }
        }

        public final void l(Activity activity) {
            l.f(activity, "activity");
            try {
                Object systemService = activity.getSystemService("input_method");
                l.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                View currentFocus = activity.getCurrentFocus();
                if (currentFocus == null) {
                    currentFocus = new View(activity);
                }
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            } catch (Exception unused) {
            }
        }

        public final boolean m(String str) {
            return p.p(str, (String) null, false, 2, (Object) null) || p.p(str, "null", false, 2, (Object) null) || p.o(str, " ", true) || p.p(str, "", false, 2, (Object) null) || p.o(str, "NA", true) || str == null || str.length() == 0 || str == null || p.q(str) || p.q(str) || str.length() == 0 || !(p.q(str) ^ true) || str.length() <= 0;
        }

        public final boolean n(String str) {
            try {
                Log.e("Date --2 > ", new SimpleDateFormat("dd-MMM-yyyy").parse(str).toString());
                return true;
            } catch (ParseException e10) {
                e10.printStackTrace();
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }
    }
}
