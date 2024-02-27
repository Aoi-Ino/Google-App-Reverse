package org.json;

import java.util.Iterator;

public class XML {
    public static final Character AMP = new Character('&');
    public static final Character APOS = new Character('\'');
    public static final Character BANG = new Character('!');
    public static final Character EQ = new Character('=');
    public static final Character GT = new Character('>');
    public static final Character LT = new Character('<');
    public static final Character QUEST = new Character('?');
    public static final Character QUOT = new Character('\"');
    public static final Character SLASH = new Character('/');

    public static String escape(String str) {
        String str2;
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '\"') {
                str2 = "&quot;";
            } else if (charAt == '<') {
                str2 = "&lt;";
            } else if (charAt == '>') {
                str2 = "&gt;";
            } else if (charAt == '&') {
                str2 = "&amp;";
            } else if (charAt != '\'') {
                stringBuffer.append(charAt);
            } else {
                str2 = "&apos;";
            }
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }

    public static void noSpace(String str) throws JSONException {
        int length = str.length();
        if (length != 0) {
            int i10 = 0;
            while (i10 < length) {
                if (!Character.isWhitespace(str.charAt(i10))) {
                    i10++;
                } else {
                    throw new JSONException("'" + str + "' contains a space character.");
                }
            }
            return;
        }
        throw new JSONException("Empty string.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ec, code lost:
        r7 = r10.nextToken();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f2, code lost:
        if ((r7 instanceof java.lang.String) == false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0104, code lost:
        throw r10.syntaxError("Missing value");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean parse(org.json.XMLTokener r10, org.json.JSONObject r11, java.lang.String r12) throws org.json.JSONException {
        /*
            java.lang.Object r0 = r10.nextToken()
            java.lang.Character r1 = BANG
            r2 = 1
            java.lang.String r3 = "content"
            r4 = 0
            if (r0 != r1) goto L_0x006c
            char r12 = r10.next()
            r0 = 45
            if (r12 != r0) goto L_0x0024
            char r11 = r10.next()
            if (r11 != r0) goto L_0x0020
            java.lang.String r11 = "-->"
        L_0x001c:
            r10.skipPast(r11)
            return r4
        L_0x0020:
            r10.back()
            goto L_0x004f
        L_0x0024:
            r0 = 91
            if (r12 != r0) goto L_0x004f
            java.lang.Object r12 = r10.nextToken()
            java.lang.String r1 = "CDATA"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0048
            char r12 = r10.next()
            if (r12 != r0) goto L_0x0048
            java.lang.String r10 = r10.nextCDATA()
            int r12 = r10.length()
            if (r12 <= 0) goto L_0x0047
            r11.accumulate(r3, r10)
        L_0x0047:
            return r4
        L_0x0048:
            java.lang.String r11 = "Expected 'CDATA['"
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x004f:
            java.lang.Object r11 = r10.nextMeta()
            if (r11 == 0) goto L_0x0065
            java.lang.Character r12 = LT
            if (r11 != r12) goto L_0x005c
            int r2 = r2 + 1
            goto L_0x0062
        L_0x005c:
            java.lang.Character r12 = GT
            if (r11 != r12) goto L_0x0062
            int r2 = r2 + -1
        L_0x0062:
            if (r2 > 0) goto L_0x004f
            return r4
        L_0x0065:
            java.lang.String r11 = "Missing '>' after '<!'."
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x006c:
            java.lang.Character r1 = QUEST
            if (r0 != r1) goto L_0x0073
            java.lang.String r11 = "?>"
            goto L_0x001c
        L_0x0073:
            java.lang.Character r1 = SLASH
            if (r0 != r1) goto L_0x00c7
            java.lang.Object r11 = r10.nextToken()
            if (r12 == 0) goto L_0x00b1
            boolean r0 = r11.equals(r12)
            if (r0 == 0) goto L_0x0093
            java.lang.Object r11 = r10.nextToken()
            java.lang.Character r12 = GT
            if (r11 != r12) goto L_0x008c
            return r2
        L_0x008c:
            java.lang.String r11 = "Misshaped close tag"
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x0093:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Mismatched "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = " and "
            r0.append(r12)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x00b1:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Mismatched close tag "
            r12.append(r0)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x00c7:
            boolean r12 = r0 instanceof java.lang.Character
            java.lang.String r1 = "Misshaped tag"
            if (r12 != 0) goto L_0x0191
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            r5 = 0
        L_0x00d5:
            r6 = r5
        L_0x00d6:
            if (r6 != 0) goto L_0x00dc
            java.lang.Object r6 = r10.nextToken()
        L_0x00dc:
            boolean r7 = r6 instanceof java.lang.String
            java.lang.String r8 = ""
            if (r7 == 0) goto L_0x010a
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r10.nextToken()
            java.lang.Character r9 = EQ
            if (r7 != r9) goto L_0x0105
            java.lang.Object r7 = r10.nextToken()
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L_0x00fe
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = stringToValue(r7)
            r12.accumulate(r6, r7)
            goto L_0x00d5
        L_0x00fe:
            java.lang.String r11 = "Missing value"
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x0105:
            r12.accumulate(r6, r8)
            r6 = r7
            goto L_0x00d6
        L_0x010a:
            java.lang.Character r5 = SLASH
            if (r6 != r5) goto L_0x0129
            java.lang.Object r2 = r10.nextToken()
            java.lang.Character r3 = GT
            if (r2 != r3) goto L_0x0124
            int r10 = r12.length()
            if (r10 <= 0) goto L_0x0120
            r11.accumulate(r0, r12)
            goto L_0x0123
        L_0x0120:
            r11.accumulate(r0, r8)
        L_0x0123:
            return r4
        L_0x0124:
            org.json.JSONException r10 = r10.syntaxError(r1)
            throw r10
        L_0x0129:
            java.lang.Character r5 = GT
            if (r6 != r5) goto L_0x018c
        L_0x012d:
            java.lang.Object r1 = r10.nextContent()
            if (r1 != 0) goto L_0x014c
            if (r0 != 0) goto L_0x0136
            return r4
        L_0x0136:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Unclosed tag "
            r11.append(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x014c:
            boolean r5 = r1 instanceof java.lang.String
            if (r5 == 0) goto L_0x0160
            java.lang.String r1 = (java.lang.String) r1
            int r5 = r1.length()
            if (r5 <= 0) goto L_0x012d
            java.lang.Object r1 = stringToValue(r1)
            r12.accumulate(r3, r1)
            goto L_0x012d
        L_0x0160:
            java.lang.Character r5 = LT
            if (r1 != r5) goto L_0x012d
            boolean r1 = parse(r10, r12, r0)
            if (r1 == 0) goto L_0x012d
            int r10 = r12.length()
            if (r10 != 0) goto L_0x0174
            r11.accumulate(r0, r8)
            goto L_0x018b
        L_0x0174:
            int r10 = r12.length()
            if (r10 != r2) goto L_0x0188
            java.lang.Object r10 = r12.opt(r3)
            if (r10 == 0) goto L_0x0188
            java.lang.Object r10 = r12.opt(r3)
            r11.accumulate(r0, r10)
            goto L_0x018b
        L_0x0188:
            r11.accumulate(r0, r12)
        L_0x018b:
            return r4
        L_0x018c:
            org.json.JSONException r10 = r10.syntaxError(r1)
            throw r10
        L_0x0191:
            org.json.JSONException r10 = r10.syntaxError(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.XML.parse(org.json.XMLTokener, org.json.JSONObject, java.lang.String):boolean");
    }

    public static Object stringToValue(String str) {
        if (str.equals("")) {
            return str;
        }
        if (str.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (str.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        if (str.equalsIgnoreCase("null")) {
            return JSONObject.NULL;
        }
        boolean z10 = false;
        if (str.equals("0")) {
            return new Integer(0);
        }
        try {
            char charAt = str.charAt(0);
            int i10 = 1;
            if (charAt == '-') {
                charAt = str.charAt(1);
                z10 = true;
            }
            if (charAt == '0') {
                if (z10) {
                    i10 = 2;
                }
                if (str.charAt(i10) == '0') {
                    return str;
                }
            }
            if (charAt >= '0' && charAt <= '9') {
                if (str.indexOf(46) >= 0) {
                    return Double.valueOf(str);
                }
                if (str.indexOf(101) < 0 && str.indexOf(69) < 0) {
                    Long l10 = new Long(str);
                    return l10.longValue() == ((long) l10.intValue()) ? new Integer(l10.intValue()) : l10;
                }
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public static JSONObject toJSONObject(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        XMLTokener xMLTokener = new XMLTokener(str);
        while (xMLTokener.more() && xMLTokener.skipPast("<")) {
            parse(xMLTokener, jSONObject, (String) null);
        }
        return jSONObject;
    }

    public static String toString(Object obj) throws JSONException {
        return toString(obj, (String) null);
    }

    public static String toString(Object obj, String str) throws JSONException {
        String xml;
        StringBuffer stringBuffer = new StringBuffer();
        if (obj instanceof JSONObject) {
            if (str != null) {
                stringBuffer.append('<');
                stringBuffer.append(str);
                stringBuffer.append('>');
            }
            JSONObject jSONObject = (JSONObject) obj;
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String obj2 = keys.next().toString();
                Object opt = jSONObject.opt(obj2);
                if (opt == null) {
                    opt = "";
                }
                if (opt instanceof String) {
                    String str2 = (String) opt;
                }
                if (obj2.equals("content")) {
                    if (opt instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) opt;
                        int length = jSONArray.length();
                        for (int i10 = 0; i10 < length; i10++) {
                            if (i10 > 0) {
                                stringBuffer.append(10);
                            }
                            stringBuffer.append(escape(jSONArray.get(i10).toString()));
                        }
                    } else {
                        xml = escape(opt.toString());
                    }
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray2 = (JSONArray) opt;
                    int length2 = jSONArray2.length();
                    for (int i11 = 0; i11 < length2; i11++) {
                        Object obj3 = jSONArray2.get(i11);
                        if (obj3 instanceof JSONArray) {
                            stringBuffer.append('<');
                            stringBuffer.append(obj2);
                            stringBuffer.append('>');
                            stringBuffer.append(toString(obj3));
                            stringBuffer.append("</");
                            stringBuffer.append(obj2);
                            stringBuffer.append('>');
                        } else {
                            stringBuffer.append(toString(obj3, obj2));
                        }
                    }
                } else if (opt.equals("")) {
                    stringBuffer.append('<');
                    stringBuffer.append(obj2);
                    stringBuffer.append("/>");
                } else {
                    xml = toString(opt, obj2);
                }
                stringBuffer.append(xml);
            }
            if (str != null) {
                stringBuffer.append("</");
                stringBuffer.append(str);
                stringBuffer.append('>');
            }
            return stringBuffer.toString();
        }
        if (obj.getClass().isArray()) {
            obj = new JSONArray(obj);
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray3 = (JSONArray) obj;
            int length3 = jSONArray3.length();
            for (int i12 = 0; i12 < length3; i12++) {
                stringBuffer.append(toString(jSONArray3.opt(i12), str == null ? "array" : str));
            }
            return stringBuffer.toString();
        }
        String escape = escape(obj.toString());
        if (str == null) {
            return "\"" + escape + "\"";
        } else if (escape.length() == 0) {
            return "<" + str + "/>";
        } else {
            return "<" + str + ">" + escape + "</" + str + ">";
        }
    }
}
