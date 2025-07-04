package auvQiDfBN48eRz3fFq;

import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class R9SAhYMerGybF9OAjL {
    public static void Acstmh57AKoSEkEFNJ(CheckableImageButton checkableImageButton, ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }

    public static int[] HJFh0TGMpafqLE9haL(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    public static void IPyIQcaNa8aB7drBED(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        KYHag8HRDlnO3X9zmZ(checkableImageButton, onLongClickListener);
    }

    public static void KYHag8HRDlnO3X9zmZ(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zDfpieXfdYs58yZAiXY = lLKzvdU99Iw80uVD5I.DfpieXfdYs58yZAiXY(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zDfpieXfdYs58yZAiXY || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zDfpieXfdYs58yZAiXY);
        checkableImageButton.setPressable(zDfpieXfdYs58yZAiXY);
        checkableImageButton.setLongClickable(z);
        lLKzvdU99Iw80uVD5I.O1furmptfI76BGfN0d(checkableImageButton, z2 ? 1 : 2);
    }

    public static void TCyPEKSzIyweCN5yp1(CheckableImageButton checkableImageButton, int i) {
        checkableImageButton.setMinimumWidth(i);
        checkableImageButton.setMinimumHeight(i);
    }

    public static void lEeR5KfoEr4xU5yHH7(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(drawable, colorStateList);
            } else {
                WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(drawable, ColorStateList.valueOf(colorStateList.getColorForState(HJFh0TGMpafqLE9haL(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void pbVGzGjWvY2LDXC8vo(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        KYHag8HRDlnO3X9zmZ(checkableImageButton, onLongClickListener);
    }

    public static ImageView.ScaleType s3fjYDxWOUexjjVgyA(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static void zZKhbgvUfsK4AEX3r0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(HJFh0TGMpafqLE9haL(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(drawable).mutate();
        WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void husNiw3snxdgZPAGJm(CheckableImageButton checkableImageButton) {
    }
}
