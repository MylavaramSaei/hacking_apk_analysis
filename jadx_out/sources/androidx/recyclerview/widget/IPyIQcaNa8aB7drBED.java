package androidx.recyclerview.widget;

import androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7;
import java.util.List;

/* loaded from: classes.dex */
public class IPyIQcaNa8aB7drBED {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final lEeR5KfoEr4xU5yHH7 f3960lEeR5KfoEr4xU5yHH7;

    public interface lEeR5KfoEr4xU5yHH7 {
        void lEeR5KfoEr4xU5yHH7(lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya);

        lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA s3fjYDxWOUexjjVgyA(int i, int i2, int i3, Object obj);
    }

    public IPyIQcaNa8aB7drBED(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this.f3960lEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7;
    }

    public final void HJFh0TGMpafqLE9haL(List list, int i, lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, int i2, lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2) {
        int i3 = s3fjydxwouexjjvgya.f4324zZKhbgvUfsK4AEX3r0;
        int i4 = s3fjydxwouexjjvgya2.f4323s3fjYDxWOUexjjVgyA;
        int i5 = i3 < i4 ? -1 : 0;
        int i6 = s3fjydxwouexjjvgya.f4323s3fjYDxWOUexjjVgyA;
        if (i6 < i4) {
            i5++;
        }
        if (i4 <= i6) {
            s3fjydxwouexjjvgya.f4323s3fjYDxWOUexjjVgyA = i6 + s3fjydxwouexjjvgya2.f4324zZKhbgvUfsK4AEX3r0;
        }
        int i7 = s3fjydxwouexjjvgya2.f4323s3fjYDxWOUexjjVgyA;
        if (i7 <= i3) {
            s3fjydxwouexjjvgya.f4324zZKhbgvUfsK4AEX3r0 = i3 + s3fjydxwouexjjvgya2.f4324zZKhbgvUfsK4AEX3r0;
        }
        s3fjydxwouexjjvgya2.f4323s3fjYDxWOUexjjVgyA = i7 + i5;
        list.set(i, s3fjydxwouexjjvgya2);
        list.set(i2, s3fjydxwouexjjvgya);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void KYHag8HRDlnO3X9zmZ(java.util.List r9, int r10, androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA r11, int r12, androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA r13) {
        /*
            r8 = this;
            int r0 = r11.f4324zZKhbgvUfsK4AEX3r0
            int r1 = r13.f4323s3fjYDxWOUexjjVgyA
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.f4323s3fjYDxWOUexjjVgyA = r1
            goto L20
        Ld:
            int r5 = r13.f4324zZKhbgvUfsK4AEX3r0
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.f4324zZKhbgvUfsK4AEX3r0 = r5
            androidx.recyclerview.widget.IPyIQcaNa8aB7drBED$lEeR5KfoEr4xU5yHH7 r0 = r8.f3960lEeR5KfoEr4xU5yHH7
            int r1 = r11.f4323s3fjYDxWOUexjjVgyA
            java.lang.Object r5 = r13.f4321HJFh0TGMpafqLE9haL
            androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7$s3fjYDxWOUexjjVgyA r0 = r0.s3fjYDxWOUexjjVgyA(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.f4323s3fjYDxWOUexjjVgyA
            int r5 = r13.f4323s3fjYDxWOUexjjVgyA
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.f4323s3fjYDxWOUexjjVgyA = r5
            goto L41
        L2b:
            int r6 = r13.f4324zZKhbgvUfsK4AEX3r0
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.IPyIQcaNa8aB7drBED$lEeR5KfoEr4xU5yHH7 r4 = r8.f3960lEeR5KfoEr4xU5yHH7
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f4321HJFh0TGMpafqLE9haL
            androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7$s3fjYDxWOUexjjVgyA r4 = r4.s3fjYDxWOUexjjVgyA(r2, r1, r5, r3)
            int r1 = r13.f4324zZKhbgvUfsK4AEX3r0
            int r1 = r1 - r5
            r13.f4324zZKhbgvUfsK4AEX3r0 = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f4324zZKhbgvUfsK4AEX3r0
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.IPyIQcaNa8aB7drBED$lEeR5KfoEr4xU5yHH7 r11 = r8.f3960lEeR5KfoEr4xU5yHH7
            r11.lEeR5KfoEr4xU5yHH7(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.IPyIQcaNa8aB7drBED.KYHag8HRDlnO3X9zmZ(java.util.List, int, androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7$s3fjYDxWOUexjjVgyA, int, androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7$s3fjYDxWOUexjjVgyA):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0 A[PHI: r0
      0x00a0: PHI (r0v13 int) = (r0v6 int), (r0v16 int) binds: [B:58:0x00cd, B:45:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void husNiw3snxdgZPAGJm(java.util.List r10, int r11, androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA r12, int r13, androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA r14) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.IPyIQcaNa8aB7drBED.husNiw3snxdgZPAGJm(java.util.List, int, androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7$s3fjYDxWOUexjjVgyA, int, androidx.recyclerview.widget.lEeR5KfoEr4xU5yHH7$s3fjYDxWOUexjjVgyA):void");
    }

    public final int lEeR5KfoEr4xU5yHH7(List list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA) list.get(size)).f4322lEeR5KfoEr4xU5yHH7 != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    public void s3fjYDxWOUexjjVgyA(List list) {
        while (true) {
            int iLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(list);
            if (iLEeR5KfoEr4xU5yHH7 == -1) {
                return;
            } else {
                zZKhbgvUfsK4AEX3r0(list, iLEeR5KfoEr4xU5yHH7, iLEeR5KfoEr4xU5yHH7 + 1);
            }
        }
    }

    public final void zZKhbgvUfsK4AEX3r0(List list, int i, int i2) {
        lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA) list.get(i);
        lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2 = (lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA) list.get(i2);
        int i3 = s3fjydxwouexjjvgya2.f4322lEeR5KfoEr4xU5yHH7;
        if (i3 == 1) {
            HJFh0TGMpafqLE9haL(list, i, s3fjydxwouexjjvgya, i2, s3fjydxwouexjjvgya2);
        } else if (i3 == 2) {
            husNiw3snxdgZPAGJm(list, i, s3fjydxwouexjjvgya, i2, s3fjydxwouexjjvgya2);
        } else {
            if (i3 != 4) {
                return;
            }
            KYHag8HRDlnO3X9zmZ(list, i, s3fjydxwouexjjvgya, i2, s3fjydxwouexjjvgya2);
        }
    }
}
