package XdzLv4NdAtTYoEzVzB;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class husNiw3snxdgZPAGJm implements KeyListener {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final KeyListener f2105lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final lEeR5KfoEr4xU5yHH7 f2106s3fjYDxWOUexjjVgyA;

    public static class lEeR5KfoEr4xU5yHH7 {
        public boolean lEeR5KfoEr4xU5yHH7(Editable editable, int i, KeyEvent keyEvent) {
            return androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.TCyPEKSzIyweCN5yp1(editable, i, keyEvent);
        }
    }

    public husNiw3snxdgZPAGJm(KeyListener keyListener) {
        this(keyListener, new lEeR5KfoEr4xU5yHH7());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f2105lEeR5KfoEr4xU5yHH7.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f2105lEeR5KfoEr4xU5yHH7.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f2106s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(editable, i, keyEvent) || this.f2105lEeR5KfoEr4xU5yHH7.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f2105lEeR5KfoEr4xU5yHH7.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f2105lEeR5KfoEr4xU5yHH7.onKeyUp(view, editable, i, keyEvent);
    }

    public husNiw3snxdgZPAGJm(KeyListener keyListener, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this.f2105lEeR5KfoEr4xU5yHH7 = keyListener;
        this.f2106s3fjYDxWOUexjjVgyA = leer5kfoer4xu5yhh7;
    }
}
