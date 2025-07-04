package IPyIQcaNa8aB7drBED;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* loaded from: classes.dex */
public abstract class husNiw3snxdgZPAGJm extends Button {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public Z9WdNiOsPR0y54zHW4 f682HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final zZKhbgvUfsK4AEX3r0 f683lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Y43RdunnpKgpbny0lE f684s3fjYDxWOUexjjVgyA;

    public husNiw3snxdgZPAGJm(Context context, AttributeSet attributeSet, int i) {
        super(DfpieXfdYs58yZAiXY.s3fjYDxWOUexjjVgyA(context), attributeSet, i);
        GyWRxpdt1T8mEJXPoD.lEeR5KfoEr4xU5yHH7(this, getContext());
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = new zZKhbgvUfsK4AEX3r0(this);
        this.f683lEeR5KfoEr4xU5yHH7 = zzkhbgvufsk4aex3r0;
        zzkhbgvufsk4aex3r0.husNiw3snxdgZPAGJm(attributeSet, i);
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = new Y43RdunnpKgpbny0lE(this);
        this.f684s3fjYDxWOUexjjVgyA = y43RdunnpKgpbny0lE;
        y43RdunnpKgpbny0lE.T9PhQIpGRhE4yZDm1C(attributeSet, i);
        y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA();
        getEmojiTextViewHelper().s3fjYDxWOUexjjVgyA(attributeSet, i);
    }

    private Z9WdNiOsPR0y54zHW4 getEmojiTextViewHelper() {
        if (this.f682HJFh0TGMpafqLE9haL == null) {
            this.f682HJFh0TGMpafqLE9haL = new Z9WdNiOsPR0y54zHW4(this);
        }
        return this.f682HJFh0TGMpafqLE9haL;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f683lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA();
        }
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f684s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE != null) {
            y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (cT5Hs3CQpLK8NvlZAw.f672lEeR5KfoEr4xU5yHH7) {
            return super.getAutoSizeMaxTextSize();
        }
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f684s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE != null) {
            return y43RdunnpKgpbny0lE.husNiw3snxdgZPAGJm();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (cT5Hs3CQpLK8NvlZAw.f672lEeR5KfoEr4xU5yHH7) {
            return super.getAutoSizeMinTextSize();
        }
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f684s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE != null) {
            return y43RdunnpKgpbny0lE.KYHag8HRDlnO3X9zmZ();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (cT5Hs3CQpLK8NvlZAw.f672lEeR5KfoEr4xU5yHH7) {
            return super.getAutoSizeStepGranularity();
        }
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f684s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE != null) {
            return y43RdunnpKgpbny0lE.TCyPEKSzIyweCN5yp1();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (cT5Hs3CQpLK8NvlZAw.f672lEeR5KfoEr4xU5yHH7) {
            return super.getAutoSizeTextAvailableSizes();
        }
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f684s3fjYDxWOUexjjVgyA;
        return y43RdunnpKgpbny0lE != null ? y43RdunnpKgpbny0lE.IPyIQcaNa8aB7drBED() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (cT5Hs3CQpLK8NvlZAw.f672lEeR5KfoEr4xU5yHH7) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f684s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE != null) {
            return y43RdunnpKgpbny0lE.pbVGzGjWvY2LDXC8vo();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return PPkm9uUfOJHHYveeLT.TCyPEKSzIyweCN5yp1.zaq8hOURtfwbcX17cG(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f683lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            return zzkhbgvufsk4aex3r0.HJFh0TGMpafqLE9haL();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f683lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            return zzkhbgvufsk4aex3r0.zZKhbgvUfsK4AEX3r0();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f684s3fjYDxWOUexjjVgyA.Acstmh57AKoSEkEFNJ();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f684s3fjYDxWOUexjjVgyA.Z9WdNiOsPR0y54zHW4();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f684s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE != null) {
            y43RdunnpKgpbny0lE.aPyGSIylzVNKPT1Bls(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f684s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE == null || cT5Hs3CQpLK8NvlZAw.f672lEeR5KfoEr4xU5yHH7 || !y43RdunnpKgpbny0lE.e54J8UWNHWALQNixXM()) {
            return;
        }
        this.f684s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().HJFh0TGMpafqLE9haL(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (cT5Hs3CQpLK8NvlZAw.f672lEeR5KfoEr4xU5yHH7) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f684s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE != null) {
            y43RdunnpKgpbny0lE.R9SAhYMerGybF9OAjL(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (cT5Hs3CQpLK8NvlZAw.f672lEeR5KfoEr4xU5yHH7) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f684s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE != null) {
            y43RdunnpKgpbny0lE.G7AC3DWIx9i9fdanjk(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (cT5Hs3CQpLK8NvlZAw.f672lEeR5KfoEr4xU5yHH7) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f684s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE != null) {
            y43RdunnpKgpbny0lE.xHA29AmDt6y96AnB3t(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f683lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            zzkhbgvufsk4aex3r0.KYHag8HRDlnO3X9zmZ(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f683lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            zzkhbgvufsk4aex3r0.TCyPEKSzIyweCN5yp1(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(PPkm9uUfOJHHYveeLT.TCyPEKSzIyweCN5yp1.sTkWmhpZ5b1ArQIw4K(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().zZKhbgvUfsK4AEX3r0(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().lEeR5KfoEr4xU5yHH7(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f684s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE != null) {
            y43RdunnpKgpbny0lE.Y43RdunnpKgpbny0lE(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f683lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            zzkhbgvufsk4aex3r0.pbVGzGjWvY2LDXC8vo(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f683lEeR5KfoEr4xU5yHH7;
        if (zzkhbgvufsk4aex3r0 != null) {
            zzkhbgvufsk4aex3r0.Acstmh57AKoSEkEFNJ(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f684s3fjYDxWOUexjjVgyA.LIMtzhnLwQyigzK0KO(colorStateList);
        this.f684s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f684s3fjYDxWOUexjjVgyA.A49QRPHynYLCBN0SqP(mode);
        this.f684s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f684s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE != null) {
            y43RdunnpKgpbny0lE.zaq8hOURtfwbcX17cG(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (cT5Hs3CQpLK8NvlZAw.f672lEeR5KfoEr4xU5yHH7) {
            super.setTextSize(i, f);
            return;
        }
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = this.f684s3fjYDxWOUexjjVgyA;
        if (y43RdunnpKgpbny0lE != null) {
            y43RdunnpKgpbny0lE.THTDvPxsHqMeGb512f(i, f);
        }
    }
}
