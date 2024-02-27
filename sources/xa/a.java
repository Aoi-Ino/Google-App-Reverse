package xa;

import android.content.Context;
import cm.g;
import cm.l;
import java.util.StringTokenizer;
import km.f;
import org.json.JSONObject;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0238a f18250a = new C0238a((g) null);

    /* renamed from: xa.a$a  reason: collision with other inner class name */
    public static final class C0238a {
        private C0238a() {
        }

        public /* synthetic */ C0238a(g gVar) {
            this();
        }

        public final JSONObject a(String str, String str2, String str3, String str4, String str5, String str6) {
            l.f(str, "docId");
            l.f(str2, "docType");
            l.f(str3, "docDob");
            l.f(str4, "did");
            l.f(str5, "mdid");
            l.f(str6, "tid");
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("docId", Long.parseLong(str));
                jSONObject2.put("docType", (Object) str2);
                jSONObject2.put("docDob", (Object) str3);
                jSONObject.put("mparCitizenDoc", (Object) jSONObject2);
                jSONObject.put("did", (Object) str4);
                jSONObject.put("mid", (Object) str5);
                jSONObject.put("tid", (Object) str6);
                return jSONObject;
            } catch (Exception e10) {
                e10.printStackTrace();
                return jSONObject;
            }
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

        public final JSONObject c(String str, String str2, Context context, String str3, String str4) {
            l.f(context, "context");
            l.f(str3, "did");
            l.f(str4, "mid");
            JSONObject jSONObject = new JSONObject();
            ld.g gVar = new ld.g(context);
            String str5 = null;
            if (str2 != null) {
                try {
                    if (str2.length() != 0) {
                        JSONObject jSONObject2 = new JSONObject();
                        if (str != null) {
                            str5 = q.B0(str).toString();
                        }
                        jSONObject2.put("dlno", (Object) str5);
                        jSONObject2.put("dob", (Object) str2);
                        jSONObject.put("dlReq", (Object) jSONObject2);
                        jSONObject.put("recordId", Long.parseLong(gVar.k()));
                        jSONObject.put("did", (Object) str3);
                        jSONObject.put("mid", (Object) str4);
                        jSONObject.put("tid", (Object) gVar.e());
                        return jSONObject;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return jSONObject;
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            if (str != null) {
                str5 = q.B0(str).toString();
            }
            jSONObject3.put("dlno", (Object) str5);
            jSONObject.put("dlReq", (Object) jSONObject3);
            jSONObject.put("recordId", Long.parseLong(gVar.k()));
            jSONObject.put("did", (Object) str3);
            jSONObject.put("mid", (Object) str4);
            jSONObject.put("tid", (Object) gVar.e());
            return jSONObject;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0052, code lost:
            if (r9.equals("BLOCKED") == false) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
            if (r9.equals("Suspended") == false) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
            if (r9.equals("REJECTED") == false) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
            if (r9.equals("Valid") == false) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
            if (r9.equals("VALID") == false) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
            if (r9.equals("V") == false) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0085, code lost:
            r10.setText("Active");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0088, code lost:
            r10.setTextColor(-16711936);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
            if (r9.equals("S") == false) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0096, code lost:
            r10.setText("Suspended");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
            r10.setTextColor(androidx.core.content.a.c(r11, com.nic.mparivahan.R.color.danger));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a7, code lost:
            if (r9.equals("R") == false) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
            if (r9.equals("C") == false) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b9, code lost:
            if (r9.equals("B") == false) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bc, code lost:
            r10.setText("Blocked");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c6, code lost:
            if (r9.equals("A") == false) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cd, code lost:
            if (r9.equals("Rejected") == false) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d0, code lost:
            r10.setText("Rejected");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x002c, code lost:
            if (r9.equals("Active") == false) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00da, code lost:
            if (r9.equals("CANCELLED") == false) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e1, code lost:
            if (r9.equals("Cancelled") == false) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e3, code lost:
            r10.setText("NA");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e9, code lost:
            r10.setText("Cancelled");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0036, code lost:
            if (r9.equals("ACTIVE") == false) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x003e, code lost:
            if (r9.equals("Blocked") == false) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
            if (r9.equals("SUSPENDED") == false) goto L_0x00e3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(java.lang.String r9, android.widget.TextView r10, android.content.Context r11) {
            /*
                r8 = this;
                java.lang.String r0 = "statusValue"
                cm.l.f(r9, r0)
                java.lang.String r0 = "statsTexView"
                cm.l.f(r10, r0)
                java.lang.String r0 = "context"
                cm.l.f(r11, r0)
                int r0 = r9.hashCode()
                java.lang.String r1 = "Cancelled"
                java.lang.String r2 = "Rejected"
                java.lang.String r3 = "Suspended"
                java.lang.String r4 = "Blocked"
                r5 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
                java.lang.String r6 = "Active"
                r7 = 2131099739(0x7f06005b, float:1.781184E38)
                switch(r0) {
                    case -1814410959: goto L_0x00dd;
                    case -1031784143: goto L_0x00d4;
                    case -543852386: goto L_0x00c9;
                    case 65: goto L_0x00c0;
                    case 66: goto L_0x00b3;
                    case 67: goto L_0x00aa;
                    case 82: goto L_0x00a1;
                    case 83: goto L_0x008d;
                    case 86: goto L_0x007c;
                    case 81434588: goto L_0x0072;
                    case 82419676: goto L_0x0068;
                    case 174130302: goto L_0x005e;
                    case 342339003: goto L_0x0056;
                    case 696544716: goto L_0x004c;
                    case 1124965819: goto L_0x0042;
                    case 1643215308: goto L_0x003a;
                    case 1925346054: goto L_0x0030;
                    case 1955883814: goto L_0x0028;
                    default: goto L_0x0026;
                }
            L_0x0026:
                goto L_0x00e3
            L_0x0028:
                boolean r9 = r9.equals(r6)
                if (r9 != 0) goto L_0x0085
                goto L_0x00e3
            L_0x0030:
                java.lang.String r11 = "ACTIVE"
                boolean r9 = r9.equals(r11)
                if (r9 != 0) goto L_0x0085
                goto L_0x00e3
            L_0x003a:
                boolean r9 = r9.equals(r4)
                if (r9 != 0) goto L_0x00bc
                goto L_0x00e3
            L_0x0042:
                java.lang.String r0 = "SUSPENDED"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x0096
                goto L_0x00e3
            L_0x004c:
                java.lang.String r0 = "BLOCKED"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x00bc
                goto L_0x00e3
            L_0x0056:
                boolean r9 = r9.equals(r3)
                if (r9 != 0) goto L_0x0096
                goto L_0x00e3
            L_0x005e:
                java.lang.String r0 = "REJECTED"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x00d0
                goto L_0x00e3
            L_0x0068:
                java.lang.String r11 = "Valid"
                boolean r9 = r9.equals(r11)
                if (r9 != 0) goto L_0x0085
                goto L_0x00e3
            L_0x0072:
                java.lang.String r11 = "VALID"
                boolean r9 = r9.equals(r11)
                if (r9 != 0) goto L_0x0085
                goto L_0x00e3
            L_0x007c:
                java.lang.String r11 = "V"
                boolean r9 = r9.equals(r11)
                if (r9 != 0) goto L_0x0085
                goto L_0x00e3
            L_0x0085:
                r10.setText(r6)
            L_0x0088:
                r10.setTextColor(r5)
                goto L_0x00ed
            L_0x008d:
                java.lang.String r0 = "S"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x0096
                goto L_0x00e3
            L_0x0096:
                r10.setText(r3)
            L_0x0099:
                int r9 = androidx.core.content.a.c(r11, r7)
                r10.setTextColor(r9)
                goto L_0x00ed
            L_0x00a1:
                java.lang.String r0 = "R"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x00d0
                goto L_0x00e3
            L_0x00aa:
                java.lang.String r0 = "C"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x00e9
                goto L_0x00e3
            L_0x00b3:
                java.lang.String r0 = "B"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x00bc
                goto L_0x00e3
            L_0x00bc:
                r10.setText(r4)
                goto L_0x0099
            L_0x00c0:
                java.lang.String r11 = "A"
                boolean r9 = r9.equals(r11)
                if (r9 != 0) goto L_0x0085
                goto L_0x00e3
            L_0x00c9:
                boolean r9 = r9.equals(r2)
                if (r9 != 0) goto L_0x00d0
                goto L_0x00e3
            L_0x00d0:
                r10.setText(r2)
                goto L_0x0099
            L_0x00d4:
                java.lang.String r0 = "CANCELLED"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x00e9
                goto L_0x00e3
            L_0x00dd:
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x00e9
            L_0x00e3:
                java.lang.String r9 = "NA"
                r10.setText(r9)
                goto L_0x0088
            L_0x00e9:
                r10.setText(r1)
                goto L_0x0099
            L_0x00ed:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xa.a.C0238a.d(java.lang.String, android.widget.TextView, android.content.Context):void");
        }
    }
}
