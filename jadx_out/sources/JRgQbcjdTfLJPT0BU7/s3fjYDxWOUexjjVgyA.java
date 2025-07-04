package JRgQbcjdTfLJPT0BU7;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class s3fjYDxWOUexjjVgyA extends OutputStream {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public long f756HJFh0TGMpafqLE9haL = 0;

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f756HJFh0TGMpafqLE9haL++;
    }

    public long zZKhbgvUfsK4AEX3r0() {
        return this.f756HJFh0TGMpafqLE9haL;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f756HJFh0TGMpafqLE9haL += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f756HJFh0TGMpafqLE9haL += i2;
    }
}
