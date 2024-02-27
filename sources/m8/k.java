package m8;

import cm.g;
import com.nic.mparivahan.APIController;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13877a = new a((g) null);

    /* renamed from: b  reason: collision with root package name */
    private static String f13878b = APIController.a().getAuth();

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
        public final java.lang.String a(java.lang.String r12, java.lang.String r13) {
            /*
                r11 = this;
                java.lang.String r0 = "stock"
                cm.l.f(r12, r0)
                eo.a r0 = new eo.a
                r0.<init>()
                java.security.Security.addProvider(r0)
                r0 = 0
                ii.d r1 = new ii.d     // Catch:{ Exception -> 0x0072 }
                r1.<init>(r12)     // Catch:{ Exception -> 0x0072 }
                java.util.HashMap r12 = r1.a()     // Catch:{ Exception -> 0x0072 }
                com.nic.mparivahan.APIController r1 = com.nic.mparivahan.APIController.a()     // Catch:{ Exception -> 0x0072 }
                java.lang.String r1 = r1.getConst()     // Catch:{ Exception -> 0x0072 }
                java.lang.Object r12 = r12.get(r1)     // Catch:{ Exception -> 0x0072 }
                java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x0072 }
                java.lang.String r1 = "UTF8"
                java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)     // Catch:{ Exception -> 0x0072 }
                java.lang.String r2 = "forName(charsetName)"
                cm.l.e(r1, r2)     // Catch:{ Exception -> 0x0072 }
                byte[] r12 = r12.getBytes(r1)     // Catch:{ Exception -> 0x0072 }
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                cm.l.e(r12, r1)     // Catch:{ Exception -> 0x0072 }
                javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x0072 }
                java.lang.String r2 = "AES"
                r1.<init>(r12, r2)     // Catch:{ Exception -> 0x0072 }
                r12 = 32
                r2 = 0
                r3 = 1
                if (r13 == 0) goto L_0x0095
                int r4 = r13.length()     // Catch:{ Exception -> 0x0072 }
                int r4 = r4 - r3
                r5 = r2
                r6 = r5
            L_0x004f:
                if (r5 > r4) goto L_0x0075
                if (r6 != 0) goto L_0x0055
                r7 = r5
                goto L_0x0056
            L_0x0055:
                r7 = r4
            L_0x0056:
                char r7 = r13.charAt(r7)     // Catch:{ Exception -> 0x0072 }
                int r7 = cm.l.h(r7, r12)     // Catch:{ Exception -> 0x0072 }
                if (r7 > 0) goto L_0x0062
                r7 = r3
                goto L_0x0063
            L_0x0062:
                r7 = r2
            L_0x0063:
                if (r6 != 0) goto L_0x006c
                if (r7 != 0) goto L_0x0069
                r6 = r3
                goto L_0x004f
            L_0x0069:
                int r5 = r5 + 1
                goto L_0x004f
            L_0x006c:
                if (r7 != 0) goto L_0x006f
                goto L_0x0075
            L_0x006f:
                int r4 = r4 + -1
                goto L_0x004f
            L_0x0072:
                r12 = move-exception
                goto L_0x00fa
            L_0x0075:
                int r4 = r4 + r3
                java.lang.CharSequence r13 = r13.subSequence(r5, r4)     // Catch:{ Exception -> 0x0072 }
                java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0072 }
                if (r13 == 0) goto L_0x0095
                java.lang.String r4 = "UTF8"
                java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)     // Catch:{ Exception -> 0x0072 }
                java.lang.String r5 = "forName(charsetName)"
                cm.l.e(r4, r5)     // Catch:{ Exception -> 0x0072 }
                byte[] r13 = r13.getBytes(r4)     // Catch:{ Exception -> 0x0072 }
                java.lang.String r4 = "this as java.lang.String).getBytes(charset)"
                cm.l.e(r13, r4)     // Catch:{ Exception -> 0x0072 }
                goto L_0x0096
            L_0x0095:
                r13 = r0
            L_0x0096:
                byte[] r5 = bp.a.a(r13)     // Catch:{ Exception -> 0x0072 }
                java.lang.Class<javax.crypto.Cipher> r13 = javax.crypto.Cipher.class
                monitor-enter(r13)     // Catch:{ Exception -> 0x0072 }
                java.lang.String r4 = "AES/ECB/PKCS7Padding"
                javax.crypto.Cipher r10 = javax.crypto.Cipher.getInstance(r4)     // Catch:{ all -> 0x00eb }
                r4 = 2
                r10.init(r4, r1)     // Catch:{ all -> 0x00eb }
                int r1 = r5.length     // Catch:{ all -> 0x00eb }
                int r1 = r10.getOutputSize(r1)     // Catch:{ all -> 0x00eb }
                byte[] r1 = new byte[r1]     // Catch:{ all -> 0x00eb }
                r6 = 0
                int r7 = r5.length     // Catch:{ all -> 0x00eb }
                r9 = 0
                r4 = r10
                r8 = r1
                int r4 = r4.update(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00eb }
                r10.doFinal(r1, r4)     // Catch:{ all -> 0x00eb }
                java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x00eb }
                java.nio.charset.Charset r5 = km.d.f24740b     // Catch:{ all -> 0x00eb }
                r4.<init>(r1, r5)     // Catch:{ all -> 0x00eb }
                int r1 = r4.length()     // Catch:{ all -> 0x00eb }
                int r1 = r1 - r3
                r5 = r2
                r6 = r5
            L_0x00c8:
                if (r5 > r1) goto L_0x00ed
                if (r6 != 0) goto L_0x00ce
                r7 = r5
                goto L_0x00cf
            L_0x00ce:
                r7 = r1
            L_0x00cf:
                char r7 = r4.charAt(r7)     // Catch:{ all -> 0x00eb }
                int r7 = cm.l.h(r7, r12)     // Catch:{ all -> 0x00eb }
                if (r7 > 0) goto L_0x00db
                r7 = r3
                goto L_0x00dc
            L_0x00db:
                r7 = r2
            L_0x00dc:
                if (r6 != 0) goto L_0x00e5
                if (r7 != 0) goto L_0x00e2
                r6 = r3
                goto L_0x00c8
            L_0x00e2:
                int r5 = r5 + 1
                goto L_0x00c8
            L_0x00e5:
                if (r7 != 0) goto L_0x00e8
                goto L_0x00ed
            L_0x00e8:
                int r1 = r1 + -1
                goto L_0x00c8
            L_0x00eb:
                r12 = move-exception
                goto L_0x00f8
            L_0x00ed:
                int r1 = r1 + r3
                java.lang.CharSequence r12 = r4.subSequence(r5, r1)     // Catch:{ all -> 0x00eb }
                java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x00eb }
                monitor-exit(r13)     // Catch:{ Exception -> 0x0072 }
                return r12
            L_0x00f8:
                monitor-exit(r13)     // Catch:{ Exception -> 0x0072 }
                throw r12     // Catch:{ Exception -> 0x0072 }
            L_0x00fa:
                r12.printStackTrace()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: m8.k.a.a(java.lang.String, java.lang.String):java.lang.String");
        }
    }
}
