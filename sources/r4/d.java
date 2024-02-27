package r4;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

public class d extends Property {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f15588a = new Matrix();

    public d() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f15588a.set(imageView.getImageMatrix());
        return this.f15588a;
    }

    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
