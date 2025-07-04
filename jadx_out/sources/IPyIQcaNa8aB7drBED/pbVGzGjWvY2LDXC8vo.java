package IPyIQcaNa8aB7drBED;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* loaded from: classes.dex */
public abstract class pbVGzGjWvY2LDXC8vo extends EditText implements W3RZ2dTDKrKpS5Mxdk.XzJ1BS7H9Ilbkv4eVM {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final sTkWmhpZ5b1ArQIw4K f702HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public lEeR5KfoEr4xU5yHH7 f703KYHag8HRDlnO3X9zmZ;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final Acstmh57AKoSEkEFNJ f704husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final zZKhbgvUfsK4AEX3r0 f705lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Y43RdunnpKgpbny0lE f706s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final PPkm9uUfOJHHYveeLT.IPyIQcaNa8aB7drBED f707zZKhbgvUfsK4AEX3r0;

    public class lEeR5KfoEr4xU5yHH7 {
        public lEeR5KfoEr4xU5yHH7() {
        }

        public TextClassifier lEeR5KfoEr4xU5yHH7() {
            return pbVGzGjWvY2LDXC8vo.super.getTextClassifier();
        }

        public void s3fjYDxWOUexjjVgyA(TextClassifier textClassifier) {
            pbVGzGjWvY2LDXC8vo.super.setTextClassifier(textClassifier);
        }
    }

    public pbVGzGjWvY2LDXC8vo(Context context, AttributeSet attributeSet, int i) {
        super(DfpieXfdYs58yZAiXY.s3fjYDxWOUexjjVgyA(context), attributeSet, i);
        GyWRxpdt1T8mEJXPoD.lEeR5KfoEr4xU5yHH7(this, getContext());
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = new zZKhbgvUfsK4AEX3r0(this);
        this.f705lEeR5KfoEr4xU5yHH7 = zzkhbgvufsk4aex3r0;
        zzkhbgvufsk4aex3r0.husNiw3snxdgZPAGJm(attributeSet, i);
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = new Y43RdunnpKgpbny0lE(this);
        this.f706s3fjYDxWOUexjjVgyA = y43RdunnpKgpbny0lE;
        y43RdunnpKgpbny0lE.T9PhQIpGRhE4yZDm1C(attributeSet, i);
        y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA();
        this.f702HJFh0TGMpafqLE9haL = new sTkWmhpZ5b1ArQIw4K(this);
        this.f707zZKhbgvUfsK4AEX3r0 = new PPkm9uUfOJHHYveeLT.IPyIQcaNa8aB7drBED();
        Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ = new Acstmh57AKoSEkEFNJ(this);
        this.f704husNiw3snxdgZPAGJm = acstmh57AKoSEkEFNJ;
        acstmh57AKoSEkEFNJ.HJFh0TGMpafqLE9haL(attributeSet, i);
        zZKhbgvUfsK4AEX3r0(acstmh57AKoSEkEFNJ);
    }

