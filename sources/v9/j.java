package v9;

import android.util.Base64;
import cm.g;
import cm.l;
import com.nic.mparivahan.APIController;
import km.d;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17579a = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static String f17580b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
            	at java.util.ArrayList.get(ArrayList.java:435)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public final java.util.HashMap a(java.lang.String r13) {
            /*
                r12 = this;
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                eo.a r1 = new eo.a
                r1.<init>()
                java.security.Security.addProvider(r1)
                java.lang.String r1 = r12.b()     // Catch:{ Exception -> 0x005c }
                java.lang.String r2 = "UTF8"
                java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)     // Catch:{ Exception -> 0x005c }
                java.lang.String r3 = "forName(charsetName)"
                cm.l.e(r2, r3)     // Catch:{ Exception -> 0x005c }
                byte[] r1 = r1.getBytes(r2)     // Catch:{ Exception -> 0x005c }
                java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
                cm.l.e(r1, r2)     // Catch:{ Exception -> 0x005c }
                javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x005c }
                java.lang.String r3 = "AES"
                r2.<init>(r1, r3)     // Catch:{ Exception -> 0x005c }
                r1 = 32
                r3 = 0
                r4 = 1
                if (r13 == 0) goto L_0x007f
                int r5 = r13.length()     // Catch:{ Exception -> 0x005c }
                int r5 = r5 - r4
                r6 = r3
                r7 = r6
            L_0x0039:
                if (r6 > r5) goto L_0x005f
                if (r7 != 0) goto L_0x003f
                r8 = r6
                goto L_0x0040
            L_0x003f:
                r8 = r5
            L_0x0040:
                char r8 = r13.charAt(r8)     // Catch:{ Exception -> 0x005c }
                int r8 = cm.l.h(r8, r1)     // Catch:{ Exception -> 0x005c }
                if (r8 > 0) goto L_0x004c
                r8 = r4
                goto L_0x004d
            L_0x004c:
                r8 = r3
            L_0x004d:
                if (r7 != 0) goto L_0x0056
                if (r8 != 0) goto L_0x0053
                r7 = r4
                goto L_0x0039
            L_0x0053:
                int r6 = r6 + 1
                goto L_0x0039
            L_0x0056:
                if (r8 != 0) goto L_0x0059
                goto L_0x005f
            L_0x0059:
                int r5 = r5 + -1
                goto L_0x0039
            L_0x005c:
                r13 = move-exception
                goto L_0x00e9
            L_0x005f:
                int r5 = r5 + r4
                java.lang.CharSequence r13 = r13.subSequence(r6, r5)     // Catch:{ Exception -> 0x005c }
                java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x005c }
                if (r13 == 0) goto L_0x007f
                java.lang.String r5 = "UTF8"
                java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)     // Catch:{ Exception -> 0x005c }
                java.lang.String r6 = "forName(charsetName)"
                cm.l.e(r5, r6)     // Catch:{ Exception -> 0x005c }
                byte[] r13 = r13.getBytes(r5)     // Catch:{ Exception -> 0x005c }
                java.lang.String r5 = "this as java.lang.String).getBytes(charset)"
                cm.l.e(r13, r5)     // Catch:{ Exception -> 0x005c }
                goto L_0x0080
            L_0x007f:
                r13 = 0
            L_0x0080:
                byte[] r6 = bp.a.a(r13)     // Catch:{ Exception -> 0x005c }
                java.lang.Class<javax.crypto.Cipher> r13 = javax.crypto.Cipher.class
                monitor-enter(r13)     // Catch:{ Exception -> 0x005c }
                java.lang.String r5 = "AES/ECB/PKCS7Padding"
                javax.crypto.Cipher r11 = javax.crypto.Cipher.getInstance(r5)     // Catch:{ all -> 0x00d7 }
                r5 = 2
                r11.init(r5, r2)     // Catch:{ all -> 0x00d7 }
                int r2 = r6.length     // Catch:{ all -> 0x00d7 }
                int r2 = r11.getOutputSize(r2)     // Catch:{ all -> 0x00d7 }
                byte[] r2 = new byte[r2]     // Catch:{ all -> 0x00d7 }
                r7 = 0
                int r8 = r6.length     // Catch:{ all -> 0x00d7 }
                r10 = 0
                r5 = r11
                r9 = r2
                int r5 = r5.update(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00d7 }
                r11.doFinal(r2, r5)     // Catch:{ all -> 0x00d7 }
                java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x00d7 }
                java.nio.charset.Charset r6 = km.d.f24740b     // Catch:{ all -> 0x00d7 }
                r5.<init>(r2, r6)     // Catch:{ all -> 0x00d7 }
                java.lang.String r2 = "KEY"
                int r6 = r5.length()     // Catch:{ all -> 0x00d7 }
                int r6 = r6 - r4
                r7 = r3
                r8 = r7
            L_0x00b4:
                if (r7 > r6) goto L_0x00d9
                if (r8 != 0) goto L_0x00ba
                r9 = r7
                goto L_0x00bb
            L_0x00ba:
                r9 = r6
            L_0x00bb:
                char r9 = r5.charAt(r9)     // Catch:{ all -> 0x00d7 }
                int r9 = cm.l.h(r9, r1)     // Catch:{ all -> 0x00d7 }
                if (r9 > 0) goto L_0x00c7
                r9 = r4
                goto L_0x00c8
            L_0x00c7:
                r9 = r3
            L_0x00c8:
                if (r8 != 0) goto L_0x00d1
                if (r9 != 0) goto L_0x00ce
                r8 = r4
                goto L_0x00b4
            L_0x00ce:
                int r7 = r7 + 1
                goto L_0x00b4
            L_0x00d1:
                if (r9 != 0) goto L_0x00d4
                goto L_0x00d9
            L_0x00d4:
                int r6 = r6 + -1
                goto L_0x00b4
            L_0x00d7:
                r1 = move-exception
                goto L_0x00e7
            L_0x00d9:
                int r6 = r6 + r4
                java.lang.CharSequence r1 = r5.subSequence(r7, r6)     // Catch:{ all -> 0x00d7 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00d7 }
                r0.put(r2, r1)     // Catch:{ all -> 0x00d7 }
                monitor-exit(r13)     // Catch:{ Exception -> 0x005c }
                return r0
            L_0x00e7:
                monitor-exit(r13)     // Catch:{ Exception -> 0x005c }
                throw r1     // Catch:{ Exception -> 0x005c }
            L_0x00e9:
                r13.printStackTrace()
                java.lang.String r13 = "KEY"
                java.lang.String r1 = " "
                r0.put(r13, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: v9.j.a.a(java.lang.String):java.util.HashMap");
        }

        public final String b() {
            return j.f17580b;
        }
    }

    static {
        byte[] decode = Base64.decode(APIController.a().getNapixKeyUser(), 0);
        l.e(decode, "decode(...)");
        f17580b = new String(decode, d.f24740b);
    }
}
