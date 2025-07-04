package Kh0uC90qEEhuLdpgB9;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public class s3fjYDxWOUexjjVgyA extends lEeR5KfoEr4xU5yHH7 {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public int f889Acstmh57AKoSEkEFNJ;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final String f890IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final int f891KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final int f892TCyPEKSzIyweCN5yp1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public int f893Z9WdNiOsPR0y54zHW4;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final Parcel f894husNiw3snxdgZPAGJm;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public int f895pbVGzGjWvY2LDXC8vo;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final SparseIntArray f896zZKhbgvUfsK4AEX3r0;

    public s3fjYDxWOUexjjVgyA(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7(), new Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7(), new Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7());
    }

    @Override // Kh0uC90qEEhuLdpgB9.lEeR5KfoEr4xU5yHH7
    public void GyWRxpdt1T8mEJXPoD(String str) {
        this.f894husNiw3snxdgZPAGJm.writeString(str);
    }

    @Override // Kh0uC90qEEhuLdpgB9.lEeR5KfoEr4xU5yHH7
    public void LIMtzhnLwQyigzK0KO(int i) {
        lEeR5KfoEr4xU5yHH7();
        this.f895pbVGzGjWvY2LDXC8vo = i;
        this.f896zZKhbgvUfsK4AEX3r0.put(i, this.f894husNiw3snxdgZPAGJm.dataPosition());
        XzJ1BS7H9Ilbkv4eVM(0);
        XzJ1BS7H9Ilbkv4eVM(i);
    }

    @Override // Kh0uC90qEEhuLdpgB9.lEeR5KfoEr4xU5yHH7
    public void OUd9THiLjZndMj0qdF(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f894husNiw3snxdgZPAGJm, 0);
    }

    @Override // Kh0uC90qEEhuLdpgB9.lEeR5KfoEr4xU5yHH7
    public boolean T9PhQIpGRhE4yZDm1C(int i) {
        while (this.f889Acstmh57AKoSEkEFNJ < this.f892TCyPEKSzIyweCN5yp1) {
            int i2 = this.f893Z9WdNiOsPR0y54zHW4;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f894husNiw3snxdgZPAGJm.setDataPosition(this.f889Acstmh57AKoSEkEFNJ);
            int i3 = this.f894husNiw3snxdgZPAGJm.readInt();
            this.f893Z9WdNiOsPR0y54zHW4 = this.f894husNiw3snxdgZPAGJm.readInt();
            this.f889Acstmh57AKoSEkEFNJ += i3;
        }
        return this.f893Z9WdNiOsPR0y54zHW4 == i;
    }

    @Override // Kh0uC90qEEhuLdpgB9.lEeR5KfoEr4xU5yHH7
    public boolean TCyPEKSzIyweCN5yp1() {
        return this.f894husNiw3snxdgZPAGJm.readInt() != 0;
    }

    @Override // Kh0uC90qEEhuLdpgB9.lEeR5KfoEr4xU5yHH7
    public void THTDvPxsHqMeGb512f(byte[] bArr) {
        if (bArr == null) {
            this.f894husNiw3snxdgZPAGJm.writeInt(-1);
        } else {
            this.f894husNiw3snxdgZPAGJm.writeInt(bArr.length);
            this.f894husNiw3snxdgZPAGJm.writeByteArray(bArr);
        }
    }

    @Override // Kh0uC90qEEhuLdpgB9.lEeR5KfoEr4xU5yHH7
    public void VItLRw50eXTZeEfGl0(boolean z) {
        this.f894husNiw3snxdgZPAGJm.writeInt(z ? 1 : 0);
    }

    @Override // Kh0uC90qEEhuLdpgB9.lEeR5KfoEr4xU5yHH7
    public void W3RZ2dTDKrKpS5Mxdk(Parcelable parcelable) {
        this.f894husNiw3snxdgZPAGJm.writeParcelable(parcelable, 0);
    }

    @Override // Kh0uC90qEEhuLdpgB9.lEeR5KfoEr4xU5yHH7
    public void XzJ1BS7H9Ilbkv4eVM(int i) {
        this.f894husNiw3snxdgZPAGJm.writeInt(i);
    }

    @Override // Kh0uC90qEEhuLdpgB9.lEeR5KfoEr4xU5yHH7
    public String Y43RdunnpKgpbny0lE() {
        return this.f894husNiw3snxdgZPAGJm.readString();
    }

    @Override // Kh0uC90qEEhuLdpgB9.lEeR5KfoEr4xU5yHH7
    public CharSequence Z9WdNiOsPR0y54zHW4() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f894husNiw3snxdgZPAGJm);
    }

    @Override // Kh0uC90qEEhuLdpgB9.lEeR5KfoEr4xU5yHH7
    public int aPyGSIylzVNKPT1Bls() {
        return this.f894husNiw3snxdgZPAGJm.readInt();
    }

    @Override // Kh0uC90qEEhuLdpgB9.lEeR5KfoEr4xU5yHH7
    public void lEeR5KfoEr4xU5yHH7() {
        int i = this.f895pbVGzGjWvY2LDXC8vo;
        if (i >= 0) {
            int i2 = this.f896zZKhbgvUfsK4AEX3r0.get(i);
            int iDataPosition = this.f894husNiw3snxdgZPAGJm.dataPosition();
            this.f894husNiw3snxdgZPAGJm.setDataPosition(i2);
            this.f894husNiw3snxdgZPAGJm.writeInt(iDataPosition - i2);
            this.f894husNiw3snxdgZPAGJm.setDataPosition(iDataPosition);
        }
    }

    @Override // Kh0uC90qEEhuLdpgB9.lEeR5KfoEr4xU5yHH7
    public byte[] pbVGzGjWvY2LDXC8vo() {
        int i = this.f894husNiw3snxdgZPAGJm.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.f894husNiw3snxdgZPAGJm.readByteArray(bArr);
        return bArr;
    }

    @Override // Kh0uC90qEEhuLdpgB9.lEeR5KfoEr4xU5yHH7
    public lEeR5KfoEr4xU5yHH7 s3fjYDxWOUexjjVgyA() {
        Parcel parcel = this.f894husNiw3snxdgZPAGJm;
        int iDataPosition = parcel.dataPosition();
        int i = this.f889Acstmh57AKoSEkEFNJ;
        if (i == this.f891KYHag8HRDlnO3X9zmZ) {
            i = this.f892TCyPEKSzIyweCN5yp1;
        }
        return new s3fjYDxWOUexjjVgyA(parcel, iDataPosition, i, this.f890IPyIQcaNa8aB7drBED + "  ", this.f887lEeR5KfoEr4xU5yHH7, this.f888s3fjYDxWOUexjjVgyA, this.f886HJFh0TGMpafqLE9haL);
    }

    @Override // Kh0uC90qEEhuLdpgB9.lEeR5KfoEr4xU5yHH7
    public Parcelable zaq8hOURtfwbcX17cG() {
        return this.f894husNiw3snxdgZPAGJm.readParcelable(getClass().getClassLoader());
    }

    public s3fjYDxWOUexjjVgyA(Parcel parcel, int i, int i2, String str, Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72, Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh73) {
        super(leer5kfoer4xu5yhh7, leer5kfoer4xu5yhh72, leer5kfoer4xu5yhh73);
        this.f896zZKhbgvUfsK4AEX3r0 = new SparseIntArray();
        this.f895pbVGzGjWvY2LDXC8vo = -1;
        this.f893Z9WdNiOsPR0y54zHW4 = -1;
        this.f894husNiw3snxdgZPAGJm = parcel;
        this.f891KYHag8HRDlnO3X9zmZ = i;
        this.f892TCyPEKSzIyweCN5yp1 = i2;
        this.f889Acstmh57AKoSEkEFNJ = i;
        this.f890IPyIQcaNa8aB7drBED = str;
    }
}
