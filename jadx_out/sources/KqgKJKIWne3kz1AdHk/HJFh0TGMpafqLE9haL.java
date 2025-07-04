package KqgKJKIWne3kz1AdHk;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1;

/* loaded from: classes.dex */
public abstract class HJFh0TGMpafqLE9haL {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final String[] f897lEeR5KfoEr4xU5yHH7 = new String[0];

    public static class lEeR5KfoEr4xU5yHH7 {
        public static void lEeR5KfoEr4xU5yHH7(EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    public static boolean HJFh0TGMpafqLE9haL(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    public static void IPyIQcaNa8aB7drBED(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        int i3 = i2 - i;
        int i4 = i3 > 1024 ? 0 : i3;
        int i5 = 2048 - i4;
        int iMin = Math.min(charSequence.length() - i2, i5 - Math.min(i, (int) (i5 * 0.8d)));
        int iMin2 = Math.min(i, i5 - iMin);
        int i6 = i - iMin2;
        if (s3fjYDxWOUexjjVgyA(charSequence, i6, 0)) {
            i6++;
            iMin2--;
        }
        if (s3fjYDxWOUexjjVgyA(charSequence, (i2 + iMin) - 1, 1)) {
            iMin--;
        }
        TCyPEKSzIyweCN5yp1(editorInfo, i4 != i3 ? TextUtils.concat(charSequence.subSequence(i6, i6 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i6, iMin2 + i4 + iMin + i6), iMin2, i4 + iMin2);
    }

    public static void KYHag8HRDlnO3X9zmZ(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(editorInfo, charSequence, 0);
        } else {
            husNiw3snxdgZPAGJm(editorInfo, charSequence, 0);
        }
    }

    public static void TCyPEKSzIyweCN5yp1(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static void husNiw3snxdgZPAGJm(EditorInfo editorInfo, CharSequence charSequence, int i) {
        TCyPEKSzIyweCN5yp1.TCyPEKSzIyweCN5yp1(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(editorInfo, charSequence, i);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 - i : i2 - i;
        int i5 = i2 > i3 ? i2 - i : i3 - i;
        int length = charSequence.length();
        if (i < 0 || i4 < 0 || i5 > length) {
            TCyPEKSzIyweCN5yp1(editorInfo, null, 0, 0);
            return;
        }
        if (HJFh0TGMpafqLE9haL(editorInfo.inputType)) {
            TCyPEKSzIyweCN5yp1(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            TCyPEKSzIyweCN5yp1(editorInfo, charSequence, i4, i5);
        } else {
            IPyIQcaNa8aB7drBED(editorInfo, charSequence, i4, i5);
        }
    }

    public static String[] lEeR5KfoEr4xU5yHH7(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f897lEeR5KfoEr4xU5yHH7;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f897lEeR5KfoEr4xU5yHH7;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f897lEeR5KfoEr4xU5yHH7;
    }

    public static boolean s3fjYDxWOUexjjVgyA(CharSequence charSequence, int i, int i2) {
        if (i2 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i));
        }
        if (i2 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i));
    }

    public static void zZKhbgvUfsK4AEX3r0(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }
}
