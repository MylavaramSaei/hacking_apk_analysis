package hUNBy66ZO1wVLJGW3l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public abstract class HJFh0TGMpafqLE9haL {
    public static int Acstmh57AKoSEkEFNJ(InputStream inputStream) {
        return (int) TCyPEKSzIyweCN5yp1(inputStream, 1);
    }

    public static RuntimeException HJFh0TGMpafqLE9haL(String str) {
        return new IllegalStateException(str);
    }

    public static int IPyIQcaNa8aB7drBED(InputStream inputStream) {
        return (int) TCyPEKSzIyweCN5yp1(inputStream, 2);
    }

    public static String KYHag8HRDlnO3X9zmZ(InputStream inputStream, int i) {
        return new String(zZKhbgvUfsK4AEX3r0(inputStream, i), StandardCharsets.UTF_8);
    }

    public static void OANkd3mP6AYvwbNLJM(OutputStream outputStream, int i) throws IOException {
        aPyGSIylzVNKPT1Bls(outputStream, i, 2);
    }

    public static void T9PhQIpGRhE4yZDm1C(OutputStream outputStream, byte[] bArr) throws IOException {
        zaq8hOURtfwbcX17cG(outputStream, bArr.length);
        byte[] bArrS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA(bArr);
        zaq8hOURtfwbcX17cG(outputStream, bArrS3fjYDxWOUexjjVgyA.length);
        outputStream.write(bArrS3fjYDxWOUexjjVgyA);
    }

    public static long TCyPEKSzIyweCN5yp1(InputStream inputStream, int i) throws IOException {
        byte[] bArrZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (bArrZZKhbgvUfsK4AEX3r0[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static int Z9WdNiOsPR0y54zHW4(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    public static void aPyGSIylzVNKPT1Bls(OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void e54J8UWNHWALQNixXM(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static void hoXrIDAFrSwfShk8da(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static byte[] husNiw3snxdgZPAGJm(InputStream inputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = inputStream.read(bArr2);
                if (i4 < 0) {
                    throw HJFh0TGMpafqLE9haL("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw HJFh0TGMpafqLE9haL(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw HJFh0TGMpafqLE9haL("Inflater did not finish");
            }
            throw HJFh0TGMpafqLE9haL("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static int lEeR5KfoEr4xU5yHH7(int i) {
        return ((i + 7) & (-8)) / 8;
    }

    public static long pbVGzGjWvY2LDXC8vo(InputStream inputStream) {
        return TCyPEKSzIyweCN5yp1(inputStream, 4);
    }

    public static byte[] s3fjYDxWOUexjjVgyA(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static void sTkWmhpZ5b1ArQIw4K(OutputStream outputStream, int i) throws IOException {
        aPyGSIylzVNKPT1Bls(outputStream, i, 1);
    }

    public static byte[] zZKhbgvUfsK4AEX3r0(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw HJFh0TGMpafqLE9haL("Not enough bytes to read: " + i);
            }
            i2 += i3;
        }
        return bArr;
    }

    public static void zaq8hOURtfwbcX17cG(OutputStream outputStream, long j) throws IOException {
        aPyGSIylzVNKPT1Bls(outputStream, j, 4);
    }
}
