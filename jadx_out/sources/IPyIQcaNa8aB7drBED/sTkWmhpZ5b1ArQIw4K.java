package IPyIQcaNa8aB7drBED;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class sTkWmhpZ5b1ArQIw4K {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public TextView f710lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public TextClassifier f711s3fjYDxWOUexjjVgyA;

    public static final class lEeR5KfoEr4xU5yHH7 {
        public static TextClassifier lEeR5KfoEr4xU5yHH7(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public sTkWmhpZ5b1ArQIw4K(TextView textView) {
        this.f710lEeR5KfoEr4xU5yHH7 = (TextView) tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.TCyPEKSzIyweCN5yp1(textView);
    }

    public TextClassifier lEeR5KfoEr4xU5yHH7() {
        TextClassifier textClassifier = this.f711s3fjYDxWOUexjjVgyA;
        return textClassifier == null ? lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this.f710lEeR5KfoEr4xU5yHH7) : textClassifier;
    }

    public void s3fjYDxWOUexjjVgyA(TextClassifier textClassifier) {
        this.f711s3fjYDxWOUexjjVgyA = textClassifier;
    }
}
