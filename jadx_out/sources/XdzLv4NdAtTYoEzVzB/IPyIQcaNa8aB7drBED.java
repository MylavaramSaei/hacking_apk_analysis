package XdzLv4NdAtTYoEzVzB;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* loaded from: classes.dex */
public class IPyIQcaNa8aB7drBED implements TransformationMethod {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final TransformationMethod f2092lEeR5KfoEr4xU5yHH7;

    public IPyIQcaNa8aB7drBED(TransformationMethod transformationMethod) {
        this.f2092lEeR5KfoEr4xU5yHH7 = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f2092lEeR5KfoEr4xU5yHH7;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL().husNiw3snxdgZPAGJm() != 1) ? charSequence : androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL().OANkd3mP6AYvwbNLJM(charSequence);
    }

    public TransformationMethod lEeR5KfoEr4xU5yHH7() {
        return this.f2092lEeR5KfoEr4xU5yHH7;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f2092lEeR5KfoEr4xU5yHH7;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
