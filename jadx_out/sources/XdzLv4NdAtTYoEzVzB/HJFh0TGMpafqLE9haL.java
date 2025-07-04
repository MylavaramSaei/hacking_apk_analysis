package XdzLv4NdAtTYoEzVzB;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class HJFh0TGMpafqLE9haL extends InputConnectionWrapper {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final TextView f2090lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final lEeR5KfoEr4xU5yHH7 f2091s3fjYDxWOUexjjVgyA;

    public static class lEeR5KfoEr4xU5yHH7 {
        public boolean lEeR5KfoEr4xU5yHH7(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
            return androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.KYHag8HRDlnO3X9zmZ(inputConnection, editable, i, i2, z);
        }

        public void s3fjYDxWOUexjjVgyA(EditorInfo editorInfo) {
            if (androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.pbVGzGjWvY2LDXC8vo()) {
                androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL().xHA29AmDt6y96AnB3t(editorInfo);
            }
        }
    }

    public HJFh0TGMpafqLE9haL(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new lEeR5KfoEr4xU5yHH7());
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        return this.f2091s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this, lEeR5KfoEr4xU5yHH7(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return this.f2091s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this, lEeR5KfoEr4xU5yHH7(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }

    public final Editable lEeR5KfoEr4xU5yHH7() {
        return this.f2090lEeR5KfoEr4xU5yHH7.getEditableText();
    }

    public HJFh0TGMpafqLE9haL(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        super(inputConnection, false);
        this.f2090lEeR5KfoEr4xU5yHH7 = textView;
        this.f2091s3fjYDxWOUexjjVgyA = leer5kfoer4xu5yhh7;
        leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA(editorInfo);
    }
}
