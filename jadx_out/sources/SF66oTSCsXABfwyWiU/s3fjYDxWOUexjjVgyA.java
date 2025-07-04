package SF66oTSCsXABfwyWiU;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA {

    public static final class lEeR5KfoEr4xU5yHH7 extends FilterInputStream {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public long f1517HJFh0TGMpafqLE9haL;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public long f1518zZKhbgvUfsK4AEX3r0;

        public lEeR5KfoEr4xU5yHH7(InputStream inputStream, long j) {
            super(inputStream);
            this.f1518zZKhbgvUfsK4AEX3r0 = -1L;
            this.f1517HJFh0TGMpafqLE9haL = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f1517HJFh0TGMpafqLE9haL);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i) {
            ((FilterInputStream) this).in.mark(i);
            this.f1518zZKhbgvUfsK4AEX3r0 = this.f1517HJFh0TGMpafqLE9haL;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f1517HJFh0TGMpafqLE9haL == 0) {
                return -1;
            }
            int i = ((FilterInputStream) this).in.read();
            if (i != -1) {
                this.f1517HJFh0TGMpafqLE9haL--;
            }
            return i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f1518zZKhbgvUfsK4AEX3r0 == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f1517HJFh0TGMpafqLE9haL = this.f1518zZKhbgvUfsK4AEX3r0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.f1517HJFh0TGMpafqLE9haL));
            this.f1517HJFh0TGMpafqLE9haL -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.f1517HJFh0TGMpafqLE9haL;
            if (j == 0) {
                return -1;
            }
            int i3 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
            if (i3 != -1) {
                this.f1517HJFh0TGMpafqLE9haL -= i3;
            }
            return i3;
        }
    }

    public static int HJFh0TGMpafqLE9haL(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static byte[] husNiw3snxdgZPAGJm(InputStream inputStream, Queue queue, int i) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i) * 2));
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = inputStream.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return lEeR5KfoEr4xU5yHH7(queue, i);
                }
                i2 += i3;
                i += i3;
            }
            iMin = HJFh0TGMpafqLE9haL(iMin * (iMin < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return lEeR5KfoEr4xU5yHH7(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static byte[] lEeR5KfoEr4xU5yHH7(Queue queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static InputStream s3fjYDxWOUexjjVgyA(InputStream inputStream, long j) {
        return new lEeR5KfoEr4xU5yHH7(inputStream, j);
    }

    public static byte[] zZKhbgvUfsK4AEX3r0(InputStream inputStream) {
        return husNiw3snxdgZPAGJm(inputStream, new ArrayDeque(20), 0);
    }
}
