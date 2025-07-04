package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 extends HJFh0TGMpafqLE9haL {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public int f3077Acstmh57AKoSEkEFNJ;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public OANkd3mP6AYvwbNLJM.lEeR5KfoEr4xU5yHH7 f3078Z9WdNiOsPR0y54zHW4;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public int f3079pbVGzGjWvY2LDXC8vo;

    public lEeR5KfoEr4xU5yHH7(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.HJFh0TGMpafqLE9haL
    public void IPyIQcaNa8aB7drBED(OANkd3mP6AYvwbNLJM.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, boolean z) {
        aPyGSIylzVNKPT1Bls(husniw3snxdgzpagjm, this.f3079pbVGzGjWvY2LDXC8vo, z);
    }

    @Override // androidx.constraintlayout.widget.HJFh0TGMpafqLE9haL
    public void TCyPEKSzIyweCN5yp1(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.TCyPEKSzIyweCN5yp1(attributeSet);
        this.f3078Z9WdNiOsPR0y54zHW4 = new OANkd3mP6AYvwbNLJM.lEeR5KfoEr4xU5yHH7();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6697LFGi8lLul9XOP250o9);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6770gpnYwZkFpQwu7zi2gb) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6746auvQiDfBN48eRz3fFq) {
                    this.f3078Z9WdNiOsPR0y54zHW4.OWyIJu8lIXxQlvLhaC(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.f6803sKw6Jz5uGcQ479KwIW) {
                    this.f3078Z9WdNiOsPR0y54zHW4.QW0Trt6m3nVBNaYFnP(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f3076zZKhbgvUfsK4AEX3r0 = this.f3078Z9WdNiOsPR0y54zHW4;
        T9PhQIpGRhE4yZDm1C();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aPyGSIylzVNKPT1Bls(OANkd3mP6AYvwbNLJM.husNiw3snxdgZPAGJm r4, int r5, boolean r6) {
        /*
            r3 = this;
            r3.f3077Acstmh57AKoSEkEFNJ = r5
            r5 = 0
            r0 = 6
            r1 = 1
            r2 = 5
            if (r6 == 0) goto L14
            int r6 = r3.f3079pbVGzGjWvY2LDXC8vo
            if (r6 != r2) goto Lf
        Lc:
            r3.f3077Acstmh57AKoSEkEFNJ = r1
            goto L1c
        Lf:
            if (r6 != r0) goto L1c
        L11:
            r3.f3077Acstmh57AKoSEkEFNJ = r5
            goto L1c
        L14:
            int r6 = r3.f3079pbVGzGjWvY2LDXC8vo
            if (r6 != r2) goto L19
            goto L11
        L19:
            if (r6 != r0) goto L1c
            goto Lc
        L1c:
            boolean r5 = r4 instanceof OANkd3mP6AYvwbNLJM.lEeR5KfoEr4xU5yHH7
            if (r5 == 0) goto L27
            OANkd3mP6AYvwbNLJM.lEeR5KfoEr4xU5yHH7 r4 = (OANkd3mP6AYvwbNLJM.lEeR5KfoEr4xU5yHH7) r4
            int r5 = r3.f3077Acstmh57AKoSEkEFNJ
            r4.oOMFI1Dcqcg1BSVNty(r5)
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.lEeR5KfoEr4xU5yHH7.aPyGSIylzVNKPT1Bls(OANkd3mP6AYvwbNLJM.husNiw3snxdgZPAGJm, int, boolean):void");
    }

    public int getMargin() {
        return this.f3078Z9WdNiOsPR0y54zHW4.oXIAAdret8ERrYfuyf();
    }

    public int getType() {
        return this.f3079pbVGzGjWvY2LDXC8vo;
    }

    public boolean hoXrIDAFrSwfShk8da() {
        return this.f3078Z9WdNiOsPR0y54zHW4.owCQzRKpGarpL4247z();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f3078Z9WdNiOsPR0y54zHW4.OWyIJu8lIXxQlvLhaC(z);
    }

    public void setDpMargin(int i) {
        this.f3078Z9WdNiOsPR0y54zHW4.QW0Trt6m3nVBNaYFnP((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f3078Z9WdNiOsPR0y54zHW4.QW0Trt6m3nVBNaYFnP(i);
    }

    public void setType(int i) {
        this.f3079pbVGzGjWvY2LDXC8vo = i;
    }
}
