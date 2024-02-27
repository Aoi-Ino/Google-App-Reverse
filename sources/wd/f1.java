package wd;

import cm.g;
import cm.l;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import org.json.JSONObject;
import v9.d;

public abstract class f1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32517a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final JSONObject a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
            String str17 = str;
            String str18 = str3;
            String str19 = str4;
            String str20 = str5;
            String str21 = str6;
            String str22 = str7;
            String str23 = str8;
            String str24 = str9;
            String str25 = str10;
            String str26 = str11;
            l.f(str17, "c_add1");
            l.f(str2, "c_add2");
            l.f(str18, "c_add3");
            l.f(str19, "c_dist");
            l.f(str20, "c_pincode");
            l.f(str21, "c_state");
            l.f(str22, "from_dt");
            l.f(str23, "p_add1");
            l.f(str24, "p_add2");
            l.f(str25, "p_add3");
            l.f(str26, "p_district");
            l.f(str12, "p_pincode");
            l.f(str13, "p_state");
            l.f(str14, "regn_no");
            l.f(str15, "state_code");
            String str27 = str16;
            l.f(str27, "off_code");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_cd", (Object) "40005");
            jSONObject.put("action_code", (Object) "40005");
            jSONObject.put("appl_no", (Object) " ");
            jSONObject.put("c_add1", (Object) str17);
            jSONObject.put("c_add2", (Object) str2);
            jSONObject.put("c_add3", (Object) str18);
            jSONObject.put("c_district", (Object) str19);
            jSONObject.put("c_pincode", (Object) str20);
            jSONObject.put("c_state", (Object) str21);
            jSONObject.put("facelessmessge", (Object) " ");
            jSONObject.put("flow_slno", (Object) VContant.DUPLICATE_RC_PURPOSE_CODE);
            jSONObject.put("from_dt", (Object) str22);
            jSONObject.put("messege", (Object) " ");
            jSONObject.put("off_cd", (Object) str27);
            jSONObject.put("op_dt", (Object) d.f17494a.m());
            jSONObject.put("p_add1", (Object) str23);
            jSONObject.put("p_add2", (Object) str24);
            jSONObject.put("p_add3", (Object) str25);
            jSONObject.put("p_district", (Object) str26);
            jSONObject.put("p_pincode", (Object) str12);
            jSONObject.put("p_state", (Object) str13);
            jSONObject.put("pur_cd", (Object) VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE);
            jSONObject.put("regn_no", (Object) str14);
            jSONObject.put("state_cd", (Object) str15);
            jSONObject.put("state_header", (Object) " ");
            return jSONObject;
        }
    }
}
