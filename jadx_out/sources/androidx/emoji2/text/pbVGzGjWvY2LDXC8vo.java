package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.KYHag8HRDlnO3X9zmZ;
import androidx.emoji2.text.hoXrIDAFrSwfShk8da;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class pbVGzGjWvY2LDXC8vo {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public KYHag8HRDlnO3X9zmZ.husNiw3snxdgZPAGJm f3374HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final int[] f3375husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final KYHag8HRDlnO3X9zmZ.Acstmh57AKoSEkEFNJ f3376lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final hoXrIDAFrSwfShk8da f3377s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final boolean f3378zZKhbgvUfsK4AEX3r0;

    public interface HJFh0TGMpafqLE9haL {
        Object lEeR5KfoEr4xU5yHH7();

        boolean s3fjYDxWOUexjjVgyA(CharSequence charSequence, int i, int i2, OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM);
    }

    public static final class husNiw3snxdgZPAGJm {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public hoXrIDAFrSwfShk8da.lEeR5KfoEr4xU5yHH7 f3379HJFh0TGMpafqLE9haL;

        /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
        public final int[] f3380IPyIQcaNa8aB7drBED;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public int f3381KYHag8HRDlnO3X9zmZ;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public final boolean f3382TCyPEKSzIyweCN5yp1;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public int f3383husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int f3384lEeR5KfoEr4xU5yHH7 = 1;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final hoXrIDAFrSwfShk8da.lEeR5KfoEr4xU5yHH7 f3385s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public hoXrIDAFrSwfShk8da.lEeR5KfoEr4xU5yHH7 f3386zZKhbgvUfsK4AEX3r0;

        public husNiw3snxdgZPAGJm(hoXrIDAFrSwfShk8da.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, boolean z, int[] iArr) {
            this.f3385s3fjYDxWOUexjjVgyA = leer5kfoer4xu5yhh7;
            this.f3379HJFh0TGMpafqLE9haL = leer5kfoer4xu5yhh7;
            this.f3382TCyPEKSzIyweCN5yp1 = z;
            this.f3380IPyIQcaNa8aB7drBED = iArr;
        }

        public static boolean KYHag8HRDlnO3X9zmZ(int i) {
            return i == 65038;
        }

        public static boolean zZKhbgvUfsK4AEX3r0(int i) {
            return i == 65039;
        }

        public OANkd3mP6AYvwbNLJM HJFh0TGMpafqLE9haL() {
            return this.f3386zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA();
        }

        public final boolean IPyIQcaNa8aB7drBED() {
            if (this.f3379HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA().Acstmh57AKoSEkEFNJ() || zZKhbgvUfsK4AEX3r0(this.f3383husNiw3snxdgZPAGJm)) {
                return true;
            }
            if (this.f3382TCyPEKSzIyweCN5yp1) {
                if (this.f3380IPyIQcaNa8aB7drBED == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f3380IPyIQcaNa8aB7drBED, this.f3379HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA().s3fjYDxWOUexjjVgyA(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        public final int TCyPEKSzIyweCN5yp1() {
            this.f3384lEeR5KfoEr4xU5yHH7 = 1;
            this.f3379HJFh0TGMpafqLE9haL = this.f3385s3fjYDxWOUexjjVgyA;
            this.f3381KYHag8HRDlnO3X9zmZ = 0;
            return 1;
        }

        public boolean husNiw3snxdgZPAGJm() {
            return this.f3384lEeR5KfoEr4xU5yHH7 == 2 && this.f3379HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA() != null && (this.f3381KYHag8HRDlnO3X9zmZ > 1 || IPyIQcaNa8aB7drBED());
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int lEeR5KfoEr4xU5yHH7(int r5) {
            /*
                r4 = this;
                androidx.emoji2.text.hoXrIDAFrSwfShk8da$lEeR5KfoEr4xU5yHH7 r0 = r4.f3379HJFh0TGMpafqLE9haL
                androidx.emoji2.text.hoXrIDAFrSwfShk8da$lEeR5KfoEr4xU5yHH7 r0 = r0.lEeR5KfoEr4xU5yHH7(r5)
                int r1 = r4.f3384lEeR5KfoEr4xU5yHH7
                r2 = 1
                r3 = 2
                if (r1 == r3) goto L1a
                if (r0 != 0) goto L13
            Le:
                int r3 = r4.TCyPEKSzIyweCN5yp1()
                goto L4c
            L13:
                r4.f3384lEeR5KfoEr4xU5yHH7 = r3
                r4.f3379HJFh0TGMpafqLE9haL = r0
                r4.f3381KYHag8HRDlnO3X9zmZ = r2
                goto L4c
            L1a:
                if (r0 == 0) goto L24
                r4.f3379HJFh0TGMpafqLE9haL = r0
                int r0 = r4.f3381KYHag8HRDlnO3X9zmZ
                int r0 = r0 + r2
                r4.f3381KYHag8HRDlnO3X9zmZ = r0
                goto L4c
            L24:
                boolean r0 = KYHag8HRDlnO3X9zmZ(r5)
                if (r0 == 0) goto L2b
                goto Le
            L2b:
                boolean r0 = zZKhbgvUfsK4AEX3r0(r5)
                if (r0 == 0) goto L32
                goto L4c
            L32:
                androidx.emoji2.text.hoXrIDAFrSwfShk8da$lEeR5KfoEr4xU5yHH7 r0 = r4.f3379HJFh0TGMpafqLE9haL
                androidx.emoji2.text.OANkd3mP6AYvwbNLJM r0 = r0.s3fjYDxWOUexjjVgyA()
                if (r0 == 0) goto Le
                int r0 = r4.f3381KYHag8HRDlnO3X9zmZ
                r3 = 3
                if (r0 != r2) goto L45
                boolean r0 = r4.IPyIQcaNa8aB7drBED()
                if (r0 == 0) goto Le
            L45:
                androidx.emoji2.text.hoXrIDAFrSwfShk8da$lEeR5KfoEr4xU5yHH7 r0 = r4.f3379HJFh0TGMpafqLE9haL
                r4.f3386zZKhbgvUfsK4AEX3r0 = r0
                r4.TCyPEKSzIyweCN5yp1()
            L4c:
                r4.f3383husNiw3snxdgZPAGJm = r5
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(int):int");
        }

        public OANkd3mP6AYvwbNLJM s3fjYDxWOUexjjVgyA() {
            return this.f3379HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA();
        }
    }

    public static final class lEeR5KfoEr4xU5yHH7 {
        public static int lEeR5KfoEr4xU5yHH7(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i2--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z = true;
                    }
                }
                return i;
            }
        }

        public static int s3fjYDxWOUexjjVgyA(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i2--;
                        i++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    public static class s3fjYDxWOUexjjVgyA implements HJFh0TGMpafqLE9haL {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public sTkWmhpZ5b1ArQIw4K f3387lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final KYHag8HRDlnO3X9zmZ.Acstmh57AKoSEkEFNJ f3388s3fjYDxWOUexjjVgyA;

        public s3fjYDxWOUexjjVgyA(sTkWmhpZ5b1ArQIw4K stkwmhpz5b1arqiw4k, KYHag8HRDlnO3X9zmZ.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ) {
            this.f3387lEeR5KfoEr4xU5yHH7 = stkwmhpz5b1arqiw4k;
            this.f3388s3fjYDxWOUexjjVgyA = acstmh57AKoSEkEFNJ;
        }

        @Override // androidx.emoji2.text.pbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL
        /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
        public sTkWmhpZ5b1ArQIw4K lEeR5KfoEr4xU5yHH7() {
            return this.f3387lEeR5KfoEr4xU5yHH7;
        }

        @Override // androidx.emoji2.text.pbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL
        public boolean s3fjYDxWOUexjjVgyA(CharSequence charSequence, int i, int i2, OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM) {
            if (oANkd3mP6AYvwbNLJM.Z9WdNiOsPR0y54zHW4()) {
                return true;
            }
            if (this.f3387lEeR5KfoEr4xU5yHH7 == null) {
                this.f3387lEeR5KfoEr4xU5yHH7 = new sTkWmhpZ5b1ArQIw4K(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f3387lEeR5KfoEr4xU5yHH7.setSpan(this.f3388s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(oANkd3mP6AYvwbNLJM), i, i2, 33);
            return true;
        }
    }

    public static class zZKhbgvUfsK4AEX3r0 implements HJFh0TGMpafqLE9haL {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final String f3389lEeR5KfoEr4xU5yHH7;

        public zZKhbgvUfsK4AEX3r0(String str) {
            this.f3389lEeR5KfoEr4xU5yHH7 = str;
        }

        @Override // androidx.emoji2.text.pbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL
        /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
        public zZKhbgvUfsK4AEX3r0 lEeR5KfoEr4xU5yHH7() {
            return this;
        }

        @Override // androidx.emoji2.text.pbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL
        public boolean s3fjYDxWOUexjjVgyA(CharSequence charSequence, int i, int i2, OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM) {
            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f3389lEeR5KfoEr4xU5yHH7)) {
                return true;
            }
            oANkd3mP6AYvwbNLJM.e54J8UWNHWALQNixXM(true);
            return false;
        }
    }

    public pbVGzGjWvY2LDXC8vo(hoXrIDAFrSwfShk8da hoxridafrswfshk8da, KYHag8HRDlnO3X9zmZ.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ, KYHag8HRDlnO3X9zmZ.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, boolean z, int[] iArr, Set set) {
        this.f3376lEeR5KfoEr4xU5yHH7 = acstmh57AKoSEkEFNJ;
        this.f3377s3fjYDxWOUexjjVgyA = hoxridafrswfshk8da;
        this.f3374HJFh0TGMpafqLE9haL = husniw3snxdgzpagjm;
        this.f3378zZKhbgvUfsK4AEX3r0 = z;
        this.f3375husNiw3snxdgZPAGJm = iArr;
        TCyPEKSzIyweCN5yp1(set);
    }

    public static boolean HJFh0TGMpafqLE9haL(Editable editable, int i, KeyEvent keyEvent) {
        if (!(i != 67 ? i != 112 ? false : lEeR5KfoEr4xU5yHH7(editable, keyEvent, true) : lEeR5KfoEr4xU5yHH7(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public static boolean KYHag8HRDlnO3X9zmZ(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public static boolean husNiw3snxdgZPAGJm(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    public static boolean lEeR5KfoEr4xU5yHH7(Editable editable, KeyEvent keyEvent, boolean z) {
        Acstmh57AKoSEkEFNJ[] acstmh57AKoSEkEFNJArr;
        if (KYHag8HRDlnO3X9zmZ(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!husNiw3snxdgZPAGJm(selectionStart, selectionEnd) && (acstmh57AKoSEkEFNJArr = (Acstmh57AKoSEkEFNJ[]) editable.getSpans(selectionStart, selectionEnd, Acstmh57AKoSEkEFNJ.class)) != null && acstmh57AKoSEkEFNJArr.length > 0) {
            for (Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ : acstmh57AKoSEkEFNJArr) {
                int spanStart = editable.getSpanStart(acstmh57AKoSEkEFNJ);
                int spanEnd = editable.getSpanEnd(acstmh57AKoSEkEFNJ);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean s3fjYDxWOUexjjVgyA(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (husNiw3snxdgZPAGJm(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                iMax = lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(editable, selectionStart, Math.max(i, 0));
                iMin = lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(editable, selectionEnd, Math.max(i2, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i, 0);
                iMin = Math.min(selectionEnd + i2, editable.length());
            }
            Acstmh57AKoSEkEFNJ[] acstmh57AKoSEkEFNJArr = (Acstmh57AKoSEkEFNJ[]) editable.getSpans(iMax, iMin, Acstmh57AKoSEkEFNJ.class);
            if (acstmh57AKoSEkEFNJArr != null && acstmh57AKoSEkEFNJArr.length > 0) {
                for (Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ : acstmh57AKoSEkEFNJArr) {
                    int spanStart = editable.getSpanStart(acstmh57AKoSEkEFNJ);
                    int spanEnd = editable.getSpanEnd(acstmh57AKoSEkEFNJ);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public CharSequence IPyIQcaNa8aB7drBED(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        sTkWmhpZ5b1ArQIw4K stkwmhpz5b1arqiw4k;
        Acstmh57AKoSEkEFNJ[] acstmh57AKoSEkEFNJArr;
        boolean z2 = charSequence instanceof aPyGSIylzVNKPT1Bls;
        if (z2) {
            ((aPyGSIylzVNKPT1Bls) charSequence).lEeR5KfoEr4xU5yHH7();
        }
        if (!z2) {
            try {
                stkwmhpz5b1arqiw4k = charSequence instanceof Spannable ? new sTkWmhpZ5b1ArQIw4K((Spannable) charSequence) : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i + (-1), i2 + 1, Acstmh57AKoSEkEFNJ.class) > i2) ? null : new sTkWmhpZ5b1ArQIw4K(charSequence);
            } finally {
                if (z2) {
                    ((aPyGSIylzVNKPT1Bls) charSequence).zZKhbgvUfsK4AEX3r0();
                }
            }
        }
        if (stkwmhpz5b1arqiw4k != null && (acstmh57AKoSEkEFNJArr = (Acstmh57AKoSEkEFNJ[]) stkwmhpz5b1arqiw4k.getSpans(i, i2, Acstmh57AKoSEkEFNJ.class)) != null && acstmh57AKoSEkEFNJArr.length > 0) {
            for (Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ : acstmh57AKoSEkEFNJArr) {
                int spanStart = stkwmhpz5b1arqiw4k.getSpanStart(acstmh57AKoSEkEFNJ);
                int spanEnd = stkwmhpz5b1arqiw4k.getSpanEnd(acstmh57AKoSEkEFNJ);
                if (spanStart != i2) {
                    stkwmhpz5b1arqiw4k.removeSpan(acstmh57AKoSEkEFNJ);
                }
                i = Math.min(spanStart, i);
                i2 = Math.max(spanEnd, i2);
            }
        }
        int i4 = i2;
        if (i != i4 && i < charSequence.length()) {
            if (i3 != Integer.MAX_VALUE && stkwmhpz5b1arqiw4k != null) {
                i3 -= ((Acstmh57AKoSEkEFNJ[]) stkwmhpz5b1arqiw4k.getSpans(0, stkwmhpz5b1arqiw4k.length(), Acstmh57AKoSEkEFNJ.class)).length;
            }
            sTkWmhpZ5b1ArQIw4K stkwmhpz5b1arqiw4k2 = (sTkWmhpZ5b1ArQIw4K) pbVGzGjWvY2LDXC8vo(charSequence, i, i4, i3, z, new s3fjYDxWOUexjjVgyA(stkwmhpz5b1arqiw4k, this.f3376lEeR5KfoEr4xU5yHH7));
            if (stkwmhpz5b1arqiw4k2 == null) {
                if (z2) {
                    ((aPyGSIylzVNKPT1Bls) charSequence).zZKhbgvUfsK4AEX3r0();
                }
                return charSequence;
            }
            Spannable spannableS3fjYDxWOUexjjVgyA = stkwmhpz5b1arqiw4k2.s3fjYDxWOUexjjVgyA();
            if (z2) {
                ((aPyGSIylzVNKPT1Bls) charSequence).zZKhbgvUfsK4AEX3r0();
            }
            return spannableS3fjYDxWOUexjjVgyA;
        }
        return charSequence;
    }

    public final void TCyPEKSzIyweCN5yp1(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            pbVGzGjWvY2LDXC8vo(str, 0, str.length(), 1, true, new zZKhbgvUfsK4AEX3r0(str));
        }
    }

    public final Object pbVGzGjWvY2LDXC8vo(CharSequence charSequence, int i, int i2, int i3, boolean z, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        int iCharCount;
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = new husNiw3snxdgZPAGJm(this.f3377s3fjYDxWOUexjjVgyA.KYHag8HRDlnO3X9zmZ(), this.f3378zZKhbgvUfsK4AEX3r0, this.f3375husNiw3snxdgZPAGJm);
        int i4 = 0;
        boolean zS3fjYDxWOUexjjVgyA = true;
        int iCodePointAt = Character.codePointAt(charSequence, i);
        loop0: while (true) {
            iCharCount = i;
            while (i < i2 && i4 < i3 && zS3fjYDxWOUexjjVgyA) {
                int iLEeR5KfoEr4xU5yHH7 = husniw3snxdgzpagjm.lEeR5KfoEr4xU5yHH7(iCodePointAt);
                if (iLEeR5KfoEr4xU5yHH7 == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i = iCharCount;
                } else if (iLEeR5KfoEr4xU5yHH7 == 2) {
                    i += Character.charCount(iCodePointAt);
                    if (i < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, i);
                    }
                } else if (iLEeR5KfoEr4xU5yHH7 == 3) {
                    if (z || !zZKhbgvUfsK4AEX3r0(charSequence, iCharCount, i, husniw3snxdgzpagjm.HJFh0TGMpafqLE9haL())) {
                        zS3fjYDxWOUexjjVgyA = hJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(charSequence, iCharCount, i, husniw3snxdgzpagjm.HJFh0TGMpafqLE9haL());
                        i4++;
                    }
                }
            }
            break loop0;
        }
        if (husniw3snxdgzpagjm.husNiw3snxdgZPAGJm() && i4 < i3 && zS3fjYDxWOUexjjVgyA && (z || !zZKhbgvUfsK4AEX3r0(charSequence, iCharCount, i, husniw3snxdgzpagjm.s3fjYDxWOUexjjVgyA()))) {
            hJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(charSequence, iCharCount, i, husniw3snxdgzpagjm.s3fjYDxWOUexjjVgyA());
        }
        return hJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7();
    }

    public final boolean zZKhbgvUfsK4AEX3r0(CharSequence charSequence, int i, int i2, OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM) {
        if (oANkd3mP6AYvwbNLJM.zZKhbgvUfsK4AEX3r0() == 0) {
            oANkd3mP6AYvwbNLJM.T9PhQIpGRhE4yZDm1C(this.f3374HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(charSequence, i, i2, oANkd3mP6AYvwbNLJM.IPyIQcaNa8aB7drBED()));
        }
        return oANkd3mP6AYvwbNLJM.zZKhbgvUfsK4AEX3r0() == 2;
    }
}
