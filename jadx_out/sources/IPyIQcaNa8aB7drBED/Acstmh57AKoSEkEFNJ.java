package IPyIQcaNa8aB7drBED;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* loaded from: classes.dex */
public class Acstmh57AKoSEkEFNJ {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final EditText f471lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final XdzLv4NdAtTYoEzVzB.lEeR5KfoEr4xU5yHH7 f472s3fjYDxWOUexjjVgyA;

    public Acstmh57AKoSEkEFNJ(EditText editText) {
        this.f471lEeR5KfoEr4xU5yHH7 = editText;
        this.f472s3fjYDxWOUexjjVgyA = new XdzLv4NdAtTYoEzVzB.lEeR5KfoEr4xU5yHH7(editText, false);
    }

    public void HJFh0TGMpafqLE9haL(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f471lEeR5KfoEr4xU5yHH7.getContext().obtainStyledAttributes(attributeSet, lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6449zcy2NNbtVXgoGQbfuq, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6331Pum9NZyDBKoCnecvlx) ? typedArrayObtainStyledAttributes.getBoolean(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6331Pum9NZyDBKoCnecvlx, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            husNiw3snxdgZPAGJm(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void husNiw3snxdgZPAGJm(boolean z) {
        this.f472s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(z);
    }

    public KeyListener lEeR5KfoEr4xU5yHH7(KeyListener keyListener) {
        return s3fjYDxWOUexjjVgyA(keyListener) ? this.f472s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(keyListener) : keyListener;
    }

    public boolean s3fjYDxWOUexjjVgyA(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public InputConnection zZKhbgvUfsK4AEX3r0(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f472s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(inputConnection, editorInfo);
    }
}
