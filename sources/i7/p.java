package i7;

import java.math.BigDecimal;
import k7.g;

public enum p implements q {
    DOUBLE {
        /* renamed from: c */
        public Double a(p7.a aVar) {
            return Double.valueOf(aVar.Y());
        }
    },
    LAZILY_PARSED_NUMBER {
        public Number a(p7.a aVar) {
            return new g(aVar.B0());
        }
    },
    LONG_OR_DOUBLE {
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
            if (r7.E() == false) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
            return r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
            throw new p7.d("JSON forbids NaN and infinities: " + r2 + "; at path " + r7.y());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
            throw new i7.k("Cannot parse " + r1 + "; at path " + r7.y(), r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r2 = java.lang.Double.valueOf(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r2.isInfinite() == false) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
            if (r2.isNaN() != false) goto L_0x001f;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Number a(p7.a r7) {
            /*
                r6 = this;
                java.lang.String r0 = "; at path "
                java.lang.String r1 = r7.B0()
                long r2 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x000f }
                java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ NumberFormatException -> 0x000f }
                return r7
            L_0x000f:
                java.lang.Double r2 = java.lang.Double.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0020 }
                boolean r3 = r2.isInfinite()     // Catch:{ NumberFormatException -> 0x0020 }
                if (r3 != 0) goto L_0x0022
                boolean r3 = r2.isNaN()     // Catch:{ NumberFormatException -> 0x0020 }
                if (r3 == 0) goto L_0x0028
                goto L_0x0022
            L_0x0020:
                r2 = move-exception
                goto L_0x004a
            L_0x0022:
                boolean r3 = r7.E()     // Catch:{ NumberFormatException -> 0x0020 }
                if (r3 == 0) goto L_0x0029
            L_0x0028:
                return r2
            L_0x0029:
                p7.d r3 = new p7.d     // Catch:{ NumberFormatException -> 0x0020 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0020 }
                r4.<init>()     // Catch:{ NumberFormatException -> 0x0020 }
                java.lang.String r5 = "JSON forbids NaN and infinities: "
                r4.append(r5)     // Catch:{ NumberFormatException -> 0x0020 }
                r4.append(r2)     // Catch:{ NumberFormatException -> 0x0020 }
                r4.append(r0)     // Catch:{ NumberFormatException -> 0x0020 }
                java.lang.String r2 = r7.y()     // Catch:{ NumberFormatException -> 0x0020 }
                r4.append(r2)     // Catch:{ NumberFormatException -> 0x0020 }
                java.lang.String r2 = r4.toString()     // Catch:{ NumberFormatException -> 0x0020 }
                r3.<init>(r2)     // Catch:{ NumberFormatException -> 0x0020 }
                throw r3     // Catch:{ NumberFormatException -> 0x0020 }
            L_0x004a:
                i7.k r3 = new i7.k
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Cannot parse "
                r4.append(r5)
                r4.append(r1)
                r4.append(r0)
                java.lang.String r7 = r7.y()
                r4.append(r7)
                java.lang.String r7 = r4.toString()
                r3.<init>(r7, r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: i7.p.c.a(p7.a):java.lang.Number");
        }
    },
    BIG_DECIMAL {
        /* renamed from: c */
        public BigDecimal a(p7.a aVar) {
            String B0 = aVar.B0();
            try {
                return new BigDecimal(B0);
            } catch (NumberFormatException e10) {
                throw new k("Cannot parse " + B0 + "; at path " + aVar.y(), e10);
            }
        }
    };
}
