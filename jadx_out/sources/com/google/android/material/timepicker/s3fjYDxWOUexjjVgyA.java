package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* loaded from: classes.dex */
public class s3fjYDxWOUexjjVgyA implements InputFilter {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int f5496lEeR5KfoEr4xU5yHH7;

    public s3fjYDxWOUexjjVgyA(int i) {
        this.f5496lEeR5KfoEr4xU5yHH7 = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.f5496lEeR5KfoEr4xU5yHH7) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
