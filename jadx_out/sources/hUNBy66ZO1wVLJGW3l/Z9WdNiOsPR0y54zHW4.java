package hUNBy66ZO1wVLJGW3l;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class Z9WdNiOsPR0y54zHW4 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final byte[] f5981lEeR5KfoEr4xU5yHH7 = {112, 114, 111, 0};

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final byte[] f5982s3fjYDxWOUexjjVgyA = {112, 114, 109, 0};

    public static s3fjYDxWOUexjjVgyA[] A49QRPHynYLCBN0SqP(InputStream inputStream, String str, int i) {
        if (inputStream.available() == 0) {
            return new s3fjYDxWOUexjjVgyA[0];
        }
        s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr = new s3fjYDxWOUexjjVgyA[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iIPyIQcaNa8aB7drBED = HJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED(inputStream);
            int iIPyIQcaNa8aB7drBED2 = HJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED(inputStream);
            s3fjydxwouexjjvgyaArr[i2] = new s3fjYDxWOUexjjVgyA(str, HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(inputStream, iIPyIQcaNa8aB7drBED), HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo(inputStream), 0L, iIPyIQcaNa8aB7drBED2, (int) HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo(inputStream), (int) HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo(inputStream), new int[iIPyIQcaNa8aB7drBED2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = s3fjydxwouexjjvgyaArr[i3];
            OANkd3mP6AYvwbNLJM(inputStream, s3fjydxwouexjjvgya);
            s3fjydxwouexjjvgya.f5995IPyIQcaNa8aB7drBED = T9PhQIpGRhE4yZDm1C(inputStream, s3fjydxwouexjjvgya.f5998husNiw3snxdgZPAGJm);
            xHA29AmDt6y96AnB3t(inputStream, s3fjydxwouexjjvgya);
        }
        return s3fjydxwouexjjvgyaArr;
    }

    public static String Acstmh57AKoSEkEFNJ(String str, String str2, byte[] bArr) {
        String strLEeR5KfoEr4xU5yHH7 = e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7(bArr);
        if (str.length() <= 0) {
            return TCyPEKSzIyweCN5yp1(str2, strLEeR5KfoEr4xU5yHH7);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return TCyPEKSzIyweCN5yp1(str2, strLEeR5KfoEr4xU5yHH7);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7(bArr) + str2;
    }

    public static void DfpieXfdYs58yZAiXY(OutputStream outputStream, s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr) throws IOException {
        HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(outputStream, s3fjydxwouexjjvgyaArr.length);
        for (s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya : s3fjydxwouexjjvgyaArr) {
            String strAcstmh57AKoSEkEFNJ = Acstmh57AKoSEkEFNJ(s3fjydxwouexjjvgya.f5999lEeR5KfoEr4xU5yHH7, s3fjydxwouexjjvgya.f6001s3fjYDxWOUexjjVgyA, e54J8UWNHWALQNixXM.f5986husNiw3snxdgZPAGJm);
            HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(outputStream, HJFh0TGMpafqLE9haL.Z9WdNiOsPR0y54zHW4(strAcstmh57AKoSEkEFNJ));
            HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(outputStream, s3fjydxwouexjjvgya.f6000pbVGzGjWvY2LDXC8vo.size());
            HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(outputStream, s3fjydxwouexjjvgya.f5995IPyIQcaNa8aB7drBED.length);
            HJFh0TGMpafqLE9haL.zaq8hOURtfwbcX17cG(outputStream, s3fjydxwouexjjvgya.f5994HJFh0TGMpafqLE9haL);
            HJFh0TGMpafqLE9haL.hoXrIDAFrSwfShk8da(outputStream, strAcstmh57AKoSEkEFNJ);
            Iterator it = s3fjydxwouexjjvgya.f6000pbVGzGjWvY2LDXC8vo.keySet().iterator();
            while (it.hasNext()) {
                HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i : s3fjydxwouexjjvgya.f5995IPyIQcaNa8aB7drBED) {
                HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(outputStream, i);
            }
        }
    }

    public static s3fjYDxWOUexjjVgyA[] G7AC3DWIx9i9fdanjk(InputStream inputStream, byte[] bArr, int i, s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr) {
        if (inputStream.available() == 0) {
            return new s3fjYDxWOUexjjVgyA[0];
        }
        if (i != s3fjydxwouexjjvgyaArr.length) {
            throw HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            HJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED(inputStream);
            String strKYHag8HRDlnO3X9zmZ = HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(inputStream, HJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED(inputStream));
            long jPbVGzGjWvY2LDXC8vo = HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo(inputStream);
            int iIPyIQcaNa8aB7drBED = HJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED(inputStream);
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaPbVGzGjWvY2LDXC8vo = pbVGzGjWvY2LDXC8vo(s3fjydxwouexjjvgyaArr, strKYHag8HRDlnO3X9zmZ);
            if (s3fjydxwouexjjvgyaPbVGzGjWvY2LDXC8vo == null) {
                throw HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL("Missing profile key: " + strKYHag8HRDlnO3X9zmZ);
            }
            s3fjydxwouexjjvgyaPbVGzGjWvY2LDXC8vo.f6002zZKhbgvUfsK4AEX3r0 = jPbVGzGjWvY2LDXC8vo;
            int[] iArrT9PhQIpGRhE4yZDm1C = T9PhQIpGRhE4yZDm1C(inputStream, iIPyIQcaNa8aB7drBED);
            if (Arrays.equals(bArr, e54J8UWNHWALQNixXM.f5986husNiw3snxdgZPAGJm)) {
                s3fjydxwouexjjvgyaPbVGzGjWvY2LDXC8vo.f5998husNiw3snxdgZPAGJm = iIPyIQcaNa8aB7drBED;
                s3fjydxwouexjjvgyaPbVGzGjWvY2LDXC8vo.f5995IPyIQcaNa8aB7drBED = iArrT9PhQIpGRhE4yZDm1C;
            }
        }
        return s3fjydxwouexjjvgyaArr;
    }

    public static void GyWRxpdt1T8mEJXPoD(OutputStream outputStream, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) throws IOException {
        int i = 0;
        for (Map.Entry entry : s3fjydxwouexjjvgya.f6000pbVGzGjWvY2LDXC8vo.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(outputStream, iIntValue - i);
                HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(outputStream, 0);
                i = iIntValue;
            }
        }
    }

    public static T9PhQIpGRhE4yZDm1C HJFh0TGMpafqLE9haL(s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < s3fjydxwouexjjvgyaArr.length; i2++) {
            try {
                s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = s3fjydxwouexjjvgyaArr[i2];
                HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(byteArrayOutputStream, i2);
                HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(byteArrayOutputStream, s3fjydxwouexjjvgya.f5998husNiw3snxdgZPAGJm);
                i = i + 4 + (s3fjydxwouexjjvgya.f5998husNiw3snxdgZPAGJm * 2);
                OUd9THiLjZndMj0qdF(byteArrayOutputStream, s3fjydxwouexjjvgya);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C = new T9PhQIpGRhE4yZDm1C(zZKhbgvUfsK4AEX3r0.CLASSES, i, byteArray, true);
            byteArrayOutputStream.close();
            return t9PhQIpGRhE4yZDm1C;
        }
        throw HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    public static String IPyIQcaNa8aB7drBED(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    public static byte[] KYHag8HRDlnO3X9zmZ(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GyWRxpdt1T8mEJXPoD(byteArrayOutputStream, s3fjydxwouexjjvgya);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void KqgKJKIWne3kz1AdHk(OutputStream outputStream, s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr) throws IOException {
        byte[] bArrS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA(s3fjydxwouexjjvgyaArr, e54J8UWNHWALQNixXM.f5983HJFh0TGMpafqLE9haL);
        HJFh0TGMpafqLE9haL.sTkWmhpZ5b1ArQIw4K(outputStream, s3fjydxwouexjjvgyaArr.length);
        HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C(outputStream, bArrS3fjYDxWOUexjjVgyA);
    }

    public static s3fjYDxWOUexjjVgyA[] LIMtzhnLwQyigzK0KO(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, e54J8UWNHWALQNixXM.f5988s3fjYDxWOUexjjVgyA)) {
            throw HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL("Unsupported version");
        }
        int iAcstmh57AKoSEkEFNJ = HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ(inputStream);
        byte[] bArrHusNiw3snxdgZPAGJm = HJFh0TGMpafqLE9haL.husNiw3snxdgZPAGJm(inputStream, (int) HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo(inputStream), (int) HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo(inputStream));
        if (inputStream.read() > 0) {
            throw HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrHusNiw3snxdgZPAGJm);
        try {
            s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArrA49QRPHynYLCBN0SqP = A49QRPHynYLCBN0SqP(byteArrayInputStream, str, iAcstmh57AKoSEkEFNJ);
            byteArrayInputStream.close();
            return s3fjydxwouexjjvgyaArrA49QRPHynYLCBN0SqP;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void OANkd3mP6AYvwbNLJM(InputStream inputStream, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        int iAvailable = inputStream.available() - s3fjydxwouexjjvgya.f5996KYHag8HRDlnO3X9zmZ;
        int iIPyIQcaNa8aB7drBED = 0;
        while (inputStream.available() > iAvailable) {
            iIPyIQcaNa8aB7drBED += HJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED(inputStream);
            s3fjydxwouexjjvgya.f6000pbVGzGjWvY2LDXC8vo.put(Integer.valueOf(iIPyIQcaNa8aB7drBED), 1);
            for (int iIPyIQcaNa8aB7drBED2 = HJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED(inputStream); iIPyIQcaNa8aB7drBED2 > 0; iIPyIQcaNa8aB7drBED2--) {
                THTDvPxsHqMeGb512f(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL("Read too much data during profile line parse");
        }
    }

    public static void OUd9THiLjZndMj0qdF(OutputStream outputStream, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) throws IOException {
        int[] iArr = s3fjydxwouexjjvgya.f5995IPyIQcaNa8aB7drBED;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(outputStream, i3 - i2);
            i++;
            i2 = i3;
        }
    }

    public static void OqIo5QF00RDxUQb4qq(OutputStream outputStream, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) throws IOException {
        byte[] bArr = new byte[Z9WdNiOsPR0y54zHW4(s3fjydxwouexjjvgya.f5997TCyPEKSzIyweCN5yp1)];
        for (Map.Entry entry : s3fjydxwouexjjvgya.f6000pbVGzGjWvY2LDXC8vo.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                WWC27LAMFqFFBzfbNw(bArr, 2, iIntValue, s3fjydxwouexjjvgya);
            }
            if ((iIntValue2 & 4) != 0) {
                WWC27LAMFqFFBzfbNw(bArr, 4, iIntValue, s3fjydxwouexjjvgya);
            }
        }
        outputStream.write(bArr);
    }

    public static void PPkm9uUfOJHHYveeLT(OutputStream outputStream, s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr) throws IOException {
        byte[] bArrS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA(s3fjydxwouexjjvgyaArr, e54J8UWNHWALQNixXM.f5988s3fjYDxWOUexjjVgyA);
        HJFh0TGMpafqLE9haL.sTkWmhpZ5b1ArQIw4K(outputStream, s3fjydxwouexjjvgyaArr.length);
        HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C(outputStream, bArrS3fjYDxWOUexjjVgyA);
    }

    public static s3fjYDxWOUexjjVgyA[] R9SAhYMerGybF9OAjL(InputStream inputStream, byte[] bArr, s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr) throws IOException {
        int iIPyIQcaNa8aB7drBED = HJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED(inputStream);
        byte[] bArrHusNiw3snxdgZPAGJm = HJFh0TGMpafqLE9haL.husNiw3snxdgZPAGJm(inputStream, (int) HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo(inputStream), (int) HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo(inputStream));
        if (inputStream.read() > 0) {
            throw HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrHusNiw3snxdgZPAGJm);
        try {
            s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArrG7AC3DWIx9i9fdanjk = G7AC3DWIx9i9fdanjk(byteArrayInputStream, bArr, iIPyIQcaNa8aB7drBED, s3fjydxwouexjjvgyaArr);
            byteArrayInputStream.close();
            return s3fjydxwouexjjvgyaArrG7AC3DWIx9i9fdanjk;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int[] T9PhQIpGRhE4yZDm1C(InputStream inputStream, int i) {
        int[] iArr = new int[i];
        int iIPyIQcaNa8aB7drBED = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iIPyIQcaNa8aB7drBED += HJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED(inputStream);
            iArr[i2] = iIPyIQcaNa8aB7drBED;
        }
        return iArr;
    }

    public static String TCyPEKSzIyweCN5yp1(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    public static void THTDvPxsHqMeGb512f(InputStream inputStream) {
        HJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED(inputStream);
        int iAcstmh57AKoSEkEFNJ = HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ(inputStream);
        if (iAcstmh57AKoSEkEFNJ == 6 || iAcstmh57AKoSEkEFNJ == 7) {
            return;
        }
        while (iAcstmh57AKoSEkEFNJ > 0) {
            HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ(inputStream);
            for (int iAcstmh57AKoSEkEFNJ2 = HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ(inputStream); iAcstmh57AKoSEkEFNJ2 > 0; iAcstmh57AKoSEkEFNJ2--) {
                HJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED(inputStream);
            }
            iAcstmh57AKoSEkEFNJ--;
        }
    }

    public static int VItLRw50eXTZeEfGl0(int i) {
        return (i + 7) & (-8);
    }

    public static void W3RZ2dTDKrKpS5Mxdk(OutputStream outputStream, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, String str) throws IOException {
        HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(outputStream, HJFh0TGMpafqLE9haL.Z9WdNiOsPR0y54zHW4(str));
        HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(outputStream, s3fjydxwouexjjvgya.f5998husNiw3snxdgZPAGJm);
        HJFh0TGMpafqLE9haL.zaq8hOURtfwbcX17cG(outputStream, s3fjydxwouexjjvgya.f5996KYHag8HRDlnO3X9zmZ);
        HJFh0TGMpafqLE9haL.zaq8hOURtfwbcX17cG(outputStream, s3fjydxwouexjjvgya.f5994HJFh0TGMpafqLE9haL);
        HJFh0TGMpafqLE9haL.zaq8hOURtfwbcX17cG(outputStream, s3fjydxwouexjjvgya.f5997TCyPEKSzIyweCN5yp1);
        HJFh0TGMpafqLE9haL.hoXrIDAFrSwfShk8da(outputStream, str);
    }

    public static void WWC27LAMFqFFBzfbNw(byte[] bArr, int i, int i2, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        int iE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(i, i2, s3fjydxwouexjjvgya.f5997TCyPEKSzIyweCN5yp1);
        int i3 = iE54J8UWNHWALQNixXM / 8;
        bArr[i3] = (byte) ((1 << (iE54J8UWNHWALQNixXM % 8)) | bArr[i3]);
    }

    public static void XzJ1BS7H9Ilbkv4eVM(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f5981lEeR5KfoEr4xU5yHH7);
        outputStream.write(bArr);
    }

    public static s3fjYDxWOUexjjVgyA[] Y43RdunnpKgpbny0lE(InputStream inputStream, int i, s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr) {
        if (inputStream.available() == 0) {
            return new s3fjYDxWOUexjjVgyA[0];
        }
        if (i != s3fjydxwouexjjvgyaArr.length) {
            throw HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iIPyIQcaNa8aB7drBED = HJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED(inputStream);
            iArr[i2] = HJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED(inputStream);
            strArr[i2] = HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(inputStream, iIPyIQcaNa8aB7drBED);
        }
        for (int i3 = 0; i3 < i; i3++) {
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = s3fjydxwouexjjvgyaArr[i3];
            if (!s3fjydxwouexjjvgya.f6001s3fjYDxWOUexjjVgyA.equals(strArr[i3])) {
                throw HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            s3fjydxwouexjjvgya.f5998husNiw3snxdgZPAGJm = i4;
            s3fjydxwouexjjvgya.f5995IPyIQcaNa8aB7drBED = T9PhQIpGRhE4yZDm1C(inputStream, i4);
        }
        return s3fjydxwouexjjvgyaArr;
    }

    public static int Z9WdNiOsPR0y54zHW4(int i) {
        return VItLRw50eXTZeEfGl0(i * 2) / 8;
    }

    public static void aAp6BD79BhftLCnuvf(OutputStream outputStream, s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr) throws IOException {
        lLKzvdU99Iw80uVD5I(outputStream, s3fjydxwouexjjvgyaArr);
    }

    public static byte[] aPyGSIylzVNKPT1Bls(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(inputStream, bArr.length))) {
            return HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(inputStream, e54J8UWNHWALQNixXM.f5988s3fjYDxWOUexjjVgyA.length);
        }
        throw HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL("Invalid magic");
    }

    public static boolean ao3wqKm5CXFuvC0q47(OutputStream outputStream, byte[] bArr, s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr) throws IOException {
        if (Arrays.equals(bArr, e54J8UWNHWALQNixXM.f5987lEeR5KfoEr4xU5yHH7)) {
            aAp6BD79BhftLCnuvf(outputStream, s3fjydxwouexjjvgyaArr);
            return true;
        }
        if (Arrays.equals(bArr, e54J8UWNHWALQNixXM.f5988s3fjYDxWOUexjjVgyA)) {
            PPkm9uUfOJHHYveeLT(outputStream, s3fjydxwouexjjvgyaArr);
            return true;
        }
        if (Arrays.equals(bArr, e54J8UWNHWALQNixXM.f5989zZKhbgvUfsK4AEX3r0)) {
            e2F9F6h8YJxTHwLCa0(outputStream, s3fjydxwouexjjvgyaArr);
            return true;
        }
        if (Arrays.equals(bArr, e54J8UWNHWALQNixXM.f5983HJFh0TGMpafqLE9haL)) {
            KqgKJKIWne3kz1AdHk(outputStream, s3fjydxwouexjjvgyaArr);
            return true;
        }
        if (!Arrays.equals(bArr, e54J8UWNHWALQNixXM.f5986husNiw3snxdgZPAGJm)) {
            return false;
        }
        DfpieXfdYs58yZAiXY(outputStream, s3fjydxwouexjjvgyaArr);
        return true;
    }

    public static void e2F9F6h8YJxTHwLCa0(OutputStream outputStream, s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr) throws IOException {
        HJFh0TGMpafqLE9haL.sTkWmhpZ5b1ArQIw4K(outputStream, s3fjydxwouexjjvgyaArr.length);
        for (s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya : s3fjydxwouexjjvgyaArr) {
            int size = s3fjydxwouexjjvgya.f6000pbVGzGjWvY2LDXC8vo.size() * 4;
            String strAcstmh57AKoSEkEFNJ = Acstmh57AKoSEkEFNJ(s3fjydxwouexjjvgya.f5999lEeR5KfoEr4xU5yHH7, s3fjydxwouexjjvgya.f6001s3fjYDxWOUexjjVgyA, e54J8UWNHWALQNixXM.f5989zZKhbgvUfsK4AEX3r0);
            HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(outputStream, HJFh0TGMpafqLE9haL.Z9WdNiOsPR0y54zHW4(strAcstmh57AKoSEkEFNJ));
            HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(outputStream, s3fjydxwouexjjvgya.f5995IPyIQcaNa8aB7drBED.length);
            HJFh0TGMpafqLE9haL.zaq8hOURtfwbcX17cG(outputStream, size);
            HJFh0TGMpafqLE9haL.zaq8hOURtfwbcX17cG(outputStream, s3fjydxwouexjjvgya.f5994HJFh0TGMpafqLE9haL);
            HJFh0TGMpafqLE9haL.hoXrIDAFrSwfShk8da(outputStream, strAcstmh57AKoSEkEFNJ);
            Iterator it = s3fjydxwouexjjvgya.f6000pbVGzGjWvY2LDXC8vo.keySet().iterator();
            while (it.hasNext()) {
                HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(outputStream, ((Integer) it.next()).intValue());
                HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(outputStream, 0);
            }
            for (int i : s3fjydxwouexjjvgya.f5995IPyIQcaNa8aB7drBED) {
                HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(outputStream, i);
            }
        }
    }

    public static int e54J8UWNHWALQNixXM(int i, int i2, int i3) {
        if (i == 1) {
            throw HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL("HOT methods are not stored in the bitmap");
        }
        if (i == 2) {
            return i2;
        }
        if (i == 4) {
            return i2 + i3;
        }
        throw HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL("Unexpected flag: " + i);
    }

    public static int hoXrIDAFrSwfShk8da(BitSet bitSet, int i, int i2) {
        int i3 = bitSet.get(e54J8UWNHWALQNixXM(2, i, i2)) ? 2 : 0;
        return bitSet.get(e54J8UWNHWALQNixXM(4, i, i2)) ? i3 | 4 : i3;
    }

    public static byte[] husNiw3snxdgZPAGJm(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            OqIo5QF00RDxUQb4qq(byteArrayOutputStream, s3fjydxwouexjjvgya);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static T9PhQIpGRhE4yZDm1C jCtUeU2YI1poCxWcjm(s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(byteArrayOutputStream, s3fjydxwouexjjvgyaArr.length);
            int i = 2;
            for (s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya : s3fjydxwouexjjvgyaArr) {
                HJFh0TGMpafqLE9haL.zaq8hOURtfwbcX17cG(byteArrayOutputStream, s3fjydxwouexjjvgya.f5994HJFh0TGMpafqLE9haL);
                HJFh0TGMpafqLE9haL.zaq8hOURtfwbcX17cG(byteArrayOutputStream, s3fjydxwouexjjvgya.f6002zZKhbgvUfsK4AEX3r0);
                HJFh0TGMpafqLE9haL.zaq8hOURtfwbcX17cG(byteArrayOutputStream, s3fjydxwouexjjvgya.f5997TCyPEKSzIyweCN5yp1);
                String strAcstmh57AKoSEkEFNJ = Acstmh57AKoSEkEFNJ(s3fjydxwouexjjvgya.f5999lEeR5KfoEr4xU5yHH7, s3fjydxwouexjjvgya.f6001s3fjYDxWOUexjjVgyA, e54J8UWNHWALQNixXM.f5987lEeR5KfoEr4xU5yHH7);
                int iZ9WdNiOsPR0y54zHW4 = HJFh0TGMpafqLE9haL.Z9WdNiOsPR0y54zHW4(strAcstmh57AKoSEkEFNJ);
                HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(byteArrayOutputStream, iZ9WdNiOsPR0y54zHW4);
                i = i + 14 + iZ9WdNiOsPR0y54zHW4;
                HJFh0TGMpafqLE9haL.hoXrIDAFrSwfShk8da(byteArrayOutputStream, strAcstmh57AKoSEkEFNJ);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i == byteArray.length) {
                T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C = new T9PhQIpGRhE4yZDm1C(zZKhbgvUfsK4AEX3r0.DEX_FILES, i, byteArray, false);
                byteArrayOutputStream.close();
                return t9PhQIpGRhE4yZDm1C;
            }
            throw HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL("Expected size " + i + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int lEeR5KfoEr4xU5yHH7(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        Iterator it = s3fjydxwouexjjvgya.f6000pbVGzGjWvY2LDXC8vo.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return iIntValue;
    }

    public static void lLKzvdU99Iw80uVD5I(OutputStream outputStream, s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(jCtUeU2YI1poCxWcjm(s3fjydxwouexjjvgyaArr));
        arrayList.add(HJFh0TGMpafqLE9haL(s3fjydxwouexjjvgyaArr));
        arrayList.add(zZKhbgvUfsK4AEX3r0(s3fjydxwouexjjvgyaArr));
        long length2 = e54J8UWNHWALQNixXM.f5987lEeR5KfoEr4xU5yHH7.length + f5981lEeR5KfoEr4xU5yHH7.length + 4 + (arrayList.size() * 16);
        HJFh0TGMpafqLE9haL.zaq8hOURtfwbcX17cG(outputStream, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C = (T9PhQIpGRhE4yZDm1C) arrayList.get(i);
            HJFh0TGMpafqLE9haL.zaq8hOURtfwbcX17cG(outputStream, t9PhQIpGRhE4yZDm1C.f5976lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA());
            HJFh0TGMpafqLE9haL.zaq8hOURtfwbcX17cG(outputStream, length2);
            if (t9PhQIpGRhE4yZDm1C.f5978zZKhbgvUfsK4AEX3r0) {
                byte[] bArr = t9PhQIpGRhE4yZDm1C.f5975HJFh0TGMpafqLE9haL;
                long length3 = bArr.length;
                byte[] bArrS3fjYDxWOUexjjVgyA = HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(bArr);
                arrayList2.add(bArrS3fjYDxWOUexjjVgyA);
                HJFh0TGMpafqLE9haL.zaq8hOURtfwbcX17cG(outputStream, bArrS3fjYDxWOUexjjVgyA.length);
                HJFh0TGMpafqLE9haL.zaq8hOURtfwbcX17cG(outputStream, length3);
                length = bArrS3fjYDxWOUexjjVgyA.length;
            } else {
                arrayList2.add(t9PhQIpGRhE4yZDm1C.f5975HJFh0TGMpafqLE9haL);
                HJFh0TGMpafqLE9haL.zaq8hOURtfwbcX17cG(outputStream, t9PhQIpGRhE4yZDm1C.f5975HJFh0TGMpafqLE9haL.length);
                HJFh0TGMpafqLE9haL.zaq8hOURtfwbcX17cG(outputStream, 0L);
                length = t9PhQIpGRhE4yZDm1C.f5975HJFh0TGMpafqLE9haL.length;
            }
            length2 += length;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            outputStream.write((byte[]) arrayList2.get(i2));
        }
    }

    public static s3fjYDxWOUexjjVgyA pbVGzGjWvY2LDXC8vo(s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr, String str) {
        if (s3fjydxwouexjjvgyaArr.length <= 0) {
            return null;
        }
        String strIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(str);
        for (int i = 0; i < s3fjydxwouexjjvgyaArr.length; i++) {
            if (s3fjydxwouexjjvgyaArr[i].f6001s3fjYDxWOUexjjVgyA.equals(strIPyIQcaNa8aB7drBED)) {
                return s3fjydxwouexjjvgyaArr[i];
            }
        }
        return null;
    }

    public static byte[] s3fjYDxWOUexjjVgyA(s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr, byte[] bArr) throws IOException {
        int i = 0;
        int iZ9WdNiOsPR0y54zHW4 = 0;
        for (s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya : s3fjydxwouexjjvgyaArr) {
            iZ9WdNiOsPR0y54zHW4 += HJFh0TGMpafqLE9haL.Z9WdNiOsPR0y54zHW4(Acstmh57AKoSEkEFNJ(s3fjydxwouexjjvgya.f5999lEeR5KfoEr4xU5yHH7, s3fjydxwouexjjvgya.f6001s3fjYDxWOUexjjVgyA, bArr)) + 16 + (s3fjydxwouexjjvgya.f5998husNiw3snxdgZPAGJm * 2) + s3fjydxwouexjjvgya.f5996KYHag8HRDlnO3X9zmZ + Z9WdNiOsPR0y54zHW4(s3fjydxwouexjjvgya.f5997TCyPEKSzIyweCN5yp1);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iZ9WdNiOsPR0y54zHW4);
        if (Arrays.equals(bArr, e54J8UWNHWALQNixXM.f5983HJFh0TGMpafqLE9haL)) {
            int length = s3fjydxwouexjjvgyaArr.length;
            while (i < length) {
                s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2 = s3fjydxwouexjjvgyaArr[i];
                W3RZ2dTDKrKpS5Mxdk(byteArrayOutputStream, s3fjydxwouexjjvgya2, Acstmh57AKoSEkEFNJ(s3fjydxwouexjjvgya2.f5999lEeR5KfoEr4xU5yHH7, s3fjydxwouexjjvgya2.f6001s3fjYDxWOUexjjVgyA, bArr));
                tXWeW0sqVddf7ZBflq(byteArrayOutputStream, s3fjydxwouexjjvgya2);
                i++;
            }
        } else {
            for (s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya3 : s3fjydxwouexjjvgyaArr) {
                W3RZ2dTDKrKpS5Mxdk(byteArrayOutputStream, s3fjydxwouexjjvgya3, Acstmh57AKoSEkEFNJ(s3fjydxwouexjjvgya3.f5999lEeR5KfoEr4xU5yHH7, s3fjydxwouexjjvgya3.f6001s3fjYDxWOUexjjVgyA, bArr));
            }
            int length2 = s3fjydxwouexjjvgyaArr.length;
            while (i < length2) {
                tXWeW0sqVddf7ZBflq(byteArrayOutputStream, s3fjydxwouexjjvgyaArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == iZ9WdNiOsPR0y54zHW4) {
            return byteArrayOutputStream.toByteArray();
        }
        throw HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iZ9WdNiOsPR0y54zHW4);
    }

    public static s3fjYDxWOUexjjVgyA[] sTkWmhpZ5b1ArQIw4K(InputStream inputStream, byte[] bArr, s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr) throws IOException {
        if (!Arrays.equals(bArr, e54J8UWNHWALQNixXM.f5984KYHag8HRDlnO3X9zmZ)) {
            throw HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL("Unsupported meta version");
        }
        int iAcstmh57AKoSEkEFNJ = HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ(inputStream);
        byte[] bArrHusNiw3snxdgZPAGJm = HJFh0TGMpafqLE9haL.husNiw3snxdgZPAGJm(inputStream, (int) HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo(inputStream), (int) HJFh0TGMpafqLE9haL.pbVGzGjWvY2LDXC8vo(inputStream));
        if (inputStream.read() > 0) {
            throw HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrHusNiw3snxdgZPAGJm);
        try {
            s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArrY43RdunnpKgpbny0lE = Y43RdunnpKgpbny0lE(byteArrayInputStream, iAcstmh57AKoSEkEFNJ, s3fjydxwouexjjvgyaArr);
            byteArrayInputStream.close();
            return s3fjydxwouexjjvgyaArrY43RdunnpKgpbny0lE;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void tXWeW0sqVddf7ZBflq(OutputStream outputStream, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) throws IOException {
        GyWRxpdt1T8mEJXPoD(outputStream, s3fjydxwouexjjvgya);
        OUd9THiLjZndMj0qdF(outputStream, s3fjydxwouexjjvgya);
        OqIo5QF00RDxUQb4qq(outputStream, s3fjydxwouexjjvgya);
    }

    public static void xHA29AmDt6y96AnB3t(InputStream inputStream, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        BitSet bitSetValueOf = BitSet.valueOf(HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(inputStream, HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(s3fjydxwouexjjvgya.f5997TCyPEKSzIyweCN5yp1 * 2)));
        int i = 0;
        while (true) {
            int i2 = s3fjydxwouexjjvgya.f5997TCyPEKSzIyweCN5yp1;
            if (i >= i2) {
                return;
            }
            int iHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(bitSetValueOf, i, i2);
            if (iHoXrIDAFrSwfShk8da != 0) {
                Integer num = (Integer) s3fjydxwouexjjvgya.f6000pbVGzGjWvY2LDXC8vo.get(Integer.valueOf(i));
                if (num == null) {
                    num = 0;
                }
                s3fjydxwouexjjvgya.f6000pbVGzGjWvY2LDXC8vo.put(Integer.valueOf(i), Integer.valueOf(iHoXrIDAFrSwfShk8da | num.intValue()));
            }
            i++;
        }
    }

    public static T9PhQIpGRhE4yZDm1C zZKhbgvUfsK4AEX3r0(s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < s3fjydxwouexjjvgyaArr.length; i2++) {
            try {
                s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = s3fjydxwouexjjvgyaArr[i2];
                int iLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(s3fjydxwouexjjvgya);
                byte[] bArrHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(s3fjydxwouexjjvgya);
                byte[] bArrKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(s3fjydxwouexjjvgya);
                HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(byteArrayOutputStream, i2);
                int length = bArrHusNiw3snxdgZPAGJm.length + 2 + bArrKYHag8HRDlnO3X9zmZ.length;
                HJFh0TGMpafqLE9haL.zaq8hOURtfwbcX17cG(byteArrayOutputStream, length);
                HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM(byteArrayOutputStream, iLEeR5KfoEr4xU5yHH7);
                byteArrayOutputStream.write(bArrHusNiw3snxdgZPAGJm);
                byteArrayOutputStream.write(bArrKYHag8HRDlnO3X9zmZ);
                i = i + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C = new T9PhQIpGRhE4yZDm1C(zZKhbgvUfsK4AEX3r0.METHODS, i, byteArray, true);
            byteArrayOutputStream.close();
            return t9PhQIpGRhE4yZDm1C;
        }
        throw HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    public static s3fjYDxWOUexjjVgyA[] zaq8hOURtfwbcX17cG(InputStream inputStream, byte[] bArr, byte[] bArr2, s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr) {
        if (Arrays.equals(bArr, e54J8UWNHWALQNixXM.f5984KYHag8HRDlnO3X9zmZ)) {
            if (Arrays.equals(e54J8UWNHWALQNixXM.f5987lEeR5KfoEr4xU5yHH7, bArr2)) {
                throw HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return sTkWmhpZ5b1ArQIw4K(inputStream, bArr, s3fjydxwouexjjvgyaArr);
        }
        if (Arrays.equals(bArr, e54J8UWNHWALQNixXM.f5985TCyPEKSzIyweCN5yp1)) {
            return R9SAhYMerGybF9OAjL(inputStream, bArr2, s3fjydxwouexjjvgyaArr);
        }
        throw HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL("Unsupported meta version");
    }
}
