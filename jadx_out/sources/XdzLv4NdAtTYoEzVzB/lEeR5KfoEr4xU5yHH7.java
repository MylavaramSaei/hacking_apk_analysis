package XdzLv4NdAtTYoEzVzB;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final s3fjYDxWOUexjjVgyA f2108lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f2109s3fjYDxWOUexjjVgyA = Integer.MAX_VALUE;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f2107HJFh0TGMpafqLE9haL = 0;

    /* renamed from: XdzLv4NdAtTYoEzVzB.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public static class C0027lEeR5KfoEr4xU5yHH7 extends s3fjYDxWOUexjjVgyA {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final EditText f2110lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final TCyPEKSzIyweCN5yp1 f2111s3fjYDxWOUexjjVgyA;

        public C0027lEeR5KfoEr4xU5yHH7(EditText editText, boolean z) {
            this.f2110lEeR5KfoEr4xU5yHH7 = editText;
            TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = new TCyPEKSzIyweCN5yp1(editText, z);
            this.f2111s3fjYDxWOUexjjVgyA = tCyPEKSzIyweCN5yp1;
            editText.addTextChangedListener(tCyPEKSzIyweCN5yp1);
            editText.setEditableFactory(XdzLv4NdAtTYoEzVzB.s3fjYDxWOUexjjVgyA.getInstance());
        }

        @Override // XdzLv4NdAtTYoEzVzB.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA
        public void HJFh0TGMpafqLE9haL(boolean z) {
            this.f2111s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(z);
        }

        @Override // XdzLv4NdAtTYoEzVzB.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA
        public KeyListener lEeR5KfoEr4xU5yHH7(KeyListener keyListener) {
            if (keyListener instanceof husNiw3snxdgZPAGJm) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new husNiw3snxdgZPAGJm(keyListener);
        }

        @Override // XdzLv4NdAtTYoEzVzB.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA
        public InputConnection s3fjYDxWOUexjjVgyA(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof HJFh0TGMpafqLE9haL ? inputConnection : new HJFh0TGMpafqLE9haL(this.f2110lEeR5KfoEr4xU5yHH7, inputConnection, editorInfo);
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public abstract void HJFh0TGMpafqLE9haL(boolean z);

        public abstract KeyListener lEeR5KfoEr4xU5yHH7(KeyListener keyListener);

        public abstract InputConnection s3fjYDxWOUexjjVgyA(InputConnection inputConnection, EditorInfo editorInfo);
    }

    public lEeR5KfoEr4xU5yHH7(EditText editText, boolean z) {
        tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.IPyIQcaNa8aB7drBED(editText, "editText cannot be null");
        this.f2108lEeR5KfoEr4xU5yHH7 = new C0027lEeR5KfoEr4xU5yHH7(editText, z);
    }

    public void HJFh0TGMpafqLE9haL(boolean z) {
        this.f2108lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(z);
    }

    public KeyListener lEeR5KfoEr4xU5yHH7(KeyListener keyListener) {
        return this.f2108lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(keyListener);
    }

    public InputConnection s3fjYDxWOUexjjVgyA(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f2108lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(inputConnection, editorInfo);
    }
}
