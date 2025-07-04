package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public class sTkWmhpZ5b1ArQIw4K implements Spannable {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public boolean f3390HJFh0TGMpafqLE9haL = false;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public Spannable f3391zZKhbgvUfsK4AEX3r0;

    public static class HJFh0TGMpafqLE9haL extends s3fjYDxWOUexjjVgyA {
        @Override // androidx.emoji2.text.sTkWmhpZ5b1ArQIw4K.s3fjYDxWOUexjjVgyA
        public boolean lEeR5KfoEr4xU5yHH7(CharSequence charSequence) {
            return Y43RdunnpKgpbny0lE.lEeR5KfoEr4xU5yHH7(charSequence);
        }
    }

    public static class lEeR5KfoEr4xU5yHH7 {
        public static IntStream lEeR5KfoEr4xU5yHH7(CharSequence charSequence) {
            return charSequence.chars();
        }

        public static IntStream s3fjYDxWOUexjjVgyA(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public boolean lEeR5KfoEr4xU5yHH7(CharSequence charSequence) {
            return false;
        }
    }

    public sTkWmhpZ5b1ArQIw4K(Spannable spannable) {
        this.f3391zZKhbgvUfsK4AEX3r0 = spannable;
    }

    public static s3fjYDxWOUexjjVgyA HJFh0TGMpafqLE9haL() {
        return Build.VERSION.SDK_INT < 28 ? new s3fjYDxWOUexjjVgyA() : new HJFh0TGMpafqLE9haL();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f3391zZKhbgvUfsK4AEX3r0.charAt(i);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(this.f3391zZKhbgvUfsK4AEX3r0);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(this.f3391zZKhbgvUfsK4AEX3r0);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f3391zZKhbgvUfsK4AEX3r0.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f3391zZKhbgvUfsK4AEX3r0.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f3391zZKhbgvUfsK4AEX3r0.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i, int i2, Class cls) {
        return this.f3391zZKhbgvUfsK4AEX3r0.getSpans(i, i2, cls);
    }

    public final void lEeR5KfoEr4xU5yHH7() {
        Spannable spannable = this.f3391zZKhbgvUfsK4AEX3r0;
        if (!this.f3390HJFh0TGMpafqLE9haL && HJFh0TGMpafqLE9haL().lEeR5KfoEr4xU5yHH7(spannable)) {
            this.f3391zZKhbgvUfsK4AEX3r0 = new SpannableString(spannable);
        }
        this.f3390HJFh0TGMpafqLE9haL = true;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f3391zZKhbgvUfsK4AEX3r0.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f3391zZKhbgvUfsK4AEX3r0.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        lEeR5KfoEr4xU5yHH7();
        this.f3391zZKhbgvUfsK4AEX3r0.removeSpan(obj);
    }

    public Spannable s3fjYDxWOUexjjVgyA() {
        return this.f3391zZKhbgvUfsK4AEX3r0;
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        lEeR5KfoEr4xU5yHH7();
        this.f3391zZKhbgvUfsK4AEX3r0.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f3391zZKhbgvUfsK4AEX3r0.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f3391zZKhbgvUfsK4AEX3r0.toString();
    }

    public sTkWmhpZ5b1ArQIw4K(CharSequence charSequence) {
        this.f3391zZKhbgvUfsK4AEX3r0 = new SpannableString(charSequence);
    }
}
