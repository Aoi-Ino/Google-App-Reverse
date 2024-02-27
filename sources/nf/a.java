package nf;

import cm.g;
import cm.l;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import java.util.regex.Pattern;
import org.json.JSONObject;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0324a f25133a = new C0324a((g) null);

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f25134b = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");

    /* renamed from: nf.a$a  reason: collision with other inner class name */
    public static final class C0324a {
        private C0324a() {
        }

        public /* synthetic */ C0324a(g gVar) {
            this();
        }

        public final JSONObject a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
            String str14 = str;
            String str15 = str2;
            String str16 = str4;
            String str17 = str5;
            String str18 = str6;
            String str19 = str7;
            String str20 = str8;
            String str21 = str9;
            String str22 = str12;
            String str23 = str13;
            l.f(str14, "fncr_add1");
            l.f(str15, "fncr_add2");
            l.f(str3, "fncr_add3");
            l.f(str16, "dis_code");
            l.f(str17, "fncr_name");
            l.f(str18, "fncr_pincode");
            l.f(str19, "fncr_state");
            l.f(str20, "from_dt");
            l.f(str21, "op_dt");
            l.f(str10, "state_cd");
            l.f(str11, "regn_no");
            l.f(str22, "off_code");
            l.f(str23, "hptcode");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appl_no", (Object) " ");
            jSONObject.put("fncr_add1", (Object) str14);
            jSONObject.put("fncr_add2", (Object) str15);
            jSONObject.put("fncr_add3", (Object) str3);
            jSONObject.put("fncr_district", (Object) str16);
            jSONObject.put("fncr_name", (Object) str17);
            jSONObject.put("fncr_pincode", (Object) str18);
            jSONObject.put("fncr_state", (Object) str19);
            jSONObject.put("from_dt", (Object) str20);
            jSONObject.put("hp_type", (Object) str23);
            jSONObject.put("off_cd", (Object) str22);
            jSONObject.put("op_dt", (Object) str21);
            jSONObject.put("regn_no", (Object) str11);
            jSONObject.put("sr_no", (Object) "1");
            jSONObject.put("pur_cd", (Object) VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE);
            jSONObject.put("state_cd", (Object) str10);
            return jSONObject;
        }
    }
}
