package g0OBkYSIvp0JYnHPjC;

import W3RZ2dTDKrKpS5Mxdk.cT5Hs3CQpLK8NvlZAw;
import W3RZ2dTDKrKpS5Mxdk.zXY7dgnTfw9Pd9RXel;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class HJFh0TGMpafqLE9haL extends cT5Hs3CQpLK8NvlZAw.s3fjYDxWOUexjjVgyA {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final View f5960HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final int[] f5961KYHag8HRDlnO3X9zmZ;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int f5962husNiw3snxdgZPAGJm;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f5963zZKhbgvUfsK4AEX3r0;

    public HJFh0TGMpafqLE9haL(View view) {
        super(0);
        this.f5961KYHag8HRDlnO3X9zmZ = new int[2];
        this.f5960HJFh0TGMpafqLE9haL = view;
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.cT5Hs3CQpLK8NvlZAw.s3fjYDxWOUexjjVgyA
    public void HJFh0TGMpafqLE9haL(cT5Hs3CQpLK8NvlZAw ct5hs3cqplk8nvlzaw) {
        this.f5960HJFh0TGMpafqLE9haL.getLocationOnScreen(this.f5961KYHag8HRDlnO3X9zmZ);
        this.f5963zZKhbgvUfsK4AEX3r0 = this.f5961KYHag8HRDlnO3X9zmZ[1];
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.cT5Hs3CQpLK8NvlZAw.s3fjYDxWOUexjjVgyA
    public cT5Hs3CQpLK8NvlZAw.lEeR5KfoEr4xU5yHH7 husNiw3snxdgZPAGJm(cT5Hs3CQpLK8NvlZAw ct5hs3cqplk8nvlzaw, cT5Hs3CQpLK8NvlZAw.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this.f5960HJFh0TGMpafqLE9haL.getLocationOnScreen(this.f5961KYHag8HRDlnO3X9zmZ);
        int i = this.f5963zZKhbgvUfsK4AEX3r0 - this.f5961KYHag8HRDlnO3X9zmZ[1];
        this.f5962husNiw3snxdgZPAGJm = i;
        this.f5960HJFh0TGMpafqLE9haL.setTranslationY(i);
        return leer5kfoer4xu5yhh7;
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.cT5Hs3CQpLK8NvlZAw.s3fjYDxWOUexjjVgyA
    public void s3fjYDxWOUexjjVgyA(cT5Hs3CQpLK8NvlZAw ct5hs3cqplk8nvlzaw) {
        this.f5960HJFh0TGMpafqLE9haL.setTranslationY(0.0f);
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.cT5Hs3CQpLK8NvlZAw.s3fjYDxWOUexjjVgyA
    public zXY7dgnTfw9Pd9RXel zZKhbgvUfsK4AEX3r0(zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((cT5Hs3CQpLK8NvlZAw) it.next()).HJFh0TGMpafqLE9haL() & zXY7dgnTfw9Pd9RXel.T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7()) != 0) {
                this.f5960HJFh0TGMpafqLE9haL.setTranslationY(jsjSYEu4NPZjZxcfmI.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(this.f5962husNiw3snxdgZPAGJm, 0, r0.s3fjYDxWOUexjjVgyA()));
                break;
            }
        }
        return zxy7dgntfw9pd9rxel;
    }
}
