package e8;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

public abstract class g2 {
    static void a(l0 l0Var, HashMap hashMap, c2 c2Var, boolean z10) {
        String str;
        i1 i1Var;
        c1 c1Var;
        c1 c1Var2;
        c0 c0Var;
        c1 c1Var3;
        i1 c1Var4;
        i1 i1Var2;
        try {
            String str2 = (String) hashMap.get("Action");
            int i10 = 0;
            if ("GoTo".equals(str2)) {
                String str3 = (String) hashMap.get("Named");
                if (str3 == null) {
                    String str4 = (String) hashMap.get("Page");
                    if (str4 != null) {
                        b0 b0Var = new b0();
                        StringTokenizer stringTokenizer = new StringTokenizer(str4);
                        b0Var.m(c2Var.I(Integer.parseInt(stringTokenizer.nextToken())));
                        if (!stringTokenizer.hasMoreTokens()) {
                            b0Var.m(c1.Cb);
                            b0Var.n(new float[]{0.0f, 10000.0f, 0.0f});
                        } else {
                            String nextToken = stringTokenizer.nextToken();
                            if (nextToken.startsWith("/")) {
                                nextToken = nextToken.substring(1);
                            }
                            b0Var.m(new c1(nextToken));
                            while (i10 < 4 && stringTokenizer.hasMoreTokens()) {
                                String nextToken2 = stringTokenizer.nextToken();
                                if (nextToken2.equals("null")) {
                                    b0Var.m(e1.f10628g);
                                } else {
                                    b0Var.m(new f1(nextToken2));
                                }
                                i10++;
                            }
                        }
                        l0Var.r(c1.U1, b0Var);
                        return;
                    }
                    return;
                } else if (z10) {
                    c1Var = c1.U1;
                    i1Var2 = new c1(str3);
                } else {
                    c1Var = c1.U1;
                    i1Var2 = new y1(str3, (String) null);
                }
            } else {
                if ("GoToR".equals(str2)) {
                    l0 l0Var2 = new l0();
                    String str5 = (String) hashMap.get("Named");
                    if (str5 != null) {
                        c1Var3 = c1.E1;
                        c1Var4 = new y1(str5, (String) null);
                    } else {
                        String str6 = (String) hashMap.get("NamedN");
                        if (str6 != null) {
                            c1Var3 = c1.E1;
                            c1Var4 = new c1(str6);
                        } else {
                            String str7 = (String) hashMap.get("Page");
                            if (str7 != null) {
                                b0 b0Var2 = new b0();
                                StringTokenizer stringTokenizer2 = new StringTokenizer(str7);
                                b0Var2.m(new f1(stringTokenizer2.nextToken()));
                                if (!stringTokenizer2.hasMoreTokens()) {
                                    b0Var2.m(c1.Cb);
                                    b0Var2.n(new float[]{0.0f, 10000.0f, 0.0f});
                                } else {
                                    String nextToken3 = stringTokenizer2.nextToken();
                                    if (nextToken3.startsWith("/")) {
                                        nextToken3 = nextToken3.substring(1);
                                    }
                                    b0Var2.m(new c1(nextToken3));
                                    while (i10 < 4 && stringTokenizer2.hasMoreTokens()) {
                                        String nextToken4 = stringTokenizer2.nextToken();
                                        if (nextToken4.equals("null")) {
                                            b0Var2.m(e1.f10628g);
                                        } else {
                                            b0Var2.m(new f1(nextToken4));
                                        }
                                        i10++;
                                    }
                                }
                                l0Var2.r(c1.E1, b0Var2);
                            }
                            String str8 = (String) hashMap.get("File");
                            if (l0Var2.u() > 0 && str8 != null) {
                                l0Var2.r(c1.F8, c1.U3);
                                l0Var2.r(c1.R2, new y1(str8));
                                String str9 = (String) hashMap.get("NewWindow");
                                i1Var = l0Var2;
                                if (str9 != null) {
                                    if (str9.equals("true")) {
                                        c1Var2 = c1.f10269f6;
                                        c0Var = c0.f10200h;
                                    } else {
                                        i1Var = l0Var2;
                                        if (str9.equals("false")) {
                                            c1Var2 = c1.f10269f6;
                                            c0Var = c0.f10201i;
                                        }
                                    }
                                    l0Var2.r(c1Var2, c0Var);
                                    i1Var = l0Var2;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                    l0Var2.r(c1Var3, c1Var4);
                    String str82 = (String) hashMap.get("File");
                    if (l0Var2.u() > 0) {
                        return;
                    }
                    return;
                } else if ("URI".equals(str2)) {
                    String str10 = (String) hashMap.get("URI");
                    if (str10 != null) {
                        l0 l0Var3 = new l0();
                        c1 c1Var5 = c1.F8;
                        c1 c1Var6 = c1.Da;
                        l0Var3.r(c1Var5, c1Var6);
                        l0Var3.r(c1Var6, new y1(str10));
                        i1Var = l0Var3;
                    } else {
                        return;
                    }
                } else if ("Launch".equals(str2) && (str = (String) hashMap.get("File")) != null) {
                    l0 l0Var4 = new l0();
                    l0Var4.r(c1.F8, c1.f10319j5);
                    l0Var4.r(c1.R2, new y1(str));
                    i1Var = l0Var4;
                } else {
                    return;
                }
                c1Var = c1.f10300i;
                i1Var2 = i1Var;
            }
            l0Var.r(c1Var, i1Var2);
        } catch (Exception unused) {
        }
    }

    public static Object[] b(c2 c2Var, x0 x0Var, List list, boolean z10) {
        c2 c2Var2 = c2Var;
        boolean z11 = z10;
        int size = list.size();
        x0[] x0VarArr = new x0[size];
        for (int i10 = 0; i10 < size; i10++) {
            x0VarArr[i10] = c2Var.K();
        }
        ListIterator listIterator = list.listIterator();
        int i11 = 0;
        int i12 = 0;
        while (listIterator.hasNext()) {
            HashMap hashMap = (HashMap) listIterator.next();
            List list2 = (List) hashMap.get("Kids");
            Object[] b10 = (list2 == null || list2.isEmpty()) ? null : b(c2Var2, x0VarArr[i12], list2, z11);
            l0 l0Var = new l0();
            i11++;
            if (b10 != null) {
                l0Var.r(c1.f10254e3, (x0) b10[0]);
                l0Var.r(c1.f10280g5, (x0) b10[1]);
                int intValue = ((Integer) b10[2]).intValue();
                if ("false".equals(hashMap.get("Open"))) {
                    l0Var.r(c1.f10419r1, new f1(-intValue));
                } else {
                    l0Var.r(c1.f10419r1, new f1(intValue));
                    i11 += intValue;
                }
            }
            l0Var.r(c1.f10246d7, x0Var);
            if (i12 > 0) {
                l0Var.r(c1.C7, x0VarArr[i12 - 1]);
            }
            if (i12 < size - 1) {
                l0Var.r(c1.f10281g6, x0VarArr[i12 + 1]);
            }
            l0Var.r(c1.U9, new y1((String) hashMap.get("Title"), "UnicodeBig"));
            String str = (String) hashMap.get("Color");
            if (str != null) {
                try {
                    b0 b0Var = new b0();
                    StringTokenizer stringTokenizer = new StringTokenizer(str);
                    for (int i13 = 0; i13 < 3; i13++) {
                        float parseFloat = Float.parseFloat(stringTokenizer.nextToken());
                        if (parseFloat < 0.0f) {
                            parseFloat = 0.0f;
                        }
                        if (parseFloat > 1.0f) {
                            parseFloat = 1.0f;
                        }
                        b0Var.m(new f1(parseFloat));
                    }
                    l0Var.r(c1.f10496x0, b0Var);
                } catch (Exception unused) {
                }
            }
            String str2 = (String) hashMap.get("Style");
            if (str2 != null) {
                String lowerCase = str2.toLowerCase();
                int i14 = lowerCase.indexOf("italic") >= 0 ? 1 : 0;
                if (lowerCase.indexOf("bold") >= 0) {
                    i14 |= 2;
                }
                if (i14 != 0) {
                    l0Var.r(c1.R2, new f1(i14));
                }
            }
            a(l0Var, hashMap, c2Var2, z11);
            c2Var2.o(l0Var, x0VarArr[i12]);
            i12++;
        }
        return new Object[]{x0VarArr[0], x0VarArr[size - 1], Integer.valueOf(i11)};
    }
}
