package k0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.core.util.g;
import androidx.emoji2.text.e;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final b f12895a;

    private static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final TextView f12896a;

        /* renamed from: b  reason: collision with root package name */
        private final d f12897b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f12898c = true;

        a(TextView textView) {
            this.f12896a = textView;
            this.f12897b = new d(textView);
        }

        private InputFilter[] d(InputFilter[] inputFilterArr) {
            for (d dVar : inputFilterArr) {
                if (dVar == this.f12897b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, r0);
            inputFilterArr2[r0] = this.f12897b;
            return inputFilterArr2;
        }

        private SparseArray e(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            SparseArray e10 = e(inputFilterArr);
            if (e10.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - e10.size())];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (e10.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod h(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void i() {
            this.f12896a.setFilters(a(this.f12896a.getFilters()));
        }

        private TransformationMethod k(TransformationMethod transformationMethod) {
            return (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) ? new h(transformationMethod) : transformationMethod;
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f12898c ? f(inputFilterArr) : d(inputFilterArr);
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z10) {
            if (z10) {
                j();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z10) {
            this.f12898c = z10;
            j();
            i();
        }

        /* access modifiers changed from: package-private */
        public void g(boolean z10) {
            this.f12898c = z10;
        }

        /* access modifiers changed from: package-private */
        public void j() {
            this.f12896a.setTransformationMethod(l(this.f12896a.getTransformationMethod()));
        }

        /* access modifiers changed from: package-private */
        public TransformationMethod l(TransformationMethod transformationMethod) {
            return this.f12898c ? k(transformationMethod) : h(transformationMethod);
        }
    }

    static class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public abstract InputFilter[] a(InputFilter[] inputFilterArr);

        /* access modifiers changed from: package-private */
        public abstract void b(boolean z10);

        /* access modifiers changed from: package-private */
        public abstract void c(boolean z10);
    }

    private static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private final a f12899a;

        c(TextView textView) {
            this.f12899a = new a(textView);
        }

        private boolean d() {
            return !e.h();
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return d() ? inputFilterArr : this.f12899a.a(inputFilterArr);
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z10) {
            if (!d()) {
                this.f12899a.b(z10);
            }
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z10) {
            if (d()) {
                this.f12899a.g(z10);
            } else {
                this.f12899a.c(z10);
            }
        }
    }

    public f(TextView textView, boolean z10) {
        g.h(textView, "textView cannot be null");
        this.f12895a = !z10 ? new c(textView) : new a(textView);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f12895a.a(inputFilterArr);
    }

    public void b(boolean z10) {
        this.f12895a.b(z10);
    }

    public void c(boolean z10) {
        this.f12895a.c(z10);
    }
}
