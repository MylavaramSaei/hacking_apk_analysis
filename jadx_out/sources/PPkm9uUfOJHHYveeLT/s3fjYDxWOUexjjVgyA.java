package PPkm9uUfOJHHYveeLT;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA {

    public static class lEeR5KfoEr4xU5yHH7 {
        public static void HJFh0TGMpafqLE9haL(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        public static ColorStateList lEeR5KfoEr4xU5yHH7(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        public static PorterDuff.Mode s3fjYDxWOUexjjVgyA(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        public static void zZKhbgvUfsK4AEX3r0(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA$s3fjYDxWOUexjjVgyA, reason: collision with other inner class name */
    public static class C0016s3fjYDxWOUexjjVgyA {
        public static Drawable lEeR5KfoEr4xU5yHH7(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    public static void HJFh0TGMpafqLE9haL(CompoundButton compoundButton, PorterDuff.Mode mode) {
        lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(compoundButton, mode);
    }

    public static Drawable lEeR5KfoEr4xU5yHH7(CompoundButton compoundButton) {
        return C0016s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(compoundButton);
    }

    public static void s3fjYDxWOUexjjVgyA(CompoundButton compoundButton, ColorStateList colorStateList) {
        lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(compoundButton, colorStateList);
    }
}
