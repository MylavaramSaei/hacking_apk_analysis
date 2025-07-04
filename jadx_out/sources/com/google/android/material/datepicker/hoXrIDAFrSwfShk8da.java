package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class hoXrIDAFrSwfShk8da extends BaseAdapter {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public HJFh0TGMpafqLE9haL f5166HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final T9PhQIpGRhE4yZDm1C f5167lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public Collection f5168s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final lEeR5KfoEr4xU5yHH7 f5169zZKhbgvUfsK4AEX3r0;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final int f5165husNiw3snxdgZPAGJm = R9SAhYMerGybF9OAjL.pbVGzGjWvY2LDXC8vo().getMaximum(4);

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public static final int f5164KYHag8HRDlnO3X9zmZ = (R9SAhYMerGybF9OAjL.pbVGzGjWvY2LDXC8vo().getMaximum(5) + R9SAhYMerGybF9OAjL.pbVGzGjWvY2LDXC8vo().getMaximum(7)) - 1;

    public hoXrIDAFrSwfShk8da(T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1) {
        this.f5167lEeR5KfoEr4xU5yHH7 = t9PhQIpGRhE4yZDm1C;
        this.f5169zZKhbgvUfsK4AEX3r0 = leer5kfoer4xu5yhh7;
        this.f5168s3fjYDxWOUexjjVgyA = zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA();
    }

    public final boolean Acstmh57AKoSEkEFNJ(long j) {
        return R9SAhYMerGybF9OAjL.TCyPEKSzIyweCN5yp1().getTimeInMillis() == j;
    }

    public final String HJFh0TGMpafqLE9haL(Context context, long j) {
        return husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(context, j, Acstmh57AKoSEkEFNJ(j), pbVGzGjWvY2LDXC8vo(j), TCyPEKSzIyweCN5yp1(j));
    }

    public final boolean IPyIQcaNa8aB7drBED(long j) {
        throw null;
    }

    public final void KYHag8HRDlnO3X9zmZ(Context context) {
        if (this.f5166HJFh0TGMpafqLE9haL == null) {
            this.f5166HJFh0TGMpafqLE9haL = new HJFh0TGMpafqLE9haL(context);
        }
    }

    public boolean OANkd3mP6AYvwbNLJM(int i) {
        return i >= s3fjYDxWOUexjjVgyA() && i <= Z9WdNiOsPR0y54zHW4();
    }

    public final void T9PhQIpGRhE4yZDm1C(TextView textView, long j, int i) {
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya;
        if (textView == null) {
            return;
        }
        textView.setContentDescription(HJFh0TGMpafqLE9haL(textView.getContext(), j));
        if (this.f5169zZKhbgvUfsK4AEX3r0.IPyIQcaNa8aB7drBED().lEeR5KfoEr4xU5yHH7(j)) {
            textView.setEnabled(true);
            boolean zIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(j);
            textView.setSelected(zIPyIQcaNa8aB7drBED);
            s3fjydxwouexjjvgya = zIPyIQcaNa8aB7drBED ? this.f5166HJFh0TGMpafqLE9haL.f5097s3fjYDxWOUexjjVgyA : Acstmh57AKoSEkEFNJ(j) ? this.f5166HJFh0TGMpafqLE9haL.f5091HJFh0TGMpafqLE9haL : this.f5166HJFh0TGMpafqLE9haL.f5096lEeR5KfoEr4xU5yHH7;
        } else {
            textView.setEnabled(false);
            s3fjydxwouexjjvgya = this.f5166HJFh0TGMpafqLE9haL.f5094TCyPEKSzIyweCN5yp1;
        }
        s3fjydxwouexjjvgya.s3fjYDxWOUexjjVgyA(textView);
    }

    public boolean TCyPEKSzIyweCN5yp1(long j) {
        throw null;
    }

    public int Z9WdNiOsPR0y54zHW4() {
        return (s3fjYDxWOUexjjVgyA() + this.f5167lEeR5KfoEr4xU5yHH7.f5111husNiw3snxdgZPAGJm) - 1;
    }

    public void aPyGSIylzVNKPT1Bls(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f5168s3fjYDxWOUexjjVgyA.iterator();
        while (it.hasNext()) {
            hoXrIDAFrSwfShk8da(materialCalendarGridView, ((Long) it.next()).longValue());
        }
    }

    public int e54J8UWNHWALQNixXM(int i) {
        return (i - s3fjYDxWOUexjjVgyA()) + 1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f5164KYHag8HRDlnO3X9zmZ;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f5167lEeR5KfoEr4xU5yHH7.f5114zZKhbgvUfsK4AEX3r0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public final void hoXrIDAFrSwfShk8da(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (T9PhQIpGRhE4yZDm1C.husNiw3snxdgZPAGJm(j).equals(this.f5167lEeR5KfoEr4xU5yHH7)) {
            int iPbVGzGjWvY2LDXC8vo = this.f5167lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(j);
            T9PhQIpGRhE4yZDm1C((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().lEeR5KfoEr4xU5yHH7(iPbVGzGjWvY2LDXC8vo) - materialCalendarGridView.getFirstVisiblePosition()), j, iPbVGzGjWvY2LDXC8vo);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    @Override // android.widget.Adapter
    /* renamed from: husNiw3snxdgZPAGJm, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.KYHag8HRDlnO3X9zmZ(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = tmIBXGVvBsrJ7i63G2.TCyPEKSzIyweCN5yp1.f7070Acstmh57AKoSEkEFNJ
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.s3fjYDxWOUexjjVgyA()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.google.android.material.datepicker.T9PhQIpGRhE4yZDm1C r8 = r5.f5167lEeR5KfoEr4xU5yHH7
            int r2 = r8.f5111husNiw3snxdgZPAGJm
            if (r7 < r2) goto L2d
            goto L54
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L5d
        L54:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r0
        L64:
            long r1 = r6.longValue()
            r5.T9PhQIpGRhE4yZDm1C(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.hoXrIDAFrSwfShk8da.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public int lEeR5KfoEr4xU5yHH7(int i) {
        return s3fjYDxWOUexjjVgyA() + (i - 1);
    }

    public boolean pbVGzGjWvY2LDXC8vo(long j) {
        throw null;
    }

    public int s3fjYDxWOUexjjVgyA() {
        return this.f5167lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(this.f5169zZKhbgvUfsK4AEX3r0.Acstmh57AKoSEkEFNJ());
    }

    @Override // android.widget.Adapter
    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i) {
        if (i < s3fjYDxWOUexjjVgyA() || i > Z9WdNiOsPR0y54zHW4()) {
            return null;
        }
        return Long.valueOf(this.f5167lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(e54J8UWNHWALQNixXM(i)));
    }
}
