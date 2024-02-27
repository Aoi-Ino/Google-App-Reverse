package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.g;

final class x {

    /* renamed from: a  reason: collision with root package name */
    private TextView f1564a;

    /* renamed from: b  reason: collision with root package name */
    private TextClassifier f1565b;

    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    x(TextView textView) {
        this.f1564a = (TextView) g.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f1565b;
        return textClassifier == null ? a.a(this.f1564a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f1565b = textClassifier;
    }
}
