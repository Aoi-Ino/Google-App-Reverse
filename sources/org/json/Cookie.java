package org.json;

public class Cookie {
    public static String escape(String str) {
        String trim = str.trim();
        StringBuffer stringBuffer = new StringBuffer();
        int length = trim.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = trim.charAt(i10);
            if (charAt < ' ' || charAt == '+' || charAt == '%' || charAt == '=' || charAt == ';') {
                stringBuffer.append('%');
                stringBuffer.append(Character.forDigit((char) ((charAt >>> 4) & 15), 16));
                charAt = Character.forDigit((char) (charAt & 15), 16);
            }
            stringBuffer.append(charAt);
        }
        return stringBuffer.toString();
    }

    public static JSONObject toJSONObject(String str) throws JSONException {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        JSONTokener jSONTokener = new JSONTokener(str);
        jSONObject.put("name", (Object) jSONTokener.nextTo('='));
        jSONTokener.next('=');
        jSONObject.put("value", (Object) jSONTokener.nextTo(';'));
        jSONTokener.next();
        while (jSONTokener.more()) {
            String unescape = unescape(jSONTokener.nextTo("=;"));
            if (jSONTokener.next() == '=') {
                obj = unescape(jSONTokener.nextTo(';'));
                jSONTokener.next();
            } else if (unescape.equals("secure")) {
                obj = Boolean.TRUE;
            } else {
                throw jSONTokener.syntaxError("Missing '=' in cookie parameter.");
            }
            jSONObject.put(unescape, obj);
        }
        return jSONObject;
    }

    public static String toString(JSONObject jSONObject) throws JSONException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(escape(jSONObject.getString("name")));
        stringBuffer.append("=");
        stringBuffer.append(escape(jSONObject.getString("value")));
        if (jSONObject.has("expires")) {
            stringBuffer.append(";expires=");
            stringBuffer.append(jSONObject.getString("expires"));
        }
        if (jSONObject.has("domain")) {
            stringBuffer.append(";domain=");
            stringBuffer.append(escape(jSONObject.getString("domain")));
        }
        if (jSONObject.has("path")) {
            stringBuffer.append(";path=");
            stringBuffer.append(escape(jSONObject.getString("path")));
        }
        if (jSONObject.optBoolean("secure")) {
            stringBuffer.append(";secure");
        }
        return stringBuffer.toString();
    }

    public static String unescape(String str) {
        int i10;
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer();
        int i11 = 0;
        while (i11 < length) {
            char charAt = str.charAt(i11);
            if (charAt == '+') {
                charAt = ' ';
            } else if (charAt == '%' && (i10 = i11 + 2) < length) {
                int dehexchar = JSONTokener.dehexchar(str.charAt(i11 + 1));
                int dehexchar2 = JSONTokener.dehexchar(str.charAt(i10));
                if (dehexchar >= 0 && dehexchar2 >= 0) {
                    charAt = (char) ((dehexchar * 16) + dehexchar2);
                    i11 = i10;
                }
            }
            stringBuffer.append(charAt);
            i11++;
        }
        return stringBuffer.toString();
    }
}
