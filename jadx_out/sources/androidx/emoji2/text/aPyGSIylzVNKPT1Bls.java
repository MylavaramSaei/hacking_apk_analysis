package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class aPyGSIylzVNKPT1Bls extends SpannableStringBuilder {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final Class f3360HJFh0TGMpafqLE9haL;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final List f3361zZKhbgvUfsK4AEX3r0;

    public static class lEeR5KfoEr4xU5yHH7 implements TextWatcher, SpanWatcher {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Object f3362lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final AtomicInteger f3363s3fjYDxWOUexjjVgyA = new AtomicInteger(0);

        public lEeR5KfoEr4xU5yHH7(Object obj) {
            this.f3362lEeR5KfoEr4xU5yHH7 = obj;
        }

        public final void HJFh0TGMpafqLE9haL() {
            this.f3363s3fjYDxWOUexjjVgyA.decrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f3362lEeR5KfoEr4xU5yHH7).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f3362lEeR5KfoEr4xU5yHH7).beforeTextChanged(charSequence, i, i2, i3);
        }

        public final void lEeR5KfoEr4xU5yHH7() {
            this.f3363s3fjYDxWOUexjjVgyA.incrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f3363s3fjYDxWOUexjjVgyA.get() <= 0 || !s3fjYDxWOUexjjVgyA(obj)) {
                ((SpanWatcher) this.f3362lEeR5KfoEr4xU5yHH7).onSpanAdded(spannable, obj, i, i2);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[PHI: r11
          0x001e: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0013, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onSpanChanged(android.text.Spannable r9, java.lang.Object r10, int r11, int r12, int r13, int r14) {
            /*
                r8 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r8.f3363s3fjYDxWOUexjjVgyA
                int r0 = r0.get()
                if (r0 <= 0) goto Lf
                boolean r0 = r8.s3fjYDxWOUexjjVgyA(r10)
                if (r0 == 0) goto Lf
                return
            Lf:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 >= r1) goto L1e
                r0 = 0
                if (r11 <= r12) goto L19
                r11 = r0
            L19:
                if (r13 <= r14) goto L1e
                r4 = r11
                r6 = r0
                goto L20
            L1e:
                r4 = r11
                r6 = r13
            L20:
                java.lang.Object r11 = r8.f3362lEeR5KfoEr4xU5yHH7
                r1 = r11
                android.text.SpanWatcher r1 = (android.text.SpanWatcher) r1
                r2 = r9
                r3 = r10
                r5 = r12
                r7 = r14
                r1.onSpanChanged(r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.aPyGSIylzVNKPT1Bls.lEeR5KfoEr4xU5yHH7.onSpanChanged(android.text.Spannable, java.lang.Object, int, int, int, int):void");
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f3363s3fjYDxWOUexjjVgyA.get() <= 0 || !s3fjYDxWOUexjjVgyA(obj)) {
                ((SpanWatcher) this.f3362lEeR5KfoEr4xU5yHH7).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f3362lEeR5KfoEr4xU5yHH7).onTextChanged(charSequence, i, i2, i3);
        }

        public final boolean s3fjYDxWOUexjjVgyA(Object obj) {
            return obj instanceof Acstmh57AKoSEkEFNJ;
        }
    }

    public aPyGSIylzVNKPT1Bls(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f3361zZKhbgvUfsK4AEX3r0 = new ArrayList();
        tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.IPyIQcaNa8aB7drBED(cls, "watcherClass cannot be null");
        this.f3360HJFh0TGMpafqLE9haL = cls;
    }

    public static aPyGSIylzVNKPT1Bls HJFh0TGMpafqLE9haL(Class cls, CharSequence charSequence) {
        return new aPyGSIylzVNKPT1Bls(cls, charSequence);
    }

    public final boolean IPyIQcaNa8aB7drBED(Object obj) {
        return obj != null && TCyPEKSzIyweCN5yp1(obj.getClass());
    }

    public final lEeR5KfoEr4xU5yHH7 KYHag8HRDlnO3X9zmZ(Object obj) {
        for (int i = 0; i < this.f3361zZKhbgvUfsK4AEX3r0.size(); i++) {
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (lEeR5KfoEr4xU5yHH7) this.f3361zZKhbgvUfsK4AEX3r0.get(i);
            if (leer5kfoer4xu5yhh7.f3362lEeR5KfoEr4xU5yHH7 == obj) {
                return leer5kfoer4xu5yhh7;
            }
        }
        return null;
    }

    public final boolean TCyPEKSzIyweCN5yp1(Class cls) {
        return this.f3360HJFh0TGMpafqLE9haL == cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ;
        if (IPyIQcaNa8aB7drBED(obj) && (leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(obj)) != null) {
            obj = leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ;
        if (IPyIQcaNa8aB7drBED(obj) && (leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(obj)) != null) {
            obj = leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ;
        if (IPyIQcaNa8aB7drBED(obj) && (leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(obj)) != null) {
            obj = leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public Object[] getSpans(int i, int i2, Class cls) {
        if (!TCyPEKSzIyweCN5yp1(cls)) {
            return super.getSpans(i, i2, cls);
        }
        lEeR5KfoEr4xU5yHH7[] leer5kfoer4xu5yhh7Arr = (lEeR5KfoEr4xU5yHH7[]) super.getSpans(i, i2, lEeR5KfoEr4xU5yHH7.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, leer5kfoer4xu5yhh7Arr.length);
        for (int i3 = 0; i3 < leer5kfoer4xu5yhh7Arr.length; i3++) {
            objArr[i3] = leer5kfoer4xu5yhh7Arr[i3].f3362lEeR5KfoEr4xU5yHH7;
        }
        return objArr;
    }

    public final void husNiw3snxdgZPAGJm() {
        for (int i = 0; i < this.f3361zZKhbgvUfsK4AEX3r0.size(); i++) {
            ((lEeR5KfoEr4xU5yHH7) this.f3361zZKhbgvUfsK4AEX3r0.get(i)).onTextChanged(this, 0, length(), length());
        }
    }

    public void lEeR5KfoEr4xU5yHH7() {
        s3fjYDxWOUexjjVgyA();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || TCyPEKSzIyweCN5yp1(cls)) {
            cls = lEeR5KfoEr4xU5yHH7.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public final void pbVGzGjWvY2LDXC8vo() {
        for (int i = 0; i < this.f3361zZKhbgvUfsK4AEX3r0.size(); i++) {
            ((lEeR5KfoEr4xU5yHH7) this.f3361zZKhbgvUfsK4AEX3r0.get(i)).HJFh0TGMpafqLE9haL();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ;
        if (IPyIQcaNa8aB7drBED(obj)) {
            leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(obj);
            if (leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ != null) {
                obj = leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ;
            }
        } else {
            leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ = null;
        }
        super.removeSpan(obj);
        if (leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ != null) {
            this.f3361zZKhbgvUfsK4AEX3r0.remove(leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ);
        }
    }

    public final void s3fjYDxWOUexjjVgyA() {
        for (int i = 0; i < this.f3361zZKhbgvUfsK4AEX3r0.size(); i++) {
            ((lEeR5KfoEr4xU5yHH7) this.f3361zZKhbgvUfsK4AEX3r0.get(i)).lEeR5KfoEr4xU5yHH7();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (IPyIQcaNa8aB7drBED(obj)) {
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new lEeR5KfoEr4xU5yHH7(obj);
            this.f3361zZKhbgvUfsK4AEX3r0.add(leer5kfoer4xu5yhh7);
            obj = leer5kfoer4xu5yhh7;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return new aPyGSIylzVNKPT1Bls(this.f3360HJFh0TGMpafqLE9haL, this, i, i2);
    }

    public void zZKhbgvUfsK4AEX3r0() {
        pbVGzGjWvY2LDXC8vo();
        husNiw3snxdgZPAGJm();
    }

    public aPyGSIylzVNKPT1Bls(Class cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.f3361zZKhbgvUfsK4AEX3r0 = new ArrayList();
        tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.IPyIQcaNa8aB7drBED(cls, "watcherClass cannot be null");
        this.f3360HJFh0TGMpafqLE9haL = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        s3fjYDxWOUexjjVgyA();
        super.replace(i, i2, charSequence);
        pbVGzGjWvY2LDXC8vo();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        s3fjYDxWOUexjjVgyA();
        super.replace(i, i2, charSequence, i3, i4);
        pbVGzGjWvY2LDXC8vo();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