    private lEeR5KfoEr4xU5yHH7 getSuperCaller() {
        if (this.f703KYHag8HRDlnO3X9zmZ == null) {
            this.f703KYHag8HRDlnO3X9zmZ = new lEeR5KfoEr4xU5yHH7();
        }
        return this.f703KYHag8HRDlnO3X9zmZ;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f705lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA();
        }
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f706s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE != null) {
            y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return PPkm9uUfOJHHYveeLT.TCyPEKSzIyweCN5yp1.zaq8hOURtfwbcX17cG(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f705lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            return zzkhbgvufsk4aex3r0.HJFh0TGMpafqLE9haL();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f705lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            return zzkhbgvufsk4aex3r0.zZKhbgvUfsK4AEX3r0();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f706s3fjYDxWOUexjjVgyA.Acstmh57AKoSEkEFNJ();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f706s3fjYDxWOUexjjVgyA.Z9WdNiOsPR0y54zHW4();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        sTkWmhpZ5b1ArQIw4K stkwmhpz5b1arqiw4k;
        return (Build.VERSION.SDK_INT >= 28 || (stkwmhpz5b1arqiw4k = this.f702HJFh0TGMpafqLE9haL) == null) ? getSuperCaller().lEeR5KfoEr4xU5yHH7() : stkwmhpz5b1arqiw4k.lEeR5KfoEr4xU5yHH7();
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.XzJ1BS7H9Ilbkv4eVM
    public W3RZ2dTDKrKpS5Mxdk.zZKhbgvUfsK4AEX3r0 lEeR5KfoEr4xU5yHH7(W3RZ2dTDKrKpS5Mxdk.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        return this.f707zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(this, zzkhbgvufsk4aex3r0);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrTHTDvPxsHqMeGb512f;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f706s3fjYDxWOUexjjVgyA.sTkWmhpZ5b1ArQIw4K(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionLEeR5KfoEr4xU5yHH7 = e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionLEeR5KfoEr4xU5yHH7 != null && Build.VERSION.SDK_INT <= 30 && (strArrTHTDvPxsHqMeGb512f = W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.THTDvPxsHqMeGb512f(this)) != null) {
            KqgKJKIWne3kz1AdHk.HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(editorInfo, strArrTHTDvPxsHqMeGb512f);
            inputConnectionLEeR5KfoEr4xU5yHH7 = KqgKJKIWne3kz1AdHk.husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL(this, inputConnectionLEeR5KfoEr4xU5yHH7, editorInfo);
        }
        return this.f704husNiw3snxdgZPAGJm.zZKhbgvUfsK4AEX3r0(inputConnectionLEeR5KfoEr4xU5yHH7, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (zaq8hOURtfwbcX17cG.lEeR5KfoEr4xU5yHH7(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (zaq8hOURtfwbcX17cG.s3fjYDxWOUexjjVgyA(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f705lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            zzkhbgvufsk4aex3r0.KYHag8HRDlnO3X9zmZ(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f705lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            zzkhbgvufsk4aex3r0.TCyPEKSzIyweCN5yp1(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f706s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE != null) {
            y43RdunnpKgpbny0lE.OANkd3mP6AYvwbNLJM();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f706s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE != null) {
            y43RdunnpKgpbny0lE.OANkd3mP6AYvwbNLJM();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(PPkm9uUfOJHHYveeLT.TCyPEKSzIyweCN5yp1.sTkWmhpZ5b1ArQIw4K(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f704husNiw3snxdgZPAGJm.husNiw3snxdgZPAGJm(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f704husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f705lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            zzkhbgvufsk4aex3r0.pbVGzGjWvY2LDXC8vo(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f705lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            zzkhbgvufsk4aex3r0.Acstmh57AKoSEkEFNJ(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f706s3fjYDxWOUexjjVgyA.LIMtzhnLwQyigzK0KO(colorStateList);
        this.f706s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f706s3fjYDxWOUexjjVgyA.A49QRPHynYLCBN0SqP(mode);
        this.f706s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f706s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE != null) {
            y43RdunnpKgpbny0lE.zaq8hOURtfwbcX17cG(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        sTkWmhpZ5b1ArQIw4K stkwmhpz5b1arqiw4k;
        if (Build.VERSION.SDK_INT >= 28 || (stkwmhpz5b1arqiw4k = this.f702HJFh0TGMpafqLE9haL) == null) {
            getSuperCaller().s3fjYDxWOUexjjVgyA(textClassifier);
        } else {
            stkwmhpz5b1arqiw4k.s3fjYDxWOUexjjVgyA(textClassifier);
        }
    }

    public void zZKhbgvUfsK4AEX3r0(Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ) {
        KeyListener keyListener = getKeyListener();
        if (acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerLEeR5KfoEr4xU5yHH7 = acstmh57AKoSEkEFNJ.lEeR5KfoEr4xU5yHH7(keyListener);
            if (keyListenerLEeR5KfoEr4xU5yHH7 == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerLEeR5KfoEr4xU5yHH7);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }
}
