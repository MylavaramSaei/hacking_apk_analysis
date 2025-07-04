package IPyIQcaNa8aB7drBED;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public abstract class HJFh0TGMpafqLE9haL extends AutoCompleteTextView {

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final int[] f500zZKhbgvUfsK4AEX3r0 = {R.attr.popupBackground};

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final Acstmh57AKoSEkEFNJ f501HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final zZKhbgvUfsK4AEX3r0 f502lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Y43RdunnpKgpbny0lE f503s3fjYDxWOUexjjVgyA;

    public HJFh0TGMpafqLE9haL(Context context, AttributeSet attributeSet, int i) {
        super(DfpieXfdYs58yZAiXY.s3fjYDxWOUexjjVgyA(context), attributeSet, i);
        GyWRxpdt1T8mEJXPoD.lEeR5KfoEr4xU5yHH7(this, getContext());
        PPkm9uUfOJHHYveeLT pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL = PPkm9uUfOJHHYveeLT.R9SAhYMerGybF9OAjL(getContext(), attributeSet, f500zZKhbgvUfsK4AEX3r0, i, 0);
        if (pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.zaq8hOURtfwbcX17cG(0)) {
            setDropDownBackgroundDrawable(pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.TCyPEKSzIyweCN5yp1(0));
        }
        pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.xHA29AmDt6y96AnB3t();
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = new zZKhbgvUfsK4AEX3r0(this);
        this.f502lEeR5KfoEr4xU5yHH7 = zzkhbgvufsk4aex3r0;
        zzkhbgvufsk4aex3r0.husNiw3snxdgZPAGJm(attributeSet, i);
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = new Y43RdunnpKgpbny0lE(this);
        this.f503s3fjYDxWOUexjjVgyA = y43RdunnpKgpbny0lE;
        y43RdunnpKgpbny0lE.T9PhQIpGRhE4yZDm1C(attributeSet, i);
        y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA();
        Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ = new Acstmh57AKoSEkEFNJ(this);
        this.f501HJFh0TGMpafqLE9haL = acstmh57AKoSEkEFNJ;
        acstmh57AKoSEkEFNJ.HJFh0TGMpafqLE9haL(attributeSet, i);
        lEeR5KfoEr4xU5yHH7(acstmh57AKoSEkEFNJ);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f502lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA();
        }
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f503s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE != null) {
            y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return PPkm9uUfOJHHYveeLT.TCyPEKSzIyweCN5yp1.zaq8hOURtfwbcX17cG(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f502lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            return zzkhbgvufsk4aex3r0.HJFh0TGMpafqLE9haL();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f502lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            return zzkhbgvufsk4aex3r0.zZKhbgvUfsK4AEX3r0();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f503s3fjYDxWOUexjjVgyA.Acstmh57AKoSEkEFNJ();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f503s3fjYDxWOUexjjVgyA.Z9WdNiOsPR0y54zHW4();
    }

    public void lEeR5KfoEr4xU5yHH7(Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ) {
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f501HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f502lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            zzkhbgvufsk4aex3r0.KYHag8HRDlnO3X9zmZ(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f502lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            zzkhbgvufsk4aex3r0.TCyPEKSzIyweCN5yp1(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f503s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE != null) {
            y43RdunnpKgpbny0lE.OANkd3mP6AYvwbNLJM();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f503s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE != null) {
            y43RdunnpKgpbny0lE.OANkd3mP6AYvwbNLJM();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(PPkm9uUfOJHHYveeLT.TCyPEKSzIyweCN5yp1.sTkWmhpZ5b1ArQIw4K(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f501HJFh0TGMpafqLE9haL.husNiw3snxdgZPAGJm(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f501HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f502lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            zzkhbgvufsk4aex3r0.pbVGzGjWvY2LDXC8vo(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f502lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            zzkhbgvufsk4aex3r0.Acstmh57AKoSEkEFNJ(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f503s3fjYDxWOUexjjVgyA.LIMtzhnLwQyigzK0KO(colorStateList);
        this.f503s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f503s3fjYDxWOUexjjVgyA.A49QRPHynYLCBN0SqP(mode);
        this.f503s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f503s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE != null) {
            y43RdunnpKgpbny0lE.zaq8hOURtfwbcX17cG(context, i);
        }
    }
}
