package IPyIQcaNa8aB7drBED;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
public class TCyPEKSzIyweCN5yp1 {

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public boolean f587KYHag8HRDlnO3X9zmZ;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final CompoundButton f589lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public ColorStateList f590s3fjYDxWOUexjjVgyA = null;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public PorterDuff.Mode f586HJFh0TGMpafqLE9haL = null;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public boolean f591zZKhbgvUfsK4AEX3r0 = false;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public boolean f588husNiw3snxdgZPAGJm = false;

    public TCyPEKSzIyweCN5yp1(CompoundButton compoundButton) {
        this.f589lEeR5KfoEr4xU5yHH7 = compoundButton;
    }

    public PorterDuff.Mode HJFh0TGMpafqLE9haL() {
        return this.f586HJFh0TGMpafqLE9haL;
    }

    public void KYHag8HRDlnO3X9zmZ(ColorStateList colorStateList) {
        this.f590s3fjYDxWOUexjjVgyA = colorStateList;
        this.f591zZKhbgvUfsK4AEX3r0 = true;
        lEeR5KfoEr4xU5yHH7();
    }

    public void TCyPEKSzIyweCN5yp1(PorterDuff.Mode mode) {
        this.f586HJFh0TGMpafqLE9haL = mode;
        this.f588husNiw3snxdgZPAGJm = true;
        lEeR5KfoEr4xU5yHH7();
    }

    public void husNiw3snxdgZPAGJm() {
        if (this.f587KYHag8HRDlnO3X9zmZ) {
            this.f587KYHag8HRDlnO3X9zmZ = false;
        } else {
            this.f587KYHag8HRDlnO3X9zmZ = true;
            lEeR5KfoEr4xU5yHH7();
        }
    }

    public void lEeR5KfoEr4xU5yHH7() {
        Drawable drawableLEeR5KfoEr4xU5yHH7 = PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(this.f589lEeR5KfoEr4xU5yHH7);
        if (drawableLEeR5KfoEr4xU5yHH7 != null) {
            if (this.f591zZKhbgvUfsK4AEX3r0 || this.f588husNiw3snxdgZPAGJm) {
                Drawable drawableMutate = WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(drawableLEeR5KfoEr4xU5yHH7).mutate();
                if (this.f591zZKhbgvUfsK4AEX3r0) {
                    WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(drawableMutate, this.f590s3fjYDxWOUexjjVgyA);
                }
                if (this.f588husNiw3snxdgZPAGJm) {
                    WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(drawableMutate, this.f586HJFh0TGMpafqLE9haL);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f589lEeR5KfoEr4xU5yHH7.getDrawableState());
                }
                this.f589lEeR5KfoEr4xU5yHH7.setButtonDrawable(drawableMutate);
            }
        }
    }

    public ColorStateList s3fjYDxWOUexjjVgyA() {
        return this.f590s3fjYDxWOUexjjVgyA;
    }

    public void zZKhbgvUfsK4AEX3r0(AttributeSet attributeSet, int i) {
        int iT9PhQIpGRhE4yZDm1C;
        int iT9PhQIpGRhE4yZDm1C2;
        PPkm9uUfOJHHYveeLT pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL = PPkm9uUfOJHHYveeLT.R9SAhYMerGybF9OAjL(this.f589lEeR5KfoEr4xU5yHH7.getContext(), attributeSet, lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6438xMfAHy6F7qK0zhxhKG, i, 0);
        CompoundButton compoundButton = this.f589lEeR5KfoEr4xU5yHH7;
        W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.jocVUfxESVhVJU8LoH(compoundButton, compoundButton.getContext(), lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6438xMfAHy6F7qK0zhxhKG, attributeSet, pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.OANkd3mP6AYvwbNLJM(), i, 0);
        try {
            if (pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.zaq8hOURtfwbcX17cG(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6387fLSSbwbzFBVpwBH5FM) && (iT9PhQIpGRhE4yZDm1C2 = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.T9PhQIpGRhE4yZDm1C(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6387fLSSbwbzFBVpwBH5FM, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f589lEeR5KfoEr4xU5yHH7;
                    compoundButton2.setButtonDrawable(HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(compoundButton2.getContext(), iT9PhQIpGRhE4yZDm1C2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.zaq8hOURtfwbcX17cG(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6312Jsouc4ileb8SxQhxbX) && (iT9PhQIpGRhE4yZDm1C = pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.T9PhQIpGRhE4yZDm1C(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6312Jsouc4ileb8SxQhxbX, 0)) != 0) {
                CompoundButton compoundButton3 = this.f589lEeR5KfoEr4xU5yHH7;
                compoundButton3.setButtonDrawable(HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(compoundButton3.getContext(), iT9PhQIpGRhE4yZDm1C));
            }
            if (pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.zaq8hOURtfwbcX17cG(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6369bBVlTkqEpHW053CjWL)) {
                PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(this.f589lEeR5KfoEr4xU5yHH7, pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.HJFh0TGMpafqLE9haL(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6369bBVlTkqEpHW053CjWL));
            }
            if (pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.zaq8hOURtfwbcX17cG(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6443yvdWWG9COQQotjfedH)) {
                PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(this.f589lEeR5KfoEr4xU5yHH7, VItLRw50eXTZeEfGl0.zZKhbgvUfsK4AEX3r0(pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.Acstmh57AKoSEkEFNJ(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6443yvdWWG9COQQotjfedH, -1), null));
            }
        } finally {
            pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.xHA29AmDt6y96AnB3t();
        }
    }
}
