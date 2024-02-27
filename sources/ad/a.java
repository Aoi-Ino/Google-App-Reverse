package ad;

import cm.g;
import cm.l;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;
import km.f;
import org.json.JSONObject;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0008a f400a = new C0008a((g) null);

    /* renamed from: ad.a$a  reason: collision with other inner class name */
    public static final class C0008a {
        private C0008a() {
        }

        public /* synthetic */ C0008a(g gVar) {
            this();
        }

        public final JSONObject a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            l.f(str, "mString");
            l.f(str2, "user_id");
            l.f(str3, "chasi5");
            l.f(str4, "engine5");
            l.f(str5, "id");
            l.f(str6, "mid");
            l.f(str7, "type");
            l.f(str8, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rcNumber", (Object) str);
            jSONObject.put("recordId", Long.parseLong(str2));
            jSONObject.put("chasi5", (Object) str3);
            jSONObject.put("engine5", (Object) str4);
            jSONObject.put("did", (Object) str5);
            jSONObject.put("mid", (Object) str6);
            jSONObject.put("tid", (Object) str8);
            jSONObject.put("param", (Object) str7);
            return jSONObject;
        }

        public final String b(String str) {
            StringBuilder sb2;
            try {
                StringTokenizer stringTokenizer = new StringTokenizer(str);
                String str2 = "";
                while (stringTokenizer.hasMoreTokens()) {
                    String nextToken = stringTokenizer.nextToken();
                    l.e(nextToken, "nextToken(...)");
                    String[] strArr = (String[]) new f("").d(nextToken, 0).toArray(new String[0]);
                    int length = strArr.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        if (i10 % 2 == 0) {
                            sb2 = new StringBuilder();
                            sb2.append(str2);
                            sb2.append(strArr[i10]);
                        } else {
                            sb2 = new StringBuilder();
                            sb2.append(str2);
                            sb2.append('*');
                        }
                        str2 = sb2.toString();
                    }
                    str2 = str2 + "  ";
                }
                return str2;
            } catch (Exception unused) {
                return "--";
            }
        }

        public final JSONObject c(String str, String str2, String str3, String str4, String str5, String str6) {
            l.f(str, "doc_id");
            l.f(str2, "did");
            l.f(str3, "mdid");
            l.f(str4, "ctz_id");
            l.f(str5, "docType");
            l.f(str6, "tid");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("docId", Long.parseLong(str));
                jSONObject.put("docCtzId", (Object) str4);
                jSONObject.put("docType", (Object) str5);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("mparCitizenDoc", (Object) jSONObject);
                jSONObject2.put("did", (Object) str2);
                jSONObject2.put("mid", (Object) str3);
                jSONObject2.put("tid", (Object) str6);
                return jSONObject2;
            } catch (Exception unused) {
                return null;
            }
        }

        public final JSONObject d(String str, String str2, String str3, String str4, String str5, String str6) {
            l.f(str, "doc_id");
            l.f(str2, "docType");
            l.f(str3, "did");
            l.f(str4, "mdid");
            l.f(str5, "tid");
            l.f(str6, "ctz_id");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("docId", Long.parseLong(str));
            jSONObject.put("docType", (Object) str2);
            jSONObject.put("docCtzId", (Object) str6);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenDoc", (Object) jSONObject);
            jSONObject2.put("did", (Object) str3);
            jSONObject2.put("mid", (Object) str4);
            jSONObject2.put("tid", (Object) str5);
            return jSONObject2;
        }

        public final JSONObject e(String str, String str2, String str3, String str4, String str5, String str6) {
            l.f(str, "recordId");
            l.f(str2, "docId");
            l.f(str3, "id");
            l.f(str4, "mid");
            l.f(str5, "tid");
            l.f(str6, "user_id");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("recordId", Long.parseLong(str6));
            jSONObject.put("docId", Long.parseLong(str2));
            jSONObject.put("did", (Object) str3);
            jSONObject.put("mid", (Object) str4);
            jSONObject.put("tid", (Object) str5);
            jSONObject.put("sharedTo", Long.parseLong(str));
            return jSONObject;
        }

        public final JSONObject f(String str, String str2, String str3, String str4, String str5) {
            l.f(str, "recordId");
            l.f(str2, "docId");
            l.f(str3, "id");
            l.f(str4, "mid");
            l.f(str5, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("recordId", Long.parseLong(str));
            jSONObject.put("docId", Long.parseLong(str2));
            jSONObject.put("did", (Object) str3);
            jSONObject.put("mid", (Object) str4);
            jSONObject.put("tid", (Object) str5);
            return jSONObject;
        }

        public final JSONObject g(String str, String str2, String str3, String str4, String str5) {
            l.f(str, "mString");
            l.f(str2, "user_id");
            l.f(str3, "device_id");
            l.f(str4, "mobile_no");
            l.f(str5, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rcNumber", (Object) str);
            jSONObject.put("recordId", Long.parseLong(str2));
            jSONObject.put("did", (Object) str3);
            jSONObject.put("mid", (Object) str4);
            jSONObject.put("tid", (Object) str5);
            new JSONObject().put("request", (Object) jSONObject);
            return jSONObject;
        }

        public final JSONObject h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            l.f(str, "citizenId");
            l.f(str2, "docnumber");
            l.f(str3, "shared_id");
            l.f(str4, "shared_days");
            l.f(str5, "did");
            l.f(str6, "mobile_no");
            l.f(str7, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("shrdDocType", (Object) "RC");
            jSONObject.put("shrdDocNumber", (Object) str2);
            jSONObject.put("shrdFromCtz", Long.parseLong(str));
            jSONObject.put("shrdNdays", (Object) str4);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenSharedDoc", (Object) jSONObject);
            jSONObject2.put("did", (Object) str5);
            jSONObject2.put("mid", (Object) str6);
            jSONObject2.put("tid", (Object) str7);
            jSONObject2.put("sharedToMob", (Object) str3);
            return jSONObject2;
        }

        public final JSONObject i(String str, String str2, String str3, String str4, String str5) {
            l.f(str, "shared_id");
            l.f(str2, "citizenId");
            l.f(str3, "did");
            l.f(str4, "mdid");
            l.f(str5, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("shrdId", Long.parseLong(str));
            jSONObject.put("shrdDeletedBy", Long.parseLong(str2));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenSharedDoc", (Object) jSONObject);
            jSONObject2.put("did", (Object) str3);
            jSONObject2.put("mid", (Object) str4);
            jSONObject2.put("tid", (Object) str5);
            return jSONObject2;
        }

        public final JSONObject j(String str, String str2, String str3, String str4) {
            l.f(str, "citizenId");
            l.f(str2, "did");
            l.f(str3, "mdid");
            l.f(str4, "tid");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzId", Long.parseLong(str));
            jSONObject.put("did", (Object) str2);
            jSONObject.put("mid", (Object) str3);
            jSONObject.put("tid", (Object) str4);
            return jSONObject;
        }

        public final String k(String str, String str2, String str3) {
            try {
                return new SimpleDateFormat(str3).format(new SimpleDateFormat(str2).parse(str));
            } catch (ParseException e10) {
                e10.printStackTrace();
                return str;
            }
        }

        public final String l(String str) {
            l.f(str, "dateString1");
            try {
                return String.valueOf(a.f400a.k(q.B0(((String[]) q.l0(str, new String[]{"T"}, false, 0, 6, (Object) null).toArray(new String[0]))[0]).toString().toString(), "yyyy-MM-dd", "dd MMM,yyyy"));
            } catch (Exception unused) {
                return " ";
            }
        }
    }
}
