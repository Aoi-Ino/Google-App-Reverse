package org.json;

import java.io.IOException;
import java.io.Writer;

public class JSONWriter {
    private static final int maxdepth = 20;
    private boolean comma = false;
    protected char mode = 'i';
    private JSONObject[] stack = new JSONObject[20];
    private int top = 0;
    protected Writer writer;

    public JSONWriter(Writer writer2) {
        this.writer = writer2;
    }

    private JSONWriter append(String str) throws JSONException {
        if (str != null) {
            char c10 = this.mode;
            if (c10 == 'o' || c10 == 'a') {
                try {
                    if (this.comma && c10 == 'a') {
                        this.writer.write(44);
                    }
                    this.writer.write(str);
                    if (this.mode == 'o') {
                        this.mode = 'k';
                    }
                    this.comma = true;
                    return this;
                } catch (IOException e10) {
                    throw new JSONException((Throwable) e10);
                }
            } else {
                throw new JSONException("Value out of sequence.");
            }
        } else {
            throw new JSONException("Null pointer");
        }
    }

    private JSONWriter end(char c10, char c11) throws JSONException {
        if (this.mode != c10) {
            throw new JSONException(c10 == 'a' ? "Misplaced endArray." : "Misplaced endObject.");
        }
        pop(c10);
        try {
            this.writer.write(c11);
            this.comma = true;
            return this;
        } catch (IOException e10) {
            throw new JSONException((Throwable) e10);
        }
    }

    private void pop(char c10) throws JSONException {
        int i10 = this.top;
        if (i10 > 0) {
            JSONObject[] jSONObjectArr = this.stack;
            char c11 = 'k';
            if ((jSONObjectArr[i10 + -1] == null ? 'a' : 'k') == c10) {
                int i11 = i10 - 1;
                this.top = i11;
                if (i11 == 0) {
                    c11 = 'd';
                } else if (jSONObjectArr[i10 - 2] == null) {
                    c11 = 'a';
                }
                this.mode = c11;
                return;
            }
            throw new JSONException("Nesting error.");
        }
        throw new JSONException("Nesting error.");
    }

    private void push(JSONObject jSONObject) throws JSONException {
        int i10 = this.top;
        if (i10 < 20) {
            this.stack[i10] = jSONObject;
            this.mode = jSONObject == null ? 'a' : 'k';
            this.top = i10 + 1;
            return;
        }
        throw new JSONException("Nesting too deep.");
    }

    public JSONWriter array() throws JSONException {
        char c10 = this.mode;
        if (c10 == 'i' || c10 == 'o' || c10 == 'a') {
            push((JSONObject) null);
            append("[");
            this.comma = false;
            return this;
        }
        throw new JSONException("Misplaced array.");
    }

    public JSONWriter endArray() throws JSONException {
        return end('a', ']');
    }

    public JSONWriter endObject() throws JSONException {
        return end('k', '}');
    }

    public JSONWriter key(String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Null key.");
        } else if (this.mode == 'k') {
            try {
                this.stack[this.top - 1].putOnce(str, Boolean.TRUE);
                if (this.comma) {
                    this.writer.write(44);
                }
                this.writer.write(JSONObject.quote(str));
                this.writer.write(58);
                this.comma = false;
                this.mode = 'o';
                return this;
            } catch (IOException e10) {
                throw new JSONException((Throwable) e10);
            }
        } else {
            throw new JSONException("Misplaced key.");
        }
    }

    public JSONWriter object() throws JSONException {
        if (this.mode == 'i') {
            this.mode = 'o';
        }
        char c10 = this.mode;
        if (c10 == 'o' || c10 == 'a') {
            append("{");
            push(new JSONObject());
            this.comma = false;
            return this;
        }
        throw new JSONException("Misplaced object.");
    }

    public JSONWriter value(double d10) throws JSONException {
        return value((Object) new Double(d10));
    }

    public JSONWriter value(long j10) throws JSONException {
        return append(Long.toString(j10));
    }

    public JSONWriter value(Object obj) throws JSONException {
        return append(JSONObject.valueToString(obj));
    }

    public JSONWriter value(boolean z10) throws JSONException {
        return append(z10 ? "true" : "false");
    }
}
