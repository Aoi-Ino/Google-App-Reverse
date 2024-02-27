package org.json;

import java.util.Iterator;

public class JSONML {
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x016f, code lost:
        throw r9.syntaxError("Reserved attribute.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0178, code lost:
        r7 = r9.nextToken();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x017e, code lost:
        if ((r7 instanceof java.lang.String) == false) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0191, code lost:
        throw r9.syntaxError("Missing value");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object parse(org.json.XMLTokener r9, boolean r10, org.json.JSONArray r11) throws org.json.JSONException {
        /*
        L_0x0000:
            java.lang.Object r0 = r9.nextContent()
            java.lang.Character r1 = org.json.XML.LT
            if (r0 != r1) goto L_0x01b8
            java.lang.Object r0 = r9.nextToken()
            boolean r1 = r0 instanceof java.lang.Character
            java.lang.String r2 = "'."
            java.lang.String r3 = "Misshaped tag"
            if (r1 == 0) goto L_0x00bc
            java.lang.Character r1 = org.json.XML.SLASH
            if (r0 != r1) goto L_0x004a
            java.lang.Object r10 = r9.nextToken()
            boolean r11 = r10 instanceof java.lang.String
            if (r11 == 0) goto L_0x0030
            java.lang.Object r11 = r9.nextToken()
            java.lang.Character r0 = org.json.XML.GT
            if (r11 != r0) goto L_0x0029
            return r10
        L_0x0029:
            java.lang.String r10 = "Misshaped close tag"
            org.json.JSONException r9 = r9.syntaxError(r10)
            throw r9
        L_0x0030:
            org.json.JSONException r9 = new org.json.JSONException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Expected a closing name instead of '"
            r11.append(r0)
            r11.append(r10)
            r11.append(r2)
            java.lang.String r10 = r11.toString()
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x004a:
            java.lang.Character r1 = org.json.XML.BANG
            if (r0 != r1) goto L_0x00ac
            char r0 = r9.next()
            r1 = 45
            if (r0 != r1) goto L_0x0065
            char r0 = r9.next()
            if (r0 != r1) goto L_0x0061
            java.lang.String r0 = "-->"
            r9.skipPast(r0)
        L_0x0061:
            r9.back()
            goto L_0x0000
        L_0x0065:
            r1 = 91
            if (r0 != r1) goto L_0x008d
            java.lang.Object r0 = r9.nextToken()
            java.lang.String r2 = "CDATA"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0086
            char r0 = r9.next()
            if (r0 != r1) goto L_0x0086
            if (r11 == 0) goto L_0x0000
            java.lang.String r0 = r9.nextCDATA()
        L_0x0081:
            r11.put((java.lang.Object) r0)
            goto L_0x0000
        L_0x0086:
            java.lang.String r10 = "Expected 'CDATA['"
            org.json.JSONException r9 = r9.syntaxError(r10)
            throw r9
        L_0x008d:
            r0 = 1
        L_0x008e:
            java.lang.Object r1 = r9.nextMeta()
            if (r1 == 0) goto L_0x00a5
            java.lang.Character r2 = org.json.XML.LT
            if (r1 != r2) goto L_0x009b
            int r0 = r0 + 1
            goto L_0x00a1
        L_0x009b:
            java.lang.Character r2 = org.json.XML.GT
            if (r1 != r2) goto L_0x00a1
            int r0 = r0 + -1
        L_0x00a1:
            if (r0 > 0) goto L_0x008e
            goto L_0x0000
        L_0x00a5:
            java.lang.String r10 = "Missing '>' after '<!'."
            org.json.JSONException r9 = r9.syntaxError(r10)
            throw r9
        L_0x00ac:
            java.lang.Character r1 = org.json.XML.QUEST
            if (r0 != r1) goto L_0x00b7
            java.lang.String r0 = "?>"
            r9.skipPast(r0)
            goto L_0x0000
        L_0x00b7:
            org.json.JSONException r9 = r9.syntaxError(r3)
            throw r9
        L_0x00bc:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x019f
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r4 = "tagName"
            if (r10 == 0) goto L_0x00d9
            r1.put((java.lang.Object) r0)
            if (r11 == 0) goto L_0x00e1
            r11.put((java.lang.Object) r1)
            goto L_0x00e1
        L_0x00d9:
            r2.put((java.lang.String) r4, (java.lang.Object) r0)
            if (r11 == 0) goto L_0x00e1
            r11.put((java.lang.Object) r2)
        L_0x00e1:
            r5 = 0
        L_0x00e2:
            r6 = r5
        L_0x00e3:
            if (r6 != 0) goto L_0x00e9
            java.lang.Object r6 = r9.nextToken()
        L_0x00e9:
            if (r6 == 0) goto L_0x019a
            boolean r7 = r6 instanceof java.lang.String
            if (r7 != 0) goto L_0x015e
            if (r10 == 0) goto L_0x00fa
            int r4 = r2.length()
            if (r4 <= 0) goto L_0x00fa
            r1.put((java.lang.Object) r2)
        L_0x00fa:
            java.lang.Character r4 = org.json.XML.SLASH
            if (r6 != r4) goto L_0x0111
            java.lang.Object r0 = r9.nextToken()
            java.lang.Character r4 = org.json.XML.GT
            if (r0 != r4) goto L_0x010c
            if (r11 != 0) goto L_0x0000
            if (r10 == 0) goto L_0x010b
            return r1
        L_0x010b:
            return r2
        L_0x010c:
            org.json.JSONException r9 = r9.syntaxError(r3)
            throw r9
        L_0x0111:
            java.lang.Character r4 = org.json.XML.GT
            if (r6 != r4) goto L_0x0159
            java.lang.Object r3 = parse(r9, r10, r1)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0000
            boolean r4 = r3.equals(r0)
            if (r4 == 0) goto L_0x0136
            if (r10 != 0) goto L_0x0130
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0130
            java.lang.String r0 = "childNodes"
            r2.put((java.lang.String) r0, (java.lang.Object) r1)
        L_0x0130:
            if (r11 != 0) goto L_0x0000
            if (r10 == 0) goto L_0x0135
            return r1
        L_0x0135:
            return r2
        L_0x0136:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Mismatched '"
            r10.append(r11)
            r10.append(r0)
            java.lang.String r11 = "' and '"
            r10.append(r11)
            r10.append(r3)
            java.lang.String r11 = "'"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            org.json.JSONException r9 = r9.syntaxError(r10)
            throw r9
        L_0x0159:
            org.json.JSONException r9 = r9.syntaxError(r3)
            throw r9
        L_0x015e:
            java.lang.String r6 = (java.lang.String) r6
            if (r10 != 0) goto L_0x0170
            if (r6 == r4) goto L_0x0169
            java.lang.String r7 = "childNode"
            if (r6 == r7) goto L_0x0169
            goto L_0x0170
        L_0x0169:
            java.lang.String r10 = "Reserved attribute."
            org.json.JSONException r9 = r9.syntaxError(r10)
            throw r9
        L_0x0170:
            java.lang.Object r7 = r9.nextToken()
            java.lang.Character r8 = org.json.XML.EQ
            if (r7 != r8) goto L_0x0192
            java.lang.Object r7 = r9.nextToken()
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L_0x018b
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = org.json.XML.stringToValue(r7)
            r2.accumulate(r6, r7)
            goto L_0x00e2
        L_0x018b:
            java.lang.String r10 = "Missing value"
            org.json.JSONException r9 = r9.syntaxError(r10)
            throw r9
        L_0x0192:
            java.lang.String r8 = ""
            r2.accumulate(r6, r8)
            r6 = r7
            goto L_0x00e3
        L_0x019a:
            org.json.JSONException r9 = r9.syntaxError(r3)
            throw r9
        L_0x019f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Bad tagName '"
            r10.append(r11)
            r10.append(r0)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            org.json.JSONException r9 = r9.syntaxError(r10)
            throw r9
        L_0x01b8:
            if (r11 == 0) goto L_0x0000
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0081
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = org.json.XML.stringToValue(r0)
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.JSONML.parse(org.json.XMLTokener, boolean, org.json.JSONArray):java.lang.Object");
    }

    public static JSONArray toJSONArray(String str) throws JSONException {
        return toJSONArray(new XMLTokener(str));
    }

    public static JSONObject toJSONObject(String str) throws JSONException {
        return toJSONObject(new XMLTokener(str));
    }

    public static String toString(JSONArray jSONArray) throws JSONException {
        int i10;
        String jsonml;
        StringBuffer stringBuffer = new StringBuffer();
        String string = jSONArray.getString(0);
        XML.noSpace(string);
        String escape = XML.escape(string);
        stringBuffer.append('<');
        stringBuffer.append(escape);
        Object opt = jSONArray.opt(1);
        if (opt instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) opt;
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                XML.noSpace(obj);
                String optString = jSONObject.optString(obj);
                if (optString != null) {
                    stringBuffer.append(' ');
                    stringBuffer.append(XML.escape(obj));
                    stringBuffer.append('=');
                    stringBuffer.append('\"');
                    stringBuffer.append(XML.escape(optString));
                    stringBuffer.append('\"');
                }
            }
            i10 = 2;
        } else {
            i10 = 1;
        }
        int length = jSONArray.length();
        if (i10 >= length) {
            stringBuffer.append('/');
        } else {
            stringBuffer.append('>');
            do {
                Object obj2 = jSONArray.get(i10);
                i10++;
                if (obj2 != null) {
                    if (obj2 instanceof String) {
                        jsonml = XML.escape(obj2.toString());
                    } else if (obj2 instanceof JSONObject) {
                        jsonml = toString((JSONObject) obj2);
                    } else if (obj2 instanceof JSONArray) {
                        jsonml = toString((JSONArray) obj2);
                    } else {
                        continue;
                    }
                    stringBuffer.append(jsonml);
                    continue;
                }
            } while (i10 < length);
            stringBuffer.append('<');
            stringBuffer.append('/');
            stringBuffer.append(escape);
        }
        stringBuffer.append('>');
        return stringBuffer.toString();
    }

    public static JSONArray toJSONArray(XMLTokener xMLTokener) throws JSONException {
        return (JSONArray) parse(xMLTokener, true, (JSONArray) null);
    }

    public static JSONObject toJSONObject(XMLTokener xMLTokener) throws JSONException {
        return (JSONObject) parse(xMLTokener, false, (JSONArray) null);
    }

    public static String toString(JSONObject jSONObject) throws JSONException {
        String jsonml;
        StringBuffer stringBuffer = new StringBuffer();
        String optString = jSONObject.optString("tagName");
        if (optString == null) {
            return XML.escape(jSONObject.toString());
        }
        XML.noSpace(optString);
        String escape = XML.escape(optString);
        stringBuffer.append('<');
        stringBuffer.append(escape);
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String obj = keys.next().toString();
            if (!obj.equals("tagName") && !obj.equals("childNodes")) {
                XML.noSpace(obj);
                String optString2 = jSONObject.optString(obj);
                if (optString2 != null) {
                    stringBuffer.append(' ');
                    stringBuffer.append(XML.escape(obj));
                    stringBuffer.append('=');
                    stringBuffer.append('\"');
                    stringBuffer.append(XML.escape(optString2));
                    stringBuffer.append('\"');
                }
            }
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childNodes");
        if (optJSONArray == null) {
            stringBuffer.append('/');
        } else {
            stringBuffer.append('>');
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                Object obj2 = optJSONArray.get(i10);
                if (obj2 != null) {
                    if (obj2 instanceof String) {
                        jsonml = XML.escape(obj2.toString());
                    } else if (obj2 instanceof JSONObject) {
                        jsonml = toString((JSONObject) obj2);
                    } else if (obj2 instanceof JSONArray) {
                        jsonml = toString((JSONArray) obj2);
                    }
                    stringBuffer.append(jsonml);
                }
            }
            stringBuffer.append('<');
            stringBuffer.append('/');
            stringBuffer.append(escape);
        }
        stringBuffer.append('>');
        return stringBuffer.toString();
    }
}
